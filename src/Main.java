import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Sub s = new Sub();
        int choice ;
        String input ;
        while(true){
            System.out.println("Press 1 - To add");
            System.out.println("Press 2 - To update");
            System.out.println("Press 3 - To delete");
            System.out.println("Press 4 - To display");
            System.out.println("Press 0 - To exit");


            while(true){
                try{
                    System.out.print("Enter choice :");
                    choice = sc.nextInt();
                    sc.nextLine();  // clear the buffer
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Invalid choice!");
                    sc.nextLine();
                }
            }
            if(choice == 1){

                System.out.print("Enter a text to add : ");
                input = sc.nextLine();
                s.add(input);
                System.out.println("Text has been successfully added!");


            }else if(choice == 2){

                int index;
                System.out.print("Enter index value: ");
                index = sc.nextInt();
                s.update(index);
                System.out.println("Text has been successfully updated!");

            }else if(choice == 3){

                System.out.print("Enter value to delete: ");
                input = sc.nextLine();
                s.delete(input);
                System.out.println("Text has been successfully removed!");

            }else if(choice == 4){
                System.out.println("The arraylist values are:");
                s.display();
            }else if(choice == 0){
                System.out.println("Good bye!");
                break;
            }

        }
    }
}