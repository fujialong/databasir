package com.databasir.core.domain.project.service;

import com.databasir.common.codec.Aes;
import com.databasir.core.domain.DomainErrors;
import com.databasir.core.domain.project.converter.DataSourcePojoConverter;
import com.databasir.core.domain.project.converter.ProjectPojoConverter;
import com.databasir.core.domain.project.converter.ProjectResponseConverter;
import com.databasir.core.domain.project.data.*;
import com.databasir.dao.impl.*;
import com.databasir.dao.tables.pojos.*;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectDao projectDao;

    private final ProjectSyncRuleDao projectSyncRuleDao;

    private final DataSourceDao dataSourceDao;

    private final SysKeyDao sysKeyDao;

    private final DataSourcePropertyDao dataSourcePropertyDao;

    private final DataSourcePojoConverter dataSourcePojoConverter;

    private final ProjectPojoConverter projectPojoConverter;

    private final ProjectResponseConverter projectResponseConverter;

    public ProjectDetailResponse getOne(Integer id) {
        return projectDao.selectOptionalById(id)
                .map(schemaSource -> {
                    DataSourcePojo dataSource = dataSourceDao.selectByProjectId(id);
                    List<DataSourcePropertyPojo> properties = dataSourcePropertyDao.selectByDataSourceId(dataSource.getId());
                    ProjectDetailResponse.DataSourceResponse dataSourceResponse = projectResponseConverter.toResponse(dataSource, properties);
                    ProjectSyncRulePojo rule = projectSyncRuleDao.selectByProjectId(id);
                    ProjectDetailResponse.ProjectSyncRuleResponse ruleResponse = projectResponseConverter.toResponse(rule);
                    return projectResponseConverter.toResponse(schemaSource, dataSourceResponse, ruleResponse);
                })
                .orElseThrow(DomainErrors.PROJECT_NOT_FOUND::exception);
    }

    @Transactional
    public void create(ProjectCreateRequest request) {
        ProjectPojo project = projectPojoConverter.of(request);
        Integer projectId = null;
        try {
            projectId = projectDao.insertAndReturnId(project);
        } catch (DuplicateKeyException e) {
            throw DomainErrors.PROJECT_NOT_FOUND.exception();
        }

        String newPassword = encryptPassword(request.getDataSource().getPassword()).get();
        DataSourcePojo dataSource = dataSourcePojoConverter.of(request.getDataSource(), newPassword, projectId);
        Integer dataSourceId = dataSourceDao.insertAndReturnId(dataSource);

        List<DataSourcePropertyValue> propertyValues = request.getDataSource().getProperties();
        List<DataSourcePropertyPojo> properties = dataSourcePojoConverter.of(propertyValues, dataSourceId);
        dataSourcePropertyDao.batchInsert(properties);

        ProjectSyncRulePojo syncRule = projectPojoConverter.of(request.getProjectSyncRule(), projectId);
        projectSyncRuleDao.insertAndReturnId(syncRule);
    }

    @Transactional
    public void update(Integer groupId, ProjectUpdateRequest request) {
        Integer projectId = request.getId();
        if (projectDao.exists(groupId, projectId)) {
            // update dataSource
            String newPassword = encryptPassword(request.getDataSource().getPassword()).orElse(null);
            DataSourcePojo dataSource = dataSourcePojoConverter.of(request.getDataSource(), newPassword, projectId);
            dataSourceDao.updateByProjectId(dataSource);

            // update connection property
            Integer dataSourceId = dataSourceDao.selectByProjectId(projectId).getId();
            List<DataSourcePropertyValue> propertyValues = request.getDataSource().getProperties();
            List<DataSourcePropertyPojo> properties = dataSourcePojoConverter.of(propertyValues, dataSourceId);
            if (properties.isEmpty()) {
                dataSourcePropertyDao.deleteByDataSourceId(dataSourceId);
            } else {
                dataSourcePropertyDao.deleteByDataSourceId(dataSourceId);
                dataSourcePropertyDao.batchInsert(properties);
            }

            // update project sync rule
            ProjectSyncRulePojo syncRule = projectPojoConverter.of(request.getProjectSyncRule(), projectId);
            projectSyncRuleDao.deleteByProjectId(projectId);
            projectSyncRuleDao.insertAndReturnId(syncRule);

            // update project info
            ProjectPojo project = projectPojoConverter.of(request);
            projectDao.updateById(project);
        } else {
            throw DomainErrors.PROJECT_NOT_FOUND.exception();
        }
    }

    private Optional<String> encryptPassword(String password) {
        if (!StringUtils.hasText(password)) {
            return Optional.empty();
        }
        SysKeyPojo sysKey = sysKeyDao.selectTopOne();
//        String decryptedPassword = Rsa.decryptFromBase64DataByPrivateKey(password, sysKey.getRsaPrivateKey());
        return Optional.of(Aes.encryptToBase64Data(password, sysKey.getAesKey()));
    }

    public void delete(Integer projectId) {
        projectDao.updateDeletedById(true, projectId);
    }

    public Page<ProjectSimpleResponse> list(Pageable page, ProjectListCondition condition) {
        Page<ProjectPojo> pageData = projectDao.selectByCondition(page, condition.toCondition());
        List<Integer> projectIds = pageData.getContent()
                .stream()
                .map(ProjectPojo::getId)
                .collect(Collectors.toList());
        Map<Integer, DataSourcePojo> dataSourceMapByProjectId = dataSourceDao.selectInProjectIds(projectIds)
                .stream()
                .collect(Collectors.toMap(DataSourcePojo::getProjectId, Function.identity()));
        Map<Integer, ProjectSyncRulePojo> syncRuleMapByProjectId = projectSyncRuleDao.selectInProjectIds(projectIds)
                .stream()
                .collect(Collectors.toMap(ProjectSyncRulePojo::getProjectId, Function.identity()));
        return pageData.map(project -> {
            DataSourcePojo dataSource = dataSourceMapByProjectId.get(project.getId());
            ProjectSyncRulePojo syncRule = syncRuleMapByProjectId.get(project.getId());
            return projectResponseConverter.toSimple(project, dataSource, syncRule);
        });
    }

}