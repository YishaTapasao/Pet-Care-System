/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import petcaresystemguic.loginForm;

/**
 *
 * @author Yisha
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }

    Color blkcolor = new Color(0,0,0);
    Color hovercolor = new Color(204,204,204);
    

    
        public boolean duplicateCheck() {
    dbConnector dbc = new dbConnector();
    try {
        String query = "SELECT * FROM tbl_user WHERE u_username = '" + uname.getText() + "' OR u_email = '" + email.getText() + "'";
        ResultSet resultSet = dbc.getData(query);
        if (resultSet.next()) {
            String existingEmail = resultSet.getString("u_email");
        if (existingEmail.equals(email.getText())) {
            JOptionPane.showMessageDialog(null, "Email is Already Used!");
            email.setText("");
        }

        String existingUsername = resultSet.getString("u_username");
        if (existingUsername.equals(uname.getText())) {
            JOptionPane.showMessageDialog(null, "Username is Already Used!");
            uname.setText("");
        }
            return true;
        }
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    return false;
}
        
         public boolean updateCheck() {
    dbConnector dbc = new dbConnector();
    try {
        String query = "SELECT * FROM tbl_user WHERE (u_username = '" + uname.getText() + "' OR u_email = '" + email.getText() + "')AND u_id != '"+uid.getText()+"' ";
        ResultSet resultSet = dbc.getData(query);
        if (resultSet.next()) {
            String existingEmail = resultSet.getString("u_email");
        if (existingEmail.equals(email.getText())) {
            JOptionPane.showMessageDialog(null, "Email is Already Used!");
            email.setText("");
        }

        String existingUsername = resultSet.getString("u_username");
        if (existingUsername.equals(uname.getText())) {
            JOptionPane.showMessageDialog(null, "Username is Already Used!");
            uname.setText("");
        }
            return true;
        }
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    return false;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        email = new javax.swing.JTextField();
        utype = new javax.swing.JComboBox<>();
        ustatus = new javax.swing.JComboBox<>();
        uid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("User Status:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 160, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Password:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 160, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Email:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, 30));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("User Name:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Last Name:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("First Name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));

        fname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, 40));

        lname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 230, 40));

        uname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 230, 40));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, 40));

        email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 230, 40));

        utype.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        utype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utypeActionPerformed(evt);
            }
        });
        jPanel2.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 230, 40));

        ustatus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ustatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        ustatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ustatusActionPerformed(evt);
            }
        });
        jPanel2.add(ustatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 230, 40));

        uid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        uid.setEnabled(false);
        jPanel2.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 230, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("User ID:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, 30));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Account Type:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cão_samoiedo_bonito_acenando_ícone_dos_desenhos_animados_de_pata___Vetor_Premium-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 420, 500, 240));
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 230, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 460, 630));

        update.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 280, -1));

        add.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 280, -1));

        delete.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        delete.setText("DELETE");
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 280, -1));

        clear.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        clear.setText("CLEAR");
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 280, -1));

        cancel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 280, -1));

        refresh.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        refresh.setText("REFRESH");
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 280, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hello.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -10, 190, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ustatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ustatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ustatusActionPerformed

    private void utypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utypeActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || uname.getText().isEmpty()
            || email.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if (!email.getText().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(null, "Invalid email format!");
            email.setText("");
        }else if(pass.getText().length()<8){
            JOptionPane.showMessageDialog(null,"Password character should be 8 above.");
            pass.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");

        }else {
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_username, u_email, u_password, u_type, u_status)"
                + "VALUES('"+fname.getText()+"', '"+lname.getText()+"', '"+uname.getText()+"', '"+email.getText()+"', '"+pass.getText()+"', '"+utype.getSelectedItem()+"', 'Pending')")>0)
        
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        usersForm usf = new usersForm();
        usf.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || uname.getText().isEmpty()
            || email.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if (!email.getText().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(null, "Invalid email format!");
            email.setText("");
        }else if(pass.getText().length()<8){
            JOptionPane.showMessageDialog(null,"Password character should be 8 above.");
            pass.setText("");
        }else if(updateCheck()){
            System.out.println("Duplicate Exist");
        }else{
            
        dbConnector dbc = new dbConnector();
        dbc.updateData("UPDATE tbl_user SET u_fname = '" + fname.getText() + 
               "', u_lname = '" + lname.getText() + 
               "', u_email = '" + email.getText() + 
               "', u_password = '" + pass.getText() + 
               "', u_type = '" + utype.getSelectedItem() + 
               "', u_status = '" + ustatus.getSelectedItem() + 
               "' WHERE u_id = '" + uid.getText() + "'");
        
            usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
        pass.setEchoChar((char) 0); 
    } else {
        pass.setEchoChar('*'); 
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lname;
    public javax.swing.JPasswordField pass;
    private javax.swing.JButton refresh;
    public javax.swing.JTextField uid;
    public javax.swing.JTextField uname;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> ustatus;
    public javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
