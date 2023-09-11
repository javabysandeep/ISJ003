package multithreading.creatingThreadsByExtendingThreadClass;

public class Demo1 {
    public static void main(String[] args) {
        class Work extends Thread {
            @Override
            public void run() {
                System.out.println("Task is executing...." + Thread.currentThread().getName());
            }
        }

        Work work = new Work();
        work.setName("worker");
        work.start();
    }

}
