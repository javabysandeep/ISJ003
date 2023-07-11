package controlStatements.looping.forLoop;

public class ForDemo25TableRange {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 30; column++) {
                System.out.print(row * column + "\t");
            }
            System.out.println();
        }
    }
}
