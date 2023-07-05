package controlStatements.conditional;

import java.util.Scanner;

public class IfElseDemo09IsSquare {
    public static void main(String[] args) {
        //Take values of length and breadth of a rectangle from user
        // and check if it is square or not.
        System.out.println("Enter the length and breadth of a rectangle");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        if (length == breadth) {
            System.out.println("its square");
        } else {
            System.out.println("its not square");
        }


    }


}
