
package logic;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class FieldValidator {
    
//    // This method is used to determine if there is null in the field and which component. Returns an array of Boolean
//    public Boolean[] isEmpty(JTextField[] textArray, JDateChooser[] dateArray, JComboBox[] comboArray, ButtonGroup[] buttonArray, String imagePath) {
//        
//        int textArrayLength = textArray.length;
//        int dateArrayLength = dateArray.length;
//        int comboArrayLength = comboArray.length;
//        int buttonArrayLength = buttonArray.length;
//        
//        // This boolen array is used to determine which fields is null
//        int fieldCount = textArrayLength + dateArrayLength + comboArrayLength + buttonArrayLength + 1;
//        Boolean[] nullFields = new Boolean[fieldCount];
//        for (int i = 0; i < fieldCount; i++) {
//            nullFields[i] = false;
//        }
//        
//        Boolean hasNullField = false; // Used to determine if there is a null field, instead of iterating through the array which could slow down the program
//        
//        
//        for (int i = 0; i < fieldCount; i++) {
//            if (i < textArrayLength) {
//                for (int j = 0; j < textArrayLength; i++) {
//                    if (textArray[j] == null) {
//                        nullFields[i] = true;
//                        hasNullField = true;
//                    }
//                }
//            }else if (i < (textArrayLength + dateArrayLength)) {
//                for (int j = 0; j < dateArrayLength; i++) {
//                    if (dateArray[j] == null) {
//                        nullFields[i] = true;
//                        hasNullField = true;
//                    }
//                }
//            }else if (i < (textArrayLength + dateArrayLength + comboArrayLength)) {
//                for (int j = 0; j < comboArrayLength; i++) {
//                    if (comboArray[j] == null) {
//                        nullFields[i] = true;
//                        hasNullField = true;
//                    }
//                }
//            }else if (i < (textArrayLength + dateArrayLength + comboArrayLength + buttonArrayLength)) {
//                for (int j = 0; j < buttonArrayLength; i++) {
//                    if (buttonArray[j] == null) {
//                        nullFields[i] = true;
//                        hasNullField = true;
//                    }
//                }
//            }else if (imagePath == null) {
//                nullFields[i] = true;
//                hasNullField = true;
//            }
//        }
//        
//        return nullFields;
//        
////        
////        
////        int iterator = 0; // Used to continue the number
////        
////        // Iterates through all the JTextField array and detect if a field is null
////        for (int i = iterator; i < textArray.length; i++) {
////            if (textArray[i] == null) {
////                nullFields[i] = true;
////                hasNullField = true;
////            }
////            iterator++;
////        }
////        
////        // Iterates through all the JTextField array and detect if a field is null
////        for (int i = iterator; i < dateArray.length; i++) {
////            if (dateArray[i] == null) {
////                nullFields[i] = true;
////                hasNullField = true;
////            }
////        }
////        
////        // Iterates through all the JTextField array and detect if a field is null
////        for (int i = iterator; i < comboArray.length; i++) {
////            if (comboArray[i] == null) {
////                nullFields[i] = true;
////                hasNullField = true;
////            }
////        }
////        
////        return hasNullField;
//    }
    private JTextField[] textArray;
    private JDateChooser[] dateArray;
    private JComboBox[] comboArray;
    private ButtonGroup[] buttonArray;
    private JSpinner[] spinnerArray;
    private JFormattedTextField[] formattedArray;
    private String imagePath;
    
    public String validate(JTextField[] textArray) {
        this.textArray = textArray;
        
        if (isEmpty()) return "Please fill out every field.";
        else return null;
    }
    
    public String validate(JTextField[] textArray, JComboBox[] comboArray, JSpinner[] spinnerArray, JFormattedTextField[] formattedArray) {
        this.textArray = textArray;
        this.comboArray = comboArray;
        this.spinnerArray = spinnerArray;
        this.formattedArray = formattedArray;
        
        if (isEmpty()) return "Please fill out every field.";
        else if (noChoosedOption()) return "Please choose from the options.";
        else return null;
        
    }
    
    public String validate(JTextField[] textArray, JDateChooser[] dateArray, JComboBox[] comboArray, ButtonGroup[] buttonArray, String imagePath) {
        this.textArray = textArray;
        this.dateArray = dateArray;
        this.comboArray = comboArray;
        this.buttonArray = buttonArray;
        this.imagePath = imagePath;
        
        if (isEmpty()) return "Please fill out every field.";
        else if (noDate()) return "Please choose a date.";
        else if (noChoosedOption()) return "Please choose from the option.";
        else if (noButtonSelected()) return "Please select from the button";
        else if (noSelectedPic()) return "Please choose a picture.";
        else if (invalidPhone()) return "Please enter a valid phone number";
        else if (usernameExist()) return "Username is already taken.";
        else return null;
    }
    
    private Boolean isEmpty() {
        for (int i = 0; i < textArray.length; i++) {
            String text = textArray[i].getText();
            if (text.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    private Boolean noDate() {
        for (int i = 0; i < dateArray.length; i++) {
            if (dateArray[i].getDate() == null || dateArray[i].getDate().equals(new Date(0))) {
                return true;
            }
        }
        return false;
    }
    
    private Boolean noChoosedOption() {
        for (int i = 0; i < comboArray.length; i++) {
            if ((String) comboArray[i].getSelectedItem() == null) {
                return true;
            }
        }
        
        return false;
    }
    
    private Boolean noButtonSelected() {
        for (int i = 0; i < buttonArray.length; i++) {
            ButtonModel selectedButton = buttonArray[i].getSelection();
            if (selectedButton != null) {
                return false;
            }
        }
        
        return true;
    }
    
    private Boolean noSelectedPic() {
        if (imagePath == null) {
            return true;
        }
        
        return false;
    }
    
    private Boolean invalidPhone() {
//        if (textArray[3] < 100 || textArray[4] < 100 || textArray[5] < 1000) {
//            return true;
//        }
        return false;
    }
    
    private Boolean usernameExist() {
        return false;
    }
    
    public Boolean[] getEmptyFields(String[] stringArray) {
        int fieldCount = stringArray.length;
        // This boolen array is used to determine which fields is null
        Boolean[] nullFields = new Boolean[fieldCount];
        for (int i = 0; i < fieldCount; i++) {
            nullFields[i] = false;
        }
        
        // Iterates through each stirng and check if its null then turn its position in nullFields as true
        for (int i = 0; i < fieldCount; i++) {
            if (stringArray[i] == null || "".equals(stringArray[i])) nullFields[i] = true;
        }
        
        return nullFields;
    }
}
