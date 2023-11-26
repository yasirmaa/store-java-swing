package com.mycompany.projectuts.view.admin;

import com.mycompany.projectuts.MainApp;
import com.mycompany.projectuts.entity.Item;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class HomeAdmin extends javax.swing.JPanel {

    private MainApp app;

    public HomeAdmin(MainApp app) {
        initComponents();
        this.app = app;
        tampilProducts();
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }

    public void bersihkan() {
        txtId.setText("");
        txtName.setText("");
        txtSize.setSelectedIndex(0);
        txtPrice.setText("");
        txtStock.setText("");
        txtCategory.setSelectedIndex(0);
        
        txtId.setEditable(true);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnAdd.setEnabled(true);
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
            }else if(i == 1){
                column.setPreferredWidth(100);                
            }else if(i == 3){
                column.setPreferredWidth(50);                
            }else if(i == 5){
                column.setPreferredWidth(80);                
            }else {
                column.setPreferredWidth(150);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        navProducts = new javax.swing.JLabel();
        navUsers = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        navSold = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        labelProducts = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtSize = new javax.swing.JComboBox<>();
        txtCategory = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 241, 241));
        setForeground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel2.setBackground(new java.awt.Color(20, 108, 148));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 90));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("YAMA STORE");

        navProducts.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        navProducts.setForeground(new java.awt.Color(255, 255, 255));
        navProducts.setText("Products");

        navUsers.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        navUsers.setForeground(new java.awt.Color(255, 255, 255));
        navUsers.setText("Users");
        navUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navUsersMouseClicked(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        navSold.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        navSold.setForeground(new java.awt.Color(255, 255, 255));
        navSold.setText("Sold Item");
        navSold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navSoldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(navProducts)
                .addGap(18, 18, 18)
                .addComponent(navUsers)
                .addGap(18, 18, 18)
                .addComponent(navSold)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(navProducts)
                        .addComponent(navUsers)
                        .addComponent(navSold)))
                .addGap(18, 18, 18))
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
        ));
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);
        if (tblProducts.getColumnModel().getColumnCount() > 0) {
            tblProducts.getColumnModel().getColumn(0).setMaxWidth(40);
            tblProducts.getColumnModel().getColumn(2).setMinWidth(160);
            tblProducts.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        labelProducts.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        labelProducts.setForeground(new java.awt.Color(0, 0, 0));
        labelProducts.setText("Products");

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Id");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Size");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Price");

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Stock");

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Category");

        txtId.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtStock.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        btnAdd.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnAdd.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        txtSize.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));

        txtCategory.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shirt", "T-Shirt", "Pants", "Jackets" }));

        btnDelete.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        btnDelete.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnUpdate.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnUpdate.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProducts)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancel))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel6.getAccessibleContext().setAccessibleName("Name");
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        app.showLoginView();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        String id = txtId.getText();
        String name = txtName.getText();
        String priceText = txtPrice.getText();
        String stockText = txtStock.getText();
        String size = txtSize.getSelectedItem().toString();
        String category = txtCategory.getSelectedItem().toString();

        if(app.getStore().getIndexItem(id) != -1){
            JOptionPane.showMessageDialog(null, "Id produk telah ada!", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);            
            return;
        }
        if (id.equals("") || name.equals("") || size.equals("") || category.equals("") || priceText.equals("") || stockText.equals("")) {
            JOptionPane.showMessageDialog(null, "Data belum lengkap", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int price = 0;
        int stock = 0;

        if (!priceText.equals("") || !stockText.equals("")) {
            try {
                price = Integer.parseInt(priceText);
                stock = Integer.parseInt(stockText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Harga dan Stok harus berupa angka", "Validasi Data", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        Item item = new Item(id, name, size, price, stock, category);
        app.getStore().addItem(item);
        tampilProducts();
        bersihkan();
    }//GEN-LAST:event_btnAddMouseClicked

    private void navUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navUsersMouseClicked
        // TODO add your handling code here:
        app.showAdminSetUser();
    }//GEN-LAST:event_navUsersMouseClicked

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblProducts.getSelectedRow();
        txtId.setText(tblProducts.getValueAt(selectedRow, 1).toString());
        txtName.setText(tblProducts.getValueAt(selectedRow, 2).toString());
        txtSize.setSelectedItem((tblProducts.getValueAt(selectedRow, 3).toString()));
        txtPrice.setText(tblProducts.getValueAt(selectedRow, 4).toString());
        txtStock.setText(tblProducts.getValueAt(selectedRow, 5).toString());
        txtCategory.setSelectedItem((tblProducts.getValueAt(selectedRow, 6).toString()));

        txtId.setEditable(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnAdd.setEnabled(false);
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan dihapus ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (jawab == 0) {
            int selectedRow = tblProducts.getSelectedRow();

            String id = tblProducts.getValueAt(selectedRow, 1).toString();

            int indexItem = app.getStore().getIndexItem(id);
            if (indexItem > 0) {
                app.getStore().removeItem(indexItem);
            }
            bersihkan();
            tampilProducts();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblProducts.getSelectedRow();

        String id = tblProducts.getValueAt(selectedRow, 1).toString();
        int indexItem = app.getStore().getIndexItem(id);

        id = txtId.getText();
        String name = txtName.getText();
        String priceText = txtPrice.getText();
        String stockText = txtStock.getText();
        String size = txtSize.getSelectedItem().toString();
        String category = txtCategory.getSelectedItem().toString();
        
        if (id.equals("") || name.equals("") || size.equals("") || category.equals("") || priceText.equals("") || stockText.equals("")) {
            JOptionPane.showMessageDialog(null, "Data belum lengkap", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int price = 0;
        int stock = 0;

        if (!priceText.equals("") || !stockText.equals("")) {
            try {
                price = Integer.parseInt(priceText);
                stock = Integer.parseInt(stockText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Harga dan Stok harus berupa angka", "Validasi Data", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (indexItem > 0) {
            app.getStore().getItem(indexItem).setId(id);
            app.getStore().getItem(indexItem).setName(name);
            app.getStore().getItem(indexItem).setPrice(price);
            app.getStore().getItem(indexItem).setStock(stock);
            app.getStore().getItem(indexItem).setSize(size);
            app.getStore().getItem(indexItem).setCategory(category);
        }
        bersihkan();
        tampilProducts();
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        bersihkan();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void navSoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navSoldMouseClicked
        // TODO add your handling code here:
        app.showAdminSoldItem();
    }//GEN-LAST:event_navSoldMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelProducts;
    private javax.swing.JLabel navProducts;
    private javax.swing.JLabel navSold;
    private javax.swing.JLabel navUsers;
    private javax.swing.JTable tblProducts;
    private javax.swing.JComboBox<String> txtCategory;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JComboBox<String> txtSize;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
