package SalesCompute;

public abstract class ComputeAbstract {
    public abstract void setProductName(String name);
    public abstract void setPrice(double price);
    public abstract void setQty(int quan);

    public abstract void computeAmount();
    public abstract void display();
}
