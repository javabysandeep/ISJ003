package multithreading.examples;

public class Demo2EvenOdd {
    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }, "even");
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }, "odd");
        even.start();
        odd.start();


    }
}
