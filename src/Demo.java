import java.sql.*;

public class Demo {


    public static void main(String[] args) {

        String sql = "SELECT * FROM customers WHERE customer_id = 13";
        String url = "jdbc:mysql://localhost:3306/sql_store";
        String username = "root";
        String password = "Kannan@26";

        try {
            Connection con = DriverManager.getConnection(url,username,password);

            Statement st = con.createStatement();

            ResultSet rs =  st.executeQuery(sql);

            rs.next();

            //ResultSetMetaData rsm = st.executeQuery(sql).getMetaData();


           // System.out.println(rs.getFetchSize());

            for (int i = 1; i < 10; i++) {
                System.out.print(rs.getString(i) + " ");
            }

            //con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
