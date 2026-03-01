

public class Sub<T extends Number> implements Parent<T>{
    private T n1,n2;
    @Override
    public void setNum1(T num1){
        this.n1 = num1;
    }
    @Override
    public void setNum2(T num2){
        this.n2 = num2;
    }
    @Override

    public void add(){
        double add = n1.doubleValue() + n2.doubleValue();
        System.out.println("Add: " + add);
    }
    @Override
    public void diff(){
        double diff = n1.doubleValue() - n2.doubleValue();
        System.out.println("Difference: " + diff);
    }
    @Override
    public void multiply(){
        double mult = n1.doubleValue() * n2.doubleValue();
        System.out.println("Multiply: " + mult);
    }
    @Override
    public void divide(){
        if(n2.doubleValue() == 0){
            System.out.println("Invalid");
            return;
        }
        double div = n1.doubleValue() / n2.doubleValue();
        System.out.println("Divide: " + div);
    }
    @Override
    public void rem(){
        if(n2.doubleValue() == 0){
            System.out.println("Invalid");
            return;
        }
        double rem = n1.doubleValue() % n2.doubleValue();
        System.out.println("Remainder: " + rem);
    }
}