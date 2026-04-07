package Sales;

public abstract class PointOfSale {
    public abstract void addProductRecord(String record);
    public abstract double getTotalSales();
    public abstract void displayReport();
}
