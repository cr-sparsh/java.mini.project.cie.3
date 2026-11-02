
package demomysql;

import java.sql.*;
public class Demomysql {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/simple_db   ?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user="root";
        String pwd="123";
        Connection con=DriverManager.getConnection(url,user,pwd);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(
        "SELECT * FROM users");
    
        while(rs.next())
    {
        System.out.println(rs.getInt("ID")+" "+rs.getString("name"));
    }
        con.close();
        st.close();
        rs.close();
    
    }
}
