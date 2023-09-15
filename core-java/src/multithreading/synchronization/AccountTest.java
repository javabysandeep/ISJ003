package multithreading.synchronization;

public class AccountTest {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(1000);

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                account.deposit(100);
            }
        }, "thread1");
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                account.withdraw(100);
            }
        }, "thread2");

        thread1.join();
        thread2.join();

        thread1.start();
        thread2.start();

        System.out.println("Updated balance " + account.balance);
    }
}
