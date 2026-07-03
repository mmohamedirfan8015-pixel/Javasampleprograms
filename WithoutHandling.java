import java.io.FileReader;
public class WithoutHandling {
    public static void main(String[] args){
        try{
        FileReader file=new FileReader("data.txt");
        System.out.println("File Opened Successfully");
        } catch(filenotfoundexpeption e){
            System.out.println("File Not Found");
        }
        
    }
}
