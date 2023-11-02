package clases;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class G_Interface extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine JSE = sem.getEngineByName("JavaScript");
    KeyListener kl;
    
    public G_Interface() {
        initComponents();
        
        this.getContentPane().setBackground(new Color(25, 25, 26));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.addKeyListener(kl);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button19 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BTN_3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfield1 = new javax.swing.JTextField();
        L_result = new javax.swing.JLabel();
        BTN_4 = new javax.swing.JButton();
        BTN_2 = new javax.swing.JButton();
        BTN_1 = new javax.swing.JButton();
        BTN_8 = new javax.swing.JButton();
        BTN_5 = new javax.swing.JButton();
        BTN_6 = new javax.swing.JButton();
        BTN_9 = new javax.swing.JButton();
        BTN_0 = new javax.swing.JButton();
        BTN_7 = new javax.swing.JButton();
        BTN_EQUAL = new javax.swing.JButton();
        BTN_POINT = new javax.swing.JButton();
        BTN_REST = new javax.swing.JButton();
        BTN_ADD = new javax.swing.JButton();
        BTN_MUL = new javax.swing.JButton();
        BTN_DELETE = new javax.swing.JButton();
        BTN_DIV = new javax.swing.JButton();

        button2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button6.setFont(new java.awt.Font("Hack Nerd Font", 0, 18)); // NOI18N
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("4");
        button6.setToolTipText("");
        button6.setBorder(null);
        button6.setBorderPainted(false);
        button6.setContentAreaFilled(false);
        button6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button19.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        button19.setForeground(new java.awt.Color(0, 80, 215));
        button19.setText("/");
        button19.setToolTipText("");
        button19.setBorder(null);
        button19.setBorderPainted(false);
        button19.setContentAreaFilled(false);
        button19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 450));
        setResizable(false);

        BTN_3.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_3.setForeground(new java.awt.Color(255, 255, 255));
        BTN_3.setText("3");
        BTN_3.setBorder(null);
        BTN_3.setToolTipText("");
        BTN_3.setBorder(null);
        BTN_3.setBorderPainted(false);
        BTN_3.setContentAreaFilled(false);
        BTN_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));
        jPanel2.setForeground(new java.awt.Color(50, 50, 50));

        tfield1.setBackground(new java.awt.Color(50, 50, 50));
        tfield1.setFont(new java.awt.Font("Hack Nerd Font", 1, 30)); // NOI18N
        tfield1.setForeground(new java.awt.Color(255, 255, 255));
        tfield1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfield1.setToolTipText("");
        tfield1.setBorder(null);
        tfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfield1ActionPerformed(evt);
            }
        });

        L_result.setBackground(new java.awt.Color(50, 50, 50));
        L_result.setFont(new java.awt.Font("Cousine Nerd Font Mono", 1, 18)); // NOI18N
        L_result.setForeground(new java.awt.Color(255, 255, 255));
        L_result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_result.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L_result, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tfield1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_result, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BTN_4.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_4.setForeground(new java.awt.Color(255, 255, 255));
        BTN_4.setText("4");
        BTN_4.setToolTipText("");
        BTN_4.setBorder(null);
        BTN_4.setBorderPainted(false);
        BTN_4.setContentAreaFilled(false);
        BTN_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_4ActionPerformed(evt);
            }
        });

        BTN_2.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_2.setForeground(new java.awt.Color(255, 255, 255));
        BTN_2.setText("2");
        BTN_2.setToolTipText("");
        BTN_2.setBorder(null);
        BTN_2.setBorderPainted(false);
        BTN_2.setContentAreaFilled(false);
        BTN_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_2ActionPerformed(evt);
            }
        });

        BTN_1.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_1.setForeground(new java.awt.Color(255, 255, 255));
        BTN_1.setText("1");
        BTN_1.setToolTipText("");
        BTN_1.setBorder(null);
        BTN_1.setBorderPainted(false);
        BTN_1.setContentAreaFilled(false);
        BTN_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_1ActionPerformed(evt);
            }
        });

        BTN_8.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_8.setForeground(new java.awt.Color(255, 255, 255));
        BTN_8.setText("8");
        BTN_8.setToolTipText("");
        BTN_8.setBorder(null);
        BTN_8.setBorderPainted(false);
        BTN_8.setContentAreaFilled(false);
        BTN_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_8ActionPerformed(evt);
            }
        });

        BTN_5.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_5.setForeground(new java.awt.Color(255, 255, 255));
        BTN_5.setText("5");
        BTN_5.setToolTipText("");
        BTN_5.setBorder(null);
        BTN_5.setBorderPainted(false);
        BTN_5.setContentAreaFilled(false);
        BTN_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_5ActionPerformed(evt);
            }
        });

        BTN_6.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_6.setForeground(new java.awt.Color(255, 255, 255));
        BTN_6.setText("6");
        BTN_6.setToolTipText("");
        BTN_6.setBorder(null);
        BTN_6.setBorderPainted(false);
        BTN_6.setContentAreaFilled(false);
        BTN_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_6ActionPerformed(evt);
            }
        });

        BTN_9.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_9.setForeground(new java.awt.Color(255, 255, 255));
        BTN_9.setText("9");
        BTN_9.setToolTipText("");
        BTN_9.setBorder(null);
        BTN_9.setBorderPainted(false);
        BTN_9.setContentAreaFilled(false);
        BTN_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_9ActionPerformed(evt);
            }
        });

        BTN_0.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_0.setForeground(new java.awt.Color(255, 255, 255));
        BTN_0.setText("0");
        BTN_0.setToolTipText("");
        BTN_0.setBorder(null);
        BTN_0.setBorderPainted(false);
        BTN_0.setContentAreaFilled(false);
        BTN_0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_0ActionPerformed(evt);
            }
        });
        BTN_0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BTN_0KeyPressed(evt);
            }
        });

        BTN_7.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_7.setForeground(new java.awt.Color(255, 255, 255));
        BTN_7.setText("7");
        BTN_7.setToolTipText("");
        BTN_7.setBorder(null);
        BTN_7.setBorderPainted(false);
        BTN_7.setContentAreaFilled(false);
        BTN_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_7ActionPerformed(evt);
            }
        });

        BTN_EQUAL.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_EQUAL.setForeground(new java.awt.Color(255, 255, 255));
        BTN_EQUAL.setText("=");
        BTN_EQUAL.setToolTipText("");
        BTN_EQUAL.setBorder(null);
        BTN_EQUAL.setBorderPainted(false);
        BTN_EQUAL.setContentAreaFilled(false);
        BTN_EQUAL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_EQUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EQUALActionPerformed(evt);
            }
        });

        BTN_POINT.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_POINT.setForeground(new java.awt.Color(255, 255, 255));
        BTN_POINT.setText(".");
        BTN_POINT.setToolTipText("");
        BTN_POINT.setBorder(null);
        BTN_POINT.setBorderPainted(false);
        BTN_POINT.setContentAreaFilled(false);
        BTN_POINT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_POINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_POINTActionPerformed(evt);
            }
        });

        BTN_REST.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_REST.setForeground(new java.awt.Color(0, 80, 215));
        BTN_REST.setText("-");
        BTN_REST.setToolTipText("");
        BTN_REST.setBorder(null);
        BTN_REST.setBorderPainted(false);
        BTN_REST.setContentAreaFilled(false);
        BTN_REST.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_REST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RESTActionPerformed(evt);
            }
        });

        BTN_ADD.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_ADD.setForeground(new java.awt.Color(0, 80, 215));
        BTN_ADD.setText("+");
        BTN_ADD.setToolTipText("");
        BTN_ADD.setBorder(null);
        BTN_ADD.setBorderPainted(false);
        BTN_ADD.setContentAreaFilled(false);
        BTN_ADD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ADDActionPerformed(evt);
            }
        });

        BTN_MUL.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_MUL.setForeground(new java.awt.Color(0, 80, 215));
        BTN_MUL.setText("×");
        BTN_MUL.setToolTipText("");
        BTN_MUL.setBorder(null);
        BTN_MUL.setBorderPainted(false);
        BTN_MUL.setContentAreaFilled(false);
        BTN_MUL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_MUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MULActionPerformed(evt);
            }
        });

        BTN_DELETE.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_DELETE.setForeground(new java.awt.Color(0, 80, 215));
        BTN_DELETE.setText("<=");
        BTN_DELETE.setToolTipText("");
        BTN_DELETE.setBorder(null);
        BTN_DELETE.setBorderPainted(false);
        BTN_DELETE.setContentAreaFilled(false);
        BTN_DELETE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_DELETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BTN_DELETEMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BTN_DELETEMouseReleased(evt);
            }
        });
        BTN_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DELETEActionPerformed(evt);
            }
        });

        BTN_DIV.setFont(new java.awt.Font("Hack Nerd Font", 0, 22)); // NOI18N
        BTN_DIV.setForeground(new java.awt.Color(0, 80, 215));
        BTN_DIV.setText("÷");
        BTN_DIV.setToolTipText("");
        BTN_DIV.setBorder(null);
        BTN_DIV.setBorderPainted(false);
        BTN_DIV.setContentAreaFilled(false);
        BTN_DIV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_DIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DIVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BTN_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(BTN_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BTN_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BTN_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_DIV, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BTN_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BTN_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_REST, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_MUL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BTN_POINT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BTN_EQUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTN_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_DIV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_POINT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_EQUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_MUL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BTN_REST, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BTN_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_1ActionPerformed

        // Number 1
        Print_Symbol("1");
        Evaluate();
    }//GEN-LAST:event_BTN_1ActionPerformed

    private void BTN_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_2ActionPerformed

        // Number 2
        Print_Symbol("2");
        Evaluate();
    }//GEN-LAST:event_BTN_2ActionPerformed

    private void BTN_RESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RESTActionPerformed

        // Symbol "-"
        Print_Symbol("-");
    }//GEN-LAST:event_BTN_RESTActionPerformed

    private void BTN_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_0ActionPerformed

        // Number 0
        Print_Symbol("0");
        Evaluate();
    }//GEN-LAST:event_BTN_0ActionPerformed

    private void BTN_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_3ActionPerformed

        // Number 3
        Print_Symbol("3");
        Evaluate();
    }//GEN-LAST:event_BTN_3ActionPerformed

    private void BTN_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_4ActionPerformed

        // Number 4
        Print_Symbol("4");
        Evaluate();
    }//GEN-LAST:event_BTN_4ActionPerformed

    private void BTN_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_5ActionPerformed

        // Number 5
        Print_Symbol("5");
        Evaluate();
    }//GEN-LAST:event_BTN_5ActionPerformed

    private void BTN_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_6ActionPerformed

        // Number 6
        Print_Symbol("6");
        Evaluate();
    }//GEN-LAST:event_BTN_6ActionPerformed

    private void BTN_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_7ActionPerformed

        // Number 7
        Print_Symbol("7");
        Evaluate();
    }//GEN-LAST:event_BTN_7ActionPerformed

    private void BTN_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_8ActionPerformed

        // Number 8
        Print_Symbol("8");
        Evaluate();
    }//GEN-LAST:event_BTN_8ActionPerformed

    private void BTN_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_9ActionPerformed

        // Number 9
        Print_Symbol("9");
        Evaluate();
    }//GEN-LAST:event_BTN_9ActionPerformed

    private void BTN_POINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_POINTActionPerformed

        // Button  ' . '
        if (M_One()) {
            
            Replace_L();
            Print_Symbol(".");
            
        }
    }//GEN-LAST:event_BTN_POINTActionPerformed

    private void tfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfield1ActionPerformed

    }//GEN-LAST:event_tfield1ActionPerformed

    private void BTN_ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ADDActionPerformed

        // Symbol "+"
        if (M_One()) {
            
            Replace_L();
            Print_Symbol("+");
            
        }
    }//GEN-LAST:event_BTN_ADDActionPerformed

    private void BTN_MULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MULActionPerformed

        // Symbol "×"
        if (M_One()) {
            
            Replace_L();
            Print_Symbol("×");
            
        }

    }//GEN-LAST:event_BTN_MULActionPerformed

    private void BTN_DIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DIVActionPerformed

        // Symbol "÷"
        if (M_One()) {
            
            Replace_L();
            Print_Symbol("÷");
            
        }

    }//GEN-LAST:event_BTN_DIVActionPerformed

    private void BTN_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DELETEActionPerformed

        // Symbol "DELETE"
        if (M_One()) {
            
            Delete();
            
        }
    }//GEN-LAST:event_BTN_DELETEActionPerformed

    private void BTN_EQUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EQUALActionPerformed

        // Symbol "="
        if (M_One()) {
            
            Evaluate();
            tfield1.setText(L_result.getText());
            L_result.setText("");
        }
    }//GEN-LAST:event_BTN_EQUALActionPerformed

    private void BTN_DELETEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DELETEMousePressed

    }//GEN-LAST:event_BTN_DELETEMousePressed

    private void BTN_DELETEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DELETEMouseReleased

    }//GEN-LAST:event_BTN_DELETEMouseReleased

    private void BTN_0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTN_0KeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
                    Print_Symbol("0");
        Evaluate();
        
        }
    }//GEN-LAST:event_BTN_0KeyPressed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(G_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new G_Interface().setVisible(true);
                
            }
            
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton BTN_0;
    protected javax.swing.JButton BTN_1;
    protected javax.swing.JButton BTN_2;
    protected javax.swing.JButton BTN_3;
    protected javax.swing.JButton BTN_4;
    protected javax.swing.JButton BTN_5;
    protected javax.swing.JButton BTN_6;
    protected javax.swing.JButton BTN_7;
    protected javax.swing.JButton BTN_8;
    protected javax.swing.JButton BTN_9;
    protected javax.swing.JButton BTN_ADD;
    protected javax.swing.JButton BTN_DELETE;
    protected javax.swing.JButton BTN_DIV;
    protected javax.swing.JButton BTN_EQUAL;
    protected javax.swing.JButton BTN_MUL;
    protected javax.swing.JButton BTN_POINT;
    protected javax.swing.JButton BTN_REST;
    private javax.swing.JLabel L_result;
    protected javax.swing.JButton button19;
    protected javax.swing.JButton button2;
    protected javax.swing.JButton button6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfield1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        
        g.setColor(new Color(40, 42, 42));
        g.drawLine(230, 135, 230, 450);
        
    }
    
    public void Print_Symbol(String symbol) {
        
        tfield1.setText(tfield1.getText() + symbol);
        
    }
    
    public boolean M_One() {
        
        return tfield1.getText().length() > 0;
        
    }
    
    public void Delete() {
        
        int l_t = tfield1.getText().length();
        
        tfield1.setText(tfield1.getText().substring(0, l_t - 1));
        
    }
    
    public void Replace_L() {
        
        int temp_var = tfield1.getText().length();
        
        if (temp_var > 0) {
            
            String temp = tfield1.getText().substring(temp_var - 1, temp_var);
            
            if (temp.equals("+") | temp.equals("×") | temp.equals("÷") | temp.equals(".")) {
                
                Delete();
                
            }
            
        }
        
    }
    
    public void Evaluate() {
        
        try {
            
            String result = JSE.eval(tfield1.getText().replace("÷", "/").replace("×", "*")).toString();
            
            if (!tfield1.getText().equals(result)) {
                L_result.setText(result);
            } else {
                
                L_result.setText("");
                
            }
        } catch (ScriptException e) {
            
        }
    }
    
}
