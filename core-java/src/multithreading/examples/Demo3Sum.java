package multithreading.examples;

public class Demo3Sum {
    public static void main(String[] args) {
        long sum = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 2000000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Sum " + sum);
        System.out.println("Time taken to complete " + (endTime - startTime));
    }
}
