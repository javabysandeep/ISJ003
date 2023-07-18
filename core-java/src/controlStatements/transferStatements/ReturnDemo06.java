package controlStatements.transferStatements;

import java.util.Scanner;

public class ReturnDemo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println(isEven(number));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
