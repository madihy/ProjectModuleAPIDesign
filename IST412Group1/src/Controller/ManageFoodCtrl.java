/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Food;
import Model.FoodOrder;
import Model.Restaurant;
import View.OrderFoodUI;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * This class is to manage the actions to place and manage food orders at the park.
 * @author katerineer
 */
public class ManageFoodCtrl {
    FoodOrder foodOrder = new FoodOrder();
    ArrayList<Restaurant> restaurants1;
    
    /**
     * This is the default controller for the ManageFoodCtrl class.
     */
    public ManageFoodCtrl(){
        
    
    }
    
    public ArrayList getDeliMenuToDisplay (){
        System.out.println("Button clicked to get Deli Menu");

        ArrayList<Food> menuDeli = new ArrayList();
        Food food1 = new Food("Sandwich", 9.99);
        Food food2 = new Food("Sub", 12.99);
        Food food3 = new Food("Salad", 7);
        Food food4 = new Food("Cookie", 4.50);
        Food food5 = new Food("Chips", 3.50);
        Food food6 = new Food("Brownie", 4.50);
        Food food26 = new Food("Fountain Drink", 2.99);
        Food food27 = new Food("Bottled Drink", 3.99);
        
        menuDeli.add(food1);
        menuDeli.add(food2);
        menuDeli.add(food3);
        menuDeli.add(food4);
        menuDeli.add(food5);
        menuDeli.add(food6);
        menuDeli.add(food26);
        menuDeli.add(food27);
        System.out.println("Deli menu found");
        
        return menuDeli;
        
    }
    
    public ArrayList getItalianMenuToDisplay (){
        System.out.println("Button clicked to get Italian Menu");

        ArrayList<Food> menuItalian = new ArrayList();
        Food food15 = new Food("Small Pizza", 9.99);
        Food food16 = new Food("Large Pizza", 12.99);
        Food food17 = new Food("Pasta Bowl", 7);
        Food food18 = new Food("Gelato", 4.50);
        Food food19 = new Food("Dessert Pizza", 9.99);
        Food food26 = new Food("Fountain Drink", 2.99);
        Food food27 = new Food("Bottled Drink", 3.99);
        
        menuItalian.add(food15);
        menuItalian.add(food16);
        menuItalian.add(food17);
        menuItalian.add(food18);
        menuItalian.add(food19);
        menuItalian.add(food26);
        menuItalian.add(food27);
        System.out.println("Italian menu found");
        
        return menuItalian;
        
    }
    
    public ArrayList getMexicanMenuToDisplay (){
        System.out.println("Button clicked to get Mexican Menu");

        ArrayList<Food> menuMexican = new ArrayList();
        Food food20 = new Food("Tacos", 9.99);
        Food food21 = new Food("Burrito", 12.99);
        Food food22 = new Food("Rice Bowl", 12.99);
        Food food23 = new Food("Churro", 4.50);
        Food food24 = new Food("Chips and Salsa", 6.50);
        Food food25 = new Food("chips and Guacamole", 3.50);
        Food food26 = new Food("Fountain Drink", 2.99);
        Food food27 = new Food("Bottled Drink", 3.99);
        
        menuMexican.add(food20);
        menuMexican.add(food21);
        menuMexican.add(food22);
        menuMexican.add(food23);
        menuMexican.add(food24);
        menuMexican.add(food25);
        menuMexican.add(food26);
        menuMexican.add(food27);
        System.out.println("Mexican menu found");
        
        return menuMexican;
        
    }
    
    public ArrayList getGrillMenuToDisplay (){
        System.out.println("Button clicked to get Grill Menu");

        ArrayList<Food> menuGrill = new ArrayList();
        Food food7 = new Food("Hotdog", 6.99);
        Food food8 = new Food("Hamburger", 8.99);
        Food food9 = new Food("Turkey leg", 7);
        Food food11 = new Food("Chicken Nuggets", 6.99);
        Food food12 = new Food("Chips", 3.50);
        Food food13 = new Food("French Fries", 4.50);
        Food food14 = new Food("Milkshake", 5.00);
        Food food26 = new Food("Fountain Drink", 2.99);
        Food food27 = new Food("Bottled Drink", 3.99);
        
        menuGrill.add(food7);
        menuGrill.add(food8);
        menuGrill.add(food9);
        menuGrill.add(food11);
        menuGrill.add(food12);
        menuGrill.add(food13);
        menuGrill.add(food14);
        menuGrill.add(food26);
        menuGrill.add(food27);      
        System.out.println("Grill menu found");
        
        return menuGrill;
        
    }
   
     /**
     * Establishes the action event to be carried out when the return to main menu button 
     * is selected on the order food user interface.
     * returns user to the applications main menu interface.
     * @param event sets the event variable to occur when the return to main menu button is selected.
     */
    public void returnToMenuButtonEvent (){
        System.out.println("Button clicked to return to the main menu.");
        
    }
        
        
 }
