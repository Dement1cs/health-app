package HealthApp;

import javax.swing.JOptionPane;

/**
 *
 * @author Morris Ouedraogo
 */

public class Login extends javax.swing.JFrame {
 
    private  String fname;
    private  String sname;

    public Login() {
        initComponents();
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPanel = new javax.swing.JPanel();
        OrangePanel = new javax.swing.JPanel();
        HealthApp = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Sname = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        Forum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackPanel.setPreferredSize(new java.awt.Dimension(710, 509));

        OrangePanel.setBackground(new java.awt.Color(255, 153, 0));

        HealthApp.setFont(new java.awt.Font("Copperplate", 0, 30)); // NOI18N
        HealthApp.setText("MyHealthApp");

        icon.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/health.jpeg"))); // NOI18N

        javax.swing.GroupLayout OrangePanelLayout = new javax.swing.GroupLayout(OrangePanel);
        OrangePanel.setLayout(OrangePanelLayout);
        OrangePanelLayout.setHorizontalGroup(
            OrangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrangePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HealthApp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(OrangePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(icon)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        OrangePanelLayout.setVerticalGroup(
            OrangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrangePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon)
                .addGap(31, 31, 31)
                .addComponent(HealthApp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        Fname.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        Sname.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        name1.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        name1.setText("First Name");

        name2.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        name2.setText("Second Name");

        Login.setBackground(new java.awt.Color(255, 153, 0));
        Login.setFont(new java.awt.Font("Copperplate", 0, 24)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 153, 0));
        Login.setText("Login");

        Start.setBackground(new java.awt.Color(255, 153, 0));
        Start.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Start.setText("start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        Profile.setBackground(new java.awt.Color(255, 153, 0));
        Profile.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Profile.setText("Profile");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });

        Forum.setBackground(new java.awt.Color(255, 153, 51));
        Forum.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Forum.setText("Forum");
        Forum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addComponent(OrangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Forum, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Profile)
                        .addGap(27, 27, 27))
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name2)
                            .addComponent(name1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(name1)
                .addGap(11, 11, 11)
                .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(name2)
                .addGap(7, 7, 7)
                .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Forum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
    
    fname = Fname.getText();
    sname = Sname.getText();
    
    JOptionPane.showMessageDialog(null," Welcome " + fname +" "+ sname);
    
    EntryForm myGUI = new EntryForm();
    myGUI.setVisible(true);
   
    }//GEN-LAST:event_StartActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        
        ProfileGUI profileGUI = new ProfileGUI();
         profileGUI.setVisible(true);
    }//GEN-LAST:event_ProfileActionPerformed

    private void ForumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForumActionPerformed
        
        ForumGUI forumGUI = new ForumGUI();
        forumGUI.setVisible(true);
    }//GEN-LAST:event_ForumActionPerformed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel;
    private javax.swing.JTextField Fname;
    private javax.swing.JButton Forum;
    private javax.swing.JLabel HealthApp;
    private javax.swing.JLabel Login;
    private javax.swing.JPanel OrangePanel;
    private javax.swing.JButton Profile;
    private javax.swing.JTextField Sname;
    private javax.swing.JButton Start;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    // End of variables declaration//GEN-END:variables
}
