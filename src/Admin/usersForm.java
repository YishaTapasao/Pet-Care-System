/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import petcaresystemguic.loginForm;

/**
 *
 * @author Yisha
 */
public class usersForm extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public usersForm() {
        initComponents();
        displayData();
    }

    Color navcolor = new Color(255,204,204);
    Color hovercolor = new Color(255,153,153);
    
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT u_id, u_fname, u_lname, u_email, u_username, u_status FROM tbl_user");
            usersTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p_add = new javax.swing.JPanel();
        u_add = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        acc_lname = new javax.swing.JLabel();
        u_edit = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Current User:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 210, 30));

        acc_id.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        jPanel2.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 210, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-03-05_155149-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 130));

        p_add.setBackground(new java.awt.Color(255, 204, 204));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });
        p_add.setLayout(null);

        u_add.setBackground(new java.awt.Color(255, 204, 204));
        u_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                u_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                u_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                u_addMouseExited(evt);
            }
        });
        u_add.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ADD");
        u_add.add(jLabel15);
        jLabel15.setBounds(20, 10, 170, 30);

        p_add.add(u_add);
        u_add.setBounds(0, 0, 210, 50);

        jPanel2.add(p_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, 50));

        acc_lname.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 30));

        u_edit.setBackground(new java.awt.Color(255, 204, 204));
        u_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                u_editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                u_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                u_editMouseExited(evt);
            }
        });
        u_edit.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("EDIT");
        u_edit.add(jLabel16);
        jLabel16.setBounds(20, 10, 170, 30);

        jPanel2.add(u_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 210, 50));

        acc_name.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setText("Users");
        jPanel2.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 530));

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 630, 400));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 90, 60));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 204));
        jLabel11.setText("E");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 204));
        jLabel4.setText("U");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 204));
        jLabel10.setText("S");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("S");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 204));
        jLabel9.setText("F");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 204));
        jLabel8.setText("O");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setText("R");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("M");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 204));
        jLabel12.setText("R");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        adminDashboard ds = new adminDashboard();
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 Session sess = Session.getInstance();
       if(sess.getUid()==0){
           JOptionPane.showMessageDialog(null, "No account, Login First!");
           loginForm lf = new loginForm();
           lf.setVisible(true);
           this.dispose();           
       }else{
       acc_name.setText(""+sess.getFname());
       acc_lname.setText(""+sess.getLname());
       acc_id.setText(""+sess.getUid());
           
       }  
    }//GEN-LAST:event_formWindowActivated

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
         
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited

    }//GEN-LAST:event_p_addMouseExited

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
      createUserForm crf = new createUserForm();
      crf.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void u_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_addMouseClicked
      createUserForm crf = new createUserForm();
      crf.setVisible(true);
//      crf.update.setEnabled(false);
      crf.update.setEnabled(false);
    for (Component c : crf.update.getComponents()) {
        c.setEnabled(false);
    } 
      crf.remove.setEnabled(false);
      crf.select.setEnabled(true);    
      this.dispose();     
    }//GEN-LAST:event_u_addMouseClicked

    private void u_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_addMouseEntered
       u_add.setBackground(hovercolor);           
    }//GEN-LAST:event_u_addMouseEntered

    private void u_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_addMouseExited
      u_add.setBackground(navcolor);
    }//GEN-LAST:event_u_addMouseExited

    private void u_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_editMouseClicked
      int rowIndex = usersTable.getSelectedRow();
      if(rowIndex < 0){
          JOptionPane.showMessageDialog(null, "Please select an item!");         
      }else{
          try{
              dbConnector dbc = new dbConnector();
              TableModel tbl = usersTable.getModel();
              ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE u_id ='"+tbl.getValueAt(rowIndex, 0)+"'");
              if(rs.next()){
                  createUserForm crf = new createUserForm();
                  crf.uid.setText(""+rs.getInt("u_id"));
                  crf.fname.setText(""+rs.getString("u_fname"));
                  crf.lname.setText(""+rs.getString("u_lname"));
                  crf.uname.setText(""+rs.getString("u_username"));
                  crf.email.setText(""+rs.getString("u_email"));
                  crf.pass.setText(""+rs.getString("u_password"));
                  crf.utype.setSelectedItem(""+rs.getString("u_type"));
                  crf.ustatus.setSelectedItem(""+rs.getString("u_status"));
                  crf.image.setIcon(crf.ResizeImage(rs.getString("u_image"), null, crf.image));
                  crf.oldpath = rs.getString("u_image");
                  crf.path = rs.getString("u_image");
                  crf.destination = rs.getString("u_image");
                  crf.add.setEnabled(false);
                  crf.update.setEnabled(true);
                  crf.setVisible(true);
                  
                  if(rs.getString("u_image").isEmpty()){
                      crf.select.setEnabled(true);
                      crf.remove.setEnabled(false);
                  }else{
                      crf.select.setEnabled(false);
                      crf.remove.setEnabled(true);
                  }
                  
                  this.dispose();
              }
          }catch(SQLException ex){
              System.out.println(""+ex);
          }
          
      } 
    }//GEN-LAST:event_u_editMouseClicked

    private void u_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_editMouseEntered
       u_edit.setBackground(hovercolor);           
    }//GEN-LAST:event_u_editMouseEntered

    private void u_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_editMouseExited
      u_edit.setBackground(navcolor);
    }//GEN-LAST:event_u_editMouseExited

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
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel u_add;
    private javax.swing.JPanel u_edit;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
