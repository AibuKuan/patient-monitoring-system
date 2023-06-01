
package logic;

import gui.admin.CreateAccount;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.Date;

public class CreateAccountValidation {
    
    public CreateAccount ca;
//    public String fname, mname, lname, blood, sex, position, job, countryCode, phoneX, phoneY, phoneZ, email, street, barangay, city, province, country, username, password;
//    public Date dob, dhired;
    JTextField[] textFields;
    JDateChooser[] dateFields;
    JComboBox[] comboFields;
    ButtonGroup[] buttonFields;
    Boolean[] emptyText;
    Boolean[] emptyDate;
    Boolean[] emptyCombo;
    Boolean[] emptyButton;
    
    String[] selectedButtons;
    
    
    
//    public CreateAccountValidation(JTextField fname, JTextField mname, JTextField lname, JDateChooser dob, JComboBox blood, ButtonGroup sex, JComboBox position, JComboBox job, JDateChooser dhired, JComboBox countryCode, JTextField phoneX, JTextField phoneY, JTextField phoneZ, JTextField email, JTextField street, JTextField barangay, JTextField city, JTextField province, JTextField country, JTextField username, JTextField password) {
//        this.fname = fname.getText();
//        this.mname = mname.getText();
//        this.lname = lname.getText();
//        this.dob = dob.getDate();
//        this.blood = (String) blood.getSelectedItem();
//        ButtonModel selectedSex = sex.getSelection();
//        if (selectedSex == null) this.sex = null;
//        else this.sex = selectedSex.getActionCommand();
//        this.position = (String) position.getSelectedItem();
//        this.job = (String) job.getSelectedItem();
//        this.dhired = dhired.getDate();
//        this.countryCode = (String) countryCode.getSelectedItem();
//        this.phoneX = phoneX.getText();
//        this.phoneY = phoneY.getText();
//        this.phoneZ = phoneZ.getText();
//        this.email = email.getText();
//        this.street = street.getText();
//        this.barangay = barangay.getText();
//        this.city = city.getText();
//        this.province = province.getText();
//        this.country = country.getText();
//        this.username = username.getText();
//        this.password = password.getText();
//    }
    
    public CreateAccountValidation(JTextField[] textArray, JDateChooser[] dateArray, JComboBox[] comboArray, ButtonGroup[] buttonArray) {
        textFields = new JTextField[textArray.length];
        emptyText = new Boolean[textArray.length];
        
        dateFields = new JDateChooser[dateArray.length];
        emptyDate = new Boolean[dateArray.length];
        
        comboFields = new JComboBox[comboArray.length];
        emptyCombo = new Boolean[comboArray.length];
        
        buttonFields = new ButtonGroup[buttonArray.length];
        emptyButton = new Boolean[buttonArray.length];
        selectedButtons = new String[buttonArray.length];
        
        for (int i = 0; i < textArray.length; i++) {
            this.textFields[i] = textArray[i];
        }
        for (int i = 0; i < dateArray.length; i++) {
            this.dateFields[i] = dateArray[i];
        }
        for (int i = 0; i < comboArray.length; i++) {
            this.comboFields[i] = comboArray[i];
        }
        for (int i = 0; i < buttonArray.length; i++) {
            this.buttonFields[i] = buttonArray[i];
        }
    }
    
