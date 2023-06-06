
package database;

import logic.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDB {
    public Boolean getUser(String username, String password) {
        Connection con = MyConnection.getConnection();
        String query = "SELECT * FROM employees WHERE username = ? AND password = ?";
        ResultSet rs;
        
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            rs = statement.executeQuery();
            
            if (rs.next()) {
                new User(rs);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
