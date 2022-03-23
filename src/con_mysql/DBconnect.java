package con_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    private static String url="jdbc:mysql://localhost:3306/test?characterEncoding=utf8";
    private static String user="root";
    private static String pass="qqpp1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,pass);
    }
}
