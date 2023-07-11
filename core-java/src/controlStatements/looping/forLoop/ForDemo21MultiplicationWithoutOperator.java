package controlStatements.looping.forLoop;

import java.util.Scanner;

public class ForDemo21MultiplicationWithoutOperator {
    public static void main(String[] args) {
        //multiplication of two numbers without using *
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1 and number2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int multiplication = 0;
        //5 * 4 = 5 + 5 + 5 + 5
        //4 * 5 = 4 + 4 + 4 + 4 + 4
        for (int i = 1; i <= number1; i++) {
            multiplication = multiplication + number2;
        }

        System.out.println("Multiplication of two numbers is " + multiplication);
    }
}
