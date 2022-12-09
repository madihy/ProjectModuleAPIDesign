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
    
        
     /**
     * Establishes the action event to be carried out when the corresponding restaurant button 
     * is selected on the order food user interface.
     * Displays corresponding restaurant menu items.
     * @param event sets the event variable to occur when the corresponding restaurant button is selected.
     */
    public ArrayList getRestaurantMenuToDisplay (String selectedRestaurant){
        System.out.println("Button clicked to select the restaurant.");
        System.out.println(selectedRestaurant);
        
        ArrayList<Restaurant> restaurants1 = new ArrayList(foodOrder.createRestaurants());
        System.out.println(restaurants1);
        
        ArrayList<Food> selectedMenu = new ArrayList<Food>();
        Restaurant restaurantToReturn = restaurants1.get(0);
        for (int i = 0; i < restaurants1.size(); i++){
            if (restaurants1.get(i).getRestaurantName().equals(selectedRestaurant)){
                restaurantToReturn = restaurants1.get(i);
                //selectedMenu = restaurants1.get(i).getMenuFoods();
                System.out.println(restaurantToReturn.toString());
            }
        }
        selectedMenu = restaurantToReturn.getMenuFoods();
        
        return selectedMenu;
        
    }
    
    public ArrayList getDeliMenuToDisplay (){
        System.out.println("Button clicked to get Deli Menu");

        ArrayList<Food> menuDeli = new ArrayList();
        Food food1 = new Food("Sandwich", 9.99);
        Food food2 = new Food("Sub", 12.99);
        Food food3 = new Food("Pasta Salad", 7);
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
