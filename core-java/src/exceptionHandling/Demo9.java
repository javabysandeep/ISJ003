package exceptionHandling;

public class Demo9 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);

            String str = null;
            System.out.println(str.length());

            int[] array = {};
            System.out.println(array[0]);
        } catch (ArithmeticException ae) {
            System.out.println("outer catch");
        }
        System.out.println("Rest of the main");
    }
}
//output: 10 -> NullPointerException