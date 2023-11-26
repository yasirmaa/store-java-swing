package com.mycompany.projectuts.view.admin;

import com.mycompany.projectuts.MainApp;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

public class AdminSoldItem extends javax.swing.JPanel {

    private MainApp app;

    public AdminSoldItem(MainApp app) {
        initComponents();
        this.app = app;
        showSoldItem();
    }

    public void showSoldItem() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Name");
        model.addColumn("Size");
        model.addColumn("Price");
        model.addColumn("Category");
        model.addColumn("Quantitiy");
        model.addColumn("username");
        model.addColumn("payment");
        model.addColumn("Order date");
        model.addColumn("Delivery date");

        model.setRowCount(0);
        for (int i = 0; i < app.getStore().getSoldItemAmount(); i++) {
            model.addRow(new Object[]{
                i + 1,
                app.getStore().getSoldItem(i).getName(),
                app.getStore().getSoldItem(i).getSize(),
                app.getStore().getSoldItem(i).getPrice(),
                app.getStore().getSoldItem(i).getCategory(),
                app.getStore().getSoldItem(i).getStock(),
                app.getStore().getSoldItem(i).getUsername(),
                app.getStore().getSoldItem(i).getPayment(),
                app.getStore().getSoldItem(i).getOrderDate().format(formatter),
                app.getStore().getSoldItem(i).getDeliveryDate().format(formatter)
            });
        }

        tblSoldItems.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        navProducts = new javax.swing.JLabel();
        navUsers = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        navSoldItem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSoldItems = new javax.swing.JTable();

        setBackground(new java.awt.Color(246, 241, 241));

        jPanel2.setBackground(new java.awt.Color(20, 108, 148));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 90));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("YAMA STORE");

        navProducts.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        navProducts.setForeground(new java.awt.Color(255, 255, 255));
        navProducts.setText("Products");
        navProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navProductsMouseClicked(evt);
            }
        });

        navUsers.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        navUsers.setForeground(new java.awt.Color(255, 255, 255));
        navUsers.setText("Users");
        navUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navUsersMouseClicked(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        navSoldItem.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        navSoldItem.setForeground(new java.awt.Color(255, 255, 255));
        navSoldItem.setText("Sold Item");

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
                .addComponent(navSoldItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
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
                        .addComponent(navSoldItem)))
                .addGap(18, 18, 18))
        );

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sold Item");

        tblSoldItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Name", "Size", "Category", "Quantity", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblSoldItems);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void navProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProductsMouseClicked
        // TODO add your handling code here:
        app.showHomeAdmin();
    }//GEN-LAST:event_navProductsMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        app.showLoginView();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void navUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navUsersMouseClicked
        // TODO add your handling code here:
        app.showAdminSetUser();
    }//GEN-LAST:event_navUsersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel navProducts;
    private javax.swing.JLabel navSoldItem;
    private javax.swing.JLabel navUsers;
    private javax.swing.JTable tblSoldItems;
    // End of variables declaration//GEN-END:variables
}
