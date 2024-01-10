
package HealthApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author zador
 */
public class ProfileGUI extends javax.swing.JFrame {
    private ArrayList<User> users = new ArrayList<>();

    /**
     * Creates new form Profile
     */
    public ProfileGUI() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        emailTf = new javax.swing.JTextField();
        heightTf = new javax.swing.JTextField();
        ProfileLbl = new javax.swing.JLabel();
        weightTf = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        descriptionTf = new javax.swing.JTextField();
        sNameLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        heightLbl = new javax.swing.JLabel();
        addButt = new javax.swing.JButton();
        weightLbl = new javax.swing.JLabel();
        searchButt = new javax.swing.JButton();
        descriptionLbl = new javax.swing.JLabel();
        deleteButt = new javax.swing.JButton();
        nameTf = new javax.swing.JTextField();
        sNameTf = new javax.swing.JTextField();
        dobLbl = new javax.swing.JLabel();
        dobTf = new javax.swing.JTextField();
        displayButt = new javax.swing.JButton();
        defotRadButt = new javax.swing.JRadioButton();
        specialistRadButt = new javax.swing.JRadioButton();
        SpecializationLbl = new javax.swing.JLabel();
        SpecializationTf = new javax.swing.JTextField();
        saveButt = new javax.swing.JButton();
        loadButt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(252, 186, 3));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        emailTf.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        emailTf.setForeground(new java.awt.Color(102, 102, 102));
        emailTf.setBorder(null);

        heightTf.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        heightTf.setForeground(new java.awt.Color(102, 102, 102));
        heightTf.setBorder(null);

        ProfileLbl.setFont(new java.awt.Font("Copperplate", 1, 36)); // NOI18N
        ProfileLbl.setForeground(new java.awt.Color(255, 255, 255));
        ProfileLbl.setText("Profile");

        weightTf.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        weightTf.setForeground(new java.awt.Color(102, 102, 102));
        weightTf.setBorder(null);

        nameLbl.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setText("Name:");

        descriptionTf.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descriptionTf.setForeground(new java.awt.Color(102, 102, 102));
        descriptionTf.setBorder(null);
        descriptionTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTfActionPerformed(evt);
            }
        });

        sNameLbl.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        sNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        sNameLbl.setText("Second Name:");

        idLbl.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        idLbl.setForeground(new java.awt.Color(255, 255, 255));
        idLbl.setText("ID:");

        emailLbl.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(255, 255, 255));
        emailLbl.setText("Email:");

        idTf.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        idTf.setForeground(new java.awt.Color(102, 102, 102));
        idTf.setBorder(null);
        idTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTfActionPerformed(evt);
            }
        });

        heightLbl.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        heightLbl.setForeground(new java.awt.Color(255, 255, 255));
        heightLbl.setText("Height:");

        addButt.setBackground(new java.awt.Color(102, 255, 102));
        addButt.setFont(new java.awt.Font("Copperplate", 1, 14)); // NOI18N
        addButt.setForeground(new java.awt.Color(102, 102, 102));
        addButt.setText("Add");
        addButt.setBorder(null);
        addButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtActionPerformed(evt);
            }
        });

        weightLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        weightLbl.setForeground(new java.awt.Color(255, 255, 255));
        weightLbl.setText("Weight:");

        searchButt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        searchButt.setForeground(new java.awt.Color(102, 102, 102));
        searchButt.setText("Search");
        searchButt.setBorder(null);
        searchButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtActionPerformed(evt);
            }
        });

        descriptionLbl.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        descriptionLbl.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLbl.setText("Description:");

        deleteButt.setBackground(new java.awt.Color(255, 51, 51));
        deleteButt.setFont(new java.awt.Font("Copperplate", 1, 14)); // NOI18N
        deleteButt.setForeground(new java.awt.Color(102, 102, 102));
        deleteButt.setText("Delete");
        deleteButt.setBorder(null);
        deleteButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtActionPerformed(evt);
            }
        });

        nameTf.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        nameTf.setForeground(new java.awt.Color(102, 102, 102));
        nameTf.setBorder(null);
        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        sNameTf.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        sNameTf.setForeground(new java.awt.Color(102, 102, 102));
        sNameTf.setBorder(null);
        sNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameTfActionPerformed(evt);
            }
        });

        dobLbl.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        dobLbl.setForeground(new java.awt.Color(255, 255, 255));
        dobLbl.setText("Date of  birth:");

        dobTf.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        dobTf.setForeground(new java.awt.Color(102, 102, 102));
        dobTf.setBorder(null);

        displayButt.setFont(new java.awt.Font("Copperplate", 1, 14)); // NOI18N
        displayButt.setForeground(new java.awt.Color(102, 102, 102));
        displayButt.setText("Dispaly");
        displayButt.setBorder(null);
        displayButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtActionPerformed(evt);
            }
        });

        defotRadButt.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(defotRadButt);
        defotRadButt.setFont(new java.awt.Font("Copperplate", 1, 14)); // NOI18N
        defotRadButt.setForeground(new java.awt.Color(102, 102, 102));
        defotRadButt.setText("Defolt");
        defotRadButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defotRadButtActionPerformed(evt);
            }
        });

        specialistRadButt.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(specialistRadButt);
        specialistRadButt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        specialistRadButt.setForeground(new java.awt.Color(102, 102, 102));
        specialistRadButt.setText("Specialist");
        specialistRadButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialistRadButtActionPerformed(evt);
            }
        });

        SpecializationLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SpecializationLbl.setForeground(new java.awt.Color(255, 255, 255));
        SpecializationLbl.setText("Specialization:");

        SpecializationTf.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        SpecializationTf.setForeground(new java.awt.Color(102, 102, 102));
        SpecializationTf.setBorder(null);

        saveButt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        saveButt.setForeground(new java.awt.Color(102, 102, 102));
        saveButt.setText("Save");
        saveButt.setBorder(null);
        saveButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtActionPerformed(evt);
            }
        });

        loadButt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loadButt.setForeground(new java.awt.Color(102, 102, 102));
        loadButt.setText("Load");
        loadButt.setBorder(null);
        loadButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl)
                            .addComponent(sNameLbl)
                            .addComponent(dobLbl))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sNameTf)
                            .addComponent(nameTf)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ProfileLbl)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(descriptionLbl)
                            .addComponent(weightLbl)
                            .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLbl)
                            .addComponent(SpecializationLbl)
                            .addComponent(saveButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(displayButt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteButt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(loadButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(specialistRadButt, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(defotRadButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailTf)
                                    .addComponent(heightTf)
                                    .addComponent(weightTf)
                                    .addComponent(descriptionTf)
                                    .addComponent(dobTf)
                                    .addComponent(SpecializationTf))))))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProfileLbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sNameLbl)
                    .addComponent(sNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLbl)
                    .addComponent(dobTf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLbl)
                    .addComponent(heightTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SpecializationTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayButt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defotRadButt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(specialistRadButt)
                            .addComponent(saveButt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadButt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SpecializationLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameTfActionPerformed

    private void descriptionTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTfActionPerformed

    private void idTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTfActionPerformed

    private void addButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtActionPerformed
        // TODO add your handling code here:
        if (defotRadButt.isSelected()) {
        User user = new User();
        user.setName(nameTf.getText());
        user.setsName(sNameTf.getText());
        user.setId(idTf.getText());
        user.setDob(dobTf.getText());
        user.setEmail(emailTf.getText());
        user.setHeight(Integer.parseInt(heightTf.getText()));
        user.setWeight(Double.parseDouble(weightTf.getText()));
        user.setDescription(descriptionTf.getText());
        users.add(user);
    } else if (specialistRadButt.isSelected()) {
        SpecialProfile user = new SpecialProfile();
        user.setName(nameTf.getText());
        user.setsName(sNameTf.getText());
        user.setId(idTf.getText());
        user.setDob(dobTf.getText());
        user.setEmail(emailTf.getText());
        user.setHeight(Integer.parseInt(heightTf.getText()));
        user.setWeight(Double.parseDouble(weightTf.getText())); 
        user.setDescription(descriptionTf.getText());
        user.setSpecialization(SpecializationTf.getText());
        users.add(user);
    } else {
        JOptionPane.showMessageDialog(null, "Please select a profile type");
    }
    }//GEN-LAST:event_addButtActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void searchButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtActionPerformed
        // TODO add your handling code here:
        if (users.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Sorry, there are no users to search");
        } else {
            String searchTerm = JOptionPane.showInputDialog(null, "Please enter an ID or Email to search for");
            boolean found = false;
            for (User user : users) {
                if (user.getId().equalsIgnoreCase(searchTerm) || user.getEmail().equalsIgnoreCase(searchTerm)) {
                    JOptionPane.showMessageDialog(null, user.getDetails());
                    found = true;
                    break; 
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(null, "User with ID or Email " + searchTerm + " not found");
            }
        }
    }//GEN-LAST:event_searchButtActionPerformed

    private void displayButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtActionPerformed
        // TODO add your handling code here:
        if (users.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Sorry, there are no users to display");
        } else {
            StringBuilder userDetails = new StringBuilder();
            for (User user : users) {
                userDetails.append(user.getDetails()).append("\n\n");
            }
            JOptionPane.showMessageDialog(null, userDetails.toString());
        }
    }//GEN-LAST:event_displayButtActionPerformed

    private void deleteButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtActionPerformed
        // TODO add your handling code here:
        if (users.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Sorry, there are no users to delete");
        } else {
            String searchTerm = JOptionPane.showInputDialog(null, "Please enter an ID or Email to delete");
            User userToRemove = null;
            for (User user : users) {
                if (user.getId().equalsIgnoreCase(searchTerm) || user.getEmail().equalsIgnoreCase(searchTerm)) {
                    userToRemove = user;
                    break; 
                }
            }
            if (userToRemove != null) {
                users.remove(userToRemove);
                JOptionPane.showMessageDialog(null, userToRemove.getDetails() + " has been deleted.");
            } else {
                JOptionPane.showMessageDialog(null, "User with ID or Email " + searchTerm + " not found");
            }
        }
    }//GEN-LAST:event_deleteButtActionPerformed

    private void defotRadButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defotRadButtActionPerformed
        // TODO add your handling code here:
        nameLbl.setVisible(true);
        nameTf.setVisible(true);
        sNameLbl.setVisible(true);
        sNameTf.setVisible(true);
        dobLbl.setVisible(true);
        dobTf.setVisible(true);
        idLbl.setVisible(true);
        idTf.setVisible(true);
        emailLbl.setVisible(true);
        emailTf.setVisible(true);
        heightLbl.setVisible(true);
        heightTf.setVisible(true);
        weightLbl.setVisible(true);
        weightTf.setVisible(true);
        descriptionLbl.setVisible(true);
        descriptionTf.setVisible(true);
        SpecializationLbl.setVisible(false);
        SpecializationTf.setVisible(false);
        
    }//GEN-LAST:event_defotRadButtActionPerformed

    private void specialistRadButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialistRadButtActionPerformed
        // TODO add your handling code here:
        nameLbl.setVisible(true);
        nameTf.setVisible(true);
        sNameLbl.setVisible(true);
        sNameTf.setVisible(true);
        dobLbl.setVisible(true);
        dobTf.setVisible(true);
        idLbl.setVisible(true);
        idTf.setVisible(true);
        emailLbl.setVisible(true);
        emailTf.setVisible(true);
        heightLbl.setVisible(true);
        heightTf.setVisible(true);
        weightLbl.setVisible(true);
        weightTf.setVisible(true);
        descriptionLbl.setVisible(true);
        descriptionTf.setVisible(true);
        SpecializationLbl.setVisible(true);
        SpecializationTf.setVisible(true);
    }//GEN-LAST:event_specialistRadButtActionPerformed

    private void loadButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtActionPerformed
        // TODO add your handling code here:
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            f = new File("output.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            
            users = (ArrayList<User>) oStream.readObject();
            oStream.close();
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_loadButtActionPerformed

    private void saveButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtActionPerformed
        // TODO add your handling code here:
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            f = new File("output.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(users);
            oStream.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_saveButtActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProfileLbl;
    private javax.swing.JLabel SpecializationLbl;
    private javax.swing.JTextField SpecializationTf;
    private javax.swing.JButton addButt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton defotRadButt;
    private javax.swing.JButton deleteButt;
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JTextField descriptionTf;
    private javax.swing.JButton displayButt;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JTextField dobTf;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel heightLbl;
    private javax.swing.JTextField heightTf;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loadButt;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel sNameLbl;
    private javax.swing.JTextField sNameTf;
    private javax.swing.JButton saveButt;
    private javax.swing.JButton searchButt;
    private javax.swing.JRadioButton specialistRadButt;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JTextField weightTf;
    // End of variables declaration//GEN-END:variables
}
