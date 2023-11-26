package com.mycompany.projectuts.view.user;

import com.mycompany.projectuts.MainApp;
import javax.swing.JOptionPane;

public class UserProfile extends javax.swing.JPanel {

    private MainApp app;

    public UserProfile(MainApp app) {
        initComponents();
        this.app = app;
        txtUsername.setText(app.getStore().getUser(app.indexCurrentUser).getUsername());
        txtPassword.setText(app.getStore().getUser(app.indexCurrentUser).getPassword());
        txtAddress.setText(app.getStore().getUser(app.indexCurrentUser).getAddress());
        txtNotelp.setText(app.getStore().getUser(app.indexCurrentUser).getNoTelp());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        navProducts = new javax.swing.JLabel();
        navWallet = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        navPurchases = new javax.swing.JLabel();
        navProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNotelp = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 241, 241));

        jPanel1.setBackground(new java.awt.Color(20, 108, 148));

        lbHeader.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        lbHeader.setForeground(new java.awt.Color(255, 255, 255));
        lbHeader.setText("YAMA STORE");

        navProducts.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        navProducts.setForeground(new java.awt.Color(255, 255, 255));
        navProducts.setText("Products");
        navProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navProductsMouseClicked(evt);
            }
        });

        navWallet.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        navWallet.setForeground(new java.awt.Color(255, 255, 255));
        navWallet.setText("My Wallet");
        navWallet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navWalletMouseClicked(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
        });

        navPurchases.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        navPurchases.setForeground(new java.awt.Color(255, 255, 255));
        navPurchases.setText("My Purchase");
        navPurchases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navPurchasesMouseClicked(evt);
            }
        });

        navProfile.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        navProfile.setForeground(new java.awt.Color(255, 255, 255));
        navProfile.setText("Profile");
        navProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbHeader)
                .addGap(34, 34, 34)
                .addComponent(navProducts)
                .addGap(18, 18, 18)
                .addComponent(navWallet)
                .addGap(18, 18, 18)
                .addComponent(navPurchases)
                .addGap(18, 18, 18)
                .addComponent(navProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHeader)
                    .addComponent(navProducts)
                    .addComponent(navWallet)
                    .addComponent(btnLogout)
                    .addComponent(navPurchases)
                    .addComponent(navProfile))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("My profile");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Username");

        txtUsername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Password");

        txtPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Address");

        txtAddress.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("No Telp");

        txtNotelp.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        btnSave.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnSave.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        btnCancel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        btnCancel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9))
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(txtPassword)
                                .addComponent(txtAddress)
                                .addComponent(txtNotelp)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(0, 163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void navProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProductsMouseClicked
        // TODO add your handling code here:
        app.showHomeUser();
    }//GEN-LAST:event_navProductsMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        app.showLoginView();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void navPurchasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navPurchasesMouseClicked
        // TODO add your handling code here:
        app.showUserPurchase();
    }//GEN-LAST:event_navPurchasesMouseClicked

    private void navProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProfileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_navProfileMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String address = txtAddress.getText();
        String noTelp = txtNotelp.getText();

        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Username dan password tidak boleh kosong", 
                    "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        app.getStore().getUser(app.indexCurrentUser).setUsername(username);
        app.getStore().getUser(app.indexCurrentUser).setPassword(password);
        app.getStore().getUser(app.indexCurrentUser).setAddress(address);
        app.getStore().getUser(app.indexCurrentUser).setNoTelp(noTelp);
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        String address = app.getStore().getUser(app.indexCurrentUser).getAddress();
        String noTelp = app.getStore().getUser(app.indexCurrentUser).getNoTelp();

        txtAddress.setText(address);
        txtNotelp.setText(noTelp);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void navWalletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navWalletMouseClicked
        // TODO add your handling code here:
        app.showUserWallet();
    }//GEN-LAST:event_navWalletMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel navProducts;
    private javax.swing.JLabel navProfile;
    private javax.swing.JLabel navPurchases;
    private javax.swing.JLabel navWallet;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtNotelp;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
