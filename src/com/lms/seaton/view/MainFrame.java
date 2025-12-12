package com.lms.seaton.view;

import com.lms.seaton.view.panel.LoginPanel;
import com.lms.seaton.view.panel.MainPanel;
import com.lms.seaton.view.panel.SignUpPanel;
import com.lms.seaton.view.panel.StartPanel;
import java.awt.CardLayout;
import java.awt.Container;
import java.util.Stack;


public class MainFrame extends javax.swing.JFrame {
//    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());
    private Stack<String> historyStack;
    
    // 레이아웃
    private CardLayout cardLayout;
    private Container contentPane;
    
    // 패널 목록
    private StartPanel startPanel;
    private SignUpPanel signUpPanel;
    private LoginPanel loginPanel;
    private MainPanel mainPanel;
    
    public MainFrame() {
        initComponents();
        historyStack = new Stack<>();   
                
        setTitle("SeatOn");   // 프레임의 타이틀 세팅
        cardLayout = new CardLayout();  // 레이아웃 관리 클래스
        contentPane = getContentPane(); // 컨테이너
        contentPane.setLayout(cardLayout);  // 컨테이너에 레이아웃 관리 클래스를 등록 -> 이 과정으로 화면 전환이 가능하게 됨.
        // ------- 패널 인스턴스 생성 -------
        startPanel = new StartPanel(this);
        signUpPanel = new SignUpPanel(this);    // 회원 가입 패널을 생성할 때 프레임 정보를 알려줌 
        loginPanel = new LoginPanel(this);      // 로그인 패널을 생성할 때 프레임 정보를 알려줌
        mainPanel = new MainPanel(this);
        
        // ------- 패널 등록 -------
        contentPane.add(startPanel, "START");
        contentPane.add(signUpPanel, "SIGNUP");    // 컨테이너에 생성된 회원 가입 패널 등록
        contentPane.add(loginPanel, "LOGIN");       // 컨테이너에 생성된 로그인 패널 등록
        contentPane.add(mainPanel, "MAIN");

        // ------- 시작 화면 --------
        cardLayout.show(contentPane, "START");      // show 메서드로 보여줄 화면을 지정
        
//        setSize(WIDTH, HEIGHT);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
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
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }
    
    public void showCard(String path) {
        historyStack.push(path);
        cardLayout.show(contentPane, path); // 화면 전환을 다른 패널에서 요청하기 위한 메서드
    }
    // 뒤로 가기
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
