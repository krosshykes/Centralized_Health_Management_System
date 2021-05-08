/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allshare.chms_1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author coolb
 */
public class Staff_login extends javax.swing.JFrame {

    /**
     * Creates new form Staff_login
     */
    public Staff_login() {
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

        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        hospital_address = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        hospital_name = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Staff Login");

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right-arrow.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        password.setText("Passw0rd!");
        password.setToolTipText("Enter Password to Login");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Login");

        hospital_address.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        hospital_address.setText("Hospital Address");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 102));
        jLabel5.setText("Forgot Password?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_Mesa de trabajo 2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        hospital_name.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        hospital_name.setText("Hospital Name");

        username.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username.setText("Username");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hospital_address, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(hospital_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(username)
                            .addComponent(password)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(hospital_name)
                .addGap(18, 18, 18)
                .addComponent(hospital_address)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection mycon = null;
        Statement stmnt = null;
        ResultSet myrs = null;
        Statement stmnt2 = null;
        ResultSet myrs2 = null;
        try {
            mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/chms", "root", "Asif@123");
            stmnt = mycon.createStatement();
            String var = username.getText().toString();
            String query = "Select * from users where user_name = \"" + var + "\"";
            stmnt2 = mycon.createStatement();

            String name_to_display;
            String designation_to_display;
            int user_id;
            long aadhar;
            String dob;
            String doj;
            String city;
            String state;
            String address;
            long mobile;

            myrs = stmnt.executeQuery(query);
            boolean username_exists = false;

            while (myrs.next()) {
                username_exists = true;
                String user_password = myrs.getString("password");
                user_id = myrs.getInt("user_id");
                String entered_password = password.getText().toString();
                if (user_password.equals(entered_password)) {
                    myrs2 = stmnt2.executeQuery("select * from staff_details where user_id = \"" + user_id + "\"");
                    Staff_dash sd = new Staff_dash();
                    while (myrs2.next()) {

                        name_to_display = myrs2.getString("emp_name");
                        designation_to_display = myrs2.getString("designation");
                        aadhar = myrs2.getLong("aadhar_number");
                        dob = myrs2.getString("emp_dob");
                        doj = myrs2.getString("emp_doj");
                        city = myrs2.getString("emp_city");
                        state = myrs2.getString("emp_state");
                        address = myrs2.getString("emp_address");
                        mobile = myrs2.getLong("emp_mobile");

                        sd.emp_name.setText(name_to_display);
                        sd.designation.setText(designation_to_display);
                        sd.emp_aadhar.setText(String.valueOf(aadhar));
                        sd.emp_dob.setText(dob);
                        sd.emp_doj.setText(doj);
                        sd.emp_city.setText(city);
                        sd.emp_state.setText(state);
                        sd.emp_address.setText(address);
                        sd.emp_mobile.setText(String.valueOf(mobile));
                        sd.emp_user_id.setText(String.valueOf(user_id));

                        sd.setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "wrong password", "Dialog", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (!username_exists) {
                JOptionPane.showMessageDialog(this, "user name does not exist", "Dialog", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myrs != null) {
                try {
                    myrs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Staff_login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (stmnt != null) {
                try {
                    stmnt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Staff_login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
//        Staff_dash sd = new Staff_dash();
//        sd.setVisible(true);
//        sd.name_disp.setText("xyz");
//        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed
    boolean usernameflag = false;
    boolean passwordflag = false;
    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        if (!usernameflag) {
            username.setText("");
            usernameflag = true;
        }
    }//GEN-LAST:event_usernameKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (!passwordflag) {
            password.setText("");
            passwordflag = true;
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Home hom = new Home();
        hom.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Staff_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton exitBtn;
    public javax.swing.JLabel hospital_address;
    public javax.swing.JLabel hospital_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
