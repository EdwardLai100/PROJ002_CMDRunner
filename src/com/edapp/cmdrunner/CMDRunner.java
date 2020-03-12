/*#############################################
# Copyright (c) Edwards Software Technology (003041746-W)
# 
# Project : CMDRunner
# File: com.edapp.cmdrunner.CMDRunner.java
#
# Change History ------------
# 1) V1.0-110319 | Edward | First release
# 2) V1.1-020719 | Edward | UI update, Page Credits added, Change from Runtime to ProcessBuilder, Change config location from static to dynamic.
# 3) V1.2-040719 | Edward | UI update, enabling Jframe dynamic mo# 1) Vement. Page Changes added.
# 4) V1.3-200120 | Edward | UI update, allow "Sent" button straight sa# 1) Ve after triggered. Increase input from 8 to 10.
# 5) V1.4-060220 | Edward | UI update, added Sa# 1) Ve-all button. Added tab to increase input from 10 to 20.
# 6) V2.0-120220 | Edward | UI update, enhance performance and efficiency. 
# 7) V2.1-140220 | Edward | Package update, enhance performance and efficiency. 
# 8) V2.2-010320 | Edward | Implement cross platform feature between Windows and Linux.
##############################################*/

package com.edapp.cmdrunner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CMDRunner extends javax.swing.JFrame {

    int xx;
    int yy;
    public int open = 0;
    Engine engine = new Engine();
    Changes versioning = new Changes();
    Credits credits = new Credits();
    
    
    
    public CMDRunner() {
        this.xx = 0;
        this.yy = 0;
        engine.Checksum();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        CMDRunner = new javax.swing.JLabel();
        TabbedPane = new javax.swing.JTabbedPane();
        A = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        B = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jTextField19 = new javax.swing.JTextField();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jTextField20 = new javax.swing.JTextField();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        LaunchPS = new javax.swing.JButton();
        Credits = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        LaunchCMD = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Versioning = new javax.swing.JLabel();
        SaveAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Main.setBackground(new java.awt.Color(51, 51, 51));
        Main.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainMouseDragged(evt);
            }
        });
        Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainMousePressed(evt);
            }
        });

        CMDRunner.setBackground(new java.awt.Color(255, 255, 255));
        CMDRunner.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        CMDRunner.setForeground(new java.awt.Color(255, 255, 255));
        CMDRunner.setText("CMD RUNNER");

        A.setBackground(new java.awt.Color(51, 51, 51));

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF1.RUNNER")));
            String data = br.readLine();
            jTextField1.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField1.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF2.RUNNER")));
            String data = br.readLine();
            jTextField2.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField2.setToolTipText("");

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF3.RUNNER")));
            String data = br.readLine();
            jTextField3.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField3.setToolTipText("");

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setText("Send");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF4.RUNNER")));
            String data = br.readLine();
            jTextField4.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField4.setToolTipText("");

        jButton7.setBackground(new java.awt.Color(51, 204, 255));
        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 204));
        jButton8.setText("Send");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF5.RUNNER")));
            String data = br.readLine();
            jTextField5.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField5.setToolTipText("");

        jButton9.setBackground(new java.awt.Color(51, 204, 255));
        jButton9.setText("Save");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 204, 204));
        jButton10.setText("Send");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF6.RUNNER")));
            String data = br.readLine();
            jTextField6.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField6.setToolTipText("");

        jButton11.setBackground(new java.awt.Color(51, 204, 255));
        jButton11.setText("Save");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 204, 204));
        jButton12.setText("Send");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF7.RUNNER")));
            String data = br.readLine();
            jTextField7.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField7.setToolTipText("");

        jButton13.setBackground(new java.awt.Color(51, 204, 255));
        jButton13.setText("Save");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 204, 204));
        jButton14.setText("Send");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF8.RUNNER")));
            String data = br.readLine();
            jTextField8.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField8.setToolTipText("");

        jButton15.setBackground(new java.awt.Color(51, 204, 255));
        jButton15.setText("Save");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 204, 204));
        jButton16.setText("Send");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF9.RUNNER")));
            String data = br.readLine();
            jTextField9.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField9.setToolTipText("");

        jButton17.setBackground(new java.awt.Color(51, 204, 255));
        jButton17.setText("Save");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 204, 204));
        jButton18.setText("Send");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF10.RUNNER")));
            String data = br.readLine();
            jTextField10.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField10.setToolTipText("");

        jButton19.setBackground(new java.awt.Color(51, 204, 255));
        jButton19.setText("Save");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(0, 204, 204));
        jButton20.setText("Send");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ALayout = new javax.swing.GroupLayout(A);
        A.setLayout(ALayout);
        ALayout.setHorizontalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6))
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8))
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10))
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12))
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14))
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton16))
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18))
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ALayout.setVerticalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17)
                    .addComponent(jButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.getAccessibleContext().setAccessibleName("");

        TabbedPane.addTab("          A          ", A);

        B.setBackground(new java.awt.Color(51, 51, 51));

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF11.RUNNER")));
            String data = br.readLine();
            jTextField11.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField11.setToolTipText("");

        jButton21.setBackground(new java.awt.Color(51, 204, 255));
        jButton21.setText("Save");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(0, 204, 204));
        jButton22.setText("Send");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF12.RUNNER")));
            String data = br.readLine();
            jTextField12.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField12.setToolTipText("");

        jButton23.setBackground(new java.awt.Color(51, 204, 255));
        jButton23.setText("Save");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(0, 204, 204));
        jButton24.setText("Send");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF13.RUNNER")));
            String data = br.readLine();
            jTextField13.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField13.setToolTipText("");

        jButton25.setBackground(new java.awt.Color(51, 204, 255));
        jButton25.setText("Save");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(0, 204, 204));
        jButton26.setText("Send");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF14.RUNNER")));
            String data = br.readLine();
            jTextField14.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField14.setToolTipText("");

        jButton27.setBackground(new java.awt.Color(51, 204, 255));
        jButton27.setText("Save");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(0, 204, 204));
        jButton28.setText("Send");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF15.RUNNER")));
            String data = br.readLine();
            jTextField15.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField15.setToolTipText("");

        jButton29.setBackground(new java.awt.Color(51, 204, 255));
        jButton29.setText("Save");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(0, 204, 204));
        jButton30.setText("Send");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF16.RUNNER")));
            String data = br.readLine();
            jTextField16.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField16.setToolTipText("");

        jButton31.setBackground(new java.awt.Color(51, 204, 255));
        jButton31.setText("Save");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(0, 204, 204));
        jButton32.setText("Send");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF17.RUNNER")));
            String data = br.readLine();
            jTextField17.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField17.setToolTipText("");

        jButton33.setBackground(new java.awt.Color(51, 204, 255));
        jButton33.setText("Save");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(0, 204, 204));
        jButton34.setText("Send");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF18.RUNNER")));
            String data = br.readLine();
            jTextField18.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField18.setToolTipText("");

        jButton35.setBackground(new java.awt.Color(51, 204, 255));
        jButton35.setText("Save");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(0, 204, 204));
        jButton36.setText("Send");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF19.RUNNER")));
            String data = br.readLine();
            jTextField19.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField19.setToolTipText("");

        jButton37.setBackground(new java.awt.Color(51, 204, 255));
        jButton37.setText("Save");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(0, 204, 204));
        jButton38.setText("Send");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CONF20.RUNNER")));
            String data = br.readLine();
            jTextField20.setText(data);}
        catch (Throwable t) { t.printStackTrace(); }
        jTextField20.setToolTipText("");

        jButton39.setBackground(new java.awt.Color(51, 204, 255));
        jButton39.setText("Save");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(0, 204, 204));
        jButton40.setText("Send");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BLayout = new javax.swing.GroupLayout(B);
        B.setLayout(BLayout);
        BLayout.setHorizontalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton22))
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton24))
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton26))
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton28))
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton30))
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton32))
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton34))
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton36))
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton38))
                    .addGroup(BLayout.createSequentialGroup()
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton40)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BLayout.setVerticalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21)
                    .addComponent(jButton22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23)
                    .addComponent(jButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25)
                    .addComponent(jButton26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29)
                    .addComponent(jButton30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31)
                    .addComponent(jButton32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33)
                    .addComponent(jButton34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35)
                    .addComponent(jButton36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37)
                    .addComponent(jButton38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39)
                    .addComponent(jButton40))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPane.addTab("          B          ", B);

        LaunchPS.setBackground(new java.awt.Color(0, 0, 0));
        LaunchPS.setForeground(new java.awt.Color(255, 255, 255));
        LaunchPS.setText("Launch PowerShell");
        LaunchPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaunchPSActionPerformed(evt);
            }
        });

        Credits.setBackground(new java.awt.Color(0, 0, 0));
        Credits.setForeground(new java.awt.Color(0, 204, 204));
        Credits.setText("Credits");
        Credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditsActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(0, 0, 0));
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        LaunchCMD.setBackground(new java.awt.Color(0, 0, 0));
        LaunchCMD.setForeground(new java.awt.Color(255, 255, 255));
        LaunchCMD.setText("Launch CMD");
        LaunchCMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaunchCMDActionPerformed(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(0, 0, 0));
        Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Versioning.setForeground(new java.awt.Color(255, 255, 255));
        Versioning.setText("V2.1-140220");
        Versioning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VersioningMouseClicked(evt);
            }
        });

        SaveAll.setBackground(new java.awt.Color(51, 204, 255));
        SaveAll.setText("Save All");
        SaveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CMDRunner)
                .addGap(227, 227, 227)
                .addComponent(Versioning)
                .addGap(33, 33, 33))
            .addGroup(MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addComponent(Refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LaunchCMD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LaunchPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Credits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMDRunner)
                    .addComponent(Versioning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh)
                    .addComponent(LaunchCMD)
                    .addComponent(LaunchPS)
                    .addComponent(Credits)
                    .addComponent(Exit)
                    .addComponent(SaveAll))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.engine.save(this.jTextField1.getText(), "CONF1");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            this.engine.run(this.jTextField1.getText(), "CONF1");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            this.engine.save(this.jTextField2.getText(), "CONF2");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            this.engine.run(this.jTextField2.getText(), "CONF2");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            this.engine.save(this.jTextField3.getText(), "CONF3");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            this.engine.run(this.jTextField3.getText(), "CONF3");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            this.engine.save(this.jTextField4.getText(), "CONF4");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            this.engine.run(this.jTextField4.getText(), "CONF4");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            this.engine.save(this.jTextField5.getText(), "CONF5");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            this.engine.run(this.jTextField5.getText(), "CONF5");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            this.engine.save(this.jTextField6.getText(), "CONF6");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            this.engine.run(this.jTextField6.getText(), "CONF6");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            this.engine.save(this.jTextField7.getText(), "CONF7");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            this.engine.run(this.jTextField7.getText(), "CONF7");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            this.engine.save(this.jTextField8.getText(), "CONF8");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
            this.engine.run(this.jTextField8.getText(), "CONF8");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            this.engine.save(this.jTextField9.getText(), "CONF9");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {
            this.engine.run(this.jTextField9.getText(), "CONF9");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        try {
            this.engine.save(this.jTextField10.getText(), "CONF10");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        try {
            this.engine.run(this.jTextField10.getText(), "CONF10");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        try {
            this.engine.save(this.jTextField11.getText(), "CONF11");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        try {
            this.engine.run(this.jTextField11.getText(), "CONF11");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        try {
            this.engine.save(this.jTextField12.getText(), "CONF12");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        try {
            this.engine.run(this.jTextField12.getText(), "CONF12");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        try {
            this.engine.save(this.jTextField13.getText(), "CONF13");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        try {
            this.engine.run(this.jTextField13.getText(), "CONF13");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        try {
            this.engine.save(this.jTextField14.getText(), "CONF14");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        try {
            this.engine.run(this.jTextField14.getText(), "CONF14");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        try {
            this.engine.save(this.jTextField15.getText(), "CONF15");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        try {
            this.engine.run(this.jTextField15.getText(), "CONF15");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        try {
            this.engine.save(this.jTextField16.getText(), "CONF16");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        try {
            this.engine.run(this.jTextField16.getText(), "CONF16");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        try {
            this.engine.save(this.jTextField17.getText(), "CONF17");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        try {
            this.engine.run(this.jTextField17.getText(), "CONF17");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        try {
            this.engine.save(this.jTextField18.getText(), "CONF18");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        try {
            this.engine.run(this.jTextField18.getText(), "CONF18");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        try {
            this.engine.save(this.jTextField19.getText(), "CONF19");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        try {
            this.engine.run(this.jTextField19.getText(), "CONF19");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        try {
            this.engine.save(this.jTextField20.getText(), "CONF20");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        try {
            this.engine.run(this.jTextField20.getText(), "CONF20");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void LaunchPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaunchPSActionPerformed
        try {
            final ProcessBuilder builder = new ProcessBuilder(new String[]{"cmd.exe", "/c", "start powershell.exe"});
            builder.redirectErrorStream(true);
            builder.start();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_LaunchPSActionPerformed

    private void CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditsActionPerformed
        credits.setVisible(true);
    }//GEN-LAST:event_CreditsActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void LaunchCMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaunchCMDActionPerformed
        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K ");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_LaunchCMDActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        CMDRunner main = new CMDRunner();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RefreshActionPerformed

    private void SaveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAllActionPerformed
        this.jButton1ActionPerformed(null);
        this.jButton3ActionPerformed(null);
        this.jButton5ActionPerformed(null);
        this.jButton7ActionPerformed(null);
        this.jButton9ActionPerformed(null);
        this.jButton11ActionPerformed(null);
        this.jButton13ActionPerformed(null);
        this.jButton15ActionPerformed(null);
        this.jButton17ActionPerformed(null);
        this.jButton19ActionPerformed(null);
        this.jButton21ActionPerformed(null);
        this.jButton23ActionPerformed(null);
        this.jButton25ActionPerformed(null);
        this.jButton27ActionPerformed(null);
        this.jButton29ActionPerformed(null);
        this.jButton31ActionPerformed(null);
        this.jButton33ActionPerformed(null);
        this.jButton35ActionPerformed(null);
        this.jButton37ActionPerformed(null);
        this.jButton39ActionPerformed(null);
    }//GEN-LAST:event_SaveAllActionPerformed

    private void MainMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMouseDragged
        final int x = evt.getXOnScreen();
        final int y = evt.getYOnScreen();
        this.setLocation(x - this.xx, y - this.yy);
    }//GEN-LAST:event_MainMouseDragged

    private void MainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMousePressed
        this.xx = evt.getX();
        this.yy = evt.getY();
    }//GEN-LAST:event_MainMousePressed

    private void VersioningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VersioningMouseClicked
        versioning.setVisible(true);
    }//GEN-LAST:event_VersioningMouseClicked
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CMDRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new CMDRunner().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A;
    private javax.swing.JPanel B;
    private javax.swing.JLabel CMDRunner;
    private javax.swing.JButton Credits;
    private javax.swing.JButton Exit;
    private javax.swing.JButton LaunchCMD;
    private javax.swing.JButton LaunchPS;
    private javax.swing.JPanel Main;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton SaveAll;
    private javax.swing.JTabbedPane TabbedPane;
    public javax.swing.JLabel Versioning;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField12;
    public javax.swing.JTextField jTextField13;
    public javax.swing.JTextField jTextField14;
    public javax.swing.JTextField jTextField15;
    public javax.swing.JTextField jTextField16;
    public javax.swing.JTextField jTextField17;
    public javax.swing.JTextField jTextField18;
    public javax.swing.JTextField jTextField19;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField20;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}