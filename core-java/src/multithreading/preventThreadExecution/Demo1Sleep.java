package multithreading.preventThreadExecution;

public class Demo1Sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            // to stop the execution of currently executing thread for a specified time : sleep
            Thread.sleep(1000);
            System.out.println(i + Thread.currentThread().getName());
        }
    }
}
