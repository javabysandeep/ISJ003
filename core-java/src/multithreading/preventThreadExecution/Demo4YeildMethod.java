package multithreading.preventThreadExecution;

public class Demo4YeildMethod {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        }, "thread1");
        Thread thread2 = new Thread(() -> {
            for (int i = 11; i <= 20; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        }, "thread2");
        thread1.setPriority(Thread.MAX_PRIORITY);//1 to 10
        thread2.setPriority(9);//1 to 10

        thread1.start();
        thread2.start();

        //main thread
        Thread.yield(); // main thread is giving up the execution for t1 and t2
        for (int i = 101; i <= 200; i++) {
            System.out.println(i + "\t" + Thread.currentThread().getName());
        }
    }
}
