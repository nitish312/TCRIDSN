//FileWriter to write data in file name as example.txt
// \n to write on next line
import java.io.FileWriter;

public class file1 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("example.txt");
            fw.write("hi hello");
            fw.write("\nWelcome to the java course of TCR");
            fw.close();
        }
        catch (Exception ex1){
            System.out.println("error");
        }
    }
}