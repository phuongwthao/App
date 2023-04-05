
package main;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public final class Story extends javax.swing.JFrame {

    
    public Story() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border j = BorderFactory.createMatteBorder(4, 4, 4, 4, Color.white);
        jPanel3_Title.setBorder(j);
      
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3_Title = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1_username = new javax.swing.JLabel();
        jLabel3_pass = new javax.swing.JLabel();
        jTextField1_user = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1_login = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3_Title.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Hãy đăng nhập nhé ^ _ ^");

        javax.swing.GroupLayout jPanel3_TitleLayout = new javax.swing.GroupLayout(jPanel3_Title);
        jPanel3_Title.setLayout(jPanel3_TitleLayout);
        jPanel3_TitleLayout.setHorizontalGroup(
            jPanel3_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3_TitleLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel3_TitleLayout.setVerticalGroup(
            jPanel3_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel1_username.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive - ptit.edu.vn\\Desktop\\dinasour.png")); // NOI18N

        jLabel3_pass.setIcon(new javax.swing.ImageIcon("D:\\ảnh\\Saved Pictures\\images.png")); // NOI18N

        jTextField1_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_user.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1_user.setText("username");
        jTextField1_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_userFocusLost(evt);
            }
        });
        jTextField1_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_userActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("password");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1_login.setBackground(new java.awt.Color(0, 204, 0));
        jButton1_login.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jButton1_login.setText("Login");
        jButton1_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1_loginMouseExited(evt);
            }
        });
        jButton1_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_loginActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-macos-close-15.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jButton1_login, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1_username)
                            .addComponent(jLabel3_pass))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1_user, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTextField1_user, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1_username)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3_pass)))
                .addGap(15, 15, 15)
                .addComponent(jButton1_login)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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

    private void jTextField1_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_userActionPerformed

    private void jTextField1_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_userFocusGained
        if(jTextField1_user.getText().trim().toLowerCase().equals("username"))
        {
            jTextField1_user.setText("");
            jTextField1_user.setForeground(Color.black);
        }
        Border j = BorderFactory.createMatteBorder(2,2, 2, 2, Color.green);
        jLabel1_username.setBorder(j);
    }//GEN-LAST:event_jTextField1_userFocusGained

    private void jTextField1_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_userFocusLost
        if(jTextField1_user.getText().trim().equals("")||
                jTextField1_user.getText().trim().toLowerCase().equals("username"))
        {
            jTextField1_user.setText("username");
            jTextField1_user.setForeground(new Color(153,153,153));
        }
        jLabel1_username.setBorder(null);
    }//GEN-LAST:event_jTextField1_userFocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
       String pass = String.valueOf(jPasswordField1.getPassword());
        if(pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.black);
        }
        Border j = BorderFactory.createMatteBorder(2,2, 2, 2, Color.green);
        jLabel3_pass.setBorder(j);
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
         String pass = String.valueOf(jPasswordField1.getPassword());
         if(pass.trim().equals("")||
                pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField1.setText("password");
            jPasswordField1.setForeground(new Color(153,153,153));
        }
        jLabel3_pass.setBorder(null);
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_loginActionPerformed
        StringBuilder sb = new StringBuilder();
        String username = jTextField1_user.getText();
        String password = new String(jPasswordField1.getPassword());
        if(username.equals("username")||username.equals("")){
            sb.append("Username is empty\n");
        }
        if(password.equals("")||password.equals("password")){
            sb.append("Password is empty\n");
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString(),"Invalidation",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(username.equals("PhuongThao")&&password.equals("24012003")){
            Home h = new Home();
            h.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1_loginActionPerformed

    private void jButton1_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_loginMouseExited
      jButton1_login.setBackground(new Color(153,255,102 ));
    }//GEN-LAST:event_jButton1_loginMouseExited

    private void jButton1_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_loginMouseEntered
       jButton1_login.setBackground(Color.green);
    }//GEN-LAST:event_jButton1_loginMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton1.setBackground(Color.red);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.white);
    }//GEN-LAST:event_jButton1MouseExited

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Story().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_login;
    private javax.swing.JLabel jLabel1_username;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3_pass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3_Title;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1_user;
    // End of variables declaration//GEN-END:variables
}
