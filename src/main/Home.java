
package main;

import java.awt.Color;
import javax.swing.JLabel;


public class Home extends javax.swing.JFrame {
      Intro introo = new Intro();
       liked likee = new liked();
       Info infoo = new Info();
    
    public Home() {

        initComponents();
        this.setLocationRelativeTo(null);
       // Intro intro = new Intro();
       jDesktopPane1.removeAll();
       jDesktopPane1.add(introo).setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        intro = new javax.swing.JButton();
        story = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        like = new javax.swing.JButton();
        info = new javax.swing.JButton();
        setting = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLabel1.setText("Home");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 143, 65));

        Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hamster.png"))); // NOI18N
        Name.setText("Luu Phuong Thao");
        jPanel2.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 19, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-macos-close-15.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        intro.setBackground(new java.awt.Color(0, 0, 0));
        intro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        intro.setForeground(new java.awt.Color(255, 102, 102));
        intro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Intro.png"))); // NOI18N
        intro.setText("Intro");
        intro.setBorderPainted(false);
        intro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        intro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                introMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                introMouseExited(evt);
            }
        });
        intro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introActionPerformed(evt);
            }
        });
        jPanel3.add(intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        story.setBackground(new java.awt.Color(0, 0, 0));
        story.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        story.setForeground(new java.awt.Color(255, 102, 102));
        story.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-repository-30.png"))); // NOI18N
        story.setText("Stories");
        story.setBorderPainted(false);
        story.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        story.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storyMouseExited(evt);
            }
        });
        story.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storyActionPerformed(evt);
            }
        });
        jPanel3.add(story, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        logout.setBackground(new java.awt.Color(0, 0, 0));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 102, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-sign-out-30.png"))); // NOI18N
        logout.setText("Log out");
        logout.setBorderPainted(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        like.setBackground(new java.awt.Color(0, 0, 0));
        like.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        like.setForeground(new java.awt.Color(255, 102, 102));
        like.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        like.setText("Liked");
        like.setBorderPainted(false);
        like.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        like.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                likeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                likeMouseExited(evt);
            }
        });
        like.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeActionPerformed(evt);
            }
        });
        jPanel3.add(like, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        info.setBackground(new java.awt.Color(0, 0, 0));
        info.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        info.setForeground(new java.awt.Color(255, 102, 102));
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        info.setText("Info");
        info.setBorderPainted(false);
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoMouseExited(evt);
            }
        });
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel3.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 40));

        setting.setBackground(new java.awt.Color(0, 0, 0));
        setting.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        setting.setForeground(new java.awt.Color(255, 102, 102));
        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-settings-30.png"))); // NOI18N
        setting.setText("Setting");
        setting.setBorderPainted(false);
        setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingMouseExited(evt);
            }
        });
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        jPanel3.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 460));

        jDesktopPane1.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 660, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingActionPerformed

    private void introMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_introMouseEntered
        intro.setBackground(Color.white);
    }//GEN-LAST:event_introMouseEntered

    private void introMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_introMouseExited
         intro.setBackground(Color.black);
    }//GEN-LAST:event_introMouseExited

    private void storyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storyMouseEntered
        // TODO add your handling code here:
        story.setBackground(Color.white);
    }//GEN-LAST:event_storyMouseEntered

    private void storyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storyMouseExited
       story.setBackground(Color.black);
    }//GEN-LAST:event_storyMouseExited

    private void likeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_likeMouseEntered
        // TODO add your handling code here:
        like.setBackground(Color.white);
    }//GEN-LAST:event_likeMouseEntered

    private void likeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_likeMouseExited
        // TODO add your handling code here:
        like.setBackground(Color.black);
    }//GEN-LAST:event_likeMouseExited

    private void infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseEntered
        // TODO add your handling code here:
        info.setBackground(Color.white);
    }//GEN-LAST:event_infoMouseEntered

    private void infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseExited
        // TODO add your handling code here:
        info.setBackground(Color.black);
    }//GEN-LAST:event_infoMouseExited

    private void settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseEntered
        // TODO add your handling code here:
        setting.setBackground(Color.white);
    }//GEN-LAST:event_settingMouseEntered

    private void settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseExited
        // TODO add your handling code here:
         setting.setBackground(Color.black);
    }//GEN-LAST:event_settingMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
       logout.setBackground(Color.white);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        logout.setBackground(Color.black);
    }//GEN-LAST:event_logoutMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void storyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storyActionPerformed
        HangTruyen hangtruyen = new HangTruyen();
        hangtruyen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_storyActionPerformed

    private void likeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeActionPerformed
      // liked like = new liked();
       jDesktopPane1.removeAll();
       jDesktopPane1.add(likee).setVisible(true);
    }//GEN-LAST:event_likeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        Story str = new Story();
        str.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
      // Info info = new Info();
       jDesktopPane1.removeAll();
       jDesktopPane1.add(infoo).setVisible(true);
       Name.setText(infoo.getName());
    }//GEN-LAST:event_infoActionPerformed

    private void introActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introActionPerformed
      // Intro intro = new Intro();
       jDesktopPane1.removeAll();
       jDesktopPane1.add(introo).setVisible(true);
    }//GEN-LAST:event_introActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JButton info;
    private javax.swing.JButton intro;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton like;
    private javax.swing.JButton logout;
    private javax.swing.JButton setting;
    private javax.swing.JButton story;
    // End of variables declaration//GEN-END:variables

    public void setName(String name) {
        this.Name.setText(name);
    }
}
