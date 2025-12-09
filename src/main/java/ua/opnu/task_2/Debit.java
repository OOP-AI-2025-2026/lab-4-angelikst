package ua.opnu.task_2;

public class Debit {
    private int balance;

    public Debit(int balance) {
        setBalance(balance);
    }

    public int getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }
}
