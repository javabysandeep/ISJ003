package multithreading;

public class RunMethodDirectCall {
    public static void main(String[] args) {
        Thread thread =
                new Thread(() -> System.out.println(Thread.currentThread().getName()),"thread1");
        thread.start();
    }
}
