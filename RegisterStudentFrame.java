/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquiz.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import techquiz.dao.UserDao;
import techquiz.pojo.UserPojo;

/**
 *
 * @author DELL
 */
public class RegisterStudentFrame extends javax.swing.JFrame {

    private String userid;
    private String password;
    public RegisterStudentFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
private int validateInput(){
                      userid=txtUserid.getText();
               char []pwd=txtPassword.getPassword();
       char []repwd=txtReTypePassword.getPassword();
       if(userid.isEmpty()|| pwd.length==0 || repwd.length==0 )
            return 0;
       else 
       {
           password=String.valueOf(pwd);
           String repassword=String.valueOf(repwd);
           if(userid.length()<4 || pwd.length<4)
               return -2;
           if(password.equals(repassword)==false)
                return -1;
           else
                return 1;
       }
    
    
    
    
    
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
        jButton1 = new javax.swing.JButton();
        txtReTypePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        txtUserid = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("STUDENT REGISTERATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Register new student");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("user id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("ReType password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        txtReTypePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReTypePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtReTypePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 82, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 82, -1));

        txtUserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUseridActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 82, -1));

        lblUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquiz/gui/JJ.jpg"))); // NOI18N
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 510));

        jMenu1.setText("Back");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             int response=validateInput();
      if(response==0)
        {
            JOptionPane.showMessageDialog(null, "Username or Password cannot be left blank!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(response==-1)
        {
            JOptionPane.showMessageDialog(null, "Password and Retype Password do not match!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(response==-2)
        {
            JOptionPane.showMessageDialog(null, "Userid and Password should be atleast 4 characters long!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            UserPojo user=new UserPojo();
            user.setUserid(userid);
            user.setPassword(password);
            user.setUsertype("user");
            boolean status=UserDao.addUser(user);
           if(status)
           {
                JOptionPane.showMessageDialog(null, "Registration Done!","Userid: "+userid+"\nPassword:"+password,JOptionPane.INFORMATION_MESSAGE);
                clearAll();
           }
           else
              JOptionPane.showMessageDialog(null, "Userid Already Present","Registration Denied!",JOptionPane.ERROR_MESSAGE);
       
        }
        catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE); 
           ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUseridActionPerformed

    private void txtReTypePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReTypePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReTypePasswordActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
       NewJFrame3 n=new NewJFrame3();
       n.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(RegisterStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterStudentFrame().setVisible(true);
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtReTypePassword;
    private javax.swing.JTextField txtUserid;
    // End of variables declaration//GEN-END:variables

    public void clearAll(){

        txtUserid.setText("");
        txtPassword.setText("");
        txtReTypePassword.setText("");


    }

}
