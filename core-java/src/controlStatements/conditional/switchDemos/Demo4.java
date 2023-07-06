package controlStatements.conditional.switchDemos;

import java.util.Scanner;

public class Demo4 {
    //Take a number from user and print whether it is positive or negative. (Use switch statement)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int i = (number > 0) ? 1 : (number < 0) ? 2 : 3;
        switch (i) {
            case 1:
                System.out.println("positive");
                break;
            case 2:
                System.out.println("negative");
                break;
            case 3:
                System.out.println("neutral");
                break;
        }
    }
}
