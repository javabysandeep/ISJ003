package exceptionHandling;

public class Demo19 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            System.out.println(new int[]{1}[0]);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException ae) {
            System.out.println("invalid dr");
        } catch (NullPointerException npe) {
            System.out.println("npe");
        } catch (ArrayIndexOutOfBoundsException aioube) {
            System.out.println("index out of range");
        }catch (Exception exception){
            System.out.println("handles all excetions");
        }
    }
}
