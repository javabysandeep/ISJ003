package exceptionHandling;

public class FinallyReturning {
    public static void main(String[] args) {
        System.out.println(get());
    }

    public static int get() {
        try {
            return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            return 3;
        }
        //System.out.println("");
    }
}
