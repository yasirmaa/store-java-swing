package com.mycompany.projectuts.entity;

import java.time.LocalDateTime;

public class OrderItem extends Item{
    private String username;
    private String payment;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;

    public OrderItem(String id, String name, String size, int price, int stock, 
            String category, String username, String payment, LocalDateTime orderDate) {
        super(id, name, size, price, stock, category);
        this.username = username;
        this.payment = payment;
        this.orderDate = orderDate;
        this.deliveryDate =  orderDate.plusDays(3);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    
}
