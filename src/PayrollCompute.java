
public class PayrollCompute extends Payroll {

    private double hoursWorked;
    private double rate = 450.00;
    private double salary;
    @Override
    public   void setHours(double hrs){
        this.hoursWorked = hrs;
    }
    @Override
    public  void compute(){
        this.salary = rate * hoursWorked;
    }
    @Override
    public  double display(){
        return salary;
    }
}
