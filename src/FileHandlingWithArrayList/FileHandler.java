package FileHandlingWithArrayList;

import java.util.*;
import java.io.*;
class FileHandler extends FileAbstract {
    private String content;
    private final String fileName = "Data.txt";
    private ArrayList<String> dataList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void writeToFile() {
        dataList.add(this.content);
        try {


            File file = new File(fileName);
            FileWriter fw = new FileWriter(file,true);
            fw.write( dataList.get(dataList.size()-1)+ "\n");

            fw.close();

            System.out.println("Saved successfully.");
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    @Override
    public void readFromFile() {
        dataList.clear();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("No data found.");
            return;
        }

        try {
            Scanner scanFile = new Scanner(file);

            while (scanFile.hasNextLine()) {
                dataList.add(scanFile.nextLine());
            }
            scanFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- ArrayList Content ---");
        for (String item : dataList) {
            System.out.println(item);
        }
    }
}