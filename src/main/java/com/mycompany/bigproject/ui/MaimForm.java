/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bigproject.ui;

import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class MaimForm extends javax.swing.JFrame {
    private CandidateManamentPanel MenuManageFalcon;
    private EmployerManamentPanel MenuManageEmployer;
    private FitManamentPanel MenuManamentPanel;
    /**
    /**
     * Creates new form MaimForm
     */
    public MaimForm() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        menuManageFalcon_2 = new javax.swing.JButton();
        menuManageEmployer_2 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        menuManageNews = new javax.swing.JButton();
        tblMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuManageFalcon = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/Login-icon-32.png"))); // NOI18N
        jButton1.setText("Log out");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator4);

        menuManageFalcon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        menuManageFalcon_2.setText("Candidate");
        menuManageFalcon_2.setFocusable(false);
        menuManageFalcon_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuManageFalcon_2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuManageFalcon_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageFalcon_2ActionPerformed(evt);
            }
        });
        jToolBar1.add(menuManageFalcon_2);

        menuManageEmployer_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/gpa-icon-32.png"))); // NOI18N
        menuManageEmployer_2.setText(" Employer");
        menuManageEmployer_2.setFocusable(false);
        menuManageEmployer_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuManageEmployer_2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuManageEmployer_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageEmployer_2ActionPerformed(evt);
            }
        });
        jToolBar1.add(menuManageEmployer_2);
        jToolBar1.add(jSeparator7);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/Actions-help-about-icon-32.png"))); // NOI18N
        jButton4.setText("Help");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator5);

        menuManageNews.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/Actions-document-edit-icon-32.png"))); // NOI18N
        menuManageNews.setText("News");
        menuManageNews.setFocusable(false);
        menuManageNews.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuManageNews.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuManageNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageNewsActionPerformed(evt);
            }
        });
        jToolBar1.add(menuManageNews);

        jMenu1.setText("Hệ Thông");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/Login-icon-16.png"))); // NOI18N
        jMenuItem1.setText("Log out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/Button-Close-icon-16.png"))); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lí");

        menuManageFalcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        menuManageFalcon.setText("Candidate");
        menuManageFalcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageFalconActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageFalcon);
        jMenu2.add(jSeparator2);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/gpa-icon.png"))); // NOI18N
        jMenuItem4.setText("Employer");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ giúp");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/Actions-help-about-icon-16.png"))); // NOI18N
        jMenuItem5.setText("Nội dung");
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator3);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/Help-icon-16.png"))); // NOI18N
        jMenuItem6.setText("Giới thiệu");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addComponent(tblMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuManageFalconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageFalconActionPerformed
       if(MenuManageFalcon == null){
              MenuManageFalcon = new CandidateManamentPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/10207-man-student-light-skin-tone-icon-16.png"));
        tblMainBoard.addTab("Manament Employer", icon, MenuManageFalcon,"Manament Employer");
        
       }
     
        tblMainBoard.setSelectedComponent(MenuManageFalcon);
        
    }//GEN-LAST:event_menuManageFalconActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuManageNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageNewsActionPerformed
         if(MenuManamentPanel == null){
              MenuManamentPanel = new FitManamentPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/Actions-document-edit-icon-16.png"));
        tblMainBoard.addTab("Fit Jobs ", icon, MenuManamentPanel,"Fit Jobs ");
                
       }
     
        tblMainBoard.setSelectedComponent(MenuManamentPanel);
    }//GEN-LAST:event_menuManageNewsActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuManageFalcon_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageFalcon_2ActionPerformed
         if(MenuManageFalcon == null){
              MenuManageFalcon = new CandidateManamentPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/10207-man-student-light-skin-tone-icon-16.png"));
        tblMainBoard.addTab("Manament Falcon", icon, MenuManageFalcon,"Manament Falcon");
        
       }
     
        tblMainBoard.setSelectedComponent(MenuManageFalcon);
        
    }//GEN-LAST:event_menuManageFalcon_2ActionPerformed

    private void menuManageEmployer_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageEmployer_2ActionPerformed
        if(MenuManageEmployer == null){
            MenuManageEmployer = new EmployerManamentPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/bigproject/icons/gpa-icon-24.png"));
        tblMainBoard.addTab("Manament Employer", icon, MenuManageEmployer,"Manament Employer");
        
       }
     
        tblMainBoard.setSelectedComponent(MenuManageEmployer);
        
    }//GEN-LAST:event_menuManageEmployer_2ActionPerformed

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
            java.util.logging.Logger.getLogger(MaimForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaimForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaimForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaimForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaimForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton menuManageEmployer_2;
    private javax.swing.JMenuItem menuManageFalcon;
    private javax.swing.JButton menuManageFalcon_2;
    private javax.swing.JButton menuManageNews;
    private javax.swing.JTabbedPane tblMainBoard;
    // End of variables declaration//GEN-END:variables
}