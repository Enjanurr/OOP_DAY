package DealingWithNumbersAndThreads;

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[3];
        System.out.print("Enter 3 numbers :");


        for(int i = 0 ; i < 3 ; i++){
            nums[i] = sc.nextDouble();
        }

        MyThread task = new MyThread(nums);
        Thread thread = new Thread(task);
        thread.start();
        try{
            thread.join();
        }catch(InterruptedException e){
            System.out.println("Thread execution interrupted");
        }


    }
}