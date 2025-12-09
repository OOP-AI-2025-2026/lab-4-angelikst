package ua.opnu.task_2;

public class Startup {
    private int balance;

    public Startup(int balance) {
        setBalance(balance);
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
