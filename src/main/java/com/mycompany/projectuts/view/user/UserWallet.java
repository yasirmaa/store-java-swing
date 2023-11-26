package com.mycompany.projectuts.view.user;

import com.mycompany.projectuts.MainApp;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class UserWallet extends javax.swing.JPanel {

    private MainApp app;
    private int typeMenu;
    private DecimalFormat formatRupiah = new DecimalFormat("###,###,###,###,##0.00");
    
    public UserWallet(MainApp app) {
        initComponents();
        this.app = app;
        updateInfo();
        jPanel5.setVisible(false);
    }

    public void updateInfo() {
        labelSaldo.setText("Rp" + formatRupiah.format(app.getStore().
                getUser(app.indexCurrentUser).getTabungan().getSaldo()));
    }

    public void bersihkan() {
        txtAmount.setText("");
        txtUsername.setText("");
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
        jPanel2 = new javax.swing.JPanel();
        labelSaldo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelTopup = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelTf = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtAmount = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

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

        navWallet.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        navWallet.setForeground(new java.awt.Color(255, 255, 255));
        navWallet.setText("My Wallet");

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

        navProfile.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
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

        jPanel2.setBackground(new java.awt.Color(175, 211, 226));

        labelSaldo.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(0, 0, 0));
        labelSaldo.setText("Rp 100000");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("YamaPay");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(labelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldo)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(175, 211, 226));

        labelTopup.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        labelTopup.setForeground(new java.awt.Color(0, 0, 0));
        labelTopup.setText("Top up");
        labelTopup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTopupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(labelTopup)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTopup)
                .addGap(37, 37, 37))
        );

        jPanel4.setBackground(new java.awt.Color(175, 211, 226));

        labelTf.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        labelTf.setForeground(new java.awt.Color(0, 0, 0));
        labelTf.setText("Transfer");
        labelTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTfMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(labelTf)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTf)
                .addGap(36, 36, 36))
        );

        jPanel5.setBackground(new java.awt.Color(175, 211, 226));

        txtAmount.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtAmount.setMinimumSize(new java.awt.Dimension(200, 32));
        txtAmount.setPreferredSize(new java.awt.Dimension(200, 32));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        lblAmount.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(0, 0, 0));
        lblAmount.setText("Amount");

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("Top up");

        btnClose.setText("x");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setText("Username");

        txtUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnSave.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmount)
                                    .addComponent(lblUsername))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
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

    private void labelTopupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTopupMouseClicked
        // TODO add your handling code here:
        jPanel5.setVisible(true);
        lblUsername.setVisible(false);
        txtUsername.setVisible(false);
        lblTitle.setText("Top up");
        typeMenu = 1;
    }//GEN-LAST:event_labelTopupMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void labelTfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTfMouseClicked
        // TODO add your handling code here:
        jPanel5.setVisible(true);
        lblUsername.setVisible(true);
        txtUsername.setVisible(true);
        lblTitle.setText("Transfer");
        typeMenu = 2;
    }//GEN-LAST:event_labelTfMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        int uang = 0;
        try {
            uang = Integer.parseInt(txtAmount.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid!",
                    "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (typeMenu == 1) {
            app.getStore().getUser(app.indexCurrentUser).getTabungan().simpanUang(uang);
            JOptionPane.showMessageDialog(null, "Top up berhasil");
            bersihkan();
            updateInfo();
        } else if (typeMenu == 2) {
            String username = txtUsername.getText();
            int indexTf = app.getStore().findUser(username);
            if (indexTf == -1) {
                JOptionPane.showMessageDialog(null, "User tidak ditemukann!", 
                        "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                if (app.getStore().getUser(app.indexCurrentUser).getTabungan().ambilUang(uang)) {
                    app.getStore().getUser(indexTf).getTabungan().simpanUang(uang);
                    JOptionPane.showMessageDialog(null, "Transfer berhasil");
                    bersihkan();
                    updateInfo();
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo tidak cukup");
                    return;
                }
            }
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        jPanel5.setVisible(false);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void navProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProfileMouseClicked
        // TODO add your handling code here:
        app.showUserProfile();
    }//GEN-LAST:event_navProfileMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        bersihkan();
    }//GEN-LAST:event_btnCancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelTf;
    private javax.swing.JLabel labelTopup;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel navProducts;
    private javax.swing.JLabel navProfile;
    private javax.swing.JLabel navPurchases;
    private javax.swing.JLabel navWallet;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
