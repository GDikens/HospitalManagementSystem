/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Dineth Kariyawasam
 */
public class ReceptionMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionMainFrame
     */
    public ReceptionMainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dd = sdf.format(d);
            lblsystemdate.setText("Date : "+dd);
            
            Timer ti;
            ti = new Timer(1000, new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Date d = new Date();
                    SimpleDateFormat sm = new SimpleDateFormat("hh:mm:ss a");
                    String dd = sm.format(d);
                    lblsystemtime.setText("Time : "+dd);
                }
            });
            ti.start();
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
        lblchangeuser = new javax.swing.JLabel();
        lblsystemdate = new javax.swing.JLabel();
        lblsystemtime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btndeleteusers = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnaddnewuser = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btneditusers = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnsearchusers = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reception Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblchangeuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblchangeuser.setText("You are logged in as a Receptionist");
        jPanel1.add(lblchangeuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        lblsystemdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsystemdate.setText("Date : ");
        jPanel1.add(lblsystemdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        lblsystemtime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsystemtime.setText("Time :");
        jPanel1.add(lblsystemtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Office-Customer-Male-Light-icon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Users-Add-User-icon (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 150, 140));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/user-man-delete-icon.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Delete Users");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 315, -1, -1));

        btndeleteusers.setBackground(new java.awt.Color(255, 255, 255));
        btndeleteusers.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btndeleteusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteusersActionPerformed(evt);
            }
        });
        jPanel1.add(btndeleteusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 250, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/User-Interface-Available-Updates-icon.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Add New Users");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 135, -1, -1));

        btnaddnewuser.setBackground(new java.awt.Color(255, 255, 255));
        btnaddnewuser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnaddnewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewuserActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddnewuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 250, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Custormize Users");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 225, -1, -1));

        btneditusers.setBackground(new java.awt.Color(255, 255, 255));
        btneditusers.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btneditusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditusersActionPerformed(evt);
            }
        });
        jPanel1.add(btneditusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 250, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/user-man-search-icon.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 388, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Search Patients");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 405, -1, -1));

        btnsearchusers.setBackground(new java.awt.Color(255, 255, 255));
        btnsearchusers.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnsearchusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchusersActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearchusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 250, 70));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/textlogin.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        btnlogout.setBackground(new java.awt.Color(255, 255, 255));
        btnlogout.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddnewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewuserActionPerformed
        // TODO add your handling code here:
        AddUserFrame addnewuser=new AddUserFrame();
        addnewuser.setVisible(true);
        addnewuser.returnUserType(1);
        addnewuser.setActiveButtons(1);
        addnewuser.usertype=1;
    }//GEN-LAST:event_btnaddnewuserActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        LoginForm backtologin=new LoginForm();
        backtologin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btneditusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditusersActionPerformed
        // TODO add your handling code here:
        EditUserFrame editusers=new EditUserFrame();
        editusers.setVisible(true);
        editusers.returnUserType(1);
        editusers.setActiveButtons(1);
        editusers.usertype=1;
    }//GEN-LAST:event_btneditusersActionPerformed

    private void btndeleteusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteusersActionPerformed
        // TODO add your handling code here:
        DeleteUserFrame deleteusers=new DeleteUserFrame();
        deleteusers.setVisible(true);
        deleteusers.returnUserType(1);
        deleteusers.setActiveButtons(1);
        deleteusers.usertype=1;
    }//GEN-LAST:event_btndeleteusersActionPerformed

    private void btnsearchusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchusersActionPerformed
        // TODO add your handling code here:
        ViewPatients viewpatientsform=new ViewPatients();
        viewpatientsform.setVisible(true);
    }//GEN-LAST:event_btnsearchusersActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptionMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddnewuser;
    private javax.swing.JButton btndeleteusers;
    private javax.swing.JButton btneditusers;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnsearchusers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel lblchangeuser;
    private javax.swing.JLabel lblsystemdate;
    private javax.swing.JLabel lblsystemtime;
    // End of variables declaration//GEN-END:variables
}
