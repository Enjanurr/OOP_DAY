package FileHandlingWithArrayList;

import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileAbstract handler = new FileHandler();
        int choice = 0;

        System.out.println("Simple File Handling with ArrayList");

        while (choice != 3) {
            try {
                System.out.println("\n[1] Add\n[2] Display\n[3] Exit");
                System.out.print("Enter Choice: ");
                choice =  input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter text: ");
                        handler.setContent(input.nextLine());
                        handler.writeToFile();
                        break;
                    case 2:

                        handler.readFromFile();
                        //handler.writeToFile();
                        break;

                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid number. Choose 1-3.");
                }
            } catch (Exception e) {
                System.out.println("Error: Letters are not allowed. Please enter a number.");
                input.nextLine();
            }
        }
        input.close();
    }
}