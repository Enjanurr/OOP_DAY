package Sales;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SaleCompute pos = new SaleCompute();

       try{

           int num = 1;
           System.out.println("--- OOPC GADGETS STORE ---");
           System.out.println("Input Products (Enter '0' to stop):");

           while (  true ) {
               System.out.println("--- Product no. " + num + " ---");
               System.out.print("Product Name: ");
               String name = input.nextLine();

               if(name.equals("0")){

                   break ;
               }

               System.out.print("Price: ");
               String price = input.next();

               System.out.print("Sold Qty: ");
               String qty = input.next();

               input.nextLine();

               pos.addProductRecord(name + "," + price + "," + qty);

               num++;

           }

           pos.displayReport();
           System.out.println("---------------------------");
           System.out.println("TOTAL SALES: " + pos.getTotalSales());


       }catch(Exception e){
           System.out.println("Invalid input");
           input.nextLine();
       }
    }
}
