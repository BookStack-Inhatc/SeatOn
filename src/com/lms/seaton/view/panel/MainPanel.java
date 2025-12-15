package com.lms.seaton.view.panel;

import com.lms.seaton.view.MainFrame;
import com.lms.seaton.dto.MemberDTO;
import com.lms.seaton.view.panel.MainPanel;

public class MainPanel extends javax.swing.JPanel {
    private MainFrame frame;
    private com.lms.seaton.dto.MemberDTO loggedInUser;
    private com.lms.seaton.dao.ReservationDAO reservationDAO = new com.lms.seaton.dao.ReservationDAO();

    public MainPanel() {
        
    }

    public MainPanel(MainFrame frame, MemberDTO user) {
         initComponents();
        this.frame = frame;
        this.loggedInUser = user;
        initButtonActions();
        loadReservationStatus();
        // [추가 3] 사용자 이름 환영 메시지 (테스트용)
        System.out.println("현재 로그인 사용자: " + user.getName());

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        btnGoBack = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnSeat1 = new javax.swing.JButton();
        btnSeat2 = new javax.swing.JButton();
        btnSeat3 = new javax.swing.JButton();
        btnSeat4 = new javax.swing.JButton();
        btnSeat5 = new javax.swing.JButton();
        btnSeat6 = new javax.swing.JButton();
        btnSeat7 = new javax.swing.JButton();
        btnSeat8 = new javax.swing.JButton();
        btnSeat9 = new javax.swing.JButton();
        btnSeat10 = new javax.swing.JButton();
        btnSeat11 = new javax.swing.JButton();
        btnSeat12 = new javax.swing.JButton();
        btnSeat13 = new javax.swing.JButton();
        btnSeat14 = new javax.swing.JButton();
        btnSeat15 = new javax.swing.JButton();
        btnSeat16 = new javax.swing.JButton();
        btnSeat17 = new javax.swing.JButton();
        btnSeat18 = new javax.swing.JButton();
        btnSeat19 = new javax.swing.JButton();
        btnSeat20 = new javax.swing.JButton();
        btnSeat21 = new javax.swing.JButton();
        btnSeat22 = new javax.swing.JButton();
        btnSeat23 = new javax.swing.JButton();
        btnSeat24 = new javax.swing.JButton();
        btnSeat25 = new javax.swing.JButton();
        btnSeat26 = new javax.swing.JButton();
        btnSeat27 = new javax.swing.JButton();
        btnSeat28 = new javax.swing.JButton();
        btnSeat29 = new javax.swing.JButton();
        btnSeat30 = new javax.swing.JButton();
        btnSeat31 = new javax.swing.JButton();
        btnSeat32 = new javax.swing.JButton();
        btnSeat33 = new javax.swing.JButton();
        btnSeat34 = new javax.swing.JButton();
        btnSeat35 = new javax.swing.JButton();
        btnSeat36 = new javax.swing.JButton();
        btnSeat37 = new javax.swing.JButton();
        btnSeat38 = new javax.swing.JButton();
        btnSeat39 = new javax.swing.JButton();
        btnSeat40 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnStudyRoom1 = new javax.swing.JButton();
        btnStudyRoom2 = new javax.swing.JButton();
        btnStudyRoom3 = new javax.swing.JButton();
        btnStudyRoom4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnLocker1 = new javax.swing.JButton();
        btnLocker2 = new javax.swing.JButton();
        btnLocker3 = new javax.swing.JButton();
        btnLocker4 = new javax.swing.JButton();
        btnLocker5 = new javax.swing.JButton();
        btnLocker6 = new javax.swing.JButton();
        btnLocker7 = new javax.swing.JButton();
        btnLocker8 = new javax.swing.JButton();
        btnLocker9 = new javax.swing.JButton();
        btnLocker10 = new javax.swing.JButton();
        btnLocker13 = new javax.swing.JButton();
        btnLocker15 = new javax.swing.JButton();
        btnLocker14 = new javax.swing.JButton();
        btnLocker11 = new javax.swing.JButton();
        btnLocker12 = new javax.swing.JButton();
        btnLocker18 = new javax.swing.JButton();
        btnLocker19 = new javax.swing.JButton();
        btnLocker17 = new javax.swing.JButton();
        btnLocker16 = new javax.swing.JButton();
        btnLocker20 = new javax.swing.JButton();
        btnLocker22 = new javax.swing.JButton();
        btnLocker25 = new javax.swing.JButton();
        btnLocker21 = new javax.swing.JButton();
        btnLocker24 = new javax.swing.JButton();
        btnLocker27 = new javax.swing.JButton();
        btnLocker30 = new javax.swing.JButton();
        btnLocker26 = new javax.swing.JButton();
        btnLocker28 = new javax.swing.JButton();
        btnLocker29 = new javax.swing.JButton();
        btnLocker32 = new javax.swing.JButton();
        btnLocker35 = new javax.swing.JButton();
        btnLocker31 = new javax.swing.JButton();
        btnLocker33 = new javax.swing.JButton();
        btnLocker34 = new javax.swing.JButton();
        btnLocker37 = new javax.swing.JButton();
        btnLocker40 = new javax.swing.JButton();
        btnLocker36 = new javax.swing.JButton();
        btnLocker38 = new javax.swing.JButton();
        btnLocker39 = new javax.swing.JButton();
        btnLocker23 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 700));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoBack)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 0));
        jTabbedPane1.setForeground(new java.awt.Color(0, 51, 102));
        jTabbedPane1.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(500, 700));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        btnSeat1.setText("1");
        btnSeat1.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat2.setText("2");
        btnSeat2.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat3.setText("3");
        btnSeat3.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat4.setText("4");
        btnSeat4.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat5.setText("5");
        btnSeat5.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat6.setText("6");
        btnSeat6.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat7.setText("7");
        btnSeat7.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat8.setText("8");
        btnSeat8.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat9.setText("9");
        btnSeat9.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat10.setText("10");
        btnSeat10.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat11.setText("11");
        btnSeat11.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat12.setText("12");
        btnSeat12.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat13.setText("13");
        btnSeat13.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat14.setText("14");
        btnSeat14.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat15.setText("15");
        btnSeat15.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat16.setText("16");
        btnSeat16.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat17.setText("17");
        btnSeat17.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat18.setText("18");
        btnSeat18.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat19.setText("19");
        btnSeat19.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat20.setText("20");
        btnSeat20.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat21.setText("21");
        btnSeat21.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat22.setText("22");
        btnSeat22.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat23.setText("23");
        btnSeat23.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat24.setText("24");
        btnSeat24.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat25.setText("25");
        btnSeat25.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat26.setText("26");
        btnSeat26.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat27.setText("27");
        btnSeat27.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat28.setText("28");
        btnSeat28.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat29.setText("29");
        btnSeat29.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat30.setText("30");
        btnSeat30.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat31.setText("32");
        btnSeat31.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat32.setText("31");
        btnSeat32.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat33.setText("37");
        btnSeat33.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat34.setText("33");
        btnSeat34.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat35.setText("35");
        btnSeat35.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat36.setText("39");
        btnSeat36.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat37.setText("40");
        btnSeat37.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat38.setText("38");
        btnSeat38.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat39.setText("36");
        btnSeat39.setPreferredSize(new java.awt.Dimension(45, 45));

        btnSeat40.setText("34");
        btnSeat40.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeat7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeat17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeat27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeat33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeat32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat40, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnSeat39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSeat37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeat21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnSeat26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSeat30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeat11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSeat12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnSeat16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSeat20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeat1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnSeat6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSeat10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("자유석", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        btnStudyRoom1.setText("스터디룸 1");

        btnStudyRoom2.setText("스터디룸 2");

        btnStudyRoom3.setText("스터디룸 3");

        btnStudyRoom4.setText("스터디룸 4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStudyRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudyRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStudyRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudyRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudyRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudyRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudyRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudyRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
        );

        jTabbedPane1.addTab("스터디룸", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        btnLocker1.setText("1");
        btnLocker1.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker2.setText("2");
        btnLocker2.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker3.setText("3");
        btnLocker3.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker4.setText("4");
        btnLocker4.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker5.setText("5");
        btnLocker5.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker6.setText("6");
        btnLocker6.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker7.setText("7");
        btnLocker7.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker8.setText("8");
        btnLocker8.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker9.setText("9");
        btnLocker9.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker10.setText("10");
        btnLocker10.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker13.setText("13");
        btnLocker13.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker15.setText("15");
        btnLocker15.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker14.setText("14");
        btnLocker14.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker11.setText("11");
        btnLocker11.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker12.setText("12");
        btnLocker12.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker18.setText("18");
        btnLocker18.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker19.setText("19");
        btnLocker19.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker17.setText("17");
        btnLocker17.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker16.setText("16");
        btnLocker16.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker20.setText("20");
        btnLocker20.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker22.setText("22");
        btnLocker22.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker25.setText("25");
        btnLocker25.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker21.setText("21");
        btnLocker21.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker24.setText("24");
        btnLocker24.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker27.setText("27");
        btnLocker27.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker30.setText("30");
        btnLocker30.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker26.setText("26");
        btnLocker26.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker28.setText("28");
        btnLocker28.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker29.setText("29");
        btnLocker29.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker32.setText("32");
        btnLocker32.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker35.setText("35");
        btnLocker35.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker31.setText("31");
        btnLocker31.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker33.setText("33");
        btnLocker33.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker34.setText("34");
        btnLocker34.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker37.setText("37");
        btnLocker37.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker40.setText("40");
        btnLocker40.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker36.setText("36");
        btnLocker36.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker38.setText("38");
        btnLocker38.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker39.setText("39");
        btnLocker39.setPreferredSize(new java.awt.Dimension(45, 45));

        btnLocker23.setText("23");
        btnLocker23.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLocker5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLocker10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLocker15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLocker20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLocker25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLocker24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLocker22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLocker21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLocker23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLocker30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLocker35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLocker40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocker36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLocker28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnLocker24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("사물함", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab3");
    }// </editor-fold>//GEN-END:initComponents

     private void initButtonActions() {
        // 1. 자유석 탭 (jPanel1)의 모든 버튼 설정
        for (java.awt.Component comp : jPanel1.getComponents()) {
            if (comp instanceof javax.swing.JButton) {
                javax.swing.JButton btn = (javax.swing.JButton) comp;
                btn.addActionListener(e -> processReservation(btn, "좌석"));
            }
        }

        // 2. 스터디룸 탭 (jPanel2)의 모든 버튼 설정
        for (java.awt.Component comp : jPanel2.getComponents()) {
            if (comp instanceof javax.swing.JButton) {
                javax.swing.JButton btn = (javax.swing.JButton) comp;
                btn.addActionListener(e -> processReservation(btn, "스터디룸"));
            }
        }

        // 3. 사물함 탭 (jPanel3)의 모든 버튼 설정
        for (java.awt.Component comp : jPanel3.getComponents()) {
            if (comp instanceof javax.swing.JButton) {
                javax.swing.JButton btn = (javax.swing.JButton) comp;
                btn.addActionListener(e -> processReservation(btn, "사물함"));
            }
        }
    }

     private void processReservation(javax.swing.JButton btn, String type) {
        String seatName = btn.getText(); // "1", "스터디룸1" 등

        // ---------------------------------------------------------
        // Case 1: 이미 예약된 자리(빨간색)를 클릭 -> [반납 시도]
        // ---------------------------------------------------------
        if (btn.getBackground() == java.awt.Color.RED) {
            int choice = javax.swing.JOptionPane.showConfirmDialog(this, 
                    seatName + "번 " + type + "을(를) 반납(퇴실)하시겠습니까?",
                    "반납 확인",
                    javax.swing.JOptionPane.YES_NO_OPTION);

            if (choice == javax.swing.JOptionPane.YES_OPTION) {
                // DAO에게 반납 요청 (내 아이디로 예약된 건지 확인 포함)
                boolean success = reservationDAO.returnItem(type, seatName, loggedInUser.getMemberId());

                if (success) {
                    // 성공 시 색상 초기화 (기본값으로 복구)
                    btn.setBackground(null); 
                    btn.setForeground(java.awt.Color.BLACK); // 글자색 검정
                    javax.swing.JOptionPane.showMessageDialog(this, "반납이 완료되었습니다.");
                } else {
                    // 실패 시 (보통 남의 자리를 눌렀을 때)
                    javax.swing.JOptionPane.showMessageDialog(this, "본인이 예약한 자리만 반납할 수 있습니다.");
                }
            }
            return; // 반납 로직 끝
        }

        // ---------------------------------------------------------
        // Case 2: 빈 자리(기본색)를 클릭 -> [예약 시도]
        // ---------------------------------------------------------
        int choice = javax.swing.JOptionPane.showConfirmDialog(this, 
                seatName + "번 " + type + "을(를) 예약하시겠습니까?",
                "예약 확인",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            boolean success = reservationDAO.insertReservation(type, seatName, loggedInUser.getMemberId());
            
            if (success) {
                // 성공 시 빨간색으로 변경
                btn.setBackground(java.awt.Color.RED);
                btn.setForeground(java.awt.Color.WHITE);
                javax.swing.JOptionPane.showMessageDialog(this, "예약이 완료되었습니다!");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "예약 실패! (이미 예약되었거나 DB 오류)");
            }
        }
    }

     public void loadReservationStatus() {
        // 1. DB에서 현재 사용 중인 좌석/스터디룸/사물함 번호 명단 가져오기
        java.util.Set<String> occupiedSeats = reservationDAO.getOccupiedIds("좌석");
        java.util.Set<String> occupiedLockers = reservationDAO.getOccupiedIds("사물함");
        
        // 2. 좌석 & 스터디룸 버튼들 검사 (jPanel1, jPanel2)
        // (참고: 스터디룸도 SEAT_RESERVATIONS 테이블을 쓴다고 가정)
        checkAndColorButtons(jPanel1, occupiedSeats);
        checkAndColorButtons(jPanel2, occupiedSeats);

        // 3. 사물함 버튼들 검사 (jPanel3)
        checkAndColorButtons(jPanel3, occupiedLockers);
    }

     private void checkAndColorButtons(javax.swing.JPanel panel, java.util.Set<String> occupiedIds) {
        for (java.awt.Component comp : panel.getComponents()) {
            if (comp instanceof javax.swing.JButton) {
                javax.swing.JButton btn = (javax.swing.JButton) comp;
                // 만약 버튼 이름(예: "1")이 명단에 있다면 빨간색으로!
                if (occupiedIds.contains(btn.getText())) {
                    btn.setBackground(java.awt.Color.RED);
                    btn.setForeground(java.awt.Color.WHITE);
                }
            }
        }
    }

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        frame.goBack();
    }//GEN-LAST:event_btnGoBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnLocker1;
    private javax.swing.JButton btnLocker10;
    private javax.swing.JButton btnLocker11;
    private javax.swing.JButton btnLocker12;
    private javax.swing.JButton btnLocker13;
    private javax.swing.JButton btnLocker14;
    private javax.swing.JButton btnLocker15;
    private javax.swing.JButton btnLocker16;
    private javax.swing.JButton btnLocker17;
    private javax.swing.JButton btnLocker18;
    private javax.swing.JButton btnLocker19;
    private javax.swing.JButton btnLocker2;
    private javax.swing.JButton btnLocker20;
    private javax.swing.JButton btnLocker21;
    private javax.swing.JButton btnLocker22;
    private javax.swing.JButton btnLocker23;
    private javax.swing.JButton btnLocker24;
    private javax.swing.JButton btnLocker25;
    private javax.swing.JButton btnLocker26;
    private javax.swing.JButton btnLocker27;
    private javax.swing.JButton btnLocker28;
    private javax.swing.JButton btnLocker29;
    private javax.swing.JButton btnLocker3;
    private javax.swing.JButton btnLocker30;
    private javax.swing.JButton btnLocker31;
    private javax.swing.JButton btnLocker32;
    private javax.swing.JButton btnLocker33;
    private javax.swing.JButton btnLocker34;
    private javax.swing.JButton btnLocker35;
    private javax.swing.JButton btnLocker36;
    private javax.swing.JButton btnLocker37;
    private javax.swing.JButton btnLocker38;
    private javax.swing.JButton btnLocker39;
    private javax.swing.JButton btnLocker4;
    private javax.swing.JButton btnLocker40;
    private javax.swing.JButton btnLocker5;
    private javax.swing.JButton btnLocker6;
    private javax.swing.JButton btnLocker7;
    private javax.swing.JButton btnLocker8;
    private javax.swing.JButton btnLocker9;
    private javax.swing.JButton btnSeat1;
    private javax.swing.JButton btnSeat10;
    private javax.swing.JButton btnSeat11;
    private javax.swing.JButton btnSeat12;
    private javax.swing.JButton btnSeat13;
    private javax.swing.JButton btnSeat14;
    private javax.swing.JButton btnSeat15;
    private javax.swing.JButton btnSeat16;
    private javax.swing.JButton btnSeat17;
    private javax.swing.JButton btnSeat18;
    private javax.swing.JButton btnSeat19;
    private javax.swing.JButton btnSeat2;
    private javax.swing.JButton btnSeat20;
    private javax.swing.JButton btnSeat21;
    private javax.swing.JButton btnSeat22;
    private javax.swing.JButton btnSeat23;
    private javax.swing.JButton btnSeat24;
    private javax.swing.JButton btnSeat25;
    private javax.swing.JButton btnSeat26;
    private javax.swing.JButton btnSeat27;
    private javax.swing.JButton btnSeat28;
    private javax.swing.JButton btnSeat29;
    private javax.swing.JButton btnSeat3;
    private javax.swing.JButton btnSeat30;
    private javax.swing.JButton btnSeat31;
    private javax.swing.JButton btnSeat32;
    private javax.swing.JButton btnSeat33;
    private javax.swing.JButton btnSeat34;
    private javax.swing.JButton btnSeat35;
    private javax.swing.JButton btnSeat36;
    private javax.swing.JButton btnSeat37;
    private javax.swing.JButton btnSeat38;
    private javax.swing.JButton btnSeat39;
    private javax.swing.JButton btnSeat4;
    private javax.swing.JButton btnSeat40;
    private javax.swing.JButton btnSeat5;
    private javax.swing.JButton btnSeat6;
    private javax.swing.JButton btnSeat7;
    private javax.swing.JButton btnSeat8;
    private javax.swing.JButton btnSeat9;
    private javax.swing.JButton btnStudyRoom1;
    private javax.swing.JButton btnStudyRoom2;
    private javax.swing.JButton btnStudyRoom3;
    private javax.swing.JButton btnStudyRoom4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
