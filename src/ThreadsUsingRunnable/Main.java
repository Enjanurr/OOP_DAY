package ThreadsUsingRunnable;

import java.util.*;

class Main{
    public static void main(String[] args){

        MyThread task1 = new MyThread("Thread 1", 5000,5);
        MyThread task2 = new MyThread("Thread 2", 1000,1);
        MyThread task3 = new MyThread("Thread 3", 10000,10);
        MyThread task4 = new MyThread("Thread 4", 7000,7);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);

        thread3.start();
        thread2.start();
        thread4.start();
        thread1.start();

        System.out.println("Is Thread 1 alive? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive? " + thread2.isAlive());
        System.out.println("Is Thread 3 alive? " + thread3.isAlive());
        System.out.println("Is Thread 4 alive? " + thread4.isAlive());

        try{
            thread3.join();
            thread2.join();
            thread4.join();
            thread1.join();

        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }

        System.out.println("Is Thread 1 alive after join? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive after join? " + thread2.isAlive());
        System.out.println("Is Thread 3 alive after join? " + thread3.isAlive());
        System.out.println("Is Thread 4 alive after join? " + thread4.isAlive());

    }
}