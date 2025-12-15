package com.lms.seaton.view.panel;

import com.lms.seaton.view.MainFrame;


public class SignUpPanel extends javax.swing.JPanel {
    private MainFrame frame;

    public SignUpPanel() {
        
    }

    public SignUpPanel(MainFrame frame) {
        initComponents();
        this.frame = frame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        btnGoBack = new javax.swing.JButton();
        lblPw = new javax.swing.JLabel();
        tbxName = new javax.swing.JTextField();
        tbxAuth = new javax.swing.JTextField();
        lblSignUp = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPwConfirm = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        tbxNumber = new javax.swing.JTextField();
        btnAuth = new javax.swing.JButton();
        btnSendAuth = new javax.swing.JButton();
        lblAuth = new javax.swing.JLabel();
        tbxPw = new javax.swing.JTextField();
        lblPwCheck = new javax.swing.JLabel();
        tbxPwCheck = new javax.swing.JTextField();
        lblSuccessAuth = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSignUp = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 700));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(null);

        top.setBackground(new java.awt.Color(255, 204, 51));

        btnGoBack.setBackground(new java.awt.Color(255, 204, 0));
        btnGoBack.setText("뒤로가기");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoBack)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(top);
        top.setBounds(0, 0, 500, 40);

        lblPw.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPw.setForeground(new java.awt.Color(255, 204, 0));
        lblPw.setText("비밀번호 입력");
        jPanel1.add(lblPw);
        lblPw.setBounds(30, 540, 100, 17);
        jPanel1.add(tbxName);
        tbxName.setBounds(130, 390, 340, 23);
        jPanel1.add(tbxAuth);
        tbxAuth.setBounds(130, 470, 230, 23);

        lblSignUp.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(255, 204, 0));
        lblSignUp.setText("회원가입");
        jPanel1.add(lblSignUp);
        lblSignUp.setBounds(210, 90, 100, 33);

        lblName.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 204, 0));
        lblName.setText("이름 입력");
        jPanel1.add(lblName);
        lblName.setBounds(30, 390, 100, 20);

        lblPwConfirm.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPwConfirm.setForeground(new java.awt.Color(0, 51, 102));
        lblPwConfirm.setText("!message!");
        jPanel1.add(lblPwConfirm);
        lblPwConfirm.setBounds(130, 610, 210, 20);

        lblNumber.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 204, 0));
        lblNumber.setText("전화번호 입력");
        jPanel1.add(lblNumber);
        lblNumber.setBounds(30, 430, 100, 20);
        jPanel1.add(tbxNumber);
        tbxNumber.setBounds(130, 430, 230, 23);

        btnAuth.setBackground(new java.awt.Color(255, 204, 0));
        btnAuth.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnAuth.setForeground(new java.awt.Color(0, 51, 102));
        btnAuth.setText("인증하기");
        btnAuth.setPreferredSize(new java.awt.Dimension(102, 23));
        jPanel1.add(btnAuth);
        btnAuth.setBounds(350, 470, 120, 23);

        btnSendAuth.setBackground(new java.awt.Color(255, 204, 0));
        btnSendAuth.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSendAuth.setForeground(new java.awt.Color(0, 51, 102));
        btnSendAuth.setText("인증번호발송");
        jPanel1.add(btnSendAuth);
        btnSendAuth.setBounds(350, 430, 120, 23);

        lblAuth.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblAuth.setForeground(new java.awt.Color(255, 204, 0));
        lblAuth.setText("인증번호 입력");
        jPanel1.add(lblAuth);
        lblAuth.setBounds(30, 470, 100, 17);
        jPanel1.add(tbxPw);
        tbxPw.setBounds(130, 540, 340, 23);

        lblPwCheck.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPwCheck.setForeground(new java.awt.Color(255, 204, 0));
        lblPwCheck.setText("비밀번호 확인");
        jPanel1.add(lblPwCheck);
        lblPwCheck.setBounds(30, 580, 100, 17);
        jPanel1.add(tbxPwCheck);
        tbxPwCheck.setBounds(130, 580, 340, 23);

        lblSuccessAuth.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblSuccessAuth.setForeground(new java.awt.Color(0, 51, 102));
        lblSuccessAuth.setText("!message!");
        jPanel1.add(lblSuccessAuth);
        lblSuccessAuth.setBounds(130, 500, 210, 20);

        jSeparator1.setBackground(new java.awt.Color(255, 204, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(170, 140, 170, 10);

        btnSignUp.setBackground(new java.awt.Color(255, 204, 0));
        btnSignUp.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(0, 51, 102));
        btnSignUp.setText("회원가입");
        jPanel1.add(btnSignUp);
        btnSignUp.setBounds(360, 620, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        frame.goBack();
    }//GEN-LAST:event_btnGoBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuth;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnSendAuth;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAuth;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPw;
    private javax.swing.JLabel lblPwCheck;
    private javax.swing.JLabel lblPwConfirm;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblSuccessAuth;
    private javax.swing.JTextField tbxAuth;
    private javax.swing.JTextField tbxName;
    private javax.swing.JTextField tbxNumber;
    private javax.swing.JTextField tbxPw;
    private javax.swing.JTextField tbxPwCheck;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
