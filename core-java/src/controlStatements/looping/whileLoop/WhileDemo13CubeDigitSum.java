package controlStatements.looping.whileLoop;

import java.util.Scanner;

public class WhileDemo13CubeDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }
        System.out.println("Sum of cube digits " + sum);
        //1 = 1
        //5= 125
        //3= 27

    }
}
