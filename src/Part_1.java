import java.sql.*;

public class Part_1 {


    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/train" ;
        String username = "root";
        String password = "Kannan@26";
        String query = "SELECT * FROM customer WHERE Id = 1";


        try {
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            rs.next();

            ResultSetMetaData rsm = rs.getMetaData();
            int count = rsm.getColumnCount();
            System.out.println(count);


            for (int i = 1; i <= count; i++) {
                System.out.println(rs.getString(i));
            }
            String output = rs.getString(1);
            System.out.println(output);

            st.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
