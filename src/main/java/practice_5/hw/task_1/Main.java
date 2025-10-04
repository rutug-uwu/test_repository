package practice_5.hw.task_1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(5000.5);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(2000);
        System.out.println(bankAccount.getBalance());
    }
}
