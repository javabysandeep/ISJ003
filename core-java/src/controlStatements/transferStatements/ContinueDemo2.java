package controlStatements.transferStatements;

public class ContinueDemo2 {
    public static void main(String[] args) {
        //continue;//CTE: outside loop continue is not allowed

        for (int i = 1; i <= 10; i = i + 2) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
