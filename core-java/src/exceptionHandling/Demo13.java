package exceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        try {
            System.out.println("10/1");
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");
    }
}
//10 --> finally --> rest of the main