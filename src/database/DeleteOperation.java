
package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteOperation {
    Connection con = MyConnection.getConnection();
    
    public int deleteHealthCondition(String tableName, String idName, int id) {
        String query = "DELETE FROM " + tableName + " WHERE " + idName + " = ?";
        
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DeleteOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
}
