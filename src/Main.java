import java.util.*;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        int choice=0;
        double amount;
        double balance;
        BankAccount objBA = new BankAccount(5000.00);

        while(true){
            System.out.println("---OOP BANK---");
            System.out.println("Press 1 to Deposit");
            System.out.println("Press 2 to Withdraw");
            System.out.println("Press 3 to Balance Inquiry");
            System.out.println("Press 4 to Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            if(choice == 1){
                balance = objBA.getBalance();
                System.out.print("Enter Deposit Amount Php: ");
                amount = sc.nextDouble();
                amount = balance + amount;
                objBA.setBalance(amount);
                choice=0;
            }
            else if(choice == 2){
                balance = objBA.getBalance();
                System.out.print("Enter Withdraw Amount Php: ");
                amount = sc.nextDouble();
                if( amount > balance || balance < 1  ){
                    do{
                        System.out.println("Sorry, the transaction cannot be processed, \nwithdrawal amount cannot be less tan 0 or higher than your remaining balance. \nPlease enter an acceptable amount.");
                        System.out.print("Enter Withdraw Amount Php: ");
                        amount = sc.nextDouble();
                        if(amount >= balance){
                            break;
                        }
                    }while( amount > balance   );
                }

                balance = balance - amount;
                objBA.setBalance(balance);
                System.out.println("Successfully Withdrwan Php: " + df.format(amount));
                System.out.println("New Balance Php: " + df.format(objBA.getBalance()));
                choice=0;
            }
            else if(choice == 3 ){
                System.out.println("Available Balance Php: " + df.format(objBA.getBalance()));
                choice=0;

            }
            else if(choice == 4){
                System.out.println("Thank you for choosing OOP Bank!");
                choice=0;
                break;
            }else{
                System.out.println("Invalid Choice! Please Try Again!");
            }

        }

    }
}