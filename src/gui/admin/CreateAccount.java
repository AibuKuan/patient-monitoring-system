
package gui.admin;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.formdev.flatlaf.ui.FlatRoundBorder;
import com.formdev.flatlaf.ui.FlatTextBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import logic.CreateAccountValidation;

public class CreateAccount extends javax.swing.JFrame {
    
    Border redBorder = BorderFactory.createLineBorder(Color.RED);
    
   
    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSex = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelHeader = new javax.swing.JLabel();
        jLabelPicName = new javax.swing.JLabel();
        jLabelPic = new javax.swing.JLabel();
        jButtonBrowse = new javax.swing.JButton();
        jLabelFnameName = new javax.swing.JLabel();
        jTextFieldFname = new javax.swing.JTextField();
        jLabelMnameName = new javax.swing.JLabel();
        jTextFieldMname = new javax.swing.JTextField();
        jLabelLnameName = new javax.swing.JLabel();
        jTextFieldLname = new javax.swing.JTextField();
        jLabelDob = new javax.swing.JLabel();
        jDateChooserDob = new com.toedter.calendar.JDateChooser();
        jLabelBlood = new javax.swing.JLabel();
        jComboBoxBlood = new javax.swing.JComboBox<>();
        jLabelSex = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOther = new javax.swing.JRadioButton();
        jLabelPosition = new javax.swing.JLabel();
        jComboBoxPosition = new javax.swing.JComboBox<>();
        jLabelJob = new javax.swing.JLabel();
        jComboBoxJob = new javax.swing.JComboBox<>();
        jLabelDhired = new javax.swing.JLabel();
        jDateChooserDhired = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelContactInfo = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jComboBoxCountryCode = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldPhoneX = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldPhoneY = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldPhoneZ = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelStreet = new javax.swing.JLabel();
        jTextFieldStreet = new javax.swing.JTextField();
        jLabelBarangay = new javax.swing.JLabel();
        jTextFieldBarangay = new javax.swing.JTextField();
        jLabelCity = new javax.swing.JLabel();
        jTextFieldCity = new javax.swing.JTextField();
        jLabelProvince = new javax.swing.JLabel();
        jTextFieldProvince = new javax.swing.JTextField();
        jLabelCountry = new javax.swing.JLabel();
        jTextFieldCountry = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(null);

        jPanel1.setLayout(null);

        jLabelHeader.setText("Create Account");
        jPanel1.add(jLabelHeader);
        jLabelHeader.setBounds(40, 30, 82, 16);

        jLabelPicName.setText("Picture");
        jPanel1.add(jLabelPicName);
        jLabelPicName.setBounds(80, 90, 37, 16);

        jLabelPic.setBackground(new java.awt.Color(153, 255, 255));
        jLabelPic.setOpaque(true);
        jPanel1.add(jLabelPic);
        jLabelPic.setBounds(40, 110, 120, 110);

