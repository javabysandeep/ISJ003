package multithreading.preventThreadExecution;

public class Demo3Join {
    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }, "even");
        Thread odd = new Thread(() -> {
            try {
                even.join(50000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 1; i <= 20; i += 2) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }, "odd");
        even.start();
        odd.start();
    }
}
