import java.sql.*;

public class ReadDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "irfan@8015";

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getInt("id") + " " + rs.getString("name"));

            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
