package com.mycompany.bsu_rfms;

import java.awt.event.KeyEvent;
import javafx.scene.input.KeyCode;
import javax.swing.JFrame;

public class rf_login extends javax.swing.JFrame {

    private String login_pass = "";
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
        jtf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_passwordKeyReleased(evt);
            }
        });

        jb_login.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jb_login.setText("Login");

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
        }

    }//GEN-LAST:event_jtf_usernameFocusGained

    private void jtf_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_usernameFocusLost
        if (jtf_username.getText().equals("")) {
            jtf_username.setText("Enter your username here");            
        }

    }//GEN-LAST:event_jtf_usernameFocusLost

    private void jtf_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_passwordFocusGained
        if (jtf_password.getText().equals("Enter your password here")) {
            jtf_password.setText("");
            
        }
    }//GEN-LAST:event_jtf_passwordFocusGained

    private void jtf_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_passwordFocusLost
        if (jtf_password.getText().equals("")) {
            jtf_password.setText("Enter your password here");            
        }
    }//GEN-LAST:event_jtf_passwordFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        jframe_login.requestFocus();
        if (jtf_password.getText().equals("")) {
            jtf_password.setText("Enter your password here");            
        }
        
        if (jtf_username.getText().equals("Enter your username here")) {
            jtf_username.setText("Enter your username here");            
        }
        
    }//GEN-LAST:event_formMouseClicked

    private void jtf_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_passwordKeyReleased
        
        String pass_char = "";
        boolean keyallow = false;
        int pass_len = 0;
        
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
                    
                }
            } else {
                keyallow = true;
                
            }
            
        }
        
        System.out.println("@@@@ boolean2 " + keyallow);
        if (keyallow) {
            login_pass = new StringBuilder().append(login_pass).append(evt.getKeyChar()).toString(); 
            pass_len = jtf_password.getText().length();
            System.out.println("@@@@ allowed");
            
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
