
package logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    public static int id;
    public static String username;
    public static  String fname;
    public static  String mname;
    public static  String lname;
    public static  String role;
    public static  String job;
    public static  String birthd;
    public static  String blood;
    public static  String sex;
    public static  String country;
    public static  String province;
    public static  String city;
    public static  String barangay;
    public static  String street;
    public static  String phone;
    public static  String email;
    public static  String dhired;
    
    public User() {
        
    }
    public User(ResultSet rs) {
        try {
            User.id = rs.getInt("emp_id");
            User.username = rs.getString("username");
            User.fname = rs.getString("fname");
            User.mname = rs.getString("mname");
            User.lname = rs.getString("lname");
            User.role = rs.getString("role");
            User.job = rs.getString("title");
            User.birthd = rs.getString("birthdate");
            User.blood = rs.getString("blood");
            User.sex = rs.getString("sex");
            User.country = rs.getString("country");
            User.province = rs.getString("province");
            User.city = rs.getString("city");
            User.barangay = rs.getString("barangay");
            User.street = rs.getString("street");
            User.phone = rs.getString("phone");
            User.email = rs.getString("email");
            User.dhired = rs.getString("dhired");
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFname() {
        return fname;
    }

    public String getMname() {
        return mname;
    }

    public String getLname() {
        return lname;
    }

    public String getRole() {
        return role;
    }

    public String getJob() {
        return job;
    }

    public String getBirthd() {
        return birthd;
    }

    public String getBlood() {
        return blood;
    }

    public String getSex() {
        return sex;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getBarangay() {
        return barangay;
    }

    public String getStreet() {
        return street;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getDhired() {
        return dhired;
    }
    
}

