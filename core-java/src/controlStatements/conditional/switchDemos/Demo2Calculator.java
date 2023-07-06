package controlStatements.conditional.switchDemos;

import java.util.Scanner;

public class Demo2Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operator (+, -, *, /, %) ");
        String operator = scanner.next();

        System.out.println("Enter number1 and number2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        switch (operator) {
            case "+":
                System.out.println("Addition " + (number1 + number2));
                break;
            case "-":
                System.out.println("Subtraction " + (number1 - number2));
                break;
            case "*":
                System.out.println("Multiplication " + (number1 * number2));
                break;
            case "/":
                System.out.println("Division Quotient " + (number1 / number2));
                break;
            case "%":
                System.out.println("Division Remainder " + (number1 % number2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
