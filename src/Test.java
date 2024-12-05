import java.sql.*;

public class Test {


    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservation","root","Kannan@26");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM admin");



        while(rs.next())
        {
            int col = rs.getMetaData().getColumnCount();
            System.out.println(col);
            for(int i = 1; i <= col; i++){
                System.out.print(rs.getString(i) + " ");
            }
        }
        String name = "karthik@gmail.com";
        System.out.println(name.equals("karthik@gmail.com"));

    }
}
