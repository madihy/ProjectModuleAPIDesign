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
 * This class is to handle actions to place food orders at the park.
 * @author katerineer
 */
public class ManageFoodCtrl {
    FoodOrder foodOrder;
    ArrayList<Food> selectedFoods;
    
    /**
     * This is the constructor for the ManageFoodCtrl class.
     */
    public ManageFoodCtrl(){
        
    
    }
    /**
     * Creates the selected foods array to be used in the food order object.
     * Passes the integer values from the spinner objects to this controller object.
     * Creates food objects and uses the integer values to set the quantity for each food object created.
     * Creates an array of all food objects from all restaurant menus.
     * Finds all objects in the menu array with a quantity greater than 0 and adds them to the foods selected array.
     * Returns the food selected array to be used to create the food order object.
     * @param inf_sandwich
     * @param inf_sub
     * @param inf_salad
     * @param inf_cookie
     * @param inf_deliChips
     * @param inf_brownie
     * @param inf_deliFountain
     * @param inf_deliBottled
     * @param inf_smallPizza
     * @param inf_largePizza
     * @param inf_pastaBowl
     * @param inf_gelato
     * @param inf_dessertPizza
     * @param inf_italianFountain
     * @param inf_italianBottled
     * @param inf_hotdog
     * @param inf_hamburger
     * @param inf_turkeyLeg
     * @param inf_chickenNuggets
     * @param inf_grillChips
     * @param inf_frenchFries
     * @param inf_milkshake
     * @param inf_grillFountain
     * @param inf_grillBottled
     * @param inf_tacos
     * @param inf_burrito
     * @param inf_riceBowl
     * @param inf_churro
     * @param inf_chipsSalsa
     * @param inf_guacamole
     * @param inf_mexicanFountain
     * @param inf_mexicanBottled
     * @return 
     */
    public ArrayList<Food> createSelectedFoodsArray(int inf_sandwich, int inf_sub, int inf_salad, int inf_cookie, 
            int inf_deliChips, int inf_brownie, int inf_deliFountain, int inf_deliBottled, 
            int inf_smallPizza, int inf_largePizza, int inf_pastaBowl, int inf_gelato, int inf_dessertPizza, 
            int inf_italianFountain, int inf_italianBottled, int inf_hotdog, int inf_hamburger, int inf_turkeyLeg,
            int inf_chickenNuggets, int inf_grillChips, int inf_frenchFries, int inf_milkshake, int inf_grillFountain,
            int inf_grillBottled, int inf_tacos, int inf_burrito, int inf_riceBowl, int inf_churro,
            int inf_chipsSalsa, int inf_guacamole, int inf_mexicanFountain, int inf_mexicanBottled){
        
        //create Deli Menu food objects and pass quantity values from OrderFoodUI
        ArrayList<Food> menu = new ArrayList();
        Food food1 = new Food("Sandwich", 9.99, inf_sandwich);
        Food food2 = new Food("Sub", 12.99, inf_sub);
        Food food3 = new Food("Salad", 7, inf_salad);
        Food food4 = new Food("Cookie", 4.50, inf_cookie);
        Food food5 = new Food("Chips", 3.50, inf_deliChips);
        Food food6 = new Food("Brownie", 4.50, inf_brownie);
        Food food7 = new Food("Fountain Drink", 2.99, inf_deliFountain);
        Food food8 = new Food("Bottled Drink", 3.99, inf_deliBottled);
        //Add Mexican Menu food objects to the menu array
        menu.add(food1);
        menu.add(food2);
        menu.add(food3);
        menu.add(food4);
        menu.add(food5);
        menu.add(food6);
        menu.add(food7);
        menu.add(food8);
        
        //create Italian Menu food objects and pass quantity values from OrderFoodUI
        Food food9 = new Food("Small Pizza", 9.99, inf_smallPizza);
        Food food10 = new Food("Large Pizza", 12.99,inf_largePizza);
        Food food11 = new Food("Pasta Bowl", 7, inf_pastaBowl);
        Food food12 = new Food("Gelato", 4.50, inf_gelato);
        Food food13 = new Food("Dessert Pizza", 9.99, inf_dessertPizza);
        Food food14 = new Food("Fountain Drink", 2.99, inf_italianFountain);
        Food food15 = new Food("Bottled Drink", 3.99, inf_italianBottled);
        //Add Italian Menu food objects to the menu array
        menu.add(food9);
        menu.add(food10);
        menu.add(food11);
        menu.add(food12);
        menu.add(food13);
        menu.add(food14);
        menu.add(food15);
        
        //create Mexican Menu food objects and pass quantity values from OrderFoodUI
        Food food16 = new Food("Tacos", 9.99, inf_tacos);
        Food food17 = new Food("Burrito", 12.99, inf_burrito);
        Food food18 = new Food("Rice Bowl", 12.99, inf_riceBowl);
        Food food19 = new Food("Churro", 4.50, inf_churro);
        Food food20 = new Food("Chips and Salsa", 6.50, inf_chipsSalsa);
        Food food21 = new Food("Guacamole", 3.50, inf_guacamole);
        Food food22 = new Food("Fountain Drink", 2.99, inf_mexicanFountain);
        Food food23 = new Food("Bottled Drink", 3.99, inf_mexicanBottled);
        //Add Mexican Menu food objects to the menu array
        menu.add(food16);
        menu.add(food17);
        menu.add(food18);
        menu.add(food19);
        menu.add(food20);
        menu.add(food21);
        menu.add(food22);
        menu.add(food23);
        
        //create Grill Menu food objects and pass quantity values from OrderFoodUI
        Food food24 = new Food("Hotdog", 6.99, inf_hotdog);
        Food food25 = new Food("Hamburger", 8.99, inf_hamburger);
        Food food26 = new Food("Turkey leg", 7, inf_turkeyLeg);
        Food food27 = new Food("Chicken Nuggets", 6.99, inf_chickenNuggets);
        Food food28 = new Food("Chips", 3.50, inf_grillChips);
        Food food29 = new Food("French Fries", 4.50, inf_frenchFries);
        Food food30 = new Food("Milkshake", 5.00, inf_milkshake);
        Food food31 = new Food("Fountain Drink", 2.99, inf_grillFountain);
        Food food32 = new Food("Bottled Drink", 3.99, inf_grillBottled);
        //Add grill Menu food objects to the menu array
        menu.add(food24);
        menu.add(food25);
        menu.add(food26);
        menu.add(food27);
        menu.add(food28);
        menu.add(food29);
        menu.add(food30);
        menu.add(food31);
        menu.add(food32);      
        
        //create the selected foods array to use in the food order
        //adds food objects from the menu array to the selected food array with a food quantity value greater than 0
        ArrayList<Food> selectedFoods = new ArrayList<Food>();
        for (int i = 0; i < menu.size(); i++){
            if(menu.get(i).getFoodQuantity() > 0){
                Food selectedFood = new Food(menu.get(i).getFoodName(), menu.get(i).getFoodPrice(), menu.get(i).getFoodQuantity());
                selectedFoods.add(selectedFood);
            }
        }
        this.selectedFoods = selectedFoods;
                       
        return selectedFoods;
    }   
    
    /**
     * Creates the food order object and sets all variables for the new object.
     * @param inf_restaurant 
     */
    public void createFoodOrder(String inf_restaurant){
        FoodOrder foodOrder = new FoodOrder();
        foodOrder.setRestaurantName(inf_restaurant);
        foodOrder.setFoodsSelected(selectedFoods);
        foodOrder.setOrderNumber(foodOrder.createFoodOrderNumber());
        foodOrder.setFoodOrderSubtotal(foodOrder.calculateFoodOrderSubtotal(foodOrder.getFoodsSelected()));
        foodOrder.setFoodOrderTax(foodOrder.calculateFoodOrderTax(foodOrder.getFoodOrderSubtotal()));
        foodOrder.setFoodOrderTotal(foodOrder.calculateTotal(foodOrder.getFoodOrderSubtotal(), foodOrder.getFoodOrderTax()));
        
        
        this.foodOrder = foodOrder;
    }
    
    /**
     * Gets the food order object so it can be passed to the food order confirmation panel to display.
     * @return 
     */
    public FoodOrder getFoodOrderInformation(){
        return foodOrder;
    }      
 }
