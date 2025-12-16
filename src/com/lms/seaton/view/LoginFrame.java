package com.lms.seaton.view;

import com.lms.seaton.dto.MemberDTO;
import com.lms.seaton.view.panel.LoginPanel;
import com.lms.seaton.view.panel.SignUpPanel;
import com.lms.seaton.view.panel.StartPanel;
import java.awt.CardLayout;
import java.awt.Container;
import java.util.Stack;

public class LoginFrame extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginFrame.class.getName());
    private Stack<String> historyStack;
    
    private CardLayout cardLayout;
    private Container contentPane;
    
    private StartPanel startPanel;
    private SignUpPanel signUpPanel;
    private LoginPanel loginPanel;

    public LoginFrame() {
        initComponents();
        
        historyStack = new Stack<>();   
        contentPane = getContentPane();
        cardLayout = new CardLayout();
        
        setTitle("SeatOn");
        contentPane.setLayout(cardLayout);
        
        startPanel = new StartPanel(this);
        signUpPanel = new SignUpPanel(this);
        loginPanel = new LoginPanel(this);
        
        contentPane.add(startPanel, "START");
        contentPane.add(signUpPanel, "SIGNUP");
        contentPane.add(loginPanel, "LOGIN");

        cardLayout.show(contentPane, "START");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginFrame().setVisible(true));
    }
    
    public void showCard(String path) {
        historyStack.push(path);
        cardLayout.show(contentPane, path); // 화면 전환을 다른 패널에서 요청하기 위한 메서드
    }
    
    public void loginSuccess(MemberDTO member) {
        // 1. MainFrame을 생성하면서 member 정보를 넘겨줌 (생성자 호출)
            new MainFrame(member);
            // 2. 로그인 창은 닫음
            this.dispose();
    }
    
    public void goBack() {
        String previousPanelName = historyStack.pop();

        if (historyStack.isEmpty()) {
            cardLayout.show(contentPane, "START");
            historyStack.push("START");
            return;
        }

        cardLayout.show(contentPane, previousPanelName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
