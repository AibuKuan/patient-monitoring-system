
package logic;

import database.ReadOperation;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSetMetaData;

public class TableHandler {
    public DefaultTableModel getDoctorsData() {
        User user = new User();
        DefaultTableModel tableModel = new DefaultTableModel();
        ResultSet rs = null;
        
        if ("Admin".equals(user.getRole())) {
            try {
                ReadOperation read = new ReadOperation();
                rs = read.getDoctors();
                
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

    public DefaultTableModel getPatientsData() {
        User user = new User();
        DefaultTableModel tableModel = new DefaultTableModel();
        ResultSet rs = null;

        if ("Admin".equals(user.getRole())) {
            try {
                ReadOperation read = new ReadOperation();
                rs = read.getPatients();

                int columnCount;
                ResultSetMetaData metaData;

                Object[] rowData;
                while (rs.next()) {
                    columnCount = rs.getMetaData().getColumnCount();
                    metaData = rs.getMetaData();
                    for (int i = 1; i <= columnCount; i++) {
                        tableModel.addColumn(metaData.getColumnName(i));
                    }
                    
                    rowData = new Object[columnCount];
                    for (int i = 0; i < columnCount; i++) {
                        rowData[i] = rs.getObject(i + 1);
                    }

                    tableModel.addRow(rowData);
                }
            } catch (SQLException ex) {
                Logger.getLogger(TableHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("not an admin");
        }

        return tableModel;
    }
    
    public DefaultTableModel getDrugsData() {
        User user = new User();
        DefaultTableModel tableModel = new DefaultTableModel();
        ResultSet rs = null;

        if ("Admin".equals(user.getRole())) {
            try {
                ReadOperation read = new ReadOperation();
                rs = read.getDrugs();

                int columnCount;
                ResultSetMetaData metaData;

                Object[] rowData;
                while (rs.next()) {
                    columnCount = rs.getMetaData().getColumnCount();
                    metaData = rs.getMetaData();
                    for (int i = 1; i <= columnCount; i++) {
                        tableModel.addColumn(metaData.getColumnName(i));
                    }
                    
                    rowData = new Object[columnCount];
                    for (int i = 0; i < columnCount; i++) {
                        rowData[i] = rs.getObject(i + 1);
                    }

                    tableModel.addRow(rowData);
                }
            } catch (SQLException ex) {
                Logger.getLogger(TableHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("not an admin");
        }

        return tableModel;
    }
}
