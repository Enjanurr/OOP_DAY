import java.util.*;
import java.text.DecimalFormat;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Rectangle r = new Rectangle();

        double l,w;

        while(true){
            try{
                System.out.print("Enter length: ");
                l = sc.nextDouble();
                if(l < 0){
                    System.out.println("Invalid length! Value must be postive!");
                    continue;
                }

                r.setLength(l);

                break;
            }catch(InputMismatchException e){
                System.out.println("Invalid length! Error: " + e);
                sc.nextLine();
            }
        }
        while(true){
            try{


                System.out.print("Enter width: ");
                w = sc.nextDouble();
                if(w < 0){
                    System.out.println("Invalid width! Value must be postive!");
                    continue;
                }


                r.setWidth(w);
                System.out.println("Area of the rectangle: " + df.format(r.getArea()));
                break;
            }catch(InputMismatchException e){
                System.out.println("Invalid width! Error: " + e);
                sc.nextLine();
            }
        }
    }
}