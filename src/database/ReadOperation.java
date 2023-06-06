
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.User;

public class ReadOperation {
    Connection con = MyConnection.getConnection();
    
    public ResultSet getDoctors() {
        String query = "SELECT * FROM employees WHERE role = 'Doctor'";
        ResultSet rs;
        
        try {
            PreparedStatement statement = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = statement.executeQuery();
            
            if (rs.next()) {
                rs.beforeFirst();
                return rs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getPatients() {
        String tableName = "patients";
        String query = "SELECT * FROM " + tableName;
        ResultSet rs;

        try {
            PreparedStatement statement = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = statement.executeQuery();

            if (rs.next()) {
                rs.beforeFirst();
                return rs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getDrugs() {
        String query = "SELECT * FROM drugs";
        ResultSet rs;
        
        try {
            PreparedStatement statement = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = statement.executeQuery();
            
            if (rs.next()) {
                rs.beforeFirst();
                return rs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
