/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.system;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moizs
 */
public class Add_User extends javax.swing.JFrame {

    POS_DataMembers POS_Data;
    DAL DAL_Object;

    /**
     * Creates new form Add_User
     */
    public Add_User(POS_DataMembers POS_Data) {
        this.POS_Data = POS_Data;
        this.DAL_Object = new DAL();
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

        background = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        addUserButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();
        fullNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(251, 136, 105));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/system/userIcon.png"))); // NOI18N
        background.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        usernameTextField.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(153, 153, 153));
        usernameTextField.setText("Enter Username");
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        background.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 228, 39));

        passwordTextField.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(153, 153, 153));
        passwordTextField.setText("Enter Password");
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        background.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 228, 39));

        addUserButton.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });
        background.add(addUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, 38));

        backButton.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        background.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 515, 81, 35));

        outputLabel.setText("Enter The User Details");
        background.add(outputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, -1, -1));

        fullNameTextField.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        fullNameTextField.setForeground(new java.awt.Color(153, 153, 153));
        fullNameTextField.setText("Enter Full Name");
        fullNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTextFieldActionPerformed(evt);
            }
        });
        background.add(fullNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 228, 39));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();

        new Edit_User(POS_Data).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        String fullName = fullNameTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        DAL_Object.runQuery("insert into Users values (1, '" + fullName + "', '" + username + "', '" + password + "')");

        outputLabel.setText("User Added Successfully");
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void fullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_User(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel background;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}