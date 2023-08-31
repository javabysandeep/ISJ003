package exceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);//DEH
        } catch (NullPointerException exception) {
            System.out.println("custom exception handler");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid denominator");
        }
        System.out.println("rest of the main");

        //invalid denominator
        //rest of the main
    }
}
