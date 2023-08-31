package exceptionHandling;

public class Demo24Throws {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException arithmeticException) {
            System.out.println("exception object handled in main method");
        }
    }

    public static int divide(int number1, int number2) throws ArithmeticException {
        return number1 / number2;
    }
}
