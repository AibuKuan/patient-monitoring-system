
package logic;

import database.ReadOperation;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSetMetaData;

public class TableHandler {
    public DefaultTableModel getAllData(String tableName) {
        User user = new User();
        DefaultTableModel tableModel = new DefaultTableModel();
        ResultSet rs = null;
        
        if ("Admin".equals(user.getRole())) {
            try {
                ReadOperation read = new ReadOperation();
                rs = read.readAll(tableName);
                
                int columnCount = rs.getMetaData().getColumnCount();
                ResultSetMetaData metaData = rs.getMetaData();
                for (int i = 1; i <= columnCount; i++) {
                    tableModel.addColumn(metaData.getColumnName(i));
                }
                
                Object[] rowData = new Object[columnCount];
                while (rs.next()) {
                    for (int i = 0; i < columnCount; i++) {
                        rowData[i] = rs.getObject(i+1);
                    }
                    
                    tableModel.addRow(rowData);
                }
            } catch (SQLException ex) {
                Logger.getLogger(TableHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            System.out.println("not an admin");
        }
        
        return tableModel;
    }
    
    public DefaultTableModel getPatientCondition(int id) {
        DefaultTableModel tableModel = new DefaultTableModel();
        ResultSet rs;

        try {
            ReadOperation read = new ReadOperation();
            rs = read.readHealthCondition(id);
                if (rs != null) {
                int hlthCndtnColumnCount = rs.getMetaData().getColumnCount();
                ResultSetMetaData hlthCndtnColumnName = rs.getMetaData();
                for (int i = 1; i <= hlthCndtnColumnCount; i++) {
                    tableModel.addColumn(hlthCndtnColumnName.getColumnName(i));
                }

                while (rs.next()) {
                    Object[] rowData = new Object[tableModel.getColumnCount()];
                    //adding health_condition data
                    for (int i = 1; i <= hlthCndtnColumnCount; i++) {
                        rowData[i-1] = rs.getObject(i);
                    }

                    tableModel.addRow(rowData);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(TableHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tableModel;
    }
}
