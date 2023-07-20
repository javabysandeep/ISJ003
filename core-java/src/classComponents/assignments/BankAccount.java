package classComponents.assignments;

public class BankAccount {
    int accountNumber;
    float balance;
    static String bankName = "Mallya Bank";

    void deposit(float amount) {
        balance = balance + amount;
    }

    void withdraw(float amount) {
        if (amount < balance) {
            balance = balance - amount;
        }
    }

    public static void main(String[] args) {
        BankAccount salmansBankAccount = new BankAccount();
        salmansBankAccount.accountNumber = 1;
        salmansBankAccount.balance = 10000;

        System.out.println("Initial funding details " + salmansBankAccount.accountNumber + "\t" + salmansBankAccount.balance);

        salmansBankAccount.deposit(130000);
        System.out.println("After deposit funding details " + salmansBankAccount.accountNumber + "\t" + salmansBankAccount.balance);

        salmansBankAccount.withdraw(5000);
        System.out.println("After withdraw funding details " + salmansBankAccount.accountNumber + "\t" + salmansBankAccount.balance);

    }

}
