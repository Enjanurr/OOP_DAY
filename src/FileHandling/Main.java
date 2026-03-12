package FileHandling;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileAbstract handler = new FileHandler();
        int choice = 0;


        while (true) {

            System.out.println("--OOP STUDENT LIST--");

            try {
                System.out.println("\n1. Add");
                System.out.println("2. Edit");
                System.out.println("3. Delete");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.print("Enter Choice: ");
                choice = input.nextInt();

                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Input: ");
                        handler.setData(input.nextLine());
                        handler.addToFile();
                        System.out.println("Added.");
                        break;
                    case 2:
                        while(true){

                            handler.displayAll();

                            System.out.print("ID to edit (or 0 to cancel): ");
                            int id = input.nextInt();
                            input.nextLine();

                            if(id == 0){
                                break;
                            }
                            System.out.print("New value: ");
                            String newVal = input.nextLine();

                            if(handler.editInFile(id-1,newVal)){
                                System.out.println("Updated.");
                                break;
                            }else{
                                System.out.println("Error: Index does not exist!");
                            }
                        }


                        break;
                    case 3:
                        while(true){
                            handler.displayAll();
                            System.out.print("ID to delete (or 0 to cancel): ");
                            int id = input.nextInt();

                            if(id==0) break;
                            if(handler.deleteFromFile(id-1)){
                                System.out.println("Deleted.");
                                break;
                            }else{
                                System.out.println("Error: Index does not exist!");
                            }
                        }

                        break;
                    case 4:

                        handler.displayAll();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        input.close();
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {

            }
        }
        //  input.close();
    }
}