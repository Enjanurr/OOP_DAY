import java.util.*;
class Sub implements InterfaceFile{
    private String[] names = new String[10];
    private int count = 0;
    private Scanner sc = new Scanner(System.in);
    @Override
    public void add(String input){
        names[count] = input;
        this.count++;
    }

    @Override public void delete(String input){
        int i ;
        for( i = 0 ; i < count ; i++){
            if(names[i].equals(input)) break;

        }
        for(int j = i ; j < count -1; j++){
            names[j] = names[j+1];

        }
        names[count-1] = null;
        this.count--; }

    @Override
    public void update(int index){

        System.out.print("Enter text for update: ");
        String newText = sc.nextLine();
        names[index] = newText;

    }

    @Override
    public void display(){
        for(int i = 0 ; i < count ;i++){
            System.out.println(i + " - " + names[i]);
        }
    }
}