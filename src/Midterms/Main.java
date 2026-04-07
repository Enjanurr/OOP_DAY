package Midterms;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileHandler handler = new FileHandler();
        int choice = 0;

        // System.out.println("Simple File Handling with ArrayList");

        while (true) {
            System.out.println("--OOP STUDENT LIST--");
            try {
                System.out.println("\n1. Add");
                System.out.println("2. Edit");
                System.out.println("3. Delete");
                System.out.println("4. Display");
                System.out.println("5. Exit");


                System.out.print("Enter Choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Input: ");
                        handler.setData(sc.nextLine());
                        handler.addToFile();
                        System.out.println("Added.");
                        break;
                    case 2:

                        while(true){
                            System.out.println();
                            handler.displayAll();

                            System.out.print("ID to edit (or 0 to cancel): ");
                            int index = sc.nextInt();

                            sc.nextLine(); // always remember to add buffer to int inputs

                            if(index == 0) break;

                            System.out.print("New value: ");
                            String newVal = sc.nextLine();



                            if(handler.editInFile(index-1,newVal)){
                                System.out.println("Updated.");
                                break;
                            }else{
                                System.out.println("Error: Index does not exist!");
                            }

                        }
                        break;
                    case 3:

                        while(true){
                            System.out.println();
                            handler.displayAll();
                            System.out.print("ID to delete (or 0 to cancel): ");
                            int index = sc.nextInt();
                            sc.nextLine();

                            if(index == 0) break;

                            if(handler.deleteFromFile(index-1)){
                                System.out.println("Deleted.");
                                break;
                            }else{
                                System.out.println("Error: Index does not exist!");
                            }

                        }

                        break;
                    case 4:
                        System.out.println();
                        handler.displayAll();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice.");

                }
            } catch (Exception e) {

            }
        }

    }
}