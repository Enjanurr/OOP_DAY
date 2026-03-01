interface Parent {
    void setLoanAmount(double loanAmount);
    void setRate(double rate);
    void setMonth(int month);
    double totalInterest();
    double totalPayment();
    double monthlyPayment();
    void display();


}
