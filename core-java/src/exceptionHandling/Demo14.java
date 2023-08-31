package exceptionHandling;

public class Demo14 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");
    }
}
//finally --> AE