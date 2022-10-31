
package khungproject.Repository;

import java.sql.*;


public class DBConnection {

public static Connection connection(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=du_an_mau_1;encrypt=true;trustServerCertificate=true","abc","123456");
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
