package multithreading.synchronization;

public class Counter {
    int count = 0;

    void count() {
        synchronized (this) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10000000; i++) {
                counter.count();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10000000; i++) {
                counter.count();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count " + counter.count);
    }
}
