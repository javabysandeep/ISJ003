package controlStatements.conditional.ifElseDemos;

import java.util.Scanner;

public class BonusCalculator11 {
    //A company decided to give bonus of 50% to employee if his/her year of service is more than 5 years.
    //Ask user for their salary and year of service and print the net bonus amount.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = scanner.nextDouble();

        System.out.println("Enter the year of service");
        double yearsOfService = scanner.nextDouble();

        double bonus = 0.0d;

        if (yearsOfService >= 5) {
            bonus = salary / 2;
        }

        System.out.println("Bonus payable "+bonus);

    }
}
