package Sales;

import java.util.*;
import java.text.DecimalFormat;
public class SaleCompute extends PointOfSale {
    private ArrayList<String> records = new ArrayList<>();
    private DecimalFormat df = new DecimalFormat("#,##0.00");
    private double totalSales =0;



    @Override
    public void addProductRecord(String record) {
       records.add(record);

    }

    @Override
    public double getTotalSales() {

        for (String s : records) {
            String[] parts = s.split(",");
            double price = Double.parseDouble(parts[1]);
            int qty = Integer.parseInt(parts[2]);
            totalSales += price * qty;
        }
        return totalSales;
    }

    @Override
    public void displayReport() {
        System.out.println("\n--- SALES RECORD ---");
        int num = 1;
        for (String s : records) {
            String[] parts = s.split(",");
            String name = parts[0];
            double price = Double.parseDouble(parts[1]);
            int q = Integer.parseInt(parts[2]);

            double sub = price * q;

            System.out.println("#" + num + "\t₱" + name + " ₱" + df.format(price) + " x" + q  + " | Subtotal: P" + df.format(sub));
            num++;
        }
    }

}
