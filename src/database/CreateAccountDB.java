
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class CreateAccountDB {
    //public CreateAccountDB() {}
    
    public Boolean selectUsername(String username) {
        Connection con = MyConnection.getConnection();
        String query = "SELECT username FROM employees WHERE username = ?";
        Boolean uExist = false;
        ResultSet rs;
        
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, username);
            rs = statement.executeQuery();
            
            if (rs.next()) {
                uExist = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uExist;
    }
    
    public int insertAccount(String username, String password, String fname, String mname, String lname, String position, String job, String formatBirthd, String blood, String sex, String country, String province, String city, String barangay, String street, String phone, String email, String fomatDhired, FileInputStream pic) {
        Connection con = MyConnection.getConnection();
        
        String query = "INSERT INTO employees(username, password, fname, mname, lname, role, title, birthdate, blood, sex, country, province, city, barangay, street, phone, email, dhired, pic) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, fname);
            statement.setString(4, mname);
            statement.setString(5, lname);
            statement.setString(6, position);
            statement.setString(7, job);
            statement.setString(8, formatBirthd);
            statement.setString(9, blood);
            statement.setString(10, sex);
            statement.setString(11, country);
            statement.setString(12, province);
            statement.setString(13, city);
            statement.setString(14, barangay);
            statement.setString(15, street);
            statement.setString(16, phone);
            statement.setString(17, email);
            statement.setString(18, fomatDhired);
            statement.setBinaryStream(19, pic);
            
            return statement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
}
