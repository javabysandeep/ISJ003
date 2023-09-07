package multithreading;

public class Counter {
    public static void main(String[] args) {
        long sum = 0l;
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum = sum + i;
        }

        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum = sum + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println("Time taken to find the sum is " + (endTime - startTime));
    }
}
