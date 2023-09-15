package multithreading.synchronization;

public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    synchronized void deposit(int amount) {
        if (amount > 0) {
            synchronized (this) {
                balance += amount;
            }
        }
    }

    synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
}
