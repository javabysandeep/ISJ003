package controlStatements.looping.whileLoop;

import java.util.Scanner;

public class WhileDemo15ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int reverseNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println("reverse number is " + reverseNumber);
    }
}
