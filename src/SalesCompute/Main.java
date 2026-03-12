package SalesCompute;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Compute c = new Compute();

      String prodName = "";
      int project = 1;
        while(true){
            try{
                System.out.println("---OOPC GADGETS STORE---");
                System.out.println("Input products (Enter 0 to stop):");
                System.out.println("---Product no. " + project + "---");

                System.out.print("Product name: ");
                prodName = sc.nextLine();

                if(prodName.equals("0")){
                    c.display();
                    break;
                }

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Sold QTY: ");
                int sold = sc.nextInt();
                sc.nextLine();
                project++;

                c.setProductName(prodName);
                c.setPrice(price);
                c.setQty(sold);
                c.computeAmount();


            }catch(Exception e){
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
    }
}
