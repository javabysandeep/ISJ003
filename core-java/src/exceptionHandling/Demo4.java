package exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);//DEH
        } catch (NullPointerException exception) {
            System.out.println("custom exception handler");
        }
        System.out.println("rest of the main");
    }
}
