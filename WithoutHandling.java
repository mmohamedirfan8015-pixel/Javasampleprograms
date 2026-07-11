import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WithoutHandling {
    public static void main(String[] args) {

        FileReader file = null;

        try {
            file = new FileReader("data.txt");
            System.out.println("File Opened Successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } finally {
            if (file != null) {
                try {
                    file.close();
                    System.out.println("File Closed Successfully");
                } catch (IOException e) {
                    System.out.println("Error while closing file");
                }
            }
        }
    }
}