//reading data from file
import java.io.File;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()){           //true
                String data = reader.nextLine();
                System.out.println(data);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
