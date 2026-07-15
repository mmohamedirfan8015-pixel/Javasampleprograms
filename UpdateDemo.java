import java.sql.*;

public class UpdateDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "irfan@8015";

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "UPDATE employee SET name=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Mohamed irfan");
            ps.setInt(2, 101);

            int rows = ps.executeUpdate();

            System.out.println(rows + " Row Updated");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}