package FileHandling;

public abstract class FileAbstract {


    public abstract void setData(String content);
    public abstract void addToFile();
    public abstract boolean editInFile(int index, String newContent);
    public abstract boolean deleteFromFile(int index);
    public abstract void displayAll();


}