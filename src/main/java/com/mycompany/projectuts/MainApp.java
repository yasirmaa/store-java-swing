package com.mycompany.projectuts;

import com.mycompany.projectuts.view.user.HomeUser;
import com.mycompany.projectuts.view.admin.HomeAdmin;
import com.mycompany.projectuts.view.*;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.mycompany.projectuts.entity.Item;
import com.mycompany.projectuts.entity.Store;
import com.mycompany.projectuts.entity.User;
import com.mycompany.projectuts.view.admin.AdminSetUser;
import com.mycompany.projectuts.view.admin.AdminSoldItem;
import com.mycompany.projectuts.view.user.UserProfile;
import com.mycompany.projectuts.view.user.UserPurchase;
import com.mycompany.projectuts.view.user.UserWallet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainApp {
    private JFrame app;
    private Store store;
    public int indexCurrentUser;
    
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new FlatLightFlatIJTheme());
        }catch (Exception e){
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            MainApp app = new MainApp();
            User user1 = new User("admin", "admin");
            User user2 = new User("yasir", "yasir");
            app.getStore().addUser(user1);
            app.getStore().addUser(user2);
            
            Item item1 = new Item("S01", "Kemeja hitam", "M", 100000, 7, "Shirt");
            Item item2 = new Item("S02", "Kemeja merah", "L", 100000, 9, "Shirt");
            Item item3 = new Item("P01", "Celana Chino", "XL", 200000, 13, "Pants");
            Item item4 = new Item("J01", "Jacket ayam", "M", 250000, 20, "Jackets");
            app.getStore().addItem(item1);
            app.getStore().addItem(item2);
            app.getStore().addItem(item3);
            app.getStore().addItem(item4);
            app.showLoginView();
        });
    }
    
    public MainApp(){
        this.app = new JFrame("Yama Store");
        this.store = new Store();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(600, 450);
        app.setVisible(true);
        app.setResizable(false);
        app.setLocationRelativeTo(null);
    }
    
    public Store getStore(){
        return this.store;
    }
    
    private void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
    }
    
    public void showSignupView() {
        changeView(new SignupView(this));
        app.setSize(600, 450);
    }
    
    public void showLoginView() {
        changeView(new LoginView(this));
        app.setSize(600, 450);
    }
    
    public void showHomeAdmin(){
        changeView(new HomeAdmin(this));
        app.setSize(700, 550);
    }
    
    public void showAdminSetUser(){
        changeView(new AdminSetUser(this));
        app.setSize(700, 550);
    }    
    
    public void showAdminSoldItem(){
        changeView(new AdminSoldItem(this));
        app.setSize(700, 550);
    }
    
    public void showHomeUser(){
        changeView(new HomeUser(this));
        app.setSize(700,550);
    }
    
    public void showUserPurchase(){
        changeView(new UserPurchase(this));
        app.setSize(700,550); 
    }
    
    public void showUserWallet(){
        changeView(new UserWallet(this));
        app.setSize(700,550); 
    }
    
    public void showUserProfile(){
        changeView(new UserProfile(this));
        app.setSize(700,550); 
    }   
    
}
