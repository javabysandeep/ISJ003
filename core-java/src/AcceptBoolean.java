import java.util.Scanner;

public class AcceptBoolean {
    public static void main(String[] args) {
        System.out.println("Enter a boolean value");
        Scanner scanner = new Scanner(System.in);
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("you have entered " + booleanValue);
    }
}
