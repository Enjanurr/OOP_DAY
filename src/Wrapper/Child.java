package Wrapper;

public class Child<T,V> implements Parent<T,V> {
    private T data1;
    private V data2;

    @Override
    public void setData1(T data1) {
        this.data1 = data1;
    }

    @Override
    public void setData2(V data2) {
        this.data2 = data2;
    }

    @Override
    public void display() {
        System.out.println("Printed data: " + data1 + " and " + data2);
    }

    @Override
    public T getData1() {
        return data1;
    }

    @Override
    public V getData2() {
        return data2;
    }


}
