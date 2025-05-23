/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owner;

import Admin.*;
import config.dbConnector;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Yisha
 */
public class petOwner extends javax.swing.JFrame {

    /**
     * Creates new form petOwner
     */
    public petOwner() {
        initComponents();
    }
    
    Color navcolor = new Color(255,102,102);
    Color hovercolor = new Color(255,153,153);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ofname = new javax.swing.JLabel();
        olname = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        oid = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ofname.setBackground(new java.awt.Color(255, 204, 204));
        ofname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "First Name:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N
        jPanel1.add(ofname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 350, 70));

        olname.setBackground(new java.awt.Color(255, 204, 204));
        olname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Last Name:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N
        jPanel1.add(olname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 350, 70));

        address.setBackground(new java.awt.Color(255, 204, 204));
        address.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Address:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 350, 70));

        oid.setBackground(new java.awt.Color(255, 204, 204));
        oid.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Owner ID:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N
        jPanel1.add(oid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 350, 70));

        contact.setBackground(new java.awt.Color(255, 204, 204));
        contact.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contact:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 350, 70));

        add.setBackground(new java.awt.Color(255, 153, 153));
        add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add");
        add.add(jLabel7);
        jLabel7.setBounds(10, 0, 100, 40);

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cute_border_collie_dog_waving_paw_cartoon_vector_illustration___Premium_Vector-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 430, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked

        if (oid.getText().isEmpty() || ofname.getText().isEmpty() ||
            olname.getText().isEmpty() || contact.getText().isEmpty() ||
            address.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "All fields are required!");

        } else {
            dbConnector dbc = new dbConnector();
            try {
                String ownerId = ofname.getText();
                String ownerfname = ofname.getText();
                String ownerlname = olname.getText();
                String ownercontact = contact.getText();
                String owneraddress = address.getText();

                String query = "INSERT INTO tbl_owner (owner_id, owner_fname, owner_lname, owner_contact, owner_address) " +
                "VALUES ('" + oid + "', '" + ofname + "', '" + olname + "', '" + contact + "', '" + address + "')";

                if (dbc.insertData(query) > 0) {
                    JOptionPane.showMessageDialog(null, "Pet added successfully!");
                    // Optionally clear the fields
                    oid.setText("");
                    ofname.setText("");
                    olname.setText("");
                    contact.setText("");
                    address.setText("");
                     // Reset image
                } else {
                    JOptionPane.showMessageDialog(null, "Database insertion failed.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(hovercolor);
    }//GEN-LAST:event_addMouseExited

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
            java.util.logging.Logger.getLogger(petOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(petOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(petOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(petOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new petOwner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JLabel address;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ofname;
    private javax.swing.JLabel oid;
    private javax.swing.JLabel olname;
    // End of variables declaration//GEN-END:variables
}
