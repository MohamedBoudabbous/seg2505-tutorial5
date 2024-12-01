package com.example.pcorderapplication.model.users;

import android.util.Log;

import com.example.pcorderapplication.model.entity.Component;
import java.util.ArrayList;
import java.util.List;

public class StoreKeeper extends User {


    private List<Component> stock;// stock conteant les composants

    //constructeur
    public StoreKeeper(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
        this.stock = new ArrayList<>();
    }

    //ajoute un composant et ne retourne rien
    public void addComponent(Component component) {
        stock.add(component);
        Log.i("StoreKeeper", "Component " + component.getType() + " added to stock.");
    }

    //enleve un composant et ne retourne rien
    public void removeComponent(Component component) {
        if (stock.contains(component)) {
            stock.remove(component);
            Log.i("StoreKeeper", "Component " + component.getType() + " removed from stock.");
        } else {
            Log.i("StoreKeeper", "The component " + component.getType() + " doesn't exist in the stock.");
        }
    }


    //visualise le stck et retourne une liste
    public List<Component> viewStock() {
        /*  Log.i("StoreKeeper", "Visualisation of the stock:");
        for (Component component : stock) {
            Log.i("StoreKeeper", component.getType() + " - Quantity : " + component.getStockQuantity());
        }
        return stock;*/
        return  null;
    }
    @Override
    public void login() {
        if (super.login(this.getEmail(), this.getPassword())) {
            Log.i("StoreKeeper", "StoreKeeper " + this.getFirstName() + " " + this.getLastName() + " logged in successfully.");
        } else {
            Log.i("StoreKeeper", "Login failed for StoreKeeper: invalid email or password.");
        }
    }

    @Override
    public void logout() {
        if (this.isLoggedIn()) {
            super.logout();
            Log.i("StoreKeeper", "StoreKeeper " + this.getFirstName() + " " + this.getLastName() + " logged out successfully.");
        } else {
            Log.i("StoreKeeper", "No StoreKeeper is currently logged in.");
        }
    }
    public List<Component> getStock() {
        return stock;
    }

}