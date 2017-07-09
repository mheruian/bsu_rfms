package com.mycompany.bsu_rfms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class rf_login extends javax.swing.JPanel {

    private String login_pass = "";
    private rf_login rfl;
    
    public rf_login(int w , int h) {
        setSize(w, h);
        initComponents();
        jb_login.requestFocus();
    }
    
    public rf_login(int[] size) {
        setSize(size[0], size[1]);
        initComponents();
        jb_login.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_header1 = new javax.swing.JLabel();
        jlbl_header2 = new javax.swing.JLabel();
        jtf_username = new javax.swing.JTextField();
        jb_login = new javax.swing.JButton();
        jb_register = new javax.swing.JButton();
        jtf_password = new javax.swing.JPasswordField();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 260));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jlbl_header1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jlbl_header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_header1.setText("RF Monitoring");
        jlbl_header1.setPreferredSize(new java.awt.Dimension(222, 58));

        jlbl_header2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jlbl_header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_header2.setText("System for Radio Stations");
        jlbl_header2.setMinimumSize(new java.awt.Dimension(222, 29));

        jtf_username.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jtf_username.setForeground(new java.awt.Color(153, 153, 153));
        jtf_username.setText("Enter your username here");
        jtf_username.setPreferredSize(new java.awt.Dimension(222, 28));
        jtf_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_usernameFocusLost(evt);
            }
        });

        jb_login.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jb_login.setText("Login");
        jb_login.setMinimumSize(new java.awt.Dimension(102, 31));
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });

        jb_register.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jb_register.setText("Register");
        jb_register.setMinimumSize(new java.awt.Dimension(102, 31));
        jb_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registerActionPerformed(evt);
            }
        });

        jtf_password.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jtf_password.setForeground(new java.awt.Color(153, 153, 153));
        jtf_password.setText("Enter your password here");
        jtf_password.setToolTipText("");
        jtf_password.setEchoChar((char)0);
        jtf_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_passwordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtf_password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbl_header1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl_header2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbl_header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_header2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
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

    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked

        login_pass = jtf_password.getText();
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

        System.out.println(login_pass);

    }//GEN-LAST:event_jb_loginMouseClicked

    private void jtf_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_passwordFocusGained
        if (jtf_password.getText().equals("Enter your password here")) {
            jtf_password.setText("");
            jtf_password.setForeground(Color.black);
            jtf_password.setEchoChar('*');
        }
    }//GEN-LAST:event_jtf_passwordFocusGained

    private void jtf_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_passwordFocusLost
        if (jtf_password.getText().equals("")) {
            jtf_password.setEchoChar((char)0);
            jtf_password.setText("Enter your password here");
            jtf_password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtf_passwordFocusLost

    private void jb_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_registerActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_register;
    private javax.swing.JLabel jlbl_header1;
    private javax.swing.JLabel jlbl_header2;
    private javax.swing.JPasswordField jtf_password;
    private javax.swing.JTextField jtf_username;
    // End of variables declaration//GEN-END:variables
}
