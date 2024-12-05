import java.sql.*;

public class Part_4 {

    //Inserting the value


    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo" ;
        String username = "root";
        String password = "Kannan@26";

        int userId = 6;
        String userName = "nandhu";
        String place = "africa";
        //String query = "INSERT INTO person VALUE ("+ userId +", '"+ userName +"' , '"+ place + "')";
        String query = "INSERT INTO person VALUE (?,?,?)";
        System.out.println(query);


        try {

            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement st = con.prepareStatement(query);

            st.setInt(1,userId);
            st.setString(2,userName);
            st.setString(3,place);

            int count = st.executeUpdate();
            System.out.println(count);

//            System.out.println(rs);
//
//            while(rs.next())
//            {
//                String userData = rs.getInt(1) + " " + rs.getString(2);
//                System.out.println(userData);
//            }

            st.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
