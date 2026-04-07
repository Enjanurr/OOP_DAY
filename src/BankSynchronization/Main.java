package BankSynchronization;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00"); //
        Scanner scanner = new Scanner(System.in); //

        System.out.print("Enter initial balance: "); //
        BankAccount obj = new BankAccount(scanner.nextDouble());//

        System.out.print("Enter deposit amount: "); //
        double deposits = scanner.nextDouble();  //
        // obj.deposit(deposits);

        System.out.print("Enter withdrawal amount: ");
        double withdraw = scanner.nextDouble();
        //obj.withdraw(scanner.nextDouble());


        // Accept deposit and withdrawal amounts


        // Create tasks (deposit and withdraw operations)
        BankTask depositTask1 = new BankTask(obj, true,deposits);
        BankTask depositTask2 = new BankTask(obj, false,withdraw);

        // Create threads
        Thread thread1 = new Thread(depositTask1,"Thread-1");
        Thread thread2 = new Thread(depositTask2,"Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Final balance: " + df.format(obj.getBalance()));
    }
}