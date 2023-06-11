
package logic;

import com.mysql.cj.jdbc.Blob;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageHandler {
    public String browseImage(JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(imageFilter);
        int result = fileChooser.showOpenDialog(frame);
        
        String imagePath = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            imagePath = fileChooser.getSelectedFile().getPath();
        }else if (result == JFileChooser.CANCEL_OPTION) {
            imagePath = null;
        }
        
        return imagePath;
    }
    
    public ImageIcon resizeImage(JLabel container, byte[] BLOBpic, String imagePath) {
        ImageIcon imageIcon;
        if (imagePath != null) {
            imageIcon = new ImageIcon(imagePath);
        }else {
            imageIcon = new ImageIcon(BLOBpic);
        }
        
        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(container.getWidth(), container.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        
        return resizedIcon;
    }
}
