
package database;

import java.io.FileInputStream;
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

    public int updatePatientPhone(String phone, int id) {
        String query = "UPDATE patients SET phone = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, phone);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientEmail(String email, int id) {
        String query = "UPDATE patients SET email = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, email);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientAddress(String street, String barangay, String city, String province, String country, int id) {
        String query = "UPDATE patients SET street = ?, barangay = ?, city = ?, province = ?, country = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, street);
            statement.setString(2, barangay);
            statement.setString(3, city);
            statement.setString(4, province);
            statement.setString(5, country);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientEmgName(String emgFname, String emgLname, int id) {
        String query = "UPDATE patients SET emg_fname = ?, emg_lname = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, emgFname);
            statement.setString(2, emgLname);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientEmgPhone(String emgPhone, int id) {
        String query = "UPDATE patients SET emg_phone = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, emgPhone);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientRelationship(String relationship, int id) {
        String query = "UPDATE patients SET relationship = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, relationship);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int updatePatientImage(FileInputStream pic, int id) {
        String query = "UPDATE patients SET pic = ? WHERE id = " + id;
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setBinaryStream(1, pic);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    
}
