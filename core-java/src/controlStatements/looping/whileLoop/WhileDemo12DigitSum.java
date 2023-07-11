package controlStatements.looping.whileLoop;

import java.util.Scanner;

public class WhileDemo12DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number/10;
        }
        System.out.println("Sum of digits "+sum);

    }
}
