
package logic;

import com.toedter.calendar.JDateChooser;
import database.AddOperation;
import database.DeleteOperation;
import database.UpdateOperation;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PatientConditionCRUD {
    int health_id;
    String name;
    String description;
    String complication;
    String diagnosis_date;
    String severity;
    String notes;
    int patient_id;

    public PatientConditionCRUD(JTextField[] txtFldArry, JTextArea[] txtAreaArry, JDateChooser jDateChooser1, int patient_id, int health_id) {
        if (txtFldArry != null || txtAreaArry != null || jDateChooser1 != null) {
            this.name = txtFldArry[0].getText();
            this.description = txtAreaArry[0].getText();
            this.complication = txtFldArry[1].getText();
            this.severity = txtFldArry[2].getText();
            this.notes = txtAreaArry[1].getText();
            Date diagnosis_date = jDateChooser1.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.diagnosis_date = dateFormat.format(diagnosis_date);
        }
        this.patient_id = patient_id;
        this.health_id = health_id;
    }
    
    public Boolean AddHealthCondition() {
        AddOperation addOp = new AddOperation();
        if (addOp.addHealthCondtion(name, description, complication, diagnosis_date, severity, notes, patient_id) != 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public Boolean UpdateHealthCondition() {
        UpdateOperation updtOp = new UpdateOperation();
        if (updtOp.updateHealthCondition(name, description, complication, diagnosis_date, severity, notes, health_id) != 0) {
            return true;
        }else {
            return false;
        }
    }
    
    public Boolean DeleteHealthCondition() {
        DeleteOperation delOp = new DeleteOperation();
        if (delOp.deleteHealthCondition("health_conditions", "id", health_id) != 0) {
            return true;
        }else {
            return false;
        }
    }
}
