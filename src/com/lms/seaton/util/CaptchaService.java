package com.lms.seaton.util;

import javax.swing.*;
import java.awt.image.BufferedImage;
import nl.captcha.Captcha;
import nl.captcha.backgrounds.GradiatedBackgroundProducer;
import nl.captcha.gimpy.FishEyeGimpyRenderer;
import nl.captcha.noise.CurvedLineNoiseProducer;

public class CaptchaService {
    private Captcha captcha;
    private JLabel imageLabel;     // 이미지를 보여줄 라벨
    private JTextField inputField; // 입력받을 텍스트 필드 (필요시 초기화용)
    
    public CaptchaService(JLabel imageLabel, JButton refreshButton) {
        this.imageLabel = imageLabel;
        
        generateCaptcha();
        
        refreshButton.addActionListener(e -> generateCaptcha());
    }
    
    private void generateCaptcha() {
        captcha = new Captcha.Builder(200, 50)
                .addText() // 기본값: 5자리 숫자+문자
                .addBackground(new GradiatedBackgroundProducer())
                .addNoise(new CurvedLineNoiseProducer())
                .gimp(new FishEyeGimpyRenderer()) // 왜곡 효과
                .addBorder()
                .build();

        BufferedImage image = captcha.getImage();
        imageLabel.setIcon(new ImageIcon(image));
        imageLabel.repaint(); // 확실하게 다시 그리기
    }
    
    public boolean isCorrect(String answer) {
        return captcha.isCorrect(answer);
    }
}
