package pr05transactions;

public class BankAccount {
    private int balance;

    synchronized public void deposit(int sum) {
        this.balance += sum;
    }

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
