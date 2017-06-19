package com.mycompany.bsu_rfms;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class rf_login extends javax.swing.JFrame {

    private int caret_initpos = 0;
    private int caret_finpos = 0;
    private String login_pass = "";
    private String pass_selection = "";
    private boolean pass_selected = false;
    private static JFrame jframe_login;
    
    public rf_login() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_header1 = new javax.swing.JLabel();
        jlbl_header2 = new javax.swing.JLabel();
        jtf_username = new javax.swing.JTextField();
        jtf_password = new javax.swing.JTextField();
        jb_login = new javax.swing.JButton();
        jb_register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jlbl_header1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jlbl_header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_header1.setText("RF Monitoring");

        jlbl_header2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jlbl_header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_header2.setText("System for Radio Stations");

        jtf_username.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jtf_username.setForeground(new java.awt.Color(153, 153, 153));
        jtf_username.setText("Enter your username here");
        jtf_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_usernameFocusLost(evt);
            }
        });

        jtf_password.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jtf_password.setForeground(new java.awt.Color(153, 153, 153));
        jtf_password.setText("Enter your password here");
        jtf_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_passwordFocusLost(evt);
            }
        });
        jtf_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtf_passwordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtf_passwordMouseReleased(evt);
            }
        });
        jtf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_passwordKeyReleased(evt);
            }
        });

        jb_login.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jb_login.setText("Login");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });

        jb_register.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jb_register.setText("Register");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlbl_header2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jtf_username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlbl_header1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlbl_header1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_header2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_login, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jb_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_usernameFocusGained
        if (jtf_username.getText().equals("Enter your username here")) {
            jtf_username.setText("");    
            jtf_username.setForeground(Color.black);
        }

    }//GEN-LAST:event_jtf_usernameFocusGained

    private void jtf_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_usernameFocusLost
        if (jtf_username.getText().equals("")) {
            jtf_username.setText("Enter your username here"); 
            jtf_username.setForeground(Color.gray);
        }

    }//GEN-LAST:event_jtf_usernameFocusLost

    private void jtf_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_passwordFocusGained
        if (jtf_password.getText().equals("Enter your password here")) {
            jtf_password.setText("");
            jtf_password.setForeground(Color.black);
            login_pass = "";
        }
    }//GEN-LAST:event_jtf_passwordFocusGained

    private void jtf_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_passwordFocusLost
        if (jtf_password.getText().equals("")) {
            jtf_password.setText("Enter your password here");
            jtf_password.setForeground(Color.gray);
            login_pass = "";
        }
    }//GEN-LAST:event_jtf_passwordFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        jframe_login.requestFocus();
        if (jtf_password.getText().equals("")) {
            jtf_password.setText("Enter your password here");
            jtf_password.setForeground(Color.gray);
        }
        
        if (jtf_username.getText().equals("Enter your username here")) {
            jtf_username.setText("Enter your username here");
            jtf_password.setForeground(Color.gray);            
        }
        
    }//GEN-LAST:event_formMouseClicked

    private void jtf_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_passwordKeyReleased
        
        String pass_char = "";
        boolean keyallow = false;
        int pass_len = 0;
        
        jtf_password.setForeground(Color.black);
        
        System.out.println("@@@@ boolean1 " + keyallow);
        
        // login pass = 
        if (login_pass.trim().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
                evt.consume();
                System.out.println("@@@@ login password empty");
                
            } else {
                keyallow = true;
                
            }
            
        // login pass = h
        } else {
            System.out.println("@@@@ login password NOT empty");
            
            if (jtf_password.getText().trim().isEmpty()) {
                
                System.out.println("@@@@ field is empty");
                if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
                    evt.consume();
                    System.out.println("@@@@ backspaced - consumed"); 
                    
                } else {
                    keyallow = true;
                    System.out.println("@@@@ backspaced");
                    login_pass = "";
                    
                }
            } else {
                keyallow = true;
                
            }
            
        }
        
        System.out.println("@@@@ boolean2 " + keyallow);
        if (keyallow) {
            if (pass_selected) {
                // *********************************************************** OVER HERE !!!!
                
                pass_selection = jtf_password.getSelectedText();
        
                if (caret_initpos > caret_finpos) {
                    pass_selection = login_pass.substring(caret_finpos, caret_initpos);
                } else {
                    pass_selection = login_pass.substring(caret_initpos, caret_finpos);                    
                }

                System.out.println("@@@@ selected " + pass_selection);
                
                
                pass_len = jtf_password.getText().length();
                System.out.println("@@@@ allowed"); 
            
            } else {
                login_pass = new StringBuilder().append(login_pass).append(evt.getKeyChar()).toString(); 
                pass_len = jtf_password.getText().length();
                System.out.println("@@@@ allowed");                
            }
            
        } else if (!login_pass.trim().isEmpty()) {
            login_pass = ""; 
            pass_len = 0;
            System.out.println("@@@@ cleared");
            
        }
        
        for (byte cnt = 0; cnt < pass_len; cnt++) {
            pass_char = new StringBuilder().append(pass_char).append("*").toString();
        }

        jtf_password.setText(pass_char);

        if (login_pass.trim().isEmpty()) {
            System.out.println("@@@@ NO PASSWORD");
        } else {
            System.out.println("@@@@ Password = " + login_pass);        
        }
        
    }//GEN-LAST:event_jtf_passwordKeyReleased

    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked
        
        boolean valid_access = false;
        ResultSet resultset = null;
        Connection connection = null;
        Statement statement = null;
        String query = "SELECT * FROM `users_table` WHERE "
                + "`users-name`='" + jtf_username.getText() + "' and "
                + "`users-password`='" + login_pass + "'";
        
        try {
            connection = rf_dbconnection.getConnection();
            
            statement = connection.createStatement();
            resultset = statement.executeQuery(query);
            
            while (resultset.next()) {
                if (jtf_username.getText().equals(resultset.getString("users-name")) 
                        && login_pass.equals(resultset.getString("users-password"))) {
                    valid_access = true;
                    break;
                }
            }
            
            if (valid_access) {
                JOptionPane.showMessageDialog(null, "Good Day Mr/Mrs. " + resultset.getString("users-fullname") + "!", 
                        "Login Successed", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username/password!", 
                        "Login Failed", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException sqlx) {
            sqlx.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database exception error. Kindly contact System Administrator to address concern.", 
                        "System Error #101", JOptionPane.ERROR_MESSAGE);
            
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }//GEN-LAST:event_jb_loginMouseClicked

    private void jtf_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_passwordMousePressed
     
        if (!jtf_password.getText().equals("Enter your password here")) {
            caret_initpos = jtf_password.getCaretPosition();   
        } else {
            caret_initpos = 0;
        }
        
    }//GEN-LAST:event_jtf_passwordMousePressed

    private void jtf_passwordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_passwordMouseReleased

        caret_finpos = jtf_password.getCaretPosition();
        
        System.out.println("@@@@@@@@@ " + caret_initpos + " - " + caret_finpos);
        
        if (caret_initpos != caret_finpos) {
            pass_selected = true;
            System.out.println("@@@@@@@@@ yeah");
        } else {
            pass_selected = false;
            System.out.println("@@@@@@@@@ booo");
        }
        
    }//GEN-LAST:event_jtf_passwordMouseReleased

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
            java.util.logging.Logger.getLogger(rf_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rf_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rf_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rf_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jframe_login = new rf_login();
                jframe_login.setTitle("RF Monitoring System");
                jframe_login.setVisible(true);
                jframe_login.setLocationRelativeTo(null);
                jframe_login.requestFocus();
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_register;
    private javax.swing.JLabel jlbl_header1;
    private javax.swing.JLabel jlbl_header2;
    private javax.swing.JTextField jtf_password;
    private javax.swing.JTextField jtf_username;
    // End of variables declaration//GEN-END:variables
}
