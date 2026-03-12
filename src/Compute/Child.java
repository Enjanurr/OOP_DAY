package Compute;

import java.text.DecimalFormat;
public class Child<T extends Number> implements Parent<T> {
    static DecimalFormat df = new DecimalFormat("0.00");
    private T rate , loan , month;
    @Override
    public void setLoan(T loan){
        this.loan = loan;
    }
    @Override
    public void setRate(T rate){
        this.rate = rate;
    }
    @Override
    public void setMonth(T month){
        this.month = month;
    }

    @Override
    public double totalInterest(){
        return ((rate.doubleValue() / 100) + 1) * loan.doubleValue();
    }
    @Override
    public double monthly(){
        return payable() / month.doubleValue();
    }
    @Override
    public double payable(){
        return totalInterest();
    }
    @Override
    public void display(){
        System.out.println("Loan: " + loan);
        System.out.println("Rate: " + rate);
        System.out.println("Months: " + month);
        System.out.println("Total Interest: " + df.format(totalInterest()));
        System.out.println("Payable: " + df.format(payable()));
        System.out.println("Monthly: " + df.format(monthly()));
    }
}
