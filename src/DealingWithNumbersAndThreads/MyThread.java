package DealingWithNumbersAndThreads;

import java.text.DecimalFormat;

class MyThread implements Runnable{
    static DecimalFormat df = new DecimalFormat("0.00");

    private double[] num;

    private int n;

    public MyThread(double[] num){
        this.num = num;
        this.n = num.length;
    }

    @Override
    public void run(){
        try{
            sum();
            average();
            highest();
            lowest();
        }catch(Exception e){
            System.out.println("Erro occured   inside thread");
        }
    }

    public void average(){
        double sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += num[i];
        }
        System.out.println("Average: " + df.format(sum / 3));
    }

    public void sum(){
        double sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += num[i];
        }
        System.out.println("Sum: " + df.format(sum));
    }

    public void highest(){
        double high = num[0];
        for(int i = 1; i < num.length ; i++){
            if(num[i] > high){
                high = num[i];
            }
        }

        System.out.println("Highest: " + df.format(high));
    }

    public void lowest(){
        double low = num[0];
        for(int i = 1; i < num.length ; i++){
            if(num[i] < low){
                low = num[i];
            }
        }


        System.out.println("Lowest: " + df.format(low));

    }
}