import java.text.DecimalFormat;
class ComputePayroll extends Payroll{
    private double hrs;
    private double salary;
    private DecimalFormat df = new DecimalFormat("#,###.00");
    public ComputePayroll(double hrs){
        this.hrs = hrs;
    }

    public void compute(){
        this.salary = hrs * 500;
    }
    public void display(){
        System.out.println("Gross Pay: PHP " + df.format(salary));
    }

}