package com.mycompany.projectuts.view.admin;

import com.mycompany.projectuts.MainApp;
import com.mycompany.projectuts.entity.User;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminSetUser extends javax.swing.JPanel {

    private MainApp app;

    public AdminSetUser(MainApp app) {
        initComponents();
        this.app = app;
        tampilUsers();
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }

    public void bersihkan() {
        txtUsername.setText("");
        txtPassword.setText("");

        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnAdd.setEnabled(true);
    }

    public void tampilUsers() {
        int noUrut = 1;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Balance");
        model.addColumn("Address");
        model.addColumn("No Telp");

        model.setRowCount(0);

        for (int i = 1; i < app.getStore().getJumlahUser(); i++) {
            model.addRow(new Object[]{
                i,
                app.getStore().getUser(i).getUsername(),
                app.getStore().getUser(i).getPassword(),
                app.getStore().getUser(i).getTabungan().getSaldo(),
                app.getStore().getUser(i).getAddress(),
                app.getStore().getUser(i).getNoTelp()
            });
        }

        tblUsers.setModel(model);
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
        labelProducts = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();

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

        navUsers.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        navUsers.setForeground(new java.awt.Color(255, 255, 255));
        navUsers.setText("Users");

        btnLogout.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
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
                        .addComponent(navSold)))
                .addGap(18, 18, 18))
        );

        labelProducts.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        labelProducts.setForeground(new java.awt.Color(0, 0, 0));
        labelProducts.setText("Users");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Username");

        txtUsername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Password");

        txtPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        btnAdd.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnAdd.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

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

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Username", "Password", "Balance", "Address", "No Telp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel))
                    .addComponent(labelProducts)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        app.showLoginView();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void navProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProductsMouseClicked
        // TODO add your handling code here:
        app.showHomeAdmin();
    }//GEN-LAST:event_navProductsMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Data belum lengkap", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (!username.matches("^[a-zA-Z]*$")) {
            JOptionPane.showMessageDialog(null, "Username harus berupa huruf dan tidak spasi", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        User user = new User(username, password);
        app.getStore().addUser(user);
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        tampilUsers();
        bersihkan();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan dihapus ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (jawab == 0) {
            int selectedRow = tblUsers.getSelectedRow();

            String username = tblUsers.getValueAt(selectedRow, 1).toString();
            String password = tblUsers.getValueAt(selectedRow, 2).toString();

            int indexUser = app.getStore().getIndexUser(username, password);
            if (indexUser > 0) {
                app.getStore().removeUser(indexUser);
            }
            bersihkan();
            tampilUsers();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblUsers.getSelectedRow();

        String username = tblUsers.getValueAt(selectedRow, 1).toString();
        String password = tblUsers.getValueAt(selectedRow, 2).toString();
        
        int indexUser = app.getStore().getIndexUser(username, password);
        username = txtUsername.getText();
        password = txtPassword.getText();

        System.out.println(indexUser);
        if (indexUser > 0) {
            app.getStore().getUser(indexUser).setUsername(username);
            app.getStore().getUser(indexUser).setPassword(password);
        }
        bersihkan();
        tampilUsers();
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        bersihkan();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblUsers.getSelectedRow();
        txtUsername.setText(tblUsers.getValueAt(selectedRow, 1).toString());
        txtPassword.setText(tblUsers.getValueAt(selectedRow, 2).toString());

        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnAdd.setEnabled(false);
    }//GEN-LAST:event_tblUsersMouseClicked

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelProducts;
    private javax.swing.JLabel navProducts;
    private javax.swing.JLabel navSold;
    private javax.swing.JLabel navUsers;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
