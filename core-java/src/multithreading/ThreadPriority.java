package multithreading;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setPriority(11);
        thread.start();
        //IllegalArgumentException
    }
}
