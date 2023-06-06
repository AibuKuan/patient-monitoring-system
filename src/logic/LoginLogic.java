
package logic;

import database.LoginDB;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginLogic {
    String username;
    String password;
    
    public Boolean loginValidation(JTextField username, JPasswordField password) {
        this.username = username.getText();
        this.password = String.valueOf(password.getPassword());
        
        LoginDB loginDB = new LoginDB();
        // the conditional return the resultset, then t
        return loginDB.getUser(this.username, this.password);
    }
}
