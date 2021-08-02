
package covid.help.desk;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CovidT extends javax.swing.JFrame {

    
    public CovidT() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mv = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mini = new javax.swing.JButton();
        test = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Exit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mv.setBackground(new java.awt.Color(236, 236, 252));
        mv.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mvMouseDragged(evt);
            }
        });
        mv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mvMousePressed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(236, 236, 252));
        Exit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/Home.0.png"))); // NOI18N
        Exit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Exit.setDoubleBuffered(true);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/covid_health.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Help Desk!!");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("#COVID-19");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("For Red Cross and Red Crescent National Societies");

        mini.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mini.setText("-");
        mini.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mini.setDoubleBuffered(true);
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniMouseExited(evt);
            }
        });
        mini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniActionPerformed(evt);
            }
        });

        test.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        test.setText("Test");
        test.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                testMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                testMouseExited(evt);
            }
        });
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("#Serious symptoms:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("i. Difficulty breathing or shortness of breath!!");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("ii. Chest pain or pressure!!");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("iii. Loss of speech or movement!!");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/covid-symptoms.png"))); // NOI18N

        Exit1.setBackground(new java.awt.Color(236, 236, 252));
        Exit1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Exit1.setText("X");
        Exit1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Exit1.setDoubleBuffered(true);
        Exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Exit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Exit1MouseExited(evt);
            }
        });
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mvLayout = new javax.swing.GroupLayout(mv);
        mv.setLayout(mvLayout);
        mvLayout.setHorizontalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mvLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)))
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mvLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                                .addComponent(test)
                                .addGap(110, 110, 110))))))
            .addGroup(mvLayout.createSequentialGroup()
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mvLayout.setVerticalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mvLayout.createSequentialGroup()
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mini, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(Exit1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mvLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(20, 20, 20)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(test)
                        .addGap(99, 99, 99))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exit.setBackground(Color.black);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_ExitMouseExited

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        JFrame frame = new JFrame ("Return Home");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Go to Covid News & Test Window?",
            "Covid Help Desk!",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
             setVisible(false);
             new CovidNT().setVisible(true);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
        mini.setBackground(Color.GRAY);
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
        mini.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_miniMouseExited

    private void miniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniActionPerformed

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        
        CovidTest cvt = new CovidTest("Covid-19 Positive Test with #Symptoms!!");
        cvt.setVisible(false);
        
    }//GEN-LAST:event_testActionPerformed

    private void testMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testMouseEntered
        test.setBackground(Color.red);
    }//GEN-LAST:event_testMouseEntered

    private void testMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testMouseExited
        test.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_testMouseExited

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        JFrame frame = new JFrame ("Exit Application");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Exit?",
            "Covid Help Desk!",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_Exit1ActionPerformed

    private void Exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit1MouseEntered
        Exit1.setBackground(Color.red);
    }//GEN-LAST:event_Exit1MouseEntered

    private void Exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit1MouseExited
        Exit1.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_Exit1MouseExited

    private void mvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mvMousePressed

    private void mvMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_mvMouseDragged
       private int xMouse,yMouse;
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
            java.util.logging.Logger.getLogger(CovidT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CovidT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CovidT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CovidT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CovidT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mini;
    private javax.swing.JPanel mv;
    private javax.swing.JButton test;
    // End of variables declaration//GEN-END:variables
}
