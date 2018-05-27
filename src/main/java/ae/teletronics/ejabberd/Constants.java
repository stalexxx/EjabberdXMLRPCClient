package ae.teletronics.ejabberd;

public class Constants {

    public enum MUCRoomOption {
        ALLOW_CHANGE_SUBJ("allow_change_subj"),
        ALLOW_PRIVATE_MESSAGES("allow_private_messages"),
        ALLOW_PRIVATE_MESSAGES_FROM_VISITORS("allow_private_messages_from_visitors"),
        ALLOW_QUERY_USERS("allow_query_users"),
        ALLOW_USER_INVITES("allow_user_invites"),
        ALLOW_VISITOR_NICKCHANGE("allow_visitor_nickchange"),
        ALLOW_VISITOR_STATUS("allow_visitor_status"),
        ANONYMOUS("anonymous"),
        CAPTCHA_PROTECTED("captcha_protected"),
        LOGGING("logging"),
        MAX_USERS("max_users"),
        MEMBERS_BY_DEFAULT("members_by_default"),
        MEMBERS_ONLY("members_only"),
        MODERATED("moderated"),
        PASSWORD("password"),
        PASSWORD_PROTECTED("password_protected"),
        PERSISTENT("persistent"),
        PUBLIC("public"),
        PUBLIC_LIST("public_list"),
        TITLE("title"),;

        private String optName;

        MUCRoomOption(String optName) {
            this.optName = optName;
        }

        public String getOptName() {
            return optName;
        }
    }

    public static final class Api {

        public static final String ADD_ROSTERITEM = "add_rosteritem";

        public static final String BACKUP = "backup";

        public static final String BAN_ACCOUNT = "ban_account";

        public static final String CHANGE_PASSWORD = "change_password";

        public static final String CHANGE_ROOM_OPTION = "change_room_option";

        public static final String CHECK_ACCOUNT = "check_account";

        public static final String CHECK_PASSWORD = "check_password";

        public static final String CHECK_PASSWORD_HASH = "check_password_hash";

        public static final String COMPILE = "compile";

        public static final String CONNECTED_USERS = "connected_users";

        public static final String CONNECTED_USERS_INFO = "connected_users_info";

        public static final String CONNECTED_USERS_NUMBER = "connected_users_number";

        public static final String CONNECTED_USERS_VHOST = "connected_users_vhost";

        public static final String CONVERT_TO_SCRAM = "convert_to_scram";

        public static final String CREATE_ROOM = "create_room";

        public static final String CREATE_ROOMS_FILE = "create_rooms_file";

        public static final String DELETE_EXPIRED_MESSAGES = "delete_expired_messages";

        public static final String DELETE_OLD_MAM_MESSAGES = "delete_old_mam_messages";

        public static final String DELETE_OLD_MESSAGES = "delete_old_messages";

        public static final String DELETE_OLD_USERS = "delete_old_users";

        public static final String DELETE_OLD_USERS_VHOST = "delete_old_users_vhost";

        public static final String DELETE_ROSTER_ITEM = "delete_rosteritem";

        public static final String DESTROY_ROOM = "destroy_room";

        public static final String DESTROY_ROOMS_FILE = "destroy_rooms_file";

        public static final String DUMP = "dump";

        public static final String DUMP_TABLE = "dump_table";

        public static final String ECHO_INTEGER = "echo_integer";

        public static final String ECHO_INTEGER_LIST_STRING = "echo_integer_list_string";

        public static final String ECHO_INTEGER_STRING = "echo_integer_string";

        public static final String ECHO_ISATILS = "echo_isatils";

        public static final String ECHO_LIST_INTEGER = "echo_list_integer";

        public static final String ECHO_LIST_STRING = "echo_list_string";

        public static final String ECHO_STRING = "echo_string";

        public static final String EXPORT_TO_ODBC = "export2odbc";

        public static final String EXPORT_ODBC = "export_odbc";

        public static final String EXPORT_PIEFXIS = "export_piefxis";

        public static final String EXPORT_PIEFXIS_HOST = "export_piefxis_host";

        public static final String GEN_HTML_DOC_FOR_COMMANDS = "gen_html_doc_for_commands";

        public static final String GEN_MARKDOWN_DOC_FOR_COMMANDS = "gen_markdown_doc_for_commands";

        public static final String GET_COOKIE = "get_cookie";

        public static final String GET_LAST = "get_last";

        public static final String GET_LOG_LEVEL = "get_loglevel";

        public static final String GET_OFFLINE_COUNT = "get_offline_count";

        public static final String GET_ROOM_AFFILIATIONS = "get_room_affiliations";

        public static final String GET_ROOM_OCCUPANTS = "get_room_occupants";

        public static final String GET_ROOM_OCCUPANTS_NUMBER = "get_room_occupants_number";

        public static final String GET_ROOM_OPTIONS = "get_room_options";

        public static final String GET_ROSTER = "get_roster";

        public static final String GET_USER_ROOMS = "get_user_rooms";

        public static final String GET_VCARD = "get_vcard";

        public static final String GET_VCARD2 = "get_vcard2";

        public static final String GET_VCARD2_MULTI = "get_vcard2_multi";

        public static final String IMPORT_DIR = "import_dir";

        public static final String IMPORT_FILE = "import_file";

        public static final String IMPORT_PIEFXIS = "import_piefxis";

        public static final String IMPORT_PROSODY = "import_prosody";

        public static final String INCOMING_S2S_NUMBER = "incoming_s2s_number";

        public static final String INSTALL_FALLBACK = "install_fallback";

        public static final String JOIN_CLUSTER = "join_cluster";

        public static final String KICK_SESSION = "kick_session";

        public static final String KICK_USER = "kick_session";

        public static final String LEAVE_CLUSTER = "leave_cluster";

        public static final String LIST_CLUSTER = "list_cluster";

        public static final String LOAD = "load";

        public static final String MNESIA_CHANGE_NODENAME = "mnesia_change_nodename";

        public static final String MODULE_CHECK = "module_check";

        public static final String MODULE_INSTALL = "module_install";

        public static final String MODULE_UNINSTALL = "module_uninstall";

        public static final String MODULE_UPGRADE = "module_upgrade";

        public static final String MODULES_AVAILABLE = "modules_available";

        public static final String MODULES_INSTALLED = "modules_installed";

        public static final String MODULES_UPDATE_SPECS = "modules_update_specs";

        public static final String MUC_ONLINE_ROOMS = "muc_online_rooms";

        public static final String MUC_UNREGISTER_NICK = "muc_unregister_nick";

        public static final String NUM_ACTIVE_USERS = "num_active_users";

        public static final String NUM_RESOURCES = "num_resources";

        public static final String OUTGOING_S2S_NUMBER = "outgoing_s2s_number";

        public static final String POW = "pow";

        public static final String PRIVACY_SET = "privacy_set";

        public static final String PRIVATE_GET = "private_get";

        public static final String PRIVATE_SET = "private_set";

        public static final String PROCESS_ROSTERITEMS = "process_rosteritems";

        public static final String PUSH_ALLTOALL = "push_alltoall";

        public static final String PUSH_HOSTER = "push_roster";

        public static final String PUSH_ROSTER_ALL = "push_roster_all";

        public static final String REGISTER = "register";

        public static final String REGISTERED_USERS = "registered_users";


    }

}
