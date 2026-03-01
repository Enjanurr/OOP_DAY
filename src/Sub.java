
import java.text.DecimalFormat;
public class Sub implements Parent{

    private double loanAmount,rate;
    private int month;
    private DecimalFormat df = new  DecimalFormat("#,##0.00");
    private DecimalFormat per = new DecimalFormat("0.00");

    //public Child(){}

    @Override
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    @Override
    public void setRate(double rate){
        this.rate = rate;
    }
    @Override
    public void setMonth(int month){
        this.month = month;
    }
    @Override
    public double totalInterest(){
        return loanAmount * (rate/100);
    }
    @Override
    public double totalPayment(){
        return totalInterest() + loanAmount;
    }
    @Override
    public double monthlyPayment(){
        return totalPayment() / month;
    }
    @Override
    public void display() {
        System.out.println("Loan Amount        : ₱" + df.format(loanAmount));
        System.out.println("Interest Rate      : " + per.format(rate) + "%");
        System.out.println("Loan Duration      : " + month + " months");
        System.out.println("Total Interest     : ₱" + df.format(totalInterest()));
        System.out.println("Total Payment      : ₱" + df.format(totalPayment()));
        System.out.println("Monthly Payment    : ₱" + df.format(monthlyPayment()));
    }

}