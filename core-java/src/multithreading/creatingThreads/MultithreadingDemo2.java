package multithreading.creatingThreads;

public class MultithreadingDemo2 {
    static long sum = 0l;
    public static void main(String[] args) {

        class A extends Thread {
            @Override
            public void run() {
                for (long i = 0; i < Integer.MAX_VALUE; i++) {
                    sum = sum + i;
                }
                System.out.println("Sum "+sum);
            }
        }
        class B extends Thread {
            @Override
            public void run() {
                for (long i = 0; i < Integer.MAX_VALUE; i++) {
                    sum = sum + i;
                }
                System.out.println("Sum "+sum);
            }
        }
        A a = new A();
        a.setName("A");
        a.start();

        B b = new B();
        b.setName("B");
        b.start();
    }
}