    public Boolean isEmpty() {
        
        Boolean hasNullField = false;
        
        for (int i = 0; i < emptyText.length; i++) {
            emptyText[i] = false;
        }
        for (int i = 0; i < emptyDate.length; i++) {
            emptyDate[i] = false;
        }
        for (int i = 0; i < emptyCombo.length; i++) {
            emptyCombo[i] = false;
        }
        for (int i = 0; i < emptyButton.length; i++) {
            emptyButton[i] = false;
        }
        
        for (int i = 0; i < textFields.length; i++) {
            if (textFields[i].getText().isEmpty()) {
                hasNullField = true;
                emptyText[i] = true;
            }
        }
        for (int i = 0; i < dateFields.length; i++) {
            if (dateFields[i].getDate() == null || dateFields[i].getDate().equals(new Date(0))) {
                hasNullField = true;
                emptyDate[i] = true;
            }
        }
        for (int i = 0; i < comboFields.length; i++) {
            if ((String) comboFields[i].getSelectedItem() == null) {
                hasNullField = true;
                emptyCombo[i] = true;
            }
        }
        for (int i = 0; i < buttonFields.length; i++) {
            ButtonModel selectedButton = buttonFields[i].getSelection();
            if (selectedButton == null) {
                hasNullField = true;
                emptyButton[i] = true;
                selectedButtons[i] = null;
            }else selectedButtons[i] = selectedButton.getActionCommand();
        }
        
        if (hasNullField) {
            ca.highlightEmptyFields(emptyText, emptyDate, emptyCombo, emptyButton);
            System.out.println("highlight called");
        }
        
        return hasNullField;
    }
//    public Boolean isEmpty() {
//        
//        System.out.println(fname);
//        System.out.println(mname);
//        System.out.println(lname);
//        
//        Boolean[] emptyField = new Boolean[21];
//        for (int i = 0; i < emptyField.length; i++) {
//            emptyField[i] = false;
//        }
//        
//        boolean hasNullField = false;
//        
//        if (this.fname.isEmpty()) {
//            hasNullField = true;
//            emptyField[0] = true;
//        }
//        if (this.mname.isEmpty()) {
//            hasNullField = true;
//            emptyField[1] = true;
//        }
//        if (this.lname.isEmpty()) {
//            hasNullField = true;
//            emptyField[2] = true;
//        }
//        if (this.dob == null || this.dob.equals(new Date(0))) {
//            hasNullField = true;
//            emptyField[3] = true;
//        }
//        if (this.blood == null) {
//            hasNullField = true;
//            emptyField[4] = true;
//        }
//        if (sex == null) {
//            hasNullField = true;
//            emptyField[5] = true;
//        }
//        if (this.position == null) {
//            hasNullField = true;
//            emptyField[6] = true;
//        }
//        if (this.job == null) {
//            hasNullField = true;
//            emptyField[7] = true;
//        }
//        if (this.dhired == null || this.dhired.equals(new Date(0))) {
//            hasNullField = true;
//            emptyField[8] = true;
//        }
//        if (this.countryCode == null) {
//            hasNullField = true;
//            emptyField[9] = true;
//        }
//        if (this.phoneX.equals("XXX")) {
//            hasNullField = true;
//            emptyField[10] = true;
//        }
//        if (this.phoneY.equals("YYY")) {
//            hasNullField = true;
//            emptyField[11] = true;
//        }
//        if (this.phoneZ.equals("ZZZZ")) {
//            hasNullField = true;
//            emptyField[12] = true;
//        }
//        if (this.email.isEmpty()) {
//            hasNullField = true;
//            emptyField[13] = true;
//        }
//        if (this.street.equals("Blk # Lot # Phase #")) {
//            hasNullField = true;
//            emptyField[14] = true;
//        }
//        if (this.barangay.equals("Barangay #")) {
//            hasNullField = true;
//            emptyField[15] = true;
//        }
//        if (this.city == null) {
//            hasNullField = true;
//            emptyField[16] = true;
//        }
//        if (this.province == null) {
//            hasNullField = true;
//            emptyField[17] = true;
//        }
//        if (this.country == null) {
//            hasNullField = true;
//            emptyField[18] = true;
//        }
//        if (this.username.isEmpty()) {
//            hasNullField = true;
//            emptyField[19] = true;
//        }
//        if (this.password.isEmpty()) {
//            hasNullField = true;
//            emptyField[20] = true;
//        }
//        
//        if (hasNullField) {
//            ca.highlightEmptyFields(emptyField);
//            System.out.println("highlight called");
//        }
//        
//        return hasNullField;
//    }
}
