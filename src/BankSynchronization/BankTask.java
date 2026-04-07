package BankSynchronization;

class BankTask implements Runnable {


    private double amount;
    private boolean isDeposit;
    private BankAccount account;

    public BankTask(BankAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}