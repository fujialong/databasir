package com.databasir.api;

public interface Routes {

    String BASE = "/api/v1.0";

    interface User {

        String LIST = BASE + "/users";

        String GET_ONE = BASE + "/users/{userId}";

        String ENABLE = BASE + "/users/{userId}/enable";

        String DISABLE = BASE + "/users/{userId}/disable";

        String CREATE = BASE + "/users";

        String UPDATE_PASSWORD = BASE + "/users/{userId}/password";

        String UPDATE_NICKNAME = BASE + "/users/{userId}/nickname";

        String RENEW_PASSWORD = BASE + "/users/{userId}/renew_password";

        String ADD_OR_REMOVE_SYS_OWNER = BASE + "/users/{userId}/sys_owners";
    }

    interface UserProject {

        String LIST = BASE + "/user_projects/favorites";

        String ADD = BASE + "/user_projects/favorites/{projectId}";

        String REMOVE = BASE + "/user_projects/favorites/{projectId}";
    }

    interface Group {

        String LIST = BASE + "/groups";

        String GET_ONE = BASE + "/groups/{groupId}";

        String CREATE = BASE + "/groups";

        String UPDATE = BASE + "/groups";

        String DELETE = BASE + "/groups/{groupId}";

        String MEMBERS = GET_ONE + "/members";

        String DELETE_MEMBER = GET_ONE + "/members/{userId}";

        String ADD_MEMBER = GET_ONE + "/members";

        String UPDATE_MEMBER = GET_ONE + "/members/{userId}";
    }

    interface GroupProject {

        String LIST = BASE + "/projects";

        String GET_ONE = BASE + "/projects/{projectId}";

        String CREATE = BASE + "/projects";

        String UPDATE = BASE + "/groups/{groupId}/projects";

        String DELETE = BASE + "/groups/{groupId}/projects/{projectId}";

        String TEST_CONNECTION = BASE + "/projects/test_connection";
    }

    interface Document {

        String GET_ONE = BASE + "/projects/{projectId}/documents";

        String SYNC_ONE = BASE + "/projects/{projectId}/documents";

        String LIST_VERSIONS = BASE + "/projects/{projectId}/document_versions";

        String GET_SIMPLE_ONE = BASE + "/projects/{projectId}/documents/simple";

        String GET_TABLE_DETAIL = BASE + "/projects/{projectId}/documents/{documentId}/table_documents";

        String DIFF = BASE + "/projects/{projectId}/diff_documents";

        String EXPORT = BASE + "/projects/{projectId}/document_files";

        String LIST_TABLES = BASE + "/projects/{projectId}/tables";
    }

    interface DocumentDiscussion {

        String DISCUSSION_BASE = BASE + "/groups/{groupId}/projects/{projectId}/discussions";

        String LIST = DISCUSSION_BASE;

        String CREATE = DISCUSSION_BASE;

        String DELETE = DISCUSSION_BASE + "/{discussionId}";
    }

    interface DocumentDescription {

        String DISCUSSION_BASE = BASE + "/groups/{groupId}/projects/{projectId}/descriptions";

        String SAVE = DISCUSSION_BASE;
    }

    interface DocumentTemplateProperty {
        String API = BASE + "/document_template/properties";
    }

    interface Setting {

        String GET_SYS_EMAIL = BASE + "/settings/sys_email";

        String UPDATE_SYS_EMAIL = BASE + "/settings/sys_email";

        String DELETE_SYS_EMAIL = BASE + "/settings/sys_email";
    }

    interface Login {

        String LOGOUT = "/logout";

        String REFRESH_ACCESS_TOKEN = "/access_tokens";

        String LOGIN_INFO = BASE + "/login_info";

    }

    interface OperationLog {
        String LIST = BASE + "/operation_logs";
    }

    interface OAuth2App {

        String LIST_PAGE = BASE + "/oauth2_apps";

        String CREATE = BASE + "/oauth2_apps";

        String UPDATE = BASE + "/oauth2_apps";

        String DELETE = BASE + "/oauth2_apps/{id}";

        String GET_ONE = BASE + "/oauth2_apps/{id}";

    }

    interface DatabaseType {

        String LIST_SIMPLE = BASE + "/simple_database_types";

        String LIST_PAGE = BASE + "/database_types";

        String GET_ONE = BASE + "/database_types/{id}";

        String DELETE_ONE = BASE + "/database_types/{id}";

        String UPDATE = BASE + "/database_types";

        String CREATE = BASE + "/database_types";
    }

    interface MockData {

        String SAVE_MOCK_RULE = BASE + "/groups/{groupId}/projects/{projectId}/tables/{tableId}/mock_rules";

        String GET_MOCK_RULE = BASE + "/groups/{groupId}/projects/{projectId}/mock_rules";

        String GET_SQL_MOCK_DATA = BASE + "/groups/{groupId}/projects/{projectId}/mock_data/sql";

    }
}