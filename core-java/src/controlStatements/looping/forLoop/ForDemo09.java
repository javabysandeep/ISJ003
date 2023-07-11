package controlStatements.looping.forLoop;

public class ForDemo09 {
    public static void main(String[] args) {
        //find the sum of 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
//             sum = sum + i;
            sum += i;
        }
        System.out.println("Sum of 1 to 100 is " + sum);

        // n * (n+1)/2

    }
}
