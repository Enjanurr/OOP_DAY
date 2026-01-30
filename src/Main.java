//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   PayrollCompute pc = new PayrollCompute();
   DecimalFormat df = new DecimalFormat("#,###.00");
    double input;
    while(true){
        try{
            System.out.print("Enter hours: ");
            input = scan.nextDouble();
            if(input<0){
                System.out.println("Input must be positive");
                continue;
            }
            pc.setHours(input);
            pc.compute();
            System.out.println("Salary: PHP " + df.format(pc.display()));
            break;
        }catch(Exception e){
            System.out.println("Invalid input. Must be double");
            scan.nextLine();
        }
    }


    }
}