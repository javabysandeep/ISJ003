package classComponents.nestedClass;

public class Constants {
    static class Mysql {
        static class Dev {
            static String username = "mysql_admin_dev";
            static String password = "mysql_password_dev";
        }

        static class QA {
            static String username = "mysql_admin_qa";
            static String password = "mysql_password_qa";
        }

        static class Prod {
            static String username = "mysql_admin_prod";
            static String password = "mysql_password_prod";
        }
    }
}
