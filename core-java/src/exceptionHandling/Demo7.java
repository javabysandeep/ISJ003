package exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("invalid dr : inner catch");
                System.out.println(10 / 0);
            }
            System.out.println("Outer try");
        } catch (ArithmeticException ae) {
            System.out.println("invalid dr : outer catch");
        }
        System.out.println("Rest of the main");
    }
}
//output: inner catch, outer catch, rest of the main