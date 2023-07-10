package controlStatements.looping;

import java.util.Scanner;

public class ForDemo19Perfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find its factors");
        int number = scanner.nextInt();
        int additionOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Factor " + i);
                additionOfFactors = additionOfFactors + i;
            }
        }
        System.out.println(additionOfFactors == number ? "Its a perfect" : "its not a perfect");
    }
}
