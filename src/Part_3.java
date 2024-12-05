import java.sql.*;

public class Part_3 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/train" ;
        String username = "root";
        String password = "Kannan@26";
        String query = "SELECT * FROM customer";




        try {

            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println(rs);

            while(rs.next())
            {
                String userData = rs.getInt(1) + " " + rs.getString(5);
                System.out.println(userData);
            }

            st.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
