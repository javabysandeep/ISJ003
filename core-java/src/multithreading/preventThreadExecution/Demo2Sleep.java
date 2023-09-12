package multithreading.preventThreadExecution;

public class Demo2Sleep {
    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        });
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 20; i += 2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }, "odd");
        even.setName("even");
        even.start();
        odd.start();
    }
}
