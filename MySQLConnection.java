import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "irfan@8015";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected Successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}