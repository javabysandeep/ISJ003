package controlStatements.looping.whileLoop;

public class WhileDemo08 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (left < right) {
            System.out.println("Left = " + left + "\t Right = " + right);
            left++;
        }
        //op: left 0,1,..9= right=10
        // loop will run for 10 times
    }
}
