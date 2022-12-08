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
        
        ArrayList<Restaurant> restaurants1 = new ArrayList(foodOrder.createRestaurants());
        System.out.println(restaurants1);
        
        ArrayList<Food> selectedMenu;
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
