
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
    
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/healthcare_management";
        String user = "root";
        String pass = "";
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
