package controlStatements.looping.whileLoop;

import java.util.Scanner;

public class WhileDemo11AcceptUserInputLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        do {
            System.out.println("Enter the character");
            ch = scanner.next().charAt(0);
            System.out.println("you have entered " + ch);
        } while (ch != 'x');
    }
}
