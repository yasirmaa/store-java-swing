package com.mycompany.projectuts.entity;

public class Item {
    private String id;
    private String name;
    private int price;
    private int stock;
    private String size;
    private String category;

    public Item(String id, String name, String size, int price, int stock, String category){
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean buyItem(int quantity){
        if(this.stock >= quantity){
            this.stock -= quantity;
            return true;
        }
        return false;
    }
}
