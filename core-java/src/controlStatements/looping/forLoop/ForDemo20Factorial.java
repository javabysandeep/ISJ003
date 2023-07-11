package controlStatements.looping.forLoop;

import java.util.Scanner;

public class ForDemo20Factorial {
    public static void main(String[] args) {
        //factorial of a given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of given number "+factorial);
    }
}
