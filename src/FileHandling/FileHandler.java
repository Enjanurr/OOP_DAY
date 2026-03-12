package FileHandling;

import java.util.*;
import java.io.*;

public class FileHandler extends FileAbstract {
    private String content;
    private final String fileName = "Data.txt";
    private ArrayList<String> dataList = new ArrayList<>();

    @Override
    public void setData(String content) {
        this.content = content;
    }

    @Override
    public void addToFile() {
        try {

            FileWriter fw = new FileWriter(fileName,true);
            fw.write(this.content + "\n");
            fw.close();


        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }

    @Override
    public boolean editInFile(int index,String newContent){
        dataList.clear();
        try{

            File file = new File(fileName);
            if(!file.exists()){
                return false;
            }
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                dataList.add(sc.nextLine());
            }
            sc.close();

            if(index < 0 || index >= dataList.size()){
                return false;
            }

            dataList.set(index, newContent);

            FileWriter fw = new FileWriter(fileName);
            for(String s : dataList){
                fw.write(s + "\n");
            }
            fw.close();
            return true;

        }catch(IOException e){
            return false;
        }
    }

    @Override
    public boolean deleteFromFile(int index){
        dataList.clear();

        try{
            File file = new File(fileName);

            if(!file.exists()){
                return false;
            }

            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                dataList.add(sc.nextLine());
            }
            sc.close();
            if(index <0 || index>=dataList.size()){
                return false;
            }

            dataList.remove(index);

            FileWriter fw = new FileWriter(fileName);
            for(String s : dataList){
                fw.write(s + "\n");
            }
            fw.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }


    @Override
    public void displayAll(){
        dataList.clear();
        try{
            File file = new File(fileName);
            if(!file.exists())return;
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                dataList.add(sc.nextLine());
            }
            sc.close();
        }catch(Exception e){
            System.out.println("File error. ");
        }

        System.out.println("\n--OOP STUDENT LIST--");
        for(int i = 0 ; i < dataList.size();i++){
            System.out.println((i+1) + ". " + dataList.get(i));
        }
    }

}