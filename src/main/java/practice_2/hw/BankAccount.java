package practice_2.hw;

public class BankAccount {

    private double balance;


    public double getBalance() {
        return balance;
    }

    public void deposit(double money){
        balance = balance + money;
    }

    public void withdraw(double money){
        balance = balance - money;
    }


}
