package exceptionHandling;

public class Demo17 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid exception");
            System.exit(0);
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");
    }
}
//System.exit(): end of the program
//invalid exception -> end of program