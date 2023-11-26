package com.mycompany.projectuts.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Store {
    private ArrayList<Item> items;
    private ArrayList<User> users;
    private ArrayList<OrderItem> soldItems;
    
    private User user;
    private Item item;
    private OrderItem soldItem;
    
    public Store(){
        items = new ArrayList<>();
        users = new ArrayList<>();
        soldItems = new ArrayList<>();
    }
    
    public void addUser(User user){
        this.user = user; 
        users.add(this.user);
    }
    
    public User getUser(int index){
        return users.get(index);
    }
    
    public int getJumlahUser(){
        return users.size();
    }
    
    public void editUser(int index, User user){
        users.set(index, user);
    }
    
    public void removeUser(int index){
        users.remove(index);
    }
    
    public void addItem(Item item){
        this.item = item;
        items.add(this.item);
    }
    
    public Item getItem(int index){
        return items.get(index);
    }
    
    public int getJumlahItem(){
        return items.size();
    }
    
    public void editItem(int index, Item item){
        items.set(index, item);
    }
    
    public void removeItem(int index){
        items.remove(index);
    }
    
    public void addSoldItem(OrderItem soldItem){
        this.soldItem = soldItem;
        soldItems.add(this.soldItem);
    }
    
    public OrderItem getSoldItem(int index){
        return soldItems.get(index);
    }
    
    public int getSoldItemAmount(){
        return soldItems.size();
    }
    
    public int getIndexItem(String id){
        for(int i = 0; i < items.size(); i++){
            Item item = items.get(i);
            if(item.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    
    public int getIndexUser(String username, String password){
        for(int i = 0; i < users.size(); i++){
            User user = users.get(i);
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return i; // Mengembalikan indeks pengguna yang ditemukan
            }
        }
        return -1;
    }
    
    public int findUser(String username){
        for(int i = 0; i < users.size(); i++){
            User user = users.get(i);
            if (user.getUsername().equals(username)){
                return i; // Mengembalikan indeks pengguna yang ditemukan
            }
        }
        return -1;
    }
}
