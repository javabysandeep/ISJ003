import java.util.Scanner;

public class AcceptStringValue {
    public static void main(String[] args) {
        System.out.println("Enter the string value");
        Scanner scanner = new Scanner(System.in);
        String stringValue = scanner.nextLine();
        System.out.println("you have entered "+stringValue);

    }
}
