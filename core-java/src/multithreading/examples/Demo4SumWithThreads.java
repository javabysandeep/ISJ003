package multithreading.examples;

public class Demo4SumWithThreads {
    static long sum1 = 0;
    static long sum2 = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 1000000000; i++) {
                sum1 += i;
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1000000001; i <= 2000000000; i++) {
                sum2 += i;
            }
        });
        //long startTime = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        //1134157931744762814
        //1173627931020966741
        //1173489767966906266
        //2000000001000000000
        //2000000001000000000
        //main thread should wait for thread1 and thread2
        thread1.join();
        thread2.join();


        // long endTime = System.currentTimeMillis();
        System.out.println("Sum " + (sum1 + sum2));
        //System.out.println("Time taken to complete " + (endTime - startTime));
    }
}
