package LoanCalculator;

public interface LoanOperations {
    void setLoanAmount(double amount);
    void setMonthsToPay(int months);
    void setInterestRate(double rate);

    double calculateTotalInterest();
    double calculateMonthlyPayment();
    double calculateTotalPayment();
    void displayLoanDetails();
}