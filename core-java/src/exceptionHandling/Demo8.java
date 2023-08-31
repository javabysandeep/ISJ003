package exceptionHandling;

public class Demo8 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("inner catch");
            }
            System.out.println("Outer try");
        } catch (ArithmeticException ae) {
            System.out.println("outer catch");
        }
        System.out.println("Rest of the main");
    }
}
//output: inner catch, outer try, rest of the main