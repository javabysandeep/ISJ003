package controlStatements.looping.whileLoop;

public class WhileDemo10 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (left < right) {
            System.out.println("Left = " + left + "\t Right = " + right);
            left++;
            right--;
        }
        //op: left = 0 right=10
        //op: left = 1 right=9
        //op: left = 2 right=8
        //op: left = 3 right=7
        //op: left = 4 right=6


    }
}
