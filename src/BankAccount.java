class BankAccount extends Bank{
    private double accountBalance;

    public BankAccount(double accountBalance){
        this.accountBalance = accountBalance;
    }
    @Override
    public void setBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    @Override
    public double getBalance(){
        return accountBalance;
    }
}