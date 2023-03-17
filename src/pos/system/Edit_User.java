/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moizs
 */
public class Edit_User extends javax.swing.JFrame {

    POS_DataMembers POS_Data;
    DAL DAL_Object;

    /**
     * Creates new form Edit_User
     */
    public Edit_User(POS_DataMembers POS_Data) {
        this.POS_Data = POS_Data;
        this.DAL_Object = new DAL();
        initComponents();

        ResultSet resultSet = DAL_Object.runQueryAndGetTable("select * from Users");

        try {
            while (resultSet.next()) {
                DefaultTableModel tableModel = (DefaultTableModel) userTable.getModel();

                tableModel.insertRow(tableModel.getRowCount(), new Object[]{resultSet.getInt(1), resultSet.getString(2)});
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        addUserButton = new javax.swing.JButton();
        removeUserButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(251, 136, 105));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(251, 136, 105));
        jPanel1.setForeground(new java.awt.Color(251, 136, 105));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/system/userIcon.png"))); // NOI18N
        jPanel1.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 271, -1));

        outputLabel.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        outputLabel.setText("Please Click On Button to Add/Remove Users");
        jPanel1.add(outputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 40, 450, 37));

        addUserButton.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 178, 53));

        removeUserButton.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        removeUserButton.setText("Remove User");
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removeUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 178, 53));

        backButton.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 515, 91, 35));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Full Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 410, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        this.dispose();

        new Add_User(POS_Data).setVisible(true);
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();

        new Home_Page(POS_Data).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        this.dispose();

        new Remove_User(POS_Data).setVisible(true);
    }//GEN-LAST:event_removeUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_User(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton removeUserButton;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
