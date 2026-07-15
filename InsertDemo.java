import java.sql.*;

public class InsertDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "irfan@8015";

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO employee(id,name) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 101);
            ps.setString(2, "irfan");

            int rows = ps.executeUpdate();

            System.out.println(rows + " Row Inserted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}