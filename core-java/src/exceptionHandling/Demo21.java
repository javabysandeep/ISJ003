package exceptionHandling;

public class Demo21 {
    public static void main(String[] args) {
        try {
            //System.out.println(10 / 0);
            new ArithmeticException();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid dr");
        }
        System.out.println("rest of the main");
    }
    //rest of the main
}
