package com.lms.seaton.view.panel;

import com.lms.seaton.util.CaptchaService;
import com.lms.seaton.view.MainFrame;


public class SignUpPanel extends javax.swing.JPanel {
    private MainFrame frame;
    private CaptchaService captchaService;


    public SignUpPanel() {
        
    }

    public SignUpPanel(MainFrame frame) {
        initComponents();
        
        captchaService = new CaptchaService(
        lblCaptchaImage,
        tbxCaptcha,
        btnCaptchaRefresh,
        lblCaptchaMsg
        );

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
        lblSignUp = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPwConfirm = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        tbxNumber = new javax.swing.JTextField();
        tbxPw = new javax.swing.JTextField();
        lblPwCheck = new javax.swing.JLabel();
        tbxPwCheck = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSubmit = new javax.swing.JButton();
        lblCaptchaImage = new javax.swing.JLabel();
        tbxCaptcha = new javax.swing.JTextField();
        lblInputCaptcha = new javax.swing.JLabel();
        btnCaptchaRefresh = new javax.swing.JButton();
        lblCaptchaMsg = new javax.swing.JLabel();

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
        lblPw.setBounds(30, 370, 100, 17);
        jPanel1.add(tbxName);
        tbxName.setBounds(130, 290, 340, 23);

        lblSignUp.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(255, 204, 0));
        lblSignUp.setText("회원가입");
        jPanel1.add(lblSignUp);
        lblSignUp.setBounds(210, 90, 100, 33);

        lblName.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 204, 0));
        lblName.setText("이름 입력");
        jPanel1.add(lblName);
        lblName.setBounds(30, 290, 100, 20);

        lblPwConfirm.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPwConfirm.setForeground(new java.awt.Color(0, 51, 102));
        lblPwConfirm.setText("!message!");
        jPanel1.add(lblPwConfirm);
        lblPwConfirm.setBounds(130, 440, 210, 20);

        lblNumber.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 204, 0));
        lblNumber.setText("전화번호 입력");
        jPanel1.add(lblNumber);
        lblNumber.setBounds(30, 330, 100, 20);
        jPanel1.add(tbxNumber);
        tbxNumber.setBounds(130, 330, 340, 23);
        jPanel1.add(tbxPw);
        tbxPw.setBounds(130, 370, 340, 23);

        lblPwCheck.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPwCheck.setForeground(new java.awt.Color(255, 204, 0));
        lblPwCheck.setText("비밀번호 확인");
        jPanel1.add(lblPwCheck);
        lblPwCheck.setBounds(30, 410, 100, 17);
        jPanel1.add(tbxPwCheck);
        tbxPwCheck.setBounds(130, 410, 340, 23);

        jSeparator1.setBackground(new java.awt.Color(255, 204, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(170, 140, 170, 10);

        btnSubmit.setBackground(new java.awt.Color(255, 204, 0));
        btnSubmit.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 51, 102));
        btnSubmit.setText("회원가입");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(360, 620, 110, 40);
        jPanel1.add(lblCaptchaImage);
        lblCaptchaImage.setBounds(130, 480, 230, 60);
        jPanel1.add(tbxCaptcha);
        tbxCaptcha.setBounds(130, 560, 340, 23);

        lblInputCaptcha.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblInputCaptcha.setForeground(new java.awt.Color(255, 204, 0));
        lblInputCaptcha.setText("캡챠 입력");
        jPanel1.add(lblInputCaptcha);
        lblInputCaptcha.setBounds(30, 560, 100, 17);

        btnCaptchaRefresh.setBackground(new java.awt.Color(255, 204, 0));
        btnCaptchaRefresh.setText("새로고침");
        jPanel1.add(btnCaptchaRefresh);
        btnCaptchaRefresh.setBounds(360, 520, 110, 23);

        lblCaptchaMsg.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblCaptchaMsg.setForeground(new java.awt.Color(0, 51, 102));
        lblCaptchaMsg.setText("!message!");
        jPanel1.add(lblCaptchaMsg);
        lblCaptchaMsg.setBounds(130, 590, 210, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        frame.goBack();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String answer = tbxCaptcha.getText().trim();

        if (!captchaService.isCorrect(answer)) {
            lblCaptchaMsg.setText("캡차가 틀렸습니다.");
            tbxCaptcha.setText("");
            captchaService.refresh();
            return;
        }

        lblCaptchaMsg.setText("통과!");
        // 여기부터 기존 로그인/회원가입 로직 실행
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaptchaRefresh;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCaptchaImage;
    private javax.swing.JLabel lblCaptchaMsg;
    private javax.swing.JLabel lblInputCaptcha;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPw;
    private javax.swing.JLabel lblPwCheck;
    private javax.swing.JLabel lblPwConfirm;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JTextField tbxCaptcha;
    private javax.swing.JTextField tbxName;
    private javax.swing.JTextField tbxNumber;
    private javax.swing.JTextField tbxPw;
    private javax.swing.JTextField tbxPwCheck;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
