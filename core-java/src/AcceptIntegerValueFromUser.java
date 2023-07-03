import java.util.Scanner;

public class AcceptIntegerValueFromUser {
    public static void main(String[] args) {
        System.out.println("Enter integer value");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("you have entered "+number);
    }
}
