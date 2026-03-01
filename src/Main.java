import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Sub s = new Sub();
        double loanAmount = 0 ,rate = 0;
        int month = 0;
        // loanAmount;
        while(true){
            try{
                System.out.print("Enter amount: ");
                loanAmount = sc.nextDouble();
                if(loanAmount<1){
                    System.out.println("No negative values!");
                    continue;
                }else{
                    s.setLoanAmount(loanAmount);
                    break;
                }

            }catch(Exception e){
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }

        //rate
        while(true){
            try{
                System.out.print("Enter Rate (minimum of 1.5): ");
                rate = sc.nextDouble();
                if(rate< 1.5){
                    System.out.println("Minimum of 1.5");
                    continue;
                }else{
                    s.setRate(rate);
                    break;
                }

            }catch(Exception e){
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }
        // month
        while(true){
            try{
                System.out.print("Enter month (3 - 36): ");
                month = sc.nextInt();
                if(month< 3 || month > 36){
                    System.out.println("Month must be 3 - 37");
                    continue;
                }else{
                    s.setMonth(month);
                    break;
                }

            }catch(Exception e){
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }

        s.totalInterest();
        s.totalPayment();
        s.monthlyPayment();
        s.display();

    }
}