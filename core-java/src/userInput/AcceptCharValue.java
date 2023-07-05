package userInput;

import java.util.Scanner;

public class AcceptCharValue {
    public static void main(String[] args) {
        System.out.println("Enter the char value");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println("You have entered  " + ch);

    }
}
