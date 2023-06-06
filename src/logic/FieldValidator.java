
package logic;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
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
