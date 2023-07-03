import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("enter two numbers for addition");

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Addition of two numbers " + (number1 + number2));
    }
}
