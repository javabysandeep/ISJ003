package controlStatements.looping.forLoop;

public class ForDemo23PrimeRange {
    public static void main(String[] args) {
        //range : prime numbers
        //prime : number is divisible by only 1 and itself
        for (int number = 1; number <= 1000; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("its prime " + number);
            }
        }
    }
}
