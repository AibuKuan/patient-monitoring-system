
package logic;

import database.AddOperation;
import java.math.BigDecimal;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class AddDrug {
    
    String drug_name;
    String manufacturer;
    BigDecimal price;
    int quantity;
    
    
    public Boolean AddMedicine(JTextField[] textArray, JSpinner[] spinnerArray, JFormattedTextField[] formatArray) {
        drug_name = textArray[0].getText();
        manufacturer = textArray[1].getText();
        
        Object value = spinnerArray[0].getValue();
        quantity = ((Integer) value).intValue();
        
        String text = formatArray[0].getText();
        price = new BigDecimal(text);
        
        String[] varcharArray = {drug_name, manufacturer};
        int[] intArray = {quantity};
        BigDecimal[] decimalArray = {price};
        
        AddOperation ao = new AddOperation();
        if (ao.addMedicine(varcharArray, intArray, decimalArray) != 0) {
            return true;
        }else {
            return false;
        }
    }
}
