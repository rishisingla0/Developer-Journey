import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "Rishi@1212";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM student";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + " | " + name + " | " + marks);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
