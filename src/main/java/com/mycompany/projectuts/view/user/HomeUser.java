package com.mycompany.projectuts.view.user;

import com.mycompany.projectuts.MainApp;
import com.mycompany.projectuts.entity.Item;
import com.mycompany.projectuts.entity.OrderItem;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class HomeUser extends javax.swing.JPanel {

    private MainApp app;

    public HomeUser(MainApp app) {
        initComponents();
        this.app = app;
        tampilProducts();

        txtId.setEditable(false);
        txtName.setEditable(false);
        txtSize.setEditable(false);
        txtPrice.setEditable(false);
        txtStock.setEditable(false);
        txtCategory.setEditable(false);
    }

    public void bersihkan() {
        txtId.setText("");
        txtName.setText("");
        txtSize.setText("");
        txtPrice.setText("");
        txtStock.setText("");
        txtCategory.setText("");
        txtQuantity.setText("");
    }

    public void tampilProducts() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Id Poduct");
        model.addColumn("Name");
        model.addColumn("Size");
        model.addColumn("Price");
        model.addColumn("Stock");
        model.addColumn("Category");

        model.setRowCount(0);
        for (int i = 0; i < app.getStore().getJumlahItem(); i++) {
            model.addRow(new Object[]{
                i + 1,
                app.getStore().getItem(i).getId(),
                app.getStore().getItem(i).getName(),
                app.getStore().getItem(i).getSize(),
                app.getStore().getItem(i).getPrice(),
                app.getStore().getItem(i).getStock(),
                app.getStore().getItem(i).getCategory(),});
        }

        tblProducts.setModel(model);

        TableColumn column;
        for (int i = 0; i < tblProducts.getColumnCount(); i++) {
            column = tblProducts.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            } else {
                column.setPreferredWidth(150);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        navWallet = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        navPuchase = new javax.swing.JLabel();
        navProfile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnBuy = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbPayment = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(246, 241, 241));

        jPanel1.setBackground(new java.awt.Color(20, 108, 148));

        lbHeader.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        lbHeader.setForeground(new java.awt.Color(255, 255, 255));
        lbHeader.setText("YAMA STORE");

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Products");

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

        navPuchase.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        navPuchase.setForeground(new java.awt.Color(255, 255, 255));
        navPuchase.setText("My Purchase");
        navPuchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navPuchaseMouseClicked(evt);
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
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(navWallet)
                .addGap(18, 18, 18)
                .addComponent(navPuchase)
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
                    .addComponent(jLabel2)
                    .addComponent(navWallet)
                    .addComponent(btnLogout)
                    .addComponent(navPuchase)
                    .addComponent(navProfile))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Id Product", "Name", "Size", "Price", "Stock", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("All Products");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Id");

        txtId.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Name");

        txtName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Size");

        txtPrice.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtStock.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Category");

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Stock");

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Price");

        txtSize.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtCategory.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Quantity");

        txtQuantity.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        btnBuy.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnBuy.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnBuy.setText("Buy");
        btnBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuyMouseClicked(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Payment Method");

        cbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COD", "YamaPay" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId)
                                    .addComponent(txtName)
                                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(cbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCancel))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPrice)
                                .addComponent(txtStock)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuy)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        app.showLoginView();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblProducts.getSelectedRow();
        txtId.setText(tblProducts.getValueAt(selectedRow, 1).toString());
        txtName.setText(tblProducts.getValueAt(selectedRow, 2).toString());
        txtSize.setText(tblProducts.getValueAt(selectedRow, 3).toString());
        txtPrice.setText(tblProducts.getValueAt(selectedRow, 4).toString());
        txtStock.setText(tblProducts.getValueAt(selectedRow, 5).toString());
        txtCategory.setText(tblProducts.getValueAt(selectedRow, 6).toString());
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnBuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseClicked
        // TODO add your handling code here:
        String id = txtId.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Pilih produk dulu");
            return;
        }
        int quantity = 0;
        try {
            quantity = Integer.parseInt(txtQuantity.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Quantitiy tidak valid!",
                    "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int indexItem = app.getStore().getIndexItem(id);
        String name = txtName.getText();
        int price = Integer.parseInt(txtPrice.getText());
        int stock = Integer.parseInt(txtQuantity.getText());
        String size = txtSize.getText();
        String category = txtCategory.getText();
        String payment = cbPayment.getSelectedItem().toString();
        String username = app.getStore().getUser(app.indexCurrentUser).getUsername();
        LocalDateTime orderDate = LocalDateTime.now();
        int sumPrice = quantity * price;

        if (payment.equals("YamaPay")) {
            if (!app.getStore().getUser(app.indexCurrentUser).getTabungan().ambilUang(sumPrice)) {
                JOptionPane.showMessageDialog(null, "Saldo tidak cukup");
                return;
            }
        }
        if (app.getStore().getItem(indexItem).buyItem(quantity)) {
            OrderItem purchase = new OrderItem(id, name, size, price, stock, category, username, payment, orderDate);            
            app.getStore().getUser(app.indexCurrentUser).addPurchase(purchase);
            app.getStore().addSoldItem(purchase);
            JOptionPane.showMessageDialog(null, "Pemebelian barang berhasil");
            tampilProducts();
            bersihkan();
        } else {
            JOptionPane.showMessageDialog(null, "Stok tidak cukup");
        }
    }//GEN-LAST:event_btnBuyMouseClicked

    private void navPuchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navPuchaseMouseClicked
        // TODO add your handling code here:
        app.showUserPurchase();
    }//GEN-LAST:event_navPuchaseMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        bersihkan();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void navWalletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navWalletMouseClicked
        // TODO add your handling code here:
        app.showUserWallet();
    }//GEN-LAST:event_navWalletMouseClicked

    private void navProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProfileMouseClicked
        // TODO add your handling code here:
        app.showUserProfile();
    }//GEN-LAST:event_navProfileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cbPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel navProfile;
    private javax.swing.JLabel navPuchase;
    private javax.swing.JLabel navWallet;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
