package multithreading.creatingThreadsByExtendingThreadClass;

public class Demo2 {
    public static void main(String[] args) {
        // step 1 : create a subclass of Thread class
        //step 2: override run method
        // step 3: create object of subclass
        // step 4: call the start method
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("run method overridden");
            }
        };
        thread.start();
    }
}

