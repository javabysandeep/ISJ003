package controlStatements.looping.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int numberOfStars = 1;
        for (int row = 5; row >=1; row--) {
            //spaces
            for (int space = row - 1; space > 0; space--) {
                System.out.print(" ");
            }
            //stars
            for (int star = 1; star <=numberOfStars ; star++) {
                System.out.print("*");
            }
            System.out.println();
            numberOfStars++;
        }
    }
}
