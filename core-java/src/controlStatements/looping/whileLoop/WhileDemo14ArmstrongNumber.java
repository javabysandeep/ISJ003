package controlStatements.looping.whileLoop;

import java.util.Scanner;

public class WhileDemo14ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }
        System.out.println("Sum of cube digits " + sum);
        System.out.println(sum == originalNumber ? "its armstrong number" : "not a armstrong");

    }
}
