package multithreading;

public class MultithreadingDemo1 {
    public static void main(String[] args) {
        class A extends Thread {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                }
            }
        }
        A a = new A();
        a.setName("A");
        a.start();

        class B extends Thread {
            @Override
            public void run() {
                for (int i = 21; i <= 30; i++) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                }
            }
        }
        B b = new B();
        b.setName("B");
        b.start();
    }
}
