package practice_5.hw.task_1;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        return balance = balance + amount;
    }

    public double withdraw(double amount){
        return balance = balance - amount;
    }
}
