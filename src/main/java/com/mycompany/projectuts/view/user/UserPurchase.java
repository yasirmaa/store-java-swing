package com.mycompany.projectuts.view.user;

import com.mycompany.projectuts.MainApp;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserPurchase extends javax.swing.JPanel {
    private MainApp app;

    public UserPurchase(MainApp app) {
        initComponents();
        this.app = app;
        tampilPembelian();
    }
    
    public void tampilPembelian(){
        int indexUser = app.indexCurrentUser;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Name");
        model.addColumn("Size");
        model.addColumn("Price");
        model.addColumn("Quantitiy");
        model.addColumn("Category");
        model.addColumn("payment");
        model.addColumn("Order date");
        model.addColumn("Delivery date");

        model.setRowCount(0);
        for (int i = 0; i < app.getStore().getUser(indexUser).getPurchasesAmount(); i++) {
            model.addRow(new Object[]{
                i + 1,
                app.getStore().getUser(indexUser).getPurchases(i).getName(),
                app.getStore().getUser(indexUser).getPurchases(i).getSize(),
                app.getStore().getUser(indexUser).getPurchases(i).getPrice(),
                app.getStore().getUser(indexUser).getPurchases(i).getStock(),
                app.getStore().getUser(indexUser).getPurchases(i).getCategory(),
                app.getStore().getUser(indexUser).getPurchases(i).getPayment(),
                app.getStore().getUser(indexUser).getPurchases(i).getOrderDate().format(formatter),
                app.getStore().getUser(indexUser).getPurchases(i).getDeliveryDate().format(formatter)
            });
        }

        tblPurchase.setModel(model);
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        navProducts = new javax.swing.JLabel();
        navWallet = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        navProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPurchase = new javax.swing.JTable();

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

        jLabel14.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("My Purchase");

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
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(navProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jLabel14)
                    .addComponent(navProfile))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("My Purchase");

        tblPurchase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPurchaseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPurchase);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        app.showLoginView();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void tblPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPurchaseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPurchaseMouseClicked

    private void navProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProductsMouseClicked
        // TODO add your handling code here:
        app.showHomeUser();
    }//GEN-LAST:event_navProductsMouseClicked

    private void navWalletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navWalletMouseClicked
        // TODO add your handling code here:
        app.showUserWallet();
    }//GEN-LAST:event_navWalletMouseClicked

    private void navProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProfileMouseClicked
        // TODO add your handling code here:
        app.showUserProfile();
    }//GEN-LAST:event_navProfileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel navProducts;
    private javax.swing.JLabel navProfile;
    private javax.swing.JLabel navWallet;
    private javax.swing.JTable tblPurchase;
    // End of variables declaration//GEN-END:variables
}
