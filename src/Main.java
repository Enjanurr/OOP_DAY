import java.util.*;

class Main{
    public static<T> void generics(T value){
      System.out.println("This is a generic value : " + value);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        generics("janur");
        generics(50);
        generics(67.00);
    }
}