
package logic;

import database.ReadOperation;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Patient {
    private int id;
    private String first_name;
    private String mname;
    private String last_name;
    private String sex;
    private String blood;
    private Date birthdate;
    private String phone;
    private String email;
    private String country;
    private String province;
    private String city;
    private String barangay;
    private String street;
    private byte[] pic;
    private String emg_fname;
    private String emg_lname;
    private String emg_phone;
    private String relationship;
    
    
    
    private Date[] diagnosis_date;
    private String[] severity;
    private String[] notes;
    
    
    private int age;
    
    public Patient(int id) {
        ReadOperation ro = new ReadOperation();
        ResultSet rs1 = ro.readPatientData(id);
        //ResultSet rs2 = ro.readPatientCondition(id);
        
        try {
            
            if (rs1.next()) {
                this.id = id;
                this.first_name = rs1.getString("first_name");
                this.mname = rs1.getString("mname");
                this.last_name = rs1.getString("last_name");
                this.sex = rs1.getString("sex");
                this.blood = rs1.getString("blood");
                this.birthdate = rs1.getDate("birthdate");
                this.phone = rs1.getString("phone");
                this.email = rs1.getString("email");
                this.country = rs1.getString("country");
                this.province = rs1.getString("province");
                this.city = rs1.getString("city");
                this.barangay = rs1.getString("barangay");
                this.street = rs1.getString("street");
                this.pic = rs1.getBytes("pic");
                this.emg_fname = rs1.getString("emg_fname");
                this.emg_lname = rs1.getString("emg_lname");
                this.emg_phone = rs1.getString("emg_phone");
                this.relationship = rs1.getString("relationship");

                this.age = calculateAge(rs1.getDate("birthdate"));
            }
            
            
            
//            ArrayList<Object[]> patientCondition = new ArrayList<>();
//            int rowCount = 0; // Number of rows in the result set
//
//            while (rs2.next()) {
//                Object[] rowData = new Object[rs2.getMetaData().getColumnCount()];
//
//                for (int i = 0; i < rowData.length; i++) {
//                    rowData[i] = rs2.getObject(i + 1);
//                }
//
//                // Add the row data to the list
//                patientCondition.add(rowData);
//                rowCount++;
//            }
//
//// Initialize the arrays with the correct length
//            this.diagnosis_date = new Date[rowCount];
//            this.severity = new String[rowCount];
//            this.notes = new String[rowCount];
//
//            int i = 0;
//            for (Object[] rowData : patientCondition) {
//                this.diagnosis_date[i] = (Date) rowData[2];
//                this.severity[i] = String.valueOf(rowData[3]);
//                this.notes[i] = String.valueOf(rowData[4]);
//
//                System.out.println("Column 1: " + this.severity[i]);
//                System.out.println("Column 2: " + this.notes[i]);
//                i++;
//            }
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static int calculateAge(Date birthDate) {
        LocalDate localBirthDate = new java.sql.Date(birthDate.getTime()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(localBirthDate, currentDate);
        return period.getYears();
    }

    public int getAge() {
        return age;
    }
    
    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getMname() {
        return mname;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getSex() {
        return sex;
    }

    public String getBlood() {
        return blood;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
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

    public byte[] getPic() {
        return pic;
    }

    public String getEmg_fname() {
        return emg_fname;
    }

    public String getEmg_lname() {
        return emg_lname;
    }

    public String getEmg_phone() {
        return emg_phone;
    }

    public String getRelationship() {
        return relationship;
    }

    public Date[] getDiagnosis_date() {
        return diagnosis_date;
    }

    public String[] getSeverity() {
        return severity;
    }

    public String[] getNotes() {
        return notes;
    }
}
