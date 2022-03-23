package con_mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class main {
    public static void main(String[] args){

        Connection conn= null;
        try {
            conn = DBconnect.getConnection();
            Statement smt = conn.createStatement();
            ResultSet rs=smt.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
