
package covid.help.desk;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CovidNA extends javax.swing.JFrame {

    
    public CovidNA() {
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
        jLabel2 = new javax.swing.JLabel();
        Exit1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Symptoms = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        see = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mv.setBackground(new java.awt.Color(236, 236, 252));
        mv.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mv.setForeground(new java.awt.Color(204, 0, 0));
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("#NEW SYMPTOMS OF COVID-19!");

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

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Symptoms"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        see.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        see.setText("See");
        see.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seeMouseExited(evt);
            }
        });
        see.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(see)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(save)
                .addComponent(see)
                .addComponent(delete))
        );

        javax.swing.GroupLayout mvLayout = new javax.swing.GroupLayout(mv);
        mv.setLayout(mvLayout);
        mvLayout.setHorizontalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(mvLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(mvLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mvLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addComponent(Symptoms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        mvLayout.setVerticalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mvLayout.createSequentialGroup()
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mini, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(Exit1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mvLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(56, 56, 56))
                            .addGroup(mvLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(Symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(mvLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mvMousePressed

    private void mvMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_mvMouseDragged

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        JFrame frame = new JFrame ("Exit Application");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Exit?",
            "Covid Help Desk!",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_Exit1ActionPerformed

    private void Exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit1MouseExited
        Exit1.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_Exit1MouseExited

    private void Exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit1MouseEntered
        Exit1.setBackground(Color.red);
    }//GEN-LAST:event_Exit1MouseEntered

    private void miniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniActionPerformed

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
        mini.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_miniMouseExited

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
        mini.setBackground(Color.GRAY);
    }//GEN-LAST:event_miniMouseEntered

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        JFrame frame = new JFrame ("Return Home");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Go to Covid News & Test Window?",
            "Covid Help Desk!",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {
        setVisible(false);
        new CovidNTA().setVisible(true);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_ExitMouseExited

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exit.setBackground(Color.black);
    }//GEN-LAST:event_ExitMouseEntered

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6428124","sql6428124","VCn1UKEt3V");
            //Connection con=DriverManager.getConnection("jdbc:mysql://mysql-41754-0.cloudclusters.net:15462/covid_help_desk","admin","8SAVe8XE");
            PreparedStatement pst = con.prepareStatement("insert into symptom VALUES(?)");
    
            pst.setString(1,Symptoms.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this,"Symptoms  save Sucessfully");
            Symptoms.setText(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_saveActionPerformed
    
    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(Color.green);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_saveMouseExited

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6428124","sql6428124","VCn1UKEt3V");           
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row,0).toString());
            String query = "delete from  symptom where Symptoms ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel Model = (DefaultTableModel)jTable1.getModel();              
                Model.setRowCount(0);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(Color.red);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_deleteMouseExited

    private void seeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6428124","sql6428124","VCn1UKEt3V");
            //Connection con=DriverManager.getConnection("jdbc:mysql://mysql-41754-0.cloudclusters.net:15462/covid_help_desk","admin","8SAVe8XE");
            Statement st = con.createStatement();
            String sql = "select *from  symptom";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                
                String Symptoms = String.valueOf(rs.getString("Symptoms"));
                String tbData[] = {Symptoms};
                DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
                tbModel.addRow(tbData);
                
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_seeActionPerformed

    private void seeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeMouseEntered
       see.setBackground(Color.blue);
    }//GEN-LAST:event_seeMouseEntered

    private void seeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeMouseExited
        see.setBackground(new Color(236,236,252));
    }//GEN-LAST:event_seeMouseExited
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
            java.util.logging.Logger.getLogger(CovidNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CovidNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CovidNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CovidNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CovidNA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit1;
    private javax.swing.JTextField Symptoms;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mini;
    private javax.swing.JPanel mv;
    private javax.swing.JButton save;
    private javax.swing.JButton see;
    // End of variables declaration//GEN-END:variables
}
