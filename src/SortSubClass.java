import java.text.DecimalFormat;
class SortSubClass implements SortInterface{

    private double[] array ;
    private int size;
    private DecimalFormat df = new DecimalFormat("0.00");


    public SortSubClass(double[] array,int size){
        this.array = array;
        this.size = size;
    }

    public void unSorted(){
        System.out.println("The unsorted values of array:");
        for(int i = 0 ; i < size ; i++){
            System.out.print(df.format(array[i]));
            if(i<size)System.out.print(", ");
        }
    }

    public void sorted(){
        double sum = 0;
        for(int i = 0 ; i < size - 1; i++){
            for(int j = 0 ; j < size - i -1 ; j++){
                if (array[j] < array[j + 1]) {   // flip comparison for descending
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }

        System.out.println();
        System.out.println("The sorted values of array:");
        for(int i = 0 ; i < size ; i++){
            System.out.print(df.format(array[i]));
            if(i<size)System.out.print(", ");
            sum+= array[i];
        }
        System.out.println();
        System.out.println("The sum of the values is : " + df.format(sum));

        System.out.println("The average value is : " +df.format(sum / size));

        System.out.println("The lowest value is : " + df.format(array[size-1]));
    }

}