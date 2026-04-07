package Midterms;

import java.io.*;
import java.util.*;

public class FileHandler extends FileAbstract {
    private String content;
    private final String fileName = "Data.txt";
    private ArrayList<String> dataList = new ArrayList<>();

    @Override
    public void setData(String content) {
        this.content = content;
    }

    @Override
    public  void addToFile(){
        dataList.add(content);
        try{
            // make a File
            File file = new File(fileName);
            // make a file writer
            FileWriter fw = new FileWriter(file,true);
            // use the array to get the last added content

            fw.write(content + "\n");

            fw.close();



        }catch(IOException  e){
            System.out.println("Error: " + e.getMessage());

        }
    }

    @Override
    public  boolean editInFile(int index, String newContent){
        dataList.clear();
        try{

            // make a file first
            File file = new File(fileName);
            if(!file.exists()){
                return false;
            }
            // scan the file
            Scanner scan = new Scanner(file);

            // as long as it has next line and add to the arrayList
            while(scan.hasNextLine()){
                dataList.add(scan.nextLine());
            }

            // just conditions
            if(index <0 || index >= dataList.size()){
                return false;
            }
            // edit it in arrayList
            dataList.set(index,newContent);

            // make a file writer
            FileWriter fw = new FileWriter(file,false);

            for(String s : dataList){
                fw.write( s + "\n");
            }

            fw.close();

            return true;
        }catch(Exception e){
            return false;

        }

    }

    @Override
    public  boolean deleteFromFile(int index){
        dataList.clear();
        try{

            File file = new File(fileName);
            if(!file.exists()){
                return false;
            }
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                dataList.add(scan.nextLine());
            }


            if(index < 0 || index >= dataList.size()){
                return false;
            }
            dataList.remove(index);

            FileWriter fw = new FileWriter(file,false);
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
    public  void displayAll(){
        dataList.clear();
        try{

            File file = new File(fileName);

            Scanner scan =  new Scanner(file);

            while(scan.hasNextLine()){
                dataList.add(scan.nextLine());
            }

            int num = 1;
            System.out.println("--OOP STUDENT LIST--");
            for(String s: dataList){
                System.out.println(num + ". " + s);
                num++;
            }

        }catch(IOException  e){
            System.out.println("Error: " + e.getMessage());

        }
    }

}
