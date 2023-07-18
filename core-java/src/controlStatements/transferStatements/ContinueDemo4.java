package controlStatements.transferStatements;

public class ContinueDemo4 {
    public static void main(String[] args) {
        //continue;//CTE: outside loop continue is not allowed

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
            System.out.println(i);
            continue;
            //unreachable code after continue
            /*System.out.println(i);
            System.out.println(i);*/
        }
        System.out.println("rest of the main");
    }
}
