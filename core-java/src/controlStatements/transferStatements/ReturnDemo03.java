package controlStatements.transferStatements;

public class ReturnDemo03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            return;
        }
        System.out.println("rest of the main method");
    }
}
