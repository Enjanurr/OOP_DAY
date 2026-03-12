package Wrapper;

import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Child<Integer, String> c = new Child<>();

        c.setData1(20);
        c.setData2("Janurr");
        c.display();
        System.out.println("Returned: " + c.getData1() + " " + c.getData2());
    }
}
