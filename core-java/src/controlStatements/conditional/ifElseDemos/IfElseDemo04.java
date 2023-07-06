package controlStatements.conditional.ifElseDemos;

public class IfElseDemo04 {
    public static void main(String[] args) {
        if (isEmpty()) {
            System.out.println("it is empty");
        }
        System.out.println("rest of the main method");
    }

    public static boolean isEmpty() {
        return false;
    }
}
