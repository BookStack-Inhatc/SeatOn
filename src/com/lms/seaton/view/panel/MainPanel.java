package com.lms.seaton.view.panel;

import com.lms.seaton.view.MainFrame;
import com.lms.seaton.dto.MemberDTO;
import com.lms.seaton.view.panel.MainPanel;

public class MainPanel extends javax.swing.JPanel {
    private MainFrame frame;
    private com.lms.seaton.dto.MemberDTO loggedInUser;
    private com.lms.seaton.dao.ReservationDAO reservationDAO = new com.lms.seaton.dao.ReservationDAO();

    public MainPanel(MainFrame aThis) {
        
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        top = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
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
        btnSeat17 = new javax.swing.JButton();
        btnSeat19 = new javax.swing.JButton();
        btnSeat20 = new javax.swing.JButton();
        btnSeat21 = new javax.swing.JButton();
        btnSeat22 = new javax.swing.JButton();
        btnSeat24 = new javax.swing.JButton();
        btnSeat26 = new javax.swing.JButton();
        btnSeat27 = new javax.swing.JButton();
        btnSeat28 = new javax.swing.JButton();
        btnSeat30 = new javax.swing.JButton();
        btnSeat32 = new javax.swing.JButton();
        btnSeat31 = new javax.swing.JButton();
        btnSeat33 = new javax.swing.JButton();
        btnSeat35 = new javax.swing.JButton();
        btnSeat39 = new javax.swing.JButton();
        btnSeat40 = new javax.swing.JButton();
        btnSeat38 = new javax.swing.JButton();
        btnSeat34 = new javax.swing.JButton();
        btnSeat18 = new javax.swing.JButton();
        btnSeat23 = new javax.swing.JButton();
        btnSeat16 = new javax.swing.JButton();
        btnSeat25 = new javax.swing.JButton();
        btnSeat29 = new javax.swing.JButton();
        btnSeat36 = new javax.swing.JButton();
        btnSeat37 = new javax.swing.JButton();
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
        btnLocker20 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 700));

        top.setBackground(new java.awt.Color(255, 204, 51));

        btnLogout.setBackground(new java.awt.Color(255, 204, 0));
        btnLogout.setText("로그아웃");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addContainerGap(421, Short.MAX_VALUE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 0));
        jTabbedPane1.setForeground(new java.awt.Color(0, 51, 102));
        jTabbedPane1.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(500, 700));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        btnSeat1.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat1.setText("S01");
        btnSeat1.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat2.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat2.setText("S02");
        btnSeat2.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat3.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat3.setText("S03");
        btnSeat3.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat4.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat4.setText("S04");
        btnSeat4.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat5.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat5.setText("S05");
        btnSeat5.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat6.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat6.setText("S06");
        btnSeat6.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat7.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat7.setText("S07");
        btnSeat7.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat8.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat8.setText("S08");
        btnSeat8.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat9.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat9.setText("S09");
        btnSeat9.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat10.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat10.setText("S10");
        btnSeat10.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat11.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat11.setText("S11");
        btnSeat11.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat12.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat12.setText("S12");
        btnSeat12.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat13.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat13.setText("S13");
        btnSeat13.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat14.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat14.setText("S14");
        btnSeat14.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat15.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat15.setText("S15");
        btnSeat15.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat17.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat17.setText("S17");
        btnSeat17.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat19.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat19.setText("S19");
        btnSeat19.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat20.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat20.setText("S20");
        btnSeat20.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat21.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat21.setText("S21");
        btnSeat21.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat22.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat22.setText("S22");
        btnSeat22.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat24.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat24.setText("S24");
        btnSeat24.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat26.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat26.setText("S26");
        btnSeat26.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat27.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat27.setText("S27");
        btnSeat27.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat28.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat28.setText("S28");
        btnSeat28.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat30.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat30.setText("S30");
        btnSeat30.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat32.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat32.setText("S32");
        btnSeat32.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat31.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat31.setText("S31");
        btnSeat31.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat33.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat33.setText("S33");
        btnSeat33.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat35.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat35.setText("S35");
        btnSeat35.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat39.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat39.setText("S39");
        btnSeat39.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat40.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat40.setText("S40");
        btnSeat40.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat38.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat38.setText("S38");
        btnSeat38.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat34.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat34.setText("S34");
        btnSeat34.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat18.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat18.setText("S18");
        btnSeat18.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat23.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat23.setText("S23");
        btnSeat23.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat16.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat16.setText("S16");
        btnSeat16.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat25.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat25.setText("S25");
        btnSeat25.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat29.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat29.setText("S29");
        btnSeat29.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat36.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat36.setText("S36");
        btnSeat36.setPreferredSize(new java.awt.Dimension(55, 45));

        btnSeat37.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnSeat37.setText("S37");
        btnSeat37.setPreferredSize(new java.awt.Dimension(55, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSeat9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(btnSeat8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSeat12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeat11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeat13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeat14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeat15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeat17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeat20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSeat19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSeat18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnSeat16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSeat22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeat25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSeat31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat32, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(btnSeat33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeat37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeat31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSeat32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnSeat36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSeat37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSeat40, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSeat21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSeat22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addComponent(btnSeat24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSeat26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSeat16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSeat27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSeat28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addComponent(btnSeat30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSeat23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(396, 396, 396))
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(396, 396, 396)
                            .addComponent(btnSeat18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(106, 106, 106))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSeat11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnSeat12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSeat13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSeat14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSeat15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSeat25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(90, 90, 90)
                            .addComponent(btnSeat17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSeat19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSeat29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addComponent(btnSeat20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("자유석", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        btnStudyRoom1.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnStudyRoom1.setText("R01");

        btnStudyRoom2.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnStudyRoom2.setText("R02");

        btnStudyRoom3.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnStudyRoom3.setText("R03");

        btnStudyRoom4.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnStudyRoom4.setText("R04");

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

        btnLocker1.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker1.setText("L01");
        btnLocker1.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker2.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker2.setText("L02");
        btnLocker2.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker3.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker3.setText("L03");
        btnLocker3.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker4.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker4.setText("L04");
        btnLocker4.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker5.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker5.setText("L05");
        btnLocker5.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker6.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker6.setText("L06");
        btnLocker6.setMaximumSize(new java.awt.Dimension(55, 23));
        btnLocker6.setMinimumSize(new java.awt.Dimension(55, 23));
        btnLocker6.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker7.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker7.setText("L07");
        btnLocker7.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker8.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker8.setText("L08");
        btnLocker8.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker9.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker9.setText("L09");
        btnLocker9.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker10.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker10.setText("L10");
        btnLocker10.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker13.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker13.setText("L13");
        btnLocker13.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker15.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker15.setText("L15");
        btnLocker15.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker14.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker14.setText("L14");
        btnLocker14.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker11.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker11.setText("L11");
        btnLocker11.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker12.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker12.setText("L12");
        btnLocker12.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker18.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker18.setText("L18");
        btnLocker18.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker19.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker19.setText("L19");
        btnLocker19.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker17.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker17.setText("L17");
        btnLocker17.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker16.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker16.setText("L16");
        btnLocker16.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker22.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker22.setText("L22");
        btnLocker22.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker25.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker25.setText("L25");
        btnLocker25.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker21.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker21.setText("L21");
        btnLocker21.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker24.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker24.setText("L24");
        btnLocker24.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker27.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker27.setText("L27");
        btnLocker27.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker30.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker30.setText("L30");
        btnLocker30.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker26.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker26.setText("L26");
        btnLocker26.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker28.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker28.setText("L28");
        btnLocker28.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker29.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker29.setText("L29");
        btnLocker29.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker32.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker32.setText("L32");
        btnLocker32.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker35.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker35.setText("L35");
        btnLocker35.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker31.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker31.setText("L31");
        btnLocker31.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker33.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker33.setText("L33");
        btnLocker33.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker34.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker34.setText("L34");
        btnLocker34.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker37.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker37.setText("L37");
        btnLocker37.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker40.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker40.setText("L40");
        btnLocker40.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker36.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker36.setText("L36");
        btnLocker36.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker38.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker38.setText("L38");
        btnLocker38.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker39.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker39.setText("L39");
        btnLocker39.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker23.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker23.setText("L23");
        btnLocker23.setPreferredSize(new java.awt.Dimension(55, 45));

        btnLocker20.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnLocker20.setText("L19");
        btnLocker20.setPreferredSize(new java.awt.Dimension(55, 45));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLocker25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLocker24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLocker22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLocker21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLocker23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLocker29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnLocker36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLocker1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnLocker2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnLocker3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btnLocker4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btnLocker5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLocker10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLocker6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLocker8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLocker15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLocker19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(145, 145, 145))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLocker15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnLocker10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLocker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLocker4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLocker35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLocker28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocker23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLocker21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnLocker24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocker25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("사물함", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab3");
    }// </editor-fold>                        

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        frame.logout();
    }                                         

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
                btn.setForeground(java.awt.Color.BLUE);
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
                    btn.setForeground(java.awt.Color.BLUE);
                }
            }
        }
    }


    // Variables declaration - do not modify                     
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
    private javax.swing.JButton btnLogout;
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
    // End of variables declaration                   
}
