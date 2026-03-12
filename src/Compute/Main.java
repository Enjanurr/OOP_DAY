package Compute;

public class Main {
    public static void main(String args[]){
        Child<Integer> i = new Child<>();
        Child<Double> d = new Child<>();

        i.setLoan(4000);
        i.setRate(20);
        i.setMonth(4);
        i.totalInterest();
        i.payable();
        i.monthly();
        i.display();

        System.out.println();
        d.setLoan(4000.00);
        d.setRate(20.00);
        d.setMonth(4.00);
        d.totalInterest();
        d.payable();
        d.monthly();
        d.display();
    }
}
