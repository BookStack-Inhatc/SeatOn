package com.lms.seaton.view.panel;

import com.lms.seaton.view.MainFrame;
/*
    
*/
public class StartPanel extends javax.swing.JPanel {
    private MainFrame frame;

    public StartPanel() {
    }

    public StartPanel(MainFrame frame) {
        this.frame = frame;
        initComponents();
        System.out.println("START PANEL ACTIVE");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        top2 = new javax.swing.JPanel();
        BtnLogin = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(500, 700));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel3.setLayout(null);

        top2.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout top2Layout = new javax.swing.GroupLayout(top2);
        top2.setLayout(top2Layout);
        top2Layout.setHorizontalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        top2Layout.setVerticalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(top2);
        top2.setBounds(0, 0, 500, 40);

        BtnLogin.setBackground(new java.awt.Color(255, 204, 0));
        BtnLogin.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(0, 51, 102));
        BtnLogin.setText("로그인");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(BtnLogin);
        BtnLogin.setBounds(120, 350, 130, 190);

        lblLogin.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 204, 0));
        lblLogin.setText("환영합니다!");
        jPanel3.add(lblLogin);
        lblLogin.setBounds(190, 90, 130, 33);

        btnSignUp.setBackground(new java.awt.Color(255, 204, 0));
        btnSignUp.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(0, 51, 102));
        btnSignUp.setText("회원가입");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel3.add(btnSignUp);
        btnSignUp.setBounds(270, 350, 130, 190);

        jSeparator1.setBackground(new java.awt.Color(255, 204, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(170, 140, 170, 10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        frame.showCard("SIGNUP");
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        frame.showCard("LOGIN");
    }//GEN-LAST:event_BtnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnGoBack1;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPanel top;
    private javax.swing.JPanel top1;
    private javax.swing.JPanel top2;
    // End of variables declaration//GEN-END:variables

}
