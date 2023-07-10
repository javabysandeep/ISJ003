package controlStatements.looping;

import java.util.Scanner;

public class ForDemo18Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find its factors");
        int number = scanner.nextInt();
        //10
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Factor " + i);
            }
        }
    }
}
