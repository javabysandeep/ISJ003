package multithreading;

public class AbnormalTermination {
    public static void main(String[] args) {
        int numerator = 100;
        int denominator = 10;
        Thread remainder = new Thread(() -> System.out.println("Remainder " + (numerator % denominator)), "remainder");
        Thread quotient = new Thread(() -> System.out.println("Quotient " + (numerator / denominator)), "quotient");

        remainder.start();
        quotient.start();

        System.out.println(10 / 0);
    }
}
