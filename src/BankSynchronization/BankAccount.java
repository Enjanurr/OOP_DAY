package BankSynchronization;

import java.text.*;
class BankAccount {
    private double balance;
    static DecimalFormat df = new DecimalFormat("#,##0.00");

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }


    public synchronized void deposit(double amount) {
        this.balance += amount;
        System.out.println(Thread.currentThread().getName()
                + " deposited " + df.format(amount)
                + ". New balance: "
                + df.format(balance));
    }


    public synchronized void withdraw(double amount) {
        if (balance  < amount) {
            System.out.println(Thread.currentThread().getName()
                    + " tried to withdraw " + df.format(amount)
                    + " but insufficient funds.");
        } else {
            balance -= amount;

            System.out.println(Thread.currentThread().getName()
                    + " withdrew " + df.format(amount)
                    + ". New balance: "
                    + df.format(balance));
        }
    }

    public double getBalance() {
        return balance;
    }


}