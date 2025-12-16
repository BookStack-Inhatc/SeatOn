package com.lms.seaton;
/*
    실제 윈도우 앱 구동점
    로그인 프레임을 시작 화면으로 설정함
*/
import com.lms.seaton.view.LoginFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class App {
    public static void main(String[] args) {
        
        // --------------------- 디자인 스타일 변경 >> 윈도우 ----------------------
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // ----------------------------- EDT -----------------------------------
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
