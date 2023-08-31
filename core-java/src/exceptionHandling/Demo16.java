package exceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid exception");
        } finally {
            System.out.println("finally");
            System.out.println(10 / 0);
        }
        System.out.println("rest of the main");
    }
}
//invalid exception -> finally --> AE