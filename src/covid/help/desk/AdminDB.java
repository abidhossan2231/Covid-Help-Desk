
package covid.help.desk;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class AdminDB extends javax.swing.JFrame {

    
    public AdminDB() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mv = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NeedH = new javax.swing.JButton();
        WantH = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NewsTest = new javax.swing.JButton();
        mini = new javax.swing.JButton();
        nt = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mv.setBackground(new java.awt.Color(236, 236, 252));
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/Need Help.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/User.jpg"))); // NOI18N

        NeedH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NeedH.setText("Need Help");
        NeedH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NeedHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NeedHMouseExited(evt);
            }
        });
        NeedH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeedHActionPerformed(evt);
            }
        });

        WantH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        WantH.setText("Want to Help");
        WantH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WantHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WantHMouseExited(evt);
            }
        });
        WantH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WantHActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(236, 236, 252));
        Exit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/Home.0.png"))); // NOI18N
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

        NewsTest.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NewsTest.setText("Covid News & Test");
        NewsTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewsTestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewsTestMouseExited(evt);
            }
        });
        NewsTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewsTestActionPerformed(evt);
            }
        });

        mini.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mini.setText("-");
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

        nt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nt.setText("Notification");
        nt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ntMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ntMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/notifi.jpg"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid/help/desk/co-news (1).png"))); // NOI18N

        javax.swing.GroupLayout mvLayout = new javax.swing.GroupLayout(mv);
        mv.setLayout(mvLayout);
        mvLayout.setHorizontalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mvLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(NewsTest))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(NeedH))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WantH))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nt)
                .addGap(129, 129, 129))
        );
        mvLayout.setVerticalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mvLayout.createSequentialGroup()
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addComponent(mini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exit)
                            .addGroup(mvLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76)))
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mvLayout.createSequentialGroup()
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WantH)
                            .addComponent(NeedH)
                            .addComponent(NewsTest))
                        .addContainerGap())))
            .addGroup(mvLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(nt))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NeedHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeedHActionPerformed
        setVisible(false);
        new NeedH().setVisible(true);
    }//GEN-LAST:event_NeedHActionPerformed

    private void WantHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WantHActionPerformed
        setVisible(false);
        new WantH().setVisible(true);
    }//GEN-LAST:event_WantHActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        JFrame frame = new JFrame ("Return Home");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Back Home?",
            "Covid Help Desk!",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {
        setVisible(false);
        new main().setVisible(true);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void NewsTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewsTestActionPerformed
        setVisible(false);
        new CovidNT().setVisible(true);
    }//GEN-LAST:event_NewsTestActionPerformed

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
        mini.setBackground(Color.black);
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
        mini.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_miniMouseExited

    private void miniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniActionPerformed

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
         Exit.setBackground(Color.red);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
         Exit.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_ExitMouseExited

    private void ntMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntMouseEntered
         nt.setBackground(Color.yellow);
    }//GEN-LAST:event_ntMouseEntered

    private void ntMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntMouseExited
         nt.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_ntMouseExited

    private void NewsTestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsTestMouseEntered
         NewsTest.setBackground(Color.red);
    }//GEN-LAST:event_NewsTestMouseEntered

    private void NeedHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NeedHMouseEntered
        NeedH.setBackground(Color.blue);
    }//GEN-LAST:event_NeedHMouseEntered

    private void WantHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WantHMouseEntered
        WantH.setBackground(Color.green);
    }//GEN-LAST:event_WantHMouseEntered

    private void NewsTestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsTestMouseExited
        NewsTest.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_NewsTestMouseExited

    private void NeedHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NeedHMouseExited
        NeedH.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_NeedHMouseExited

    private void WantHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WantHMouseExited
        WantH.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_WantHMouseExited

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
            java.util.logging.Logger.getLogger(AdminDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton NeedH;
    private javax.swing.JButton NewsTest;
    private javax.swing.JButton WantH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton mini;
    private javax.swing.JPanel mv;
    private javax.swing.JButton nt;
    // End of variables declaration//GEN-END:variables
}
