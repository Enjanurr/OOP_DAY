import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size;
        SortSubClass s = null;

        while(true){
            try{
                System.out.print("Enter array size: ");
                size = sc.nextInt();
                if(size<0){
                    System.out.println("Invalid size");
                    continue;
                }

                break;
            }catch(Exception e){
                System.out.println("Invalid array size!");
                sc.nextLine();
            }
        }


        double[] array = new double[size];


        for(int i = 0 ; i < size ; i++){
            while(true){
                try{


                    System.out.print("Enter value at array index " + i + ": ");
                    array[i] = sc.nextDouble();

                    break;
                }catch(Exception e){
                    System.out.println("Invalid array value!");
                    sc.nextLine();
                }
            }
        }


        s = new SortSubClass(array,size);

        s.unSorted();
        s.sorted();

    }
}