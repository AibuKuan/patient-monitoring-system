
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateOperation {
    Connection con = MyConnection.getConnection();

    public int updateHealthCondition(String name, String description, String complication, String diagnosis_date, String severity, String notes, int health_id) {
        String query = "UPDATE health_conditions SET name = ?, description = ?, complication = ?, diagnosis_date = ?, severity = ?, notes = ? WHERE id = " + health_id;
        
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, description);
            statement.setString(3, complication);
            statement.setString(4, diagnosis_date);
            statement.setString(5, severity);
            statement.setString(6, notes);

            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientName(String fname, String mname, String lname, int id) {
        String query = "UPDATE patients SET first_name = ?, mname = ?, last_name = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, fname);
            statement.setString(2, mname);
            statement.setString(3, lname);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientSex(String sex, int id) {
        String query = "UPDATE patients SET sex = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, sex);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientBlood(String blood, int id) {
        String query = "UPDATE patients SET blood = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, blood);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientBirthdate(String birthdate, int id) {
        String query = "UPDATE patients SET birthdate = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, birthdate);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    
}
