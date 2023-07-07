package controlStatements.looping;

import java.util.Scanner;

public class ForDemo14Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if its prime");
        int number = scanner.nextInt();
        int num = Math.abs(number);
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Its prime" : "its not a prime");

    }
}
