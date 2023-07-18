package controlStatements.transferStatements;

public class BreakDemo2 {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("one");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
       // break; // CTE
        System.out.println("Rest of the main");
    }
}