        jButtonBrowse.setText("Browse");
        jButtonBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBrowse);
        jButtonBrowse.setBounds(60, 230, 72, 23);

        jLabelFnameName.setText("First Name");
        jPanel1.add(jLabelFnameName);
        jLabelFnameName.setBounds(210, 90, 64, 16);

        jTextFieldFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFnameFocusGained(evt);
            }
        });
        jPanel1.add(jTextFieldFname);
        jTextFieldFname.setBounds(200, 110, 130, 22);

        jLabelMnameName.setText("Middle Name");
        jPanel1.add(jLabelMnameName);
        jLabelMnameName.setBounds(350, 90, 72, 16);

        jTextFieldMname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldMnameFocusGained(evt);
            }
        });
        jPanel1.add(jTextFieldMname);
        jTextFieldMname.setBounds(340, 110, 130, 22);

        jLabelLnameName.setText("Last Name");
        jPanel1.add(jLabelLnameName);
        jLabelLnameName.setBounds(490, 90, 70, 16);

        jTextFieldLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldLnameFocusGained(evt);
            }
        });
        jPanel1.add(jTextFieldLname);
        jTextFieldLname.setBounds(480, 110, 130, 22);

        jLabelDob.setText("Date of Birth:");
        jPanel1.add(jLabelDob);
        jLabelDob.setBounds(210, 150, 69, 16);

        jDateChooserDob.setDateFormatString("MMMMMMMMM d, y");
        jPanel1.add(jDateChooserDob);
        jDateChooserDob.setBounds(200, 170, 130, 22);

        jLabelBlood.setText("Blood Type");
        jPanel1.add(jLabelBlood);
        jLabelBlood.setBounds(350, 150, 60, 16);

        jComboBoxBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O-", "O+", "B-", "B+", "A-", "A+", "AB-", "AB+" }));
        jComboBoxBlood.setSelectedIndex(-1);
        jPanel1.add(jComboBoxBlood);
        jComboBoxBlood.setBounds(340, 170, 80, 22);

        jLabelSex.setText("Sex:");
        jPanel1.add(jLabelSex);
        jLabelSex.setBounds(440, 150, 20, 16);

        buttonGroupSex.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonMale);
        jRadioButtonMale.setBounds(430, 170, 50, 21);

        buttonGroupSex.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");
        jPanel1.add(jRadioButtonFemale);
        jRadioButtonFemale.setBounds(490, 170, 70, 21);

        buttonGroupSex.add(jRadioButtonOther);
        jRadioButtonOther.setText("Other");
        jPanel1.add(jRadioButtonOther);
        jRadioButtonOther.setBounds(560, 170, 60, 21);

        jLabelPosition.setText("Position");
        jPanel1.add(jLabelPosition);
        jLabelPosition.setBounds(210, 210, 48, 16);

        jComboBoxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physician", "Analyst" }));
        jComboBoxPosition.setSelectedIndex(-1);
        jPanel1.add(jComboBoxPosition);
        jComboBoxPosition.setBounds(200, 230, 130, 22);

        jLabelJob.setText("Title");
        jPanel1.add(jLabelJob);
        jLabelJob.setBounds(350, 210, 26, 16);

        jComboBoxJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Doctor", "Psychiatrists", "Obstetricians", "Neurologists", "Radiologists", "Anesthesiologists", "Pediatricians", "Cardiologists" }));
        jComboBoxJob.setSelectedIndex(-1);
        jPanel1.add(jComboBoxJob);
        jComboBoxJob.setBounds(340, 230, 130, 22);

        jLabelDhired.setText("Date Hired");
        jPanel1.add(jLabelDhired);
        jLabelDhired.setBounds(490, 210, 80, 16);

        jDateChooserDhired.setDateFormatString("MMMMMMMMM d, y");
        jPanel1.add(jDateChooserDhired);
        jDateChooserDhired.setBounds(480, 230, 130, 22);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 280, 640, 3);

        jLabelContactInfo.setText("Contact Information");
        jPanel1.add(jLabelContactInfo);
        jLabelContactInfo.setBounds(50, 310, 110, 16);

        jLabelPhone.setText("Phone Number:");
        jPanel1.add(jLabelPhone);
        jLabelPhone.setBounds(30, 350, 84, 16);

        jComboBoxCountryCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+63" }));
        jPanel1.add(jComboBoxCountryCode);
        jComboBoxCountryCode.setBounds(20, 370, 60, 22);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("(");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(80, 370, 10, 20);

        jTextFieldPhoneX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPhoneX.setText("XXX");
        jTextFieldPhoneX.setMaximumSize(new java.awt.Dimension(64, 17));
        jTextFieldPhoneX.setMinimumSize(new java.awt.Dimension(64, 17));
        jTextFieldPhoneX.setPreferredSize(new java.awt.Dimension(64, 17));
        jTextFieldPhoneX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneXFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneXFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldPhoneX);
        jTextFieldPhoneX.setBounds(90, 370, 40, 20);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText(")");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(130, 370, 10, 20);

        jTextFieldPhoneY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPhoneY.setText("YYY");
        jTextFieldPhoneY.setMaximumSize(new java.awt.Dimension(64, 17));
        jTextFieldPhoneY.setMinimumSize(new java.awt.Dimension(64, 17));
        jTextFieldPhoneY.setPreferredSize(new java.awt.Dimension(64, 17));
        jTextFieldPhoneY.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneYFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneYFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldPhoneY);
        jTextFieldPhoneY.setBounds(140, 370, 40, 20);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("-");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(180, 370, 10, 20);

        jTextFieldPhoneZ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPhoneZ.setText("ZZZZ");
        jTextFieldPhoneZ.setMaximumSize(new java.awt.Dimension(64, 17));
        jTextFieldPhoneZ.setMinimumSize(new java.awt.Dimension(64, 17));
        jTextFieldPhoneZ.setPreferredSize(new java.awt.Dimension(64, 17));
        jTextFieldPhoneZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneZFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneZFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldPhoneZ);
        jTextFieldPhoneZ.setBounds(190, 370, 50, 20);

        jLabelEmail.setText("Email");
        jPanel1.add(jLabelEmail);
        jLabelEmail.setBounds(260, 350, 29, 16);

        jTextFieldEmail.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTextFieldEmailComponentAdded(evt);
            }
        });
        jPanel1.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(260, 370, 160, 22);

        jLabelStreet.setText("Street");
        jPanel1.add(jLabelStreet);
        jLabelStreet.setBounds(30, 420, 30, 16);

        jTextFieldStreet.setText("Blk # Lot # Phase #");
        jTextFieldStreet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldStreetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldStreetFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldStreet);
        jTextFieldStreet.setBounds(20, 440, 140, 22);

        jLabelBarangay.setText("Barangay");
        jPanel1.add(jLabelBarangay);
        jLabelBarangay.setBounds(170, 420, 70, 16);

        jTextFieldBarangay.setText("Barangay #");
        jTextFieldBarangay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldBarangayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBarangayFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldBarangay);
        jTextFieldBarangay.setBounds(160, 440, 120, 22);

        jLabelCity.setText("City");
        jPanel1.add(jLabelCity);
        jLabelCity.setBounds(290, 420, 21, 16);

        jTextFieldCity.setText("Dasmariñas City");
        jTextFieldCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCityFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldCity);
        jTextFieldCity.setBounds(280, 440, 110, 22);

        jLabelProvince.setText("Provice");
        jPanel1.add(jLabelProvince);
        jLabelProvince.setBounds(400, 420, 39, 16);

        jTextFieldProvince.setText("Cavite");
        jTextFieldProvince.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldProvinceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldProvinceFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldProvince);
        jTextFieldProvince.setBounds(390, 440, 100, 22);

        jLabelCountry.setText("Country:");
        jPanel1.add(jLabelCountry);
        jLabelCountry.setBounds(500, 420, 46, 16);

        jTextFieldCountry.setText("Philippines");
        jTextFieldCountry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCountryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCountryFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldCountry);
        jTextFieldCountry.setBounds(490, 440, 125, 22);

        jLabelUsername.setText("Username");
        jPanel1.add(jLabelUsername);
        jLabelUsername.setBounds(200, 510, 60, 16);
        jPanel1.add(jTextFieldUsername);
        jTextFieldUsername.setBounds(160, 530, 130, 22);

        jLabelPassword.setText("Password");
        jPanel1.add(jLabelPassword);
        jLabelPassword.setBounds(350, 510, 60, 16);
        jPanel1.add(jTextFieldPassword);
        jTextFieldPassword.setBounds(320, 530, 130, 22);

        jButtonReset.setText("Reset");
        jPanel1.add(jButtonReset);
        jButtonReset.setBounds(230, 590, 75, 23);

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSubmit);
        jButtonSubmit.setBounds(310, 590, 72, 23);

        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("One or more fields are Empty!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 630, 290, 16);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextFieldEmailComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailComponentAdded

    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed

    private void jButtonBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBrowseActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
//        String username = jTextFieldUsername.getText();
//        String password = jTextFieldPassword.getText();
//        String fname = jTextFieldFname.getText();
//        String mname = jTextFieldMname.getText();
//        String lname = jTextFieldLname.getText();
//        String position = (String) jComboBoxPosition.getSelectedItem();
//        String title  = (String) jComboBoxJob.getSelectedItem();
//        Date dob = jDateChooserDob.getDate();
//        String blood = (String) jComboBoxBlood.getSelectedItem();
        
        JTextField[] textArray = {jTextFieldFname, jTextFieldMname, jTextFieldLname, jTextFieldPhoneX, jTextFieldPhoneY, jTextFieldPhoneZ, jTextFieldEmail, jTextFieldStreet, jTextFieldBarangay, jTextFieldCity, jTextFieldProvince, jTextFieldCountry, jTextFieldUsername, jTextFieldPassword};
        JDateChooser[] dateArray = {jDateChooserDob, jDateChooserDhired};
        JComboBox[] comboArray = {jComboBoxBlood, jComboBoxPosition, jComboBoxJob, jComboBoxCountryCode};
        ButtonGroup[] buttonArray = {buttonGroupSex};
        
        //CreateAccountValidation cav = new CreateAccountValidation(jTextFieldFname, jTextFieldMname, jTextFieldLname, jDateChooserDob, jComboBoxBlood, buttonGroupSex, jComboBoxPosition, jComboBoxJob, jDateChooserDhired, jComboBoxCountryCode, jTextFieldPhoneX, jTextFieldPhoneY, jTextFieldPhoneZ, jTextFieldEmail, jTextFieldStreet, jTextFieldBarangay, jTextFieldCity, jTextFieldProvince, jTextFieldCountry, jTextFieldUsername, jTextFieldPassword);
        CreateAccountValidation cav = new CreateAccountValidation(textArray, dateArray, comboArray, buttonArray);
        cav.ca = this;
        //cav.isEmpty(jTextFieldFname.getText(), jTextFieldMname.getText(), jTextFieldLname.getText(), jDateChooserDob.getDate(), jComboBoxBlood.getSelectedItem().toString(), buttonGroupSex.getSelection(), jComboBoxPosition.getSelectedItem().toString(), jComboBoxJob.getSelectedItem().toString(), jDateChooserDhired.getDate(), jComboBoxCountryCode.getSelectedItem().toString(), jTextFieldPhoneX.getText(), jTextFieldPhoneY.getText(), jTextFieldPhoneZ.getText(), jTextFieldEmail.getText(), jTextFieldStreet.getText(), jTextFieldBarangay.getText(), jTextFieldCity.getText(), jTextFieldProvince.getText(), jTextFieldCountry.getText(), jTextFieldUsername.getText(), jTextFieldPassword.getText());
        
        if(cav.isEmpty()) {
            
        }
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    public void highlightEmptyFields(Boolean[] text, Boolean[] date, Boolean[] combo, Boolean[] button) {
        if (text[0]) jTextFieldFname.setBorder(redBorder);
        if (text[1]) jTextFieldMname.setBorder(redBorder);
        if (text[2]) jTextFieldLname.setBorder(redBorder);
        if (text[3]) jTextFieldPhoneX.setBorder(redBorder);
        if (text[4]) jTextFieldPhoneY.setBorder(redBorder);
        if (text[5]) jTextFieldPhoneZ.setBorder(redBorder);
        if (text[6]) jTextFieldEmail.setBorder(redBorder);
        if (text[7]) jTextFieldStreet.setBorder(redBorder);
        if (text[8]) jTextFieldBarangay.setBorder(redBorder);
        if (text[9]) jTextFieldCity.setBorder(redBorder);
        if (text[10]) jTextFieldProvince.setBorder(redBorder);
        if (text[11]) jTextFieldCountry.setBorder(redBorder);
        if (text[12]) jTextFieldUsername.setBorder(redBorder);
        if (text[13]) jTextFieldPassword.setBorder(redBorder);
        
        if (date[0]) jDateChooserDob.setBorder(redBorder);
        if (date[1]) jDateChooserDhired.setBorder(redBorder);
        
        if (combo[0]) jComboBoxBlood.setBorder(redBorder);
        if (combo[1]) jComboBoxPosition.setBorder(redBorder);
        if (combo[2]) jComboBoxJob.setBorder(redBorder);
        if (combo[3]) jComboBoxCountryCode.setBorder(redBorder);
        
        if (button[0]) {
            jRadioButtonMale.setBorder(redBorder);
            jRadioButtonFemale.setBorder(redBorder);
            jRadioButtonOther.setBorder(redBorder);
        }
    }
    
    private void jTextFieldPhoneXFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneXFocusGained
        if (jTextFieldPhoneX.getText().equals("XXX")) {
            jTextFieldPhoneX.setText("");
        }
        jTextFieldPhoneX.setBorder(new FlatTextBorder());
    }//GEN-LAST:event_jTextFieldPhoneXFocusGained

    private void jTextFieldPhoneXFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneXFocusLost
        if (jTextFieldPhoneX.getText().isEmpty()) {
            jTextFieldPhoneX.setText("XXX");
        }
    }//GEN-LAST:event_jTextFieldPhoneXFocusLost

    private void jTextFieldPhoneYFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneYFocusGained
        if (jTextFieldPhoneY.getText().equals("YYY")) {
            jTextFieldPhoneY.setText("");
        }
    }//GEN-LAST:event_jTextFieldPhoneYFocusGained

    private void jTextFieldPhoneYFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneYFocusLost
        if (jTextFieldPhoneY.getText().isEmpty()) {
            jTextFieldPhoneY.setText("YYY");
        }
    }//GEN-LAST:event_jTextFieldPhoneYFocusLost

    private void jTextFieldPhoneZFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneZFocusGained
        if (jTextFieldPhoneZ.getText().equals("ZZZZ")) {
            jTextFieldPhoneZ.setText("");
        }
    }//GEN-LAST:event_jTextFieldPhoneZFocusGained

    private void jTextFieldPhoneZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneZFocusLost
        if (jTextFieldPhoneZ.getText().isEmpty()) {
            jTextFieldPhoneZ.setText("ZZZZ");
        }
    }//GEN-LAST:event_jTextFieldPhoneZFocusLost

    private void jTextFieldStreetFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldStreetFocusGained
        if (jTextFieldStreet.getText().equals("Blk # Lot # Phase #")) {
            jTextFieldStreet.setText("");
        }
    }//GEN-LAST:event_jTextFieldStreetFocusGained

    private void jTextFieldStreetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldStreetFocusLost
        if (jTextFieldStreet.getText().isEmpty()) {
            jTextFieldStreet.setText("Blk # Lot # Phase #");
        }
    }//GEN-LAST:event_jTextFieldStreetFocusLost

    private void jTextFieldBarangayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBarangayFocusGained
        if (jTextFieldBarangay.getText().equals("Barangay #")) {
            jTextFieldBarangay.setText("");
        }
    }//GEN-LAST:event_jTextFieldBarangayFocusGained

    private void jTextFieldBarangayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBarangayFocusLost
        if (jTextFieldBarangay.getText().isEmpty()) {
            jTextFieldBarangay.setText("Barangay #");
        }
    }//GEN-LAST:event_jTextFieldBarangayFocusLost

    private void jTextFieldCityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCityFocusGained
        if (jTextFieldCity.getText().equals("Dasmariñas City")) {
            jTextFieldCity.setText("");
        }
    }//GEN-LAST:event_jTextFieldCityFocusGained

    private void jTextFieldCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCityFocusLost
        if (jTextFieldCity.getText().isEmpty()) {
            jTextFieldCity.setText("Dasmariñas City");
        }
    }//GEN-LAST:event_jTextFieldCityFocusLost

    private void jTextFieldProvinceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldProvinceFocusGained
        if (jTextFieldProvince.getText().equals("Cavite")) {
            jTextFieldProvince.setText("");
        }
    }//GEN-LAST:event_jTextFieldProvinceFocusGained

    private void jTextFieldProvinceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldProvinceFocusLost
        if (jTextFieldProvince.getText().isEmpty()) {
            jTextFieldProvince.setText("Cavite");
        }
    }//GEN-LAST:event_jTextFieldProvinceFocusLost

    private void jTextFieldCountryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCountryFocusGained
        if (jTextFieldCountry.getText().equals("Philippines")) {
            jTextFieldCountry.setText("");
        }
    }//GEN-LAST:event_jTextFieldCountryFocusGained

    private void jTextFieldCountryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCountryFocusLost
        if (jTextFieldCountry.getText().isEmpty()) {
            jTextFieldCountry.setText("Philippines");
        }
    }//GEN-LAST:event_jTextFieldCountryFocusLost

    private void jTextFieldFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFnameFocusGained
        jTextFieldFname.setBorder(new FlatTextBorder());
    }//GEN-LAST:event_jTextFieldFnameFocusGained

    private void jTextFieldMnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMnameFocusGained
        jTextFieldMname.setBorder(new FlatTextBorder());
    }//GEN-LAST:event_jTextFieldMnameFocusGained

    private void jTextFieldLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLnameFocusGained
        jTextFieldLname.setBorder(new FlatTextBorder());
    }//GEN-LAST:event_jTextFieldLnameFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreateAccount().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSex;
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxBlood;
    private javax.swing.JComboBox<String> jComboBoxCountryCode;
    private javax.swing.JComboBox<String> jComboBoxJob;
    private javax.swing.JComboBox<String> jComboBoxPosition;
    private com.toedter.calendar.JDateChooser jDateChooserDhired;
    private com.toedter.calendar.JDateChooser jDateChooserDob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabelBarangay;
    private javax.swing.JLabel jLabelBlood;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelContactInfo;
    private javax.swing.JLabel jLabelCountry;
    private javax.swing.JLabel jLabelDhired;
    private javax.swing.JLabel jLabelDob;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFnameName;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelJob;
    private javax.swing.JLabel jLabelLnameName;
    private javax.swing.JLabel jLabelMnameName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelPic;
    private javax.swing.JLabel jLabelPicName;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelProvince;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JLabel jLabelStreet;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOther;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldBarangay;
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldCountry;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldLname;
    private javax.swing.JTextField jTextFieldMname;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPhoneX;
    private javax.swing.JTextField jTextFieldPhoneY;
    private javax.swing.JTextField jTextFieldPhoneZ;
    private javax.swing.JTextField jTextFieldProvince;
    private javax.swing.JTextField jTextFieldStreet;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}