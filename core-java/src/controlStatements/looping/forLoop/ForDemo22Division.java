package controlStatements.looping.forLoop;

import java.util.Scanner;

public class ForDemo22Division {
    public static void main(String[] args) {
        //division[Quotient] of two numbers without using /
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1 and number2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int quotient = 0;
        while (number1 >= number2) {
            number1 = number1 - number2;
            quotient++;
        }
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + number1);
    }
}
