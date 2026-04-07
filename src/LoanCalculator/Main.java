package LoanCalculator;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double amount = 0, rate = 0;
        int month = 0;
        LoanCalculator l = new LoanCalculator();



        System.out.println("BEBEKOH LOAN CALCULATOR");

        // get the amount
        while(true){
            try{
                System.out.print("Input Loanable Amount (Min 5,000): ");
                amount = sc.nextDouble();

                if(amount < 5000){
                    System.out.println("Error: Minimum amount is ₱5,000.00.");
                    continue;
                }
                l.setLoanAmount(amount);
                break;

            }catch(Exception e){
                System.out.println("Error: Please enter a valid number.");
                sc.nextLine();
            }
        }

        // get the month
        while(true){
            try{

                System.out.print("Input Months to Pay (3 - 36): ");
                month = sc.nextInt();

                if(month < 3 || month >36){
                    System.out.println("Error: Term must be between 3 and 36 months.");
                    continue;
                }
                l.setMonthsToPay(month);
                break;
            }catch(Exception e){
                System.out.println("Error: Please enter a whole number.");
                sc.nextLine();
            }
        }

        // get the rate
        while(true){
            try{
                System.out.print("Input Interest Rate (Min 1.5%): ");
                rate = sc.nextDouble();

                if(rate < 1.5){
                    System.out.println("Error: Minimum interest rate is 1.5%.");
                    continue;
                }
                l.setInterestRate(rate);
                break;
            }catch(Exception e){
                System.out.println("Error: Please enter a valid number.");
                sc.nextLine();
            }
        }

        l.calculateTotalInterest();
        l.calculateMonthlyPayment();
        l.calculateTotalPayment();
        l.displayLoanDetails();
    }
}