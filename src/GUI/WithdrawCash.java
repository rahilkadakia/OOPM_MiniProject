/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Parth
 */
public class WithdrawCash extends javax.swing.JFrame {
    public static int balRahil=500000;
    public static int balRahul=500000;
    public static int balParth=500000;
    public static int balPruthav=500000;
    /**
     * Creates new form WithdrawCash
     */
    Connection con = null;
    Statement statement = null;
    ResultSet result = null;
    public WithdrawCash() {
        initComponents();
        selectionall();
    }
    
    public void selectionall(){
    try{
        con = DriverManager.getConnection("jdbc:derby://localhost:1527//OOPM", "rahil", "rnk1999");
        statement = con.createStatement();
        result = statement.executeQuery("Select * from RAHIL.withdraw");
        //table.setModel(DbUtils.resultSetToTableModel(result));
    }
    catch(SQLException e){
        e.printStackTrace();
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
        username = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        withdraw = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "WITHDRAW CASH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 3, 18), new java.awt.Color(51, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        confirm.setBackground(new java.awt.Color(0, 0, 0));
        confirm.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 0));
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Withdrawal Amount");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        withdraw.setBackground(new java.awt.Color(0, 0, 0));
        withdraw.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        withdraw.setForeground(new java.awt.Color(153, 153, 153));
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("User Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
     try{          
            String usernameTxt = username.getText();
            String withdrawTxt = withdraw.getText();
            int wdraw = Integer.parseInt(withdrawTxt);
            
            if("rahil".equals(usernameTxt) && wdraw <= balRahil){
                PreparedStatement add = con.prepareStatement("insert into rahil.withdraw values (?, ?)");
                add.setString(1, usernameTxt);
                add.setString(2, withdrawTxt);
                add.executeUpdate();
                username.setText("");
                withdraw.setText("");
                int balance = balRahil - Integer.parseInt(withdrawTxt);
                balRahil = balance;
                JOptionPane.showMessageDialog(null, "Balance is: "+balance);
            }
            else if("rahil".equals(usernameTxt) && wdraw > balRahil){
                JOptionPane.showMessageDialog(null, "Not Enough Balance");
            }
            
            if("pruthav".equals(usernameTxt) && wdraw <= balPruthav){
                PreparedStatement add = con.prepareStatement("insert into rahil.withdraw values (?, ?)");
                add.setString(1, usernameTxt);
                add.setString(2, withdrawTxt);
                add.executeUpdate();
                username.setText("");
                withdraw.setText("");
                int balance = balPruthav - Integer.parseInt(withdrawTxt);
                balPruthav = balance;
                JOptionPane.showMessageDialog(null, "Balance is: "+balance);
            }
            else if("pruthav".equals(usernameTxt) && wdraw > balPruthav){
                JOptionPane.showMessageDialog(null, "Not Enough Balance");
            }
            
            if("rahul".equals(usernameTxt) && wdraw <= balRahul){
                PreparedStatement add = con.prepareStatement("insert into rahil.withdraw values (?, ?)");
                add.setString(1, usernameTxt);
                add.setString(2, withdrawTxt);
                add.executeUpdate();
                username.setText("");
                withdraw.setText("");
                int balance = balRahul - Integer.parseInt(withdrawTxt);
                balRahul = balance;
                JOptionPane.showMessageDialog(null, "Balance is: "+balance);
            }
            else if("rahul".equals(usernameTxt) && wdraw > balRahul){
                JOptionPane.showMessageDialog(null, "Not Enough Balance");
            }
            
            if("parth".equals(usernameTxt) && wdraw <= balParth){
                PreparedStatement add = con.prepareStatement("insert into rahil.withdraw values (?, ?)");
                add.setString(1, usernameTxt);
                add.setString(2, withdrawTxt);
                add.executeUpdate();
                username.setText("");
                withdraw.setText("");
                int balance = balParth - Integer.parseInt(withdrawTxt);
                balParth = balance;
                JOptionPane.showMessageDialog(null, "Balance is: "+balance);
            }
            else if("parth".equals(usernameTxt) && wdraw > balParth){
                JOptionPane.showMessageDialog(null, "Not Enough Balance");
            }

        }
        catch(SQLException E){
            E.printStackTrace();
        }
        selectionall();
    }//GEN-LAST:event_confirmActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UserTab second = new UserTab();
            second.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawActionPerformed

    
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
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField username;
    private javax.swing.JTextField withdraw;
    // End of variables declaration//GEN-END:variables
}