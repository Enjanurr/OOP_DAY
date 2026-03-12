package SalesCompute;

import java.util.*;
import java.text.DecimalFormat;
public class Compute extends ComputeAbstract{
     private ArrayList<String> prodName = new ArrayList<>();
     private ArrayList<Double> prodPrice = new ArrayList<>();
     private ArrayList<Integer> qty = new ArrayList<>();
     private ArrayList<Double> totalPayment = new ArrayList<>();
     private DecimalFormat df = new DecimalFormat("#,##0.00");

     private double prices = 0;
     private int prodQuan = 0;

     @Override
    public  void setProductName(String name){
        prodName.add(name);
    }
    @Override
    public  void setPrice(double price){
        this.prices = price;
        prodPrice.add(price);
    }
    @Override
    public  void setQty(int quan){
        this.prodQuan = quan;
        qty.add(quan);
    }

    @Override
    public  void computeAmount(){
        totalPayment.add(prodQuan * prices);
    }
    @Override
    public void display(){
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("---SALES RECORD---");
         int count = 1;
         double total = 0;
        for(int i = 0 ; i < prodPrice.size() ;i++ ){
            String name = prodName.get(i);
            double producPrice = prodPrice.get(i);
            int quantity = qty.get(i);

            System.out.println("#" + (i + 1) + "     " + "P" + df.format(producPrice) + " x " + " quantity " + "| Sub - total: P" + df.format(producPrice * quantity ) );
            total += producPrice * quantity;

        }
        System.out.println("----------------------------------------------------");
        System.out.println("                         TOTAL SALES: P" + df.format(total) );
    }
}
