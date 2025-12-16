package com.lms.seaton.view.panel;

//import com.lms.seaton.view.MainFrame;
import com.lms.seaton.service.MemberService;
import com.lms.seaton.dto.MemberDTO;
import com.lms.seaton.view.LoginFrame;
import javax.swing.JOptionPane;

public class LoginPanel extends javax.swing.JPanel {
     private LoginFrame frame;
     private MemberService memberService = new MemberService();

     public LoginPanel() {
          initComponents();
    }

    public LoginPanel(LoginFrame frame) {
        initComponents();
        this.frame = frame;
          lblError.setText("");

    }

    // 로그아웃 시 로그인 입력창 초기화용 메서드
    public void clearFields() {
        if (tbxNumber != null) tbxNumber.setText("");
        if (tbxPw != null) tbxPw.setText("");
        if (lblError != null) lblError.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        btnGoBack = new javax.swing.JButton();
        lblPw = new javax.swing.JLabel();
        tbxNumber = new javax.swing.JTextField();
        tbxPw = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

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
        lblPw.setBounds(20, 600, 100, 17);
        jPanel1.add(tbxNumber);
        tbxNumber.setBounds(120, 560, 240, 23);
        jPanel1.add(tbxPw);
        tbxPw.setBounds(120, 600, 240, 23);

        btnLogin.setBackground(new java.awt.Color(255, 204, 0));
        btnLogin.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 51, 102));
        btnLogin.setText("로그인");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(370, 560, 100, 60);

        lblLogin.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 204, 0));
        lblLogin.setText("로그인");
        jPanel1.add(lblLogin);
        lblLogin.setBounds(220, 90, 72, 33);

        lblNumber.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 204, 0));
        lblNumber.setText("전화번호 입력");
        jPanel1.add(lblNumber);
        lblNumber.setBounds(20, 560, 100, 20);

        lblError.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(0, 51, 102));
        lblError.setText("!ERROR!");
        jPanel1.add(lblError);
        lblError.setBounds(120, 630, 200, 20);

        jSeparator1.setBackground(new java.awt.Color(255, 204, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(170, 140, 170, 10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

        jPanel1.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("LOGIN");
    }// </editor-fold>                        

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {                                          
        frame.goBack();
    }                                         

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String phone = tbxNumber.getText().trim(); 
        
        // [수정 4] getPassword() -> getText() 로 변경 (JTextField를 사용중이므로)
        String pw = tbxPw.getText().trim(); 

        if (phone.isEmpty() || pw.isEmpty()) {
            lblError.setForeground(java.awt.Color.RED);
            lblError.setText("전화번호와 비밀번호를 입력해주세요.");
            return;
        }

        // 2. 서비스 호출 (로그인 시도)
        MemberDTO member = memberService.login(phone, pw);
        clearFields();
        // 3. 결과 처리
        if (member != null) {
            JOptionPane.showMessageDialog(this, member.getName() + "님 환영합니다!");

//          frame.showMainPanel(member); 
            if (frame instanceof LoginFrame) {
                ((LoginFrame) frame).loginSuccess(member);
            }
        } else {
            lblError.setForeground(java.awt.Color.RED);
            lblError.setText("전화번호가 없거나 비밀번호가 틀렸습니다.");
        }
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPw;
    private javax.swing.JTextField tbxNumber;
    private javax.swing.JTextField tbxPw;
    private javax.swing.JPanel top;
    // End of variables declaration                   
}
