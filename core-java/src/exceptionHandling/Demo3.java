package exceptionHandling;

public class Demo3 {
    public static void main(String[] args) {
        try {
            //exceptions prone code
            System.out.println(10 / 1);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }
}
