import java.text.DecimalFormat;
public class AverageCalculator implements Compute{
    private double f;
    private double s;
    private DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public void setFirst(double f){
        this.f= f;
    }
    @Override
    public void setSecond(double s){
        this.s = s ;
    }
    @Override
    public void display(){
        System.out.println("Average of " + df.format(f) + " and " + df.format(s) + " is: " + df.format((f+s)/2));
    }

}