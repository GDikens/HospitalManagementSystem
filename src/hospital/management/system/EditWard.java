/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dineth Kariyawasam
 */
public class EditWard extends javax.swing.JFrame {

    /**
     * Creates new form EditWard
     */
    int usertype=0;
    String direction=null;
    
    public EditWard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtwardname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtwardcategory = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmaxpatients = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtemployedstaff = new javax.swing.JTextField();
        txtsetdate = new javax.swing.JTextField();
        txtdob = new datechooser.beans.DateChooserCombo();
        jLabel8 = new javax.swing.JLabel();
        txtwardid = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Custormize Wards");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ward Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, -1));
        jPanel2.add(txtwardname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ward Category");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, -1));
        jPanel2.add(txtwardcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Date of Started");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Max. Patients");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, -1));
        jPanel2.add(txtmaxpatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Employed Staff");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, -1));
        jPanel2.add(txtemployedstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, -1));

        txtsetdate.setEditable(false);
        jPanel2.add(txtsetdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, -1));

        txtdob.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    try {
        txtdob.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    txtdob.addCommitListener(new datechooser.events.CommitListener() {
        public void onCommit(datechooser.events.CommitEvent evt) {
            txtdobOnCommit(evt);
        }
    });
    jPanel2.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 25, -1));

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel8.setText("Ward ID");
    jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 100, -1));
    jPanel2.add(txtwardid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 70, -1));

    btnupdate.setBackground(new java.awt.Color(242, 241, 240));
    btnupdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    btnupdate.setText("Update");
    btnupdate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnupdateActionPerformed(evt);
        }
    });
    jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 80, 40));

    btndelete.setBackground(new java.awt.Color(242, 241, 240));
    btndelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    btndelete.setText("Delete");
    btndelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btndeleteActionPerformed(evt);
        }
    });
    jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 80, 40));

    btncancel.setBackground(new java.awt.Color(242, 241, 240));
    btncancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    btncancel.setText("Cancel");
    btncancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btncancelActionPerformed(evt);
        }
    });
    jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 80, 40));

    btnsearch.setBackground(new java.awt.Color(242, 241, 240));
    btnsearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    btnsearch.setText("Search");
    btnsearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnsearchActionPerformed(evt);
        }
    });
    jPanel2.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 90, 30));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdobOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_txtdobOnCommit
        // TODO add your handling code here:
        txtsetdate.setText(txtdob.getText());
    }//GEN-LAST:event_txtdobOnCommit

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        try {
            Statement s = Database.getStatement();
            s.executeUpdate("UPDATE warddetails set WardName='" + txtwardname.getText() + "',WardCategory='" + txtwardcategory.getText() + "',DateOfStarted='" + txtsetdate.getText() + "',MaxPatients='" + txtmaxpatients.getText() + "',EmployedStaff='" + txtemployedstaff.getText()+ "' where WardID='" + txtwardid.getText() + "'");
            JOptionPane.showMessageDialog(rootPane,"Updated Successfully!","",JOptionPane.INFORMATION_MESSAGE);
            txtwardid.setText("");
            txtwardname.setText("");
            txtwardcategory.setText("");
            txtsetdate.setText("");
            txtmaxpatients.setText("");
            txtemployedstaff.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            // TODO add your handling code here:
            Statement s=Database.getStatement();
            s.executeUpdate("DELETE FROM warddetails WHERE WardID='"+txtwardid.getText()+"'");
            JOptionPane.showMessageDialog(rootPane,"Deleted Successfully!","",JOptionPane.INFORMATION_MESSAGE);
            txtwardid.setText("");
            txtwardname.setText("");
            txtwardcategory.setText("");
            txtsetdate.setText("");
            txtmaxpatients.setText("");
            txtemployedstaff.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        txtwardid.setText("");
        txtwardname.setText("");
        txtwardcategory.setText("");
        txtsetdate.setText("");
        txtmaxpatients.setText("");
        txtemployedstaff.setText("");
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        try {
            Statement s = Database.getStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM warddetails WHERE WardID='" + txtwardid.getText() + "'");
            while (rs.next()) {
                txtwardname.setText(rs.getString("WardName"));
                txtwardcategory.setText(rs.getString("WardCategory"));
                txtsetdate.setText(rs.getString("DateOfStarted"));
                txtmaxpatients.setText(rs.getString("MaxPatients"));
                txtemployedstaff.setText(rs.getString("EmployedStaff"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(EditWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditWard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private datechooser.beans.DateChooserCombo txtdob;
    private javax.swing.JTextField txtemployedstaff;
    private javax.swing.JTextField txtmaxpatients;
    private javax.swing.JTextField txtsetdate;
    private javax.swing.JTextField txtwardcategory;
    private javax.swing.JTextField txtwardid;
    private javax.swing.JTextField txtwardname;
    // End of variables declaration//GEN-END:variables
}