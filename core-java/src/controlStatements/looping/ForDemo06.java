package controlStatements.looping;

public class ForDemo06 {
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i++) {
            System.out.println(i);
            i = i - 2;
        }
        System.out.println("Rest of the main");

    }
}
