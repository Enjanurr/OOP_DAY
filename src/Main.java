import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ComputePayroll p = null;
        double h;
        while(true){
            try{

                System.out.print("Enter hours worked: ");
                h = sc.nextDouble();
                if(h<0){
                    System.out.println("Invalid input! Please enter a positive value.");
                    continue;
                }

                p = new ComputePayroll(h);
                p.compute();
                p.display();
                break;
            }catch(Exception e){
                System.out.println("Invalid input! Please enter a valid value.");
                sc.nextLine();
            }
        }
    }
}