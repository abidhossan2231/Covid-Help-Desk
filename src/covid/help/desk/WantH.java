package covid.help.desk;

import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WantH extends javax.swing.JFrame {

    String filename = null;
    byte[] person_image = null;

    public WantH() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mv = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mini = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pop = new javax.swing.JTextArea();
        nfro = new javax.swing.JLabel();
        nfor = new javax.swing.JLabel();
        nidfro = new javax.swing.JButton();
        nidfor = new javax.swing.JButton();
        SA = new javax.swing.JButton();
        Exit1 = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(236, 236, 252));

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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Contact Number :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("PoP Of Massage :");

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        number.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        pop.setColumns(20);
        pop.setRows(5);
        jScrollPane1.setViewportView(pop);

        nfro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nfro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nfro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nfro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nfor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nfor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nfor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nfor.setPreferredSize(new java.awt.Dimension(93, 17));

        nidfro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nidfro.setText("Choose");
        nidfro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nidfroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nidfroMouseExited(evt);
            }
        });
        nidfro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidfroActionPerformed(evt);
            }
        });

        nidfor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nidfor.setText("Choose");
        nidfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nidforMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nidforMouseExited(evt);
            }
        });
        nidfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidforActionPerformed(evt);
            }
        });

        SA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SA.setText("Send Application");
        SA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SAMouseExited(evt);
            }
        });
        SA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAActionPerformed(evt);
            }
        });

        Exit1.setBackground(new java.awt.Color(236, 236, 252));
        Exit1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Exit1.setText("X");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(mini)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Exit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(47, 47, 47)
                                .addComponent(nfro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nfor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(147, 147, 147)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(22, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(nidfro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nidfor)
                .addGap(65, 65, 65)
                .addComponent(SA)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Exit1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nfro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nfor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nidfro)
                    .addComponent(nidfor)
                    .addComponent(SA))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout mvLayout = new javax.swing.GroupLayout(mv);
        mv.setLayout(mvLayout);
        mvLayout.setHorizontalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mvLayout.setVerticalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Exit.setBackground(Color.red);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setBackground(new Color(236, 236, 252));
    }//GEN-LAST:event_ExitMouseExited

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        JFrame frame = new JFrame("Return Home");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Back Home?",
                "Covid Help Desk!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            setVisible(false);
            new CovidNT().setVisible(true);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
        mini.setBackground(Color.black);
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
        mini.setBackground(new Color(236, 236, 252));
    }//GEN-LAST:event_miniMouseExited

    private void miniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniActionPerformed

    private void nidfroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidfroMouseEntered
        nidfro.setBackground(Color.blue);
    }//GEN-LAST:event_nidfroMouseEntered

    private void nidfroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidfroMouseExited
        nidfro.setBackground(new Color(236, 236, 252));
    }//GEN-LAST:event_nidfroMouseExited

    private void nidfroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidfroActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(nfro.getWidth(), nfro.getHeight(), Image.SCALE_SMOOTH));
        nfro.setIcon(imageIcon);
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[2048];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_nidfroActionPerformed

    private void nidforMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidforMouseEntered
        nidfor.setBackground(Color.blue);
    }//GEN-LAST:event_nidforMouseEntered

    private void nidforMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidforMouseExited
        nidfor.setBackground(new Color(236, 236, 252));
    }//GEN-LAST:event_nidforMouseExited

    private void nidforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidforActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(nfor.getWidth(), nfor.getHeight(), Image.SCALE_SMOOTH));
        nfor.setIcon(imageIcon);
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[2048];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_nidforActionPerformed

    private void SAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAMouseEntered
        SA.setBackground(Color.green);
    }//GEN-LAST:event_SAMouseEntered

    private void SAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAMouseExited
        SA.setBackground(new Color(236, 236, 252));
    }//GEN-LAST:event_SAMouseExited

    private void SAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAActionPerformed

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/covid_help_desk","root","abid1294");
            
            PreparedStatement pst = con.prepareStatement("INSERT INTO application_want_to_help VALUES(?,?,?,?,?)");
    
            pst.setString(1,name.getText());
            pst.setString(2,number.getText());
            pst.setString(3,pop.getText());
            pst.setString(4,nfro.getText());
            pst.setString(5,nfor.getText());
 
            pst.execute();
            JOptionPane.showMessageDialog(this,"Record Updated Sucessfully");
            name.setText(null);
            number.setText(null);
            pop.setText(null);
            nfro.setIcon(null);
            nfor.setIcon(null);           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
       
    }//GEN-LAST:event_SAActionPerformed

    private void mvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mvMousePressed

    private void mvMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_mvMouseDragged

    private void Exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit1MouseEntered
        Exit.setBackground(Color.red);
    }//GEN-LAST:event_Exit1MouseEntered

    private void Exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit1MouseExited
        Exit.setBackground(new Color(236,236,252));
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
    private int xMouse, yMouse;

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
            java.util.logging.Logger.getLogger(WantH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WantH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WantH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WantH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit1;
    private javax.swing.JButton SA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mini;
    private javax.swing.JPanel mv;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nfor;
    private javax.swing.JLabel nfro;
    private javax.swing.JButton nidfor;
    private javax.swing.JButton nidfro;
    private javax.swing.JTextField number;
    private javax.swing.JTextArea pop;
    // End of variables declaration//GEN-END:variables
}
