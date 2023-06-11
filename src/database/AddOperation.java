
package database;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddOperation {
    Connection con = MyConnection.getConnection();
    
    public int addPatient(String[] dataStringArray, FileInputStream pic) {
        String query = "INSERT INTO patients(first_name, mname, last_name, sex, blood, birthdate, phone, email, country, province, barangay, city, street, pic, emg_fname, emg_lname, emg_phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, dataStringArray[0]);
            statement.setString(2, dataStringArray[1]);
            statement.setString(3, dataStringArray[2]);
            statement.setString(4, dataStringArray[3]);
            statement.setString(5, dataStringArray[4]);
            statement.setString(6, dataStringArray[5]);
            statement.setString(7, dataStringArray[6]);
            statement.setString(8, dataStringArray[7]);
            statement.setString(9, dataStringArray[8]);
            statement.setString(10, dataStringArray[9]);
            statement.setString(11, dataStringArray[10]);
            statement.setString(12, dataStringArray[11]);
            statement.setString(13, dataStringArray[12]);
            statement.setBinaryStream(14, pic);
            statement.setString(15, dataStringArray[13]);
            statement.setString(16, dataStringArray[14]);
            statement.setString(17, dataStringArray[15]);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int addMedicine(String[] varcharArray, int[] intArray, BigDecimal[] decimalArray) {
        String query = "INSERT INTO drugs(drug_name, manufacturer, price, quantity) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, varcharArray[0]);
            statement.setString(2, varcharArray[1]);
            
            statement.setInt(3, intArray[0]);
            
            statement.setBigDecimal(4, decimalArray[0]);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int addRoom(String[] varcharArray, int[] intArray) {
        String query = "INSERT INTO rooms(id, capacity, room_function, building, floor) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, varcharArray[0]);
            statement.setInt(2, intArray[0]);
            statement.setString(3, varcharArray[1]);
            statement.setString(4, varcharArray[2]);
            statement.setInt(5, intArray[1]);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public int addHealthCondtion(String name, String description, String complication, String diagnosis_date, String severity, String notes, int patient_id) {
        String query = "INSERT INTO health_conditions(name, description, complication, diagnosis_date, severity, notes, patient_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, description);
            statement.setString(3, complication);
            statement.setString(4, diagnosis_date);
            statement.setString(5, severity);
            statement.setString(6, notes);
            statement.setInt(7, patient_id);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
