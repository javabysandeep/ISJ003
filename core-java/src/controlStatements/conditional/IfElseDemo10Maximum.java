package controlStatements.conditional;

import java.util.Scanner;

public class IfElseDemo10Maximum {
    public static void main(String[] args) {
        System.out.println("Enter the number1 and number2");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is max");
        } else {
            System.out.println(number2 + " is max");
        }
    }


}
