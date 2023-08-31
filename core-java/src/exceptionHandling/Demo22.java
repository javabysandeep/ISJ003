package exceptionHandling;

public class Demo22 {
    public static void main(String[] args) {
        try {
            //System.out.println(10 / 0);
            throw new ArithmeticException();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid dr");
        }
        System.out.println("rest of the main");
    }
    //invalid dr --> rest of the main
}
