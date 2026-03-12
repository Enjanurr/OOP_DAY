package Compute;

interface Parent<T extends Number> {
    void setLoan(T loan);
    void setRate(T rate);
    void setMonth(T month);
    double totalInterest();
    double monthly();
    double payable();
    void display();
}
