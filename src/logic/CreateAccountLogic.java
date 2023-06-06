
package logic;

import gui.admin.CreateAccount;
import database.CreateAccountDB;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateAccountLogic {
    
    public CreateAccount ca;
    JTextField[] textFields;
    JDateChooser[] dateFields;
    JComboBox[] comboFields;
    ButtonGroup[] buttonFields;
    String imagePath = null;
    Boolean[] emptyText;
    Boolean[] emptyDate;
    Boolean[] emptyCombo;
    Boolean[] emptyButton;
    Boolean emptyImage;
    
    String[] selectedButtons;
    
    public CreateAccountLogic() {
        
    }
    
    public CreateAccountLogic(JTextField[] textArray, JDateChooser[] dateArray, JComboBox[] comboArray, ButtonGroup[] buttonArray, String imagePath) {
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
        this.imagePath = imagePath;
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
        emptyImage = false;
        
        for (int i = 0; i < textFields.length; i++) {
            if (i == 1) {
                continue;
            }
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
        if (imagePath == null) {
            hasNullField = true;
            emptyImage = true;
        }
        
        if (hasNullField) {
            ca.highlightEmptyFields(emptyText, emptyDate, emptyCombo, emptyButton, emptyImage);
        }
        
        return hasNullField;
    }
    
    public Boolean isUsernameExist() {
        CreateAccountDB cadb = new CreateAccountDB();
        if (cadb.selectUsername(textFields[12].getText())) {
            ca.highlightUsername();
            return true;
        }else {
            return false;
        }
    }
     
    
    public Boolean createNewAccount() {
        String fname = textFields[0].getText();
        String mname = textFields[1].getText();
        String lname = textFields[2].getText();
        String phoneX = textFields[3].getText();
        String phoneY = textFields[4].getText();
        String phoneZ = textFields[5].getText();
        String email = textFields[6].getText();
        String street = textFields[7].getText();
        String barangay = textFields[8].getText();
        String city = textFields[9].getText();
        String province = textFields[10].getText();
        String country = textFields[11].getText();
        String username = textFields[12].getText();
        String password = textFields[13].getText();
        
        Date birthd = dateFields[0].getDate();
        Date dhired = dateFields[1].getDate();
        
        String blood = (String) comboFields[0].getSelectedItem();
        String position = (String) comboFields[1].getSelectedItem();
        String job = (String) comboFields[2].getSelectedItem();
        String countryCode = (String) comboFields[3].getSelectedItem();
        
        String sex = selectedButtons[0];
        System.out.println(sex);
        
        
        String phone = countryCode + "(" + phoneX + ")" + phoneY + "-" + phoneZ;
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        String formatBirthd = dateFormat.format(birthd);
        String fomatDhired = dateFormat.format(dhired);
        
        FileInputStream pic = null;
        try {
            pic = new FileInputStream(new File(imagePath));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateAccountLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CreateAccountDB cadb = new CreateAccountDB();
        int rowsAffected = cadb.insertAccount(username, password, fname, mname, lname, position, job, formatBirthd, blood, sex, country, province, city, barangay, street, phone, email, fomatDhired, pic);
        
        if (rowsAffected > 0) {
            return true;
        }else {
            return false;
        }
    }
}
