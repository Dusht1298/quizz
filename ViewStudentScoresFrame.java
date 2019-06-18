/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquiz.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquiz.dao.PerformanceDao;
import techquiz.pojo.StudentScore;
import techquiz.pojo.UserProfile;

/**
 *
 * @author DELL
 */
public class ViewStudentScoresFrame extends javax.swing.JFrame {
     private boolean isAdding;
     private ArrayList<String>examIdList;

    public ViewStudentScoresFrame() {
        initComponents();
        lblUsername.setText("Hello "+UserProfile.getUsername());
    }
      public ViewStudentScoresFrame(ArrayList<String>examIdList) {
        this();
        this.examIdList=examIdList;
        loadUI();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtLanguage = new javax.swing.JTextField();
        txtPercentage = new javax.swing.JTextField();
        txtUserid = new javax.swing.JTextField();
        jcExamId = new javax.swing.JComboBox<>();
        lblUsername = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Single Student Score Panel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("student scores details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("select student");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("select Exam id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText(" language");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Percentage");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        txtLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLanguageActionPerformed(evt);
            }
        });
        jPanel1.add(txtLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 77, -1));

        txtPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPercentageActionPerformed(evt);
            }
        });
        jPanel1.add(txtPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 77, -1));

        txtUserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUseridActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 64, -1));

        jcExamId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcExamIdItemStateChanged(evt);
            }
        });
        jcExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcExamIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcExamId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 64, -1));

        lblUsername.setBackground(new java.awt.Color(0, 0, 0));
        lblUsername.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 11, 75, 21));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquiz/gui/KK.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 510));

        jMenu1.setBackground(new java.awt.Color(153, 153, 153));
        jMenu1.setText("Back");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLanguageActionPerformed

    private void txtPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPercentageActionPerformed

    private void jcExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcExamIdActionPerformed
              if(isAdding==true){
            return;
        }
        
        String examId=jcExamId.getSelectedItem().toString();
        if(examId.equals("ExamId"))
        {
            JOptionPane.showMessageDialog(null, "Please select an ExamId!","No ExamId Selected!!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try
        {
            StudentScore scoreObj=PerformanceDao.getScore(UserProfile.getUsername(), examId);
            txtLanguage.setText(scoreObj.getLanguage());
            txtPercentage.setText(String.valueOf(scoreObj.getPer()));
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jcExamIdActionPerformed

    private void jcExamIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcExamIdItemStateChanged
        
    }//GEN-LAST:event_jcExamIdItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentOptionsFrame s=new StudentOptionsFrame();
        s.setVisible(true);
        this.dispose();
                       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUseridActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudentScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudentScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudentScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudentScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentScoresFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcExamId;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtPercentage;
    private javax.swing.JTextField txtUserid;
    // End of variables declaration//GEN-END:variables

 public void loadUI(){
        txtUserid.setText(UserProfile.getUsername());
        isAdding=true;
        jcExamId.removeAllItems();
        jcExamId.addItem("ExamId");
        for(String exid: examIdList)
                 jcExamId.addItem(exid);
      isAdding=false;  
    }



}
