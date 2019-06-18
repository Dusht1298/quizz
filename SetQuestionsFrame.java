/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquiz.gui;

import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import techquiz.dao.ExamDao;
import techquiz.dao.QuestionDao;
import techquiz.pojo.ExamPojo;
import techquiz.pojo.QuestionPojo;
import techquiz.pojo.QuestionStore;
import techquiz.pojo.UserProfile;

/**
 *
 * @author DELL
 */
public class SetQuestionsFrame extends javax.swing.JFrame {

   private ExamPojo newExam;
   private QuestionStore qstore;
   private HashMap<String,String>options;
   private int qno;
   private String question,option1,option2,option3,option4,correctOption;
    public SetQuestionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
           
       
        qstore=new QuestionStore();
        options=new HashMap<>();
        options.put("Option1", "Answer1");
        options.put("Option2", "Answer2");
        options.put("Option3", "Answer3");
        options.put("Option4", "Answer4");
                qno=1;
                lblQno.setText(lblQno.getText()+"-"+qno);
    }
    public SetQuestionsFrame(ExamPojo newExam){
        this();
        this.newExam=newExam;
       
        
        lblTitle.setText(""+this.newExam.getTotalquestions());
        
        
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        txtOption3 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblQno = new javax.swing.JLabel();
        jcCorrectOption = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(153, 153, 153));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 0));
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 50, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("OPTION 1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("OPTION 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 63, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("OPTION 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("OPTION 4");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 53, -1));

        txtOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 90, -1));
        jPanel1.add(txtOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 90, -1));
        jPanel1.add(txtOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 90, -1));
        jPanel1.add(txtOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 90, -1));

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 540, -1));

        lblQno.setBackground(new java.awt.Color(255, 255, 255));
        lblQno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQno.setForeground(new java.awt.Color(51, 255, 102));
        lblQno.setText("QUUESTION NO");
        jPanel1.add(lblQno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        jcCorrectOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option1", "Option2", "Option3", "Option4" }));
        jPanel1.add(jcCorrectOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("CORRECT ANSWER");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 100, 20));

        btnNext.setBackground(new java.awt.Color(102, 102, 102));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        btnDone.setBackground(new java.awt.Color(102, 102, 102));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        jPanel1.add(btnDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        lblTitle1.setBackground(new java.awt.Color(153, 153, 153));
        lblTitle1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 51, 0));
        lblTitle1.setText("QUESTIONS LEFT");
        jPanel1.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquiz/gui/photo-1458040937381-49c067dfd49a.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 690, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 0, 700, 490));

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption1ActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
            if(qno<=newExam.getTotalquestions()){
            int remainingQuestions=newExam.getTotalquestions()-qno+1;
            JOptionPane.showMessageDialog(null, "You still have "+remainingQuestions+" left","Cannot Add Exam!",JOptionPane.ERROR_MESSAGE);
            return;
       }
        try{
          
           ExamDao.addExam(newExam);
          QuestionDao.addQuestion(qstore);
          JOptionPane.showMessageDialog(null, "Your question set has been successfully added to the database ","Exam Added!",JOptionPane.INFORMATION_MESSAGE);
          NewJFrame3 adminFrame=new NewJFrame3();
          adminFrame.setVisible(true);
          this.dispose();
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE); 
           ex.printStackTrace();
       }

    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
      
                if(validateInput()==false)
        {
            JOptionPane.showMessageDialog(null, "Please fill all the input fields","Cannot Add Question!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String optionName=options.get(correctOption);
        QuestionPojo obj=new QuestionPojo(newExam.getExamId(),qno,newExam.getLanguage(),option1,option2,option3,option4,optionName,question);

         System.out.println(obj);
     
        qstore.addQuestion(obj);
        clearAll();
        lblTitle.setText(""+(newExam.getTotalquestions()-qno));
        qno++;
        if(qno>newExam.getTotalquestions())
        {
            disableAll();
            JOptionPane.showMessageDialog(null, "Your question set has been successfully created.\nPress the DONE button to add it to the database ","Exam Added!",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            lblQno.setText("Question no:"+qno);
        

    }//GEN-LAST:event_btnNextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              SetPaperFrame paperFrame=new SetPaperFrame();
       paperFrame.setVisible(true);
       this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         LoginFrames l=new LoginFrames();
       l.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

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
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetQuestionsFrame().setVisible(true);
            }
        });
    }
    public boolean validateInput(){
        question=txtQuestion.getText().trim();
        option1=txtOption1.getText().trim();
         option2=txtOption2.getText().trim();
          option3=txtOption3.getText().trim();
           option4=txtOption4.getText().trim();
           correctOption=jcCorrectOption.getSelectedItem().toString();
           System.out.println(correctOption);
           if(question.isEmpty()||option1.isEmpty()||option2.isEmpty()||option3.isEmpty()||option4.isEmpty())
               return false;
           else
               return true;
        
    }
    public void clearAll(){
        
        txtQuestion.setText("");
        txtOption1.setText("");
         txtOption2.setText("");
          txtOption3.setText("");
           txtOption4.setText("");
           jcCorrectOption.setSelectedIndex(0);
           
        
    }
    public void disableAll(){
        txtQuestion.setEnabled(false);
        txtOption1.setEnabled(false);
        txtOption2.setEnabled(false);
        txtOption3.setEnabled(false);
        txtOption4.setEnabled(false);
        jcCorrectOption.setEnabled(false);
        btnNext.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCorrectOption;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
