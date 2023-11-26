package com.mycompany.projectuts.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String address;
    private String noTelp;
    private ArrayList<OrderItem> purchases = new ArrayList<>();
    private Tabungan tabungan = new Tabungan(0);
    
    private OrderItem purchase;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.address = "";
        this.noTelp = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    public void addPurchase(OrderItem purchase) {
        this.purchase = purchase;
        purchases.add(this.purchase);
    }

    public int getPurchasesAmount() {
        return this.purchases.size();
    }

    public OrderItem getPurchases(int index) {
        return purchases.get(index);
    }

    public Tabungan getTabungan() {
        return tabungan;
    }
}
