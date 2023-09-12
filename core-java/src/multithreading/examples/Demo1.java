package multithreading.examples;

public class Demo1 {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        },"worker");
        worker.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
        }
    }
}
