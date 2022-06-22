/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Java_TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form Java_TicTacToe
     */
    private String startGame = "X";
    public int xCount = 0;
    public int oCount = 0;
    private int count_win = 0;
    boolean checker;
    public int calcX;
    public int calcO;
    
    public Java_TicTacToe() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private void gameScore(){
        calcX=xCount*100/(xCount+oCount);
        calcO= 100-calcX;
        PlayerX_score.setText(String.valueOf(xCount));
        PlayerO_score.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }
        else{
            startGame="X";
        }
    }
    
    public void resetAfterWin(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
        
        
    }
    
    private void winningGame(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        if(b1==("X") && b2==("X") && b3==("X")){
            
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetAfterWin();
     
        }
        else if(b4==("X") && b5==("X") && b6==("X")){
            
            btn4.setBackground(Color.CYAN);
            btn5.setBackground(Color.CYAN);
            btn6.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this, "Player X Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b7==("X") && b8==("X") && b9==("X")){
            btn7.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b1==("X") && b4==("X") && b7==("X")){
            btn1.setBackground(Color.ORANGE);
            btn4.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b2==("X") && b5==("X") && b8==("X")){
            btn2.setBackground(Color.CYAN);
            btn5.setBackground(Color.CYAN);
            btn8.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this, "Player X Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b3==("X") && b6==("X") && b9==("X")){
            btn3.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b1==("X") && b5==("X") && b9==("X")){
            
            btn1.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player X Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b3==("X") && b5==("X") && b7==("X")){
            
            btn3.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player X Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetAfterWin();
        }
        
        else if(b1==("O") && b2==("O") && b3==("O")){
            
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b4==("O") && b5==("O") && b6==("O")){
            btn4.setBackground(Color.CYAN);
            btn5.setBackground(Color.CYAN);
            btn6.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this, "Player O Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b7==("O") && b8==("O") && b9==("O")){
            btn7.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b1==("O") && b4==("O") && b7==("O")){
            btn1.setBackground(Color.ORANGE);
            btn4.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b2==("O") && b5==("O") && b8==("O")){
            btn2.setBackground(Color.CYAN);
            btn5.setBackground(Color.CYAN);
            btn8.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this, "Player O Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b3==("O") && b6==("O") && b9==("O")){
            btn3.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b1==("O") && b5==("O") && b9==("O")){
            btn1.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player O Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetAfterWin();
        }
        else if(b3==("O") && b5==("O") && b7==("O")){
            btn3.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player O Wins!!","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetAfterWin();
        }
        
        else if(b1!=("") && b2!=("") && b3!=("") && b4!=("") && b5!=("") && b6!=("") && b7!=("") && b8!=("") && b9!=("")){
            
            btn1.setBackground(Color.RED);
            btn2.setBackground(Color.RED);
            btn3.setBackground(Color.RED);
            btn4.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn6.setBackground(Color.RED);
            btn7.setBackground(Color.RED);
            btn8.setBackground(Color.RED);
            btn9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "It is a Draw!! Play Again","Java Tic-Tac-Toe Game",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            resetAfterWin();
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        exit_btn = new javax.swing.JButton();
        newgame_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        PlayerX_score = new javax.swing.JLabel();
        PlayerO_ScoreLabel = new javax.swing.JLabel();
        PlayerO_score = new javax.swing.JLabel();
        PlayerX_ScoreLabel = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(95, 158, 160));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 650, 820));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit_btn.setFont(new java.awt.Font("Chiller", 1, 60)); // NOI18N
        exit_btn.setText("EXIT");
        exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        jPanel8.add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 280, 180));

        newgame_btn.setFont(new java.awt.Font("Chiller", 1, 60)); // NOI18N
        newgame_btn.setText("NEW GAME");
        newgame_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newgame_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgame_btnActionPerformed(evt);
            }
        });
        jPanel8.add(newgame_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 280, 170));

        reset_btn.setFont(new java.awt.Font("Chiller", 1, 60)); // NOI18N
        reset_btn.setText("RESET");
        reset_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });
        jPanel8.add(reset_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 170));

        jButton1.setFont(new java.awt.Font("Chiller", 1, 60)); // NOI18N
        jButton1.setText("END MATCH");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 320, 180));

        jPanel9.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 650, 420));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayerX_score.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        PlayerX_score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerX_score.setText("0");
        PlayerX_score.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PlayerX_score.setOpaque(true);
        jPanel12.add(PlayerX_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 210, 70));

        PlayerO_ScoreLabel.setFont(new java.awt.Font("Chiller", 1, 80)); // NOI18N
        PlayerO_ScoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayerO_ScoreLabel.setText("PlayerO :");
        jPanel12.add(PlayerO_ScoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 290, 80));

        PlayerO_score.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        PlayerO_score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerO_score.setText("0");
        PlayerO_score.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PlayerO_score.setOpaque(true);
        jPanel12.add(PlayerO_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 210, 70));

        PlayerX_ScoreLabel.setFont(new java.awt.Font("Chiller", 1, 80)); // NOI18N
        PlayerX_ScoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayerX_ScoreLabel.setText("PlayerX :");
        jPanel12.add(PlayerX_ScoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 280, 70));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 650, 220));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 690, 700));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(95, 158, 160));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, 1460, 130));

        jPanel14.setBackground(new java.awt.Color(95, 158, 160));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -170, 630, 130));

        btn3.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel11.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 210, 200));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel11.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, 200));

        btn2.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel11.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 210, 200));

        btn6.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel11.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 210, 200));

        btn5.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel11.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 210, 200));

        btn4.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel11.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 210, 200));

        btn9.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel11.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 210, 200));

        btn8.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel11.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 210, 200));

        btn7.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel11.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 210, 200));

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 760, 700));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Chiller", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Java Tic-Tac-Toe Game");
        jPanel16.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 780, 80));

        jPanel7.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 1460, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        btn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) checker = false;
        else checker = true;
        choose_a_Player();
        winningGame();
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")) checker = false;
        else checker = true;
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")) checker = false;
        else checker = true;
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private JFrame frame;
    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the game?","Java Tic-Tac-Toe Game",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exit_btnActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btn5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")) checker = false;
        else checker = true;
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        // TODO add your handling code here:
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
        
        
    }//GEN-LAST:event_reset_btnActionPerformed

    private void newgame_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgame_btnActionPerformed
        // TODO add your handling code here:
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        PlayerX_score.setText("0");
        PlayerO_score.setText("0");
        xCount=0;
        oCount=0;
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_newgame_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Stats jf2 = new Stats();
        //int x= Integer.valueOf(Java_TicTacToe.PlayerX_score.getText());
        //int o= Integer.valueOf(Java_TicTacToe.PlayerO_score.getText());
        //int calcX = (x/(x+o))*100;
        
        //int calcX = (xCount/(xCount+oCount))*100;
        Stats.XName.setText(Java_TicTacToe.PlayerX_ScoreLabel.getText());
        Stats.OName.setText(Java_TicTacToe.PlayerO_ScoreLabel.getText());
        
        Stats.XGamesWon.setText(Java_TicTacToe.PlayerX_score.getText());
        Stats.OGamesWon.setText(Java_TicTacToe.PlayerO_score.getText());
        
        Stats.XWinPercentage.setText(String.valueOf(calcX)+"(%)");
        Stats.OWinPercentage.setText(String.valueOf(calcO)+"(%)");
        
        
        frame = new JFrame("END MATCH");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to end the current match?","Java Tic-Tac-Toe Game",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            //System.exit(0);
            jf2.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")) checker = false;
        else checker = true;
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btn3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")) checker = false;
        else checker = true;
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btn6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")) checker = false;
        else checker = true;
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")) checker = false;
        else checker = true;
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")) checker = false;
        else checker = true;
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel PlayerO_ScoreLabel;
    public static javax.swing.JLabel PlayerO_score;
    public static javax.swing.JLabel PlayerX_ScoreLabel;
    public static javax.swing.JLabel PlayerX_score;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton exit_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton newgame_btn;
    private javax.swing.JButton reset_btn;
    // End of variables declaration//GEN-END:variables
}
