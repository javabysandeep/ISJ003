package exceptionHandling;

public class Demo18 {
    public static void main(String[] args) {
        System.out.println("Get some number " + get());//3
    }

    public static int get() {
        try {
            return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            return 3;
        }
    }
}
