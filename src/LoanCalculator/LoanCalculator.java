package LoanCalculator;

import java.text.DecimalFormat;

public class LoanCalculator implements LoanOperations{

    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static DecimalFormat per = new DecimalFormat("0.0");
    private double amount = 0 , rate = 0;
    private int months = 0;

    public void setLoanAmount(double amount){
        this.amount = amount;
    }

    public void setMonthsToPay(int months){
        this.months = months;
    }

    public void setInterestRate(double rate){
        this.rate = rate;
    }


    public  double calculateTotalInterest(){
        return amount * (rate / 100);
    }
    public double calculateMonthlyPayment(){
        return  calculateTotalPayment() / months;
    }
    public double calculateTotalPayment(){
        return amount + calculateTotalInterest();
    }

    public void displayLoanDetails(){
        System.out.println("\n======================================");
        System.out.println("        BEBEKOH LOAN COMPANY");
        System.out.println("       Official Loan Statement");
        System.out.println("======================================");

        System.out.println("Loan Amount     : ₱" + df.format(amount));
        System.out.println("Interest Rate   : " + per.format(rate) + "%");
        System.out.println("Repayment Term  : " + months + " Months");

        System.out.println("--------------------------------------");

        System.out.println("TOTAL INTEREST  : ₱" + df.format(calculateTotalInterest() ) );
        System.out.println("MONTHLY PAYMENT : ₱" + df.format(calculateMonthlyPayment() ) );
        System.out.println("TOTAL PAYABLE   : ₱" + df.format(calculateTotalPayment() ) );

        System.out.println("======================================");
        System.out.println("    Thank you for choosing BEBEKOH!");
    }
}