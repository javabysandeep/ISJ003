package controlStatements.transferStatements;

public class BreakDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;//it will be end of the loop
            }
        }
        System.out.println("Rest of the main");
    }
}
