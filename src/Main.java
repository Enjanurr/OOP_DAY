
import java.util.*;

class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Sub<Integer> nums = new Sub<>();


     int num1,num2;

        // Input for num1
        while (true) {
            try {
                System.out.print("Enter num1: ");
                num1 = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }

        // Input for num2
        while (true) {
            try {
                System.out.print("Enter num2: ");
                num2 = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }

        nums.setNum1(num1);
        nums.setNum2(num2);

        int operation;
        boolean isEnable = true;
        while(isEnable){
            try{
                System.out.println("\nChoose operation:");
                System.out.println("1 - Addition");
                System.out.println("2 - Subtraction");
                System.out.println("3 - Multiplication");
                System.out.println("4 - Division");
                System.out.println("5 - Remainder");
                System.out.println("0 - Exit");
                System.out.print("Enter choice: ");

                operation = sc.nextInt();

                switch(operation){
                    case 0: System.out.println("Exiting......");isEnable = false; // this is how you break a loop with switch
                    case 1: nums.add();break;
                    case 2: nums.diff();break;
                    case 3: nums.multiply();break;
                    case 4: nums.divide();break;
                    case 5: nums.rem();break;

                    default: System.out.println("Invalid choice!");
                }
            }catch(Exception e){
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }
    }
}