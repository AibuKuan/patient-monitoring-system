
package logic;

import com.toedter.calendar.JDateChooser;
import database.AddOperation;
import database.CreateAccountDB;
import database.UpdateOperation;
import gui.AddPatientForm;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AddPerson {
    String  fname, // employee, patient
            mname, // employee, patient
            lname, // employee, patient
            birthdate, // employee, patient
            sex, // employee, patient
            blood, // employee, patient
            countryCode, // employee, patient
            phoneX, // employee, patient
            phoneY, // employee, patient
            phoneZ, // employee, patient
            phone, // employee, patient
            email, // employee, patient
            street, // employee, patient
            barangay, // employee, patient
            city, // employee, patient
            province, // employee, patient
            country, // employee, patient
            imagePath, // employee, patient

            username, // employee
            password, // employee
            datehired, // employee
            role, // employee
            job, // employee

            emgFname, // patient
            emgLname, // patient
            emgPhoneX, // patient
            emgPhoneY, // patient
            emgPhoneZ, // patient
            emgCountryCode; // patient
    
    public Boolean addEmployee(JTextField[] textArray, JDateChooser[] dateArray, JComboBox[] comboArray, ButtonGroup[] buttonArray, String imagePath) {
        this.fname = textArray[0].getText();
        this.mname = textArray[1].getText();
        this.lname = textArray[2].getText();
        this.phoneX = textArray[3].getText();
        this.phoneY = textArray[4].getText();
        this.phoneZ = textArray[5].getText();
        this.email = textArray[6].getText();
        this.street = textArray[7].getText();
        this.barangay = textArray[8].getText();
        this.city = textArray[9].getText();
        this.province = textArray[10].getText();
        this.country = textArray[11].getText();
        this.username = textArray[12].getText();
        this.password = textArray[13].getText();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        this.birthdate = dateFormat.format(dateArray[0].getDate());
        this.datehired = dateFormat.format(dateArray[1].getDate());
        
        this.blood = (String) comboArray[0].getSelectedItem();
        this.role = (String) comboArray[1].getSelectedItem();
        this.job = (String) comboArray[2].getSelectedItem();
        this.countryCode = (String) comboArray[3].getSelectedItem();
        
        ButtonModel selectedButton = buttonArray[0].getSelection();
        if (selectedButton != null) {
            this.sex = selectedButton.getActionCommand();
        }
        System.out.println(sex);

        this.phone = countryCode + "(" + phoneX + ")" + phoneY + "-" + phoneZ;
        
        FileInputStream pic = null;
        try {
            pic = new FileInputStream(new File(imagePath));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateAccountLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CreateAccountDB cadb = new CreateAccountDB();
        int rowsAffected = cadb.insertAccount(username, password, fname, mname, lname, role, job, birthdate, blood, sex, country, province, city, barangay, street, phone, email, datehired, pic);
        
        if (rowsAffected > 0) {
            return true;
        }else {
            return false;
        }
    }
           
           
    
    public Boolean addPatient(AddPatientForm form, JTextField[] textArray, JDateChooser[] dateArray, JComboBox[] comboArray, ButtonGroup[] buttonArray, String imagePath) {
        this.fname = textArray[0].getText();
        this.mname = textArray[1].getText();
        this.lname = textArray[2].getText();
        this.phoneX = textArray[3].getText();
        this.phoneY = textArray[4].getText();
        this.phoneZ = textArray[5].getText();
        this.email = textArray[6].getText();
        this.street = textArray[7].getText();
        this.barangay = textArray[8].getText();
        this.city = textArray[9].getText();
        this.province = textArray[10].getText();
        this.country = textArray[11].getText();
        this.emgFname = textArray[12].getText();
        this.emgLname = textArray[13].getText();
        this.emgPhoneX = textArray[14].getText();
        this.emgPhoneY = textArray[15].getText();
        this.emgPhoneZ = textArray[16].getText();
        
        this.blood = (String) comboArray[0].getSelectedItem();
        this.countryCode = (String) comboArray[1].getSelectedItem();
        this.emgCountryCode = (String) comboArray[2].getSelectedItem();
        
        ButtonModel selectedButton = buttonArray[0].getSelection();
        if (selectedButton != null) {
            this.sex = selectedButton.getActionCommand();
        }else {
            System.out.println("no button selected");
        }
        
        this.imagePath = imagePath;
        
        if (dateArray[0].getDate() != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
            this.birthdate = dateFormat.format(dateArray[0].getDate());
        }
        
        
        String[] stringArray = {this.fname, this.mname, this.lname, this.phoneX, this.phoneY, this.phoneZ, this.email, this.street, this.barangay, this.city, this.province, this.country, this.emgFname, this.emgLname, this.emgPhoneX, this.emgPhoneY, this.emgPhoneZ, this.birthdate, this.blood, this.countryCode, this.emgCountryCode, this.sex, this.imagePath};
        FieldValidator fv = new FieldValidator();
        Boolean[] emptyFields = fv.getEmptyFields(stringArray);
        
        for (int i = 0; i < emptyFields.length; i++) {
            if (emptyFields[i] == true) {
                form.highlightEmptyFields(emptyFields, i);
                return false;
            }
        }
        
        String phone = countryCode + " (" + phoneX + ") " + phoneY + " - " + phoneZ;
        String emgPhone = emgCountryCode + " (" + emgPhoneX + ") " + emgPhoneY + " - " + emgPhoneZ;
        
        FileInputStream pic = null;
        try {
            pic = new FileInputStream(new File(imagePath));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] dataStringArray = {fname, mname, lname, sex, blood, birthdate, phone, email, country, province, barangay, city, street, emgFname, emgLname, emgPhone};
        AddOperation addOp = new AddOperation();
        if (addOp.addPatient(dataStringArray, pic) != 0) {
            return true;
        }else {
            return false;
        }
    }
    
    public Boolean updatePatientName(JTextField jTextFieldFname, JTextField jTextFieldMname, JTextField jTextFieldLname, int id) {
        fname = jTextFieldFname.getText();
        mname = jTextFieldMname.getText();
        lname = jTextFieldLname.getText();
        
        UpdateOperation updtOp = new UpdateOperation();
        if (updtOp.updatePatientName(fname, mname, lname, id) != 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean updatePatientSex(ButtonGroup buttonGroupSex, int id) {
        ButtonModel selectedButton = buttonGroupSex.getSelection();
        if (selectedButton != null) {
            sex = selectedButton.getActionCommand();
        }
        
        if (sex != null) {
            UpdateOperation updtOp = new UpdateOperation();
            if (updtOp.updatePatientSex(sex, id) != 0) {
                return true;
            }
        }
        System.out.println("sex" + sex);
        System.out.println("sex" + selectedButton);
        return false;
    }

    public boolean updatePatientBlood(JComboBox<String> jComboBoxBlood, int id) {
        blood = jComboBoxBlood.getSelectedItem().toString();
        
        UpdateOperation updtOp = new UpdateOperation();
        if (updtOp.updatePatientBlood(blood, id) != 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean updatePatientBirthdate(JDateChooser jDateChooserDob, int id) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        this.birthdate = dateFormat.format(jDateChooserDob.getDate());
        
        UpdateOperation updtOp = new UpdateOperation();
        if (updtOp.updatePatientBirthdate(birthdate, id) != 0) {
            return true;
        }else {
            return false;
        }
    }
}
