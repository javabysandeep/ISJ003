package oops.encapsulation;

public class AtmMachine {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1,"Shirish",10000);
        //bankAccount.balance = bankAccount.balance-20000;
        //System.out.println(bankAccount.balance);
        bankAccount.setId(101);
        bankAccount.setName("Mr. Shrish");
        bankAccount.setBalance(4896000);

        System.out.println(bankAccount.getId() + "\t" + bankAccount.getName() + "\t" + bankAccount.getBalance());
        System.out.println(bankAccount);

        //builder design pattern : object partial creation : creational design pattern
        BankAccount bankAccount1 = BankAccount.builder()
                .id(201)
                .name("Amol")
                .balance(20000)
                .build();
        System.out.println(bankAccount1);

    }
}
