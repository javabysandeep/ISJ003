package multithreading.creatingThreadsByRunnbleInterface;

public class Demo3LocalInnerClass {
    public static void main(String[] args) {
        /*
        *
   	1. Create a class by implementing the Runnable interface
	2. Override the run method
	3. Create the subclass object
	4. Create the Thread class object by passing subclass reference in the Thread class constructor
Call the start method by using thread class reference
        * */
        class RunnableImpl implements Runnable {
            @Override
            public void run() {
                System.out.println("run method");
            }
        }
        Runnable runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
