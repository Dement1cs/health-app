package HealthApp;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *@author  @author Morris Ouedraogo
 * 29/11/2023
 */

public class EntryForm extends JFrame{
    private ArrayList<EntryForm> EntryForms;

    
    public EntryForm() {
        
        initComponents();
        FatJbl.setVisible(false);
        Kcal.setVisible(false);
        Bmi.setVisible(false);
        CalJbl.setVisible(false);
        
        EntryForms = new ArrayList<>();
  
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPanel = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        About = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Weight = new javax.swing.JLabel();
        Height = new javax.swing.JLabel();
        genline = new javax.swing.JTextField();
        ageline = new javax.swing.JTextField();
        Weigh = new javax.swing.JTextField();
        Heightline = new javax.swing.JTextField();
        Confirm = new javax.swing.JButton();
        CalJbl = new javax.swing.JLabel();
        Kcal = new javax.swing.JButton();
        FatJbl = new javax.swing.JLabel();
        Bmi = new javax.swing.JButton();
        FAQ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(710, 509));

        BackPanel.setBackground(new java.awt.Color(255, 255, 255));

        Panel.setBackground(new java.awt.Color(255, 153, 0));

        About.setFont(new java.awt.Font("Copperplate", 0, 48)); // NOI18N
        About.setText("MyHealthApp Checker");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(About)
                .addGap(87, 87, 87))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        gender.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        gender.setText("Gender");

        Age.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Age.setText("Age");

        Weight.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Weight.setText("Weight Kg");

        Height.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Height.setText("Height CM");

        genline.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        genline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genlineActionPerformed(evt);
            }
        });

        ageline.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        ageline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agelineActionPerformed(evt);
            }
        });

        Weigh.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Weigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeighActionPerformed(evt);
            }
        });

        Heightline.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Heightline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightlineActionPerformed(evt);
            }
        });

        Confirm.setBackground(new java.awt.Color(255, 153, 0));
        Confirm.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        CalJbl.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        CalJbl.setText("Check my Calorie InTake");

        Kcal.setBackground(new java.awt.Color(255, 153, 51));
        Kcal.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Kcal.setText("KCAL");
        Kcal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KcalActionPerformed(evt);
            }
        });

        FatJbl.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        FatJbl.setText("Check my body Fat");

        Bmi.setBackground(new java.awt.Color(255, 153, 0));
        Bmi.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Bmi.setText("BMI");
        Bmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmiActionPerformed(evt);
            }
        });

        FAQ.setBackground(new java.awt.Color(255, 153, 0));
        FAQ.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        FAQ.setText("FAQ");
        FAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender)
                            .addComponent(Age)
                            .addComponent(Weight)
                            .addComponent(Height))
                        .addGap(31, 31, 31)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(genline)
                            .addComponent(ageline)
                            .addComponent(Weigh)
                            .addComponent(Heightline, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CalJbl)
                            .addComponent(FatJbl, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Bmi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Kcal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender)
                            .addComponent(genline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age)
                            .addComponent(ageline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalJbl))
                        .addGap(36, 36, 36)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Weight)
                            .addComponent(Weigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Kcal)))
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Height)
                            .addComponent(Heightline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FatJbl)
                            .addComponent(Bmi))))
                .addGap(35, 35, 35)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirm)
                    .addComponent(FAQ))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeightlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightlineActionPerformed
         
    }//GEN-LAST:event_HeightlineActionPerformed

    private void WeighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeighActionPerformed
             
    }//GEN-LAST:event_WeighActionPerformed
 
    private void genlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genlineActionPerformed
                
    }//GEN-LAST:event_genlineActionPerformed

    private void agelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agelineActionPerformed
            
    }//GEN-LAST:event_agelineActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
       
        EntryF e = new EntryF() {
        
        public void computeIntake(){
      
        }
    };
         e.setValues(genline.getText(), ageline.getText(), 
                Double.parseDouble(Weigh.getText()), Double.parseDouble(Heightline.getText()));
    
         JOptionPane.showMessageDialog(null,"MyHealth Info \n" + e.getDetails());
         
            FatJbl.setVisible(true);
            Kcal.setVisible(true);
            Bmi.setVisible(true);
            CalJbl.setVisible(true);
  
    }//GEN-LAST:event_ConfirmActionPerformed

    private void KcalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KcalActionPerformed
         
        try{
        
            Calorie c = new Calorie() {};
             
            c.setGender(genline.getText());
            c.setAge(ageline.getText());
            c.setWeight(Double.parseDouble(Weigh.getText()));
            c.setHeight(Double.parseDouble(Heightline.getText()));

            c.computeIntake();

            // Display the details using a JOptionPane
            JOptionPane.showMessageDialog(null, " Your Caloric Intake \n" + c.getBmr()+ " Kcal ");
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter your weight and height");
      }
    }//GEN-LAST:event_KcalActionPerformed

    private void BmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmiActionPerformed
      try{
        // Create an instance of FatTips to calculate BMI
        FatTips f = new FatTips(){};
        
        f.setGender(genline.getText());
        f.setAge(ageline.getText());
        f.setWeight(Double.parseDouble(Weigh.getText()));
        f.setHeight(Double.parseDouble(Heightline.getText()));

        // Calculate BMI Percentage
        
       f.computeBmiPercentage();

        // Display BMI details
            JOptionPane.showMessageDialog(null, " Your BMI percentage " + f.getBmiPercentage()+ "%");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter your weight and height.");
        }
    }//GEN-LAST:event_BmiActionPerformed

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
        
        FAQGUI faqGUI = new FAQGUI();
        faqGUI.setVisible(true);
    }//GEN-LAST:event_FAQActionPerformed
     
    public static void main(String args[]) {
    
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
            java.util.logging.Logger.getLogger(EntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(() -> {
            new EntryForm().setVisible(true);
        }); 
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel About;
    private javax.swing.JLabel Age;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JButton Bmi;
    private javax.swing.JLabel CalJbl;
    private javax.swing.JButton Confirm;
    private javax.swing.JButton FAQ;
    private javax.swing.JLabel FatJbl;
    private javax.swing.JLabel Height;
    private javax.swing.JTextField Heightline;
    private javax.swing.JButton Kcal;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField Weigh;
    private javax.swing.JLabel Weight;
    private javax.swing.JTextField ageline;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField genline;
    // End of variables declaration//GEN-END:variables

}

