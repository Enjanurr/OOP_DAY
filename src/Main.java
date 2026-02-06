import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        AverageCalculator a = new AverageCalculator();
        double f,s;

        while(true){
            try{

                System.out.print("Enter first number: ");
                f = sc.nextDouble();
                a.setFirst(f);
                break;
            }catch(InputMismatchException e){
                System.out.println("Error: Please enter a valid number.");
                sc.nextLine();
            }
        }

        while(true){
            try{


                System.out.print("Enter second number: ");
                s = sc.nextDouble();
                a.setSecond(s);
                a.display();
                break;
            }catch(InputMismatchException e){
                System.out.println("Error: Please enter a valid number.");
                sc.nextLine();
            }
        }

    }
}