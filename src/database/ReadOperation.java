
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadOperation {
    Connection con = MyConnection.getConnection();
    
    public ResultSet readAll(String tableName) {
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

    public ResultSet readPatientData(int id) {
        String query = "SELECT * FROM patients WHERE id = " + id;
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

    public ResultSet readHealthCondition(int id) {
        String query = "SELECT * FROM health_conditions WHERE patient_id  = " + id;
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
        System.out.println("Patient Health Conditon ResultSet is Empty. Patient ID = " + id);
        return null;
    }

    public ResultSet readPersonData(String keyword, String filter, String table) {
        String query = "SELECT * FROM " + table + " WHERE " + filter + " = ?";
        ResultSet rs;
        
        try {
            PreparedStatement statement = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.setString(1, keyword);
            
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
