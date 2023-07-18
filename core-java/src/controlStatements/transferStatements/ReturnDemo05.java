package controlStatements.transferStatements;

import java.util.Scanner;

public class ReturnDemo05 {
    public static void main(String[] args) {
        System.out.println(accept());
    }

    public static int accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number > 0) {
            return 100;
        }
        if (number < 0) {
            return 200;
        }
        return 0;
    }

}
