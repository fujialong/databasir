/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables;


import com.databasir.dao.Databasir;
import com.databasir.dao.Keys;
import com.databasir.dao.tables.records.ProjectSyncRuleRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectSyncRule extends TableImpl<ProjectSyncRuleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>databasir.project_sync_rule</code>
     */
    public static final ProjectSyncRule PROJECT_SYNC_RULE = new ProjectSyncRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectSyncRuleRecord> getRecordType() {
        return ProjectSyncRuleRecord.class;
    }

    /**
     * The column <code>databasir.project_sync_rule.id</code>.
     */
    public final TableField<ProjectSyncRuleRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>databasir.project_sync_rule.project_id</code>.
     */
    public final TableField<ProjectSyncRuleRecord, Integer> PROJECT_ID = createField(DSL.name("project_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>databasir.project_sync_rule.ignore_table_name_regex_array</code>.
     */
    public final TableField<ProjectSyncRuleRecord, JSON> IGNORE_TABLE_NAME_REGEX_ARRAY = createField(DSL.name("ignore_table_name_regex_array"), SQLDataType.JSON.nullable(false), this, "");

    /**
     * The column
     * <code>databasir.project_sync_rule.ignore_column_name_regex_array</code>.
     */
    public final TableField<ProjectSyncRuleRecord, JSON> IGNORE_COLUMN_NAME_REGEX_ARRAY = createField(DSL.name("ignore_column_name_regex_array"), SQLDataType.JSON.nullable(false), this, "");

    /**
     * The column <code>databasir.project_sync_rule.update_at</code>.
     */
    public final TableField<ProjectSyncRuleRecord, LocalDateTime> UPDATE_AT = createField(DSL.name("update_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>databasir.project_sync_rule.create_at</code>.
     */
    public final TableField<ProjectSyncRuleRecord, LocalDateTime> CREATE_AT = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private ProjectSyncRule(Name alias, Table<ProjectSyncRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProjectSyncRule(Name alias, Table<ProjectSyncRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>databasir.project_sync_rule</code> table
     * reference
     */
    public ProjectSyncRule(String alias) {
        this(DSL.name(alias), PROJECT_SYNC_RULE);
    }

    /**
     * Create an aliased <code>databasir.project_sync_rule</code> table
     * reference
     */
    public ProjectSyncRule(Name alias) {
        this(alias, PROJECT_SYNC_RULE);
    }

    /**
     * Create a <code>databasir.project_sync_rule</code> table reference
     */
    public ProjectSyncRule() {
        this(DSL.name("project_sync_rule"), null);
    }

    public <O extends Record> ProjectSyncRule(Table<O> child, ForeignKey<O, ProjectSyncRuleRecord> key) {
        super(child, key, PROJECT_SYNC_RULE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Databasir.DATABASIR;
    }

    @Override
    public Identity<ProjectSyncRuleRecord, Integer> getIdentity() {
        return (Identity<ProjectSyncRuleRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ProjectSyncRuleRecord> getPrimaryKey() {
        return Keys.KEY_PROJECT_SYNC_RULE_PRIMARY;
    }

    @Override
    public List<UniqueKey<ProjectSyncRuleRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_PROJECT_SYNC_RULE_UK_PROJECT_ID);
    }

    @Override
    public ProjectSyncRule as(String alias) {
        return new ProjectSyncRule(DSL.name(alias), this);
    }

    @Override
    public ProjectSyncRule as(Name alias) {
        return new ProjectSyncRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProjectSyncRule rename(String name) {
        return new ProjectSyncRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProjectSyncRule rename(Name name) {
        return new ProjectSyncRule(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, JSON, JSON, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
