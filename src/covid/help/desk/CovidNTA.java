
package covid.help.desk;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CovidNTA extends javax.swing.JFrame {

    
    public CovidNTA() {
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
        CN = new javax.swing.JButton();
        CT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Exit1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Urg = new javax.swing.JButton();

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

        CN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CN.setText("Covid News");
        CN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CNMouseExited(evt);
            }
        });
        CN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNActionPerformed(evt);
            }
        });

        CT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CT.setText("Covid Test");
        CT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CTMouseExited(evt);
            }
        });
        CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/co-news (1).png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/covid-19-testing (1).jpg"))); // NOI18N

        Exit1.setBackground(new java.awt.Color(236, 236, 252));
        Exit1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Exit1.setText("X");
        Exit1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/urgent guidance.png"))); // NOI18N

        Urg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Urg.setText("Urgent Guidance");
        Urg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UrgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UrgMouseExited(evt);
            }
        });
        Urg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mvLayout = new javax.swing.GroupLayout(mv);
        mv.setLayout(mvLayout);
        mvLayout.setHorizontalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(127, 127, 127)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                        .addComponent(CT)
                        .addGap(25, 25, 25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                        .addComponent(Urg)
                        .addGap(95, 95, 95))))
            .addGroup(mvLayout.createSequentialGroup()
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(CN)))
                .addGap(60, 60, 60)
                .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        mvLayout.setVerticalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mvLayout.createSequentialGroup()
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CN))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Exit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CT)
                            .addComponent(Urg))))
                .addGap(26, 26, 26))
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
        if (JOptionPane.showConfirmDialog(frame, "Confirm Go to Admin Dashboard?",
            "Covid Help Desk!",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {
        setVisible(false);
        new AdminDB().setVisible(true);
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

    private void CNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CNMouseEntered
        CN.setBackground(Color.red);
    }//GEN-LAST:event_CNMouseEntered

    private void CNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CNMouseExited
        CN.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_CNMouseExited

    private void CNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNActionPerformed
        setVisible(false);
        new CovidNA().setVisible(true);
    }//GEN-LAST:event_CNActionPerformed

    private void CTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CTMouseEntered
        CT.setBackground(Color.red);
    }//GEN-LAST:event_CTMouseEntered

    private void CTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CTMouseExited
        CT.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_CTMouseExited

    private void CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTActionPerformed
        setVisible(false);
        new CovidTA().setVisible(true);
    }//GEN-LAST:event_CTActionPerformed

    private void Exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit1MouseEntered
        Exit1.setBackground(Color.red);
    }//GEN-LAST:event_Exit1MouseEntered

    private void Exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit1MouseExited
        Exit1.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_Exit1MouseExited

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        JFrame frame = new JFrame ("Exit Application");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Exit?",
            "Covid Help Desk!",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_Exit1ActionPerformed

    private void mvMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_mvMouseDragged

    private void mvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mvMousePressed

    private void UrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrgActionPerformed
        setVisible(false);
        new ug().setVisible(true);
    }//GEN-LAST:event_UrgActionPerformed

    private void UrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UrgMouseEntered
        Urg.setBackground(Color.GREEN);
    }//GEN-LAST:event_UrgMouseEntered

    private void UrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UrgMouseExited
         Urg.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_UrgMouseExited
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
            java.util.logging.Logger.getLogger(CovidNTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CovidNTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CovidNTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CovidNTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CovidNTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CN;
    private javax.swing.JButton CT;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit1;
    private javax.swing.JButton Urg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton mini;
    private javax.swing.JPanel mv;
    // End of variables declaration//GEN-END:variables
}
