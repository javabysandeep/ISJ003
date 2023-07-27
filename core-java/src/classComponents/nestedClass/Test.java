package classComponents.nestedClass;

public class Test {
    public static void main(String[] args) {
        System.out.println("Development credentials");
        System.out.println(Constants.Mysql.Dev.username);
        System.out.println(Constants.Mysql.Dev.password);

        System.out.println("QA credentials");
        System.out.println(Constants.Mysql.QA.username);
        System.out.println(Constants.Mysql.QA.password);

        System.out.println("Prod credentials");
        System.out.println(Constants.Mysql.Prod.username);
        System.out.println(Constants.Mysql.Prod.password);
    }
}
