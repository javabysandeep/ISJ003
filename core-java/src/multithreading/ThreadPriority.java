package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setPriority(11);
        thread.start();
        //IllegalArgumentException
    }
    void m1(){
        ExecutorService executorService =  Executors.newSingleThreadExecutor();
    }
}
