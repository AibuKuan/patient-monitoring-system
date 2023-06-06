
package database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddOperation {
    Connection con = MyConnection.getConnection();
    
    public int addPatient(String[] dataStringArray, FileInputStream pic) {
        String query = "INSERT INTO patients(first_name, mname, last_name, blood, birthdate, phone, email, country, province, barangay, city, street, pic, emg_fname, emg_lname, emg_phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
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
            statement.setBinaryStream(13, pic);
            statement.setString(14, dataStringArray[12]);
            statement.setString(15, dataStringArray[13]);
            statement.setString(16, dataStringArray[14]);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
}
