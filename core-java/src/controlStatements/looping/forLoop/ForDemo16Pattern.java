package controlStatements.looping.forLoop;

public class ForDemo16Pattern {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
//1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5