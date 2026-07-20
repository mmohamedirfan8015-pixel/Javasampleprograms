
import java.io.FileReader;

public class CheckedException{
    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("student.txt");
            System.out.println("File Opened Successfully.");
            f.close();

        }catch (Exception e) {

            System.out.println("File Not Found.");   
        }  
    }
}
