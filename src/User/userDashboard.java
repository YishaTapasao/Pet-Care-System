/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import config.Session;
import javax.swing.JOptionPane;
import petcaresystemguic.loginForm;

/**
 *
 * @author Yisha
 */
public class userDashboard extends javax.swing.JFrame {

    /**
     * Creates new form userDashboard
     */
    public userDashboard() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-03-09_113522-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 120));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("Appointments");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 230, 209));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setText("R");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setText("A");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, 40));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel6.setText("O");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel7.setText("B");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 40));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel8.setText("H");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 40));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setText("S");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 40));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel10.setText("A");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 40));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel11.setText("D");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 40));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel12.setText("S");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 40));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel13.setText("E");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 40));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel14.setText("R");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 40));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel15.setText("D");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, 40));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel16.setText("LOGOUT");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, 40));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel17.setText("U");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 700, 660));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-03-05_155149-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 130, 140));

        acc_id.setBackground(new java.awt.Color(255, 204, 204));
        acc_id.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        acc_id.setForeground(new java.awt.Color(255, 204, 204));
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        jPanel3.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 300, 30));

        acc_name.setBackground(new java.awt.Color(255, 204, 204));
        acc_name.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        acc_name.setForeground(new java.awt.Color(255, 204, 204));
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setText("User");
        jPanel3.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 300, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 320, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
               Session sess = Session.getInstance();
       if(sess.getUid()==0){
           JOptionPane.showMessageDialog(null, "No account, Login First!");
           loginForm lf = new loginForm();
           lf.setVisible(true);
           this.dispose();           
       }else{
       acc_name.setText(""+sess.getFname());
       acc_id.setText(""+sess.getUid());
       }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
