
package logic;

import database.AddOperation;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class AddRoom {
    private String id;
    private String function;
    private String building;
    private int floor;
    private int capacity;
    
    
    public Boolean AddRoom(JTextField[] textArray, JComboBox[] comboArray, JSpinner[] spinnerArray, JFormattedTextField[] formattedArray) {
        this.id = "RM" + textArray[0].getText();
        
        Object value = spinnerArray[0].getValue();
        this.capacity = ((Integer) value).intValue();
        
        this.function = comboArray[0].getSelectedItem().toString();
        this.building = "Building " + formattedArray[0].getText();
        this.floor = Integer.parseInt(formattedArray[1].getText());
        
        String[] varcharArray = {id, function, building};
        int[] intArray = {capacity, floor};
        
        AddOperation ao = new AddOperation();
        if (ao.addRoom(varcharArray, intArray) != 0) {
            return true;
        }else {
            return false;
        }
    }
}
