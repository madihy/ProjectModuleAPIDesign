/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This class contains the information about restaurants at the park.
 * @author katerineer
 */
public class Restaurant implements Serializable{
    
    private String restaurantName;
    private String restaurantDescription;
    private String restaurantLocation;
    private ArrayList <Food> menuFoods = new ArrayList<>();
    
    
    
    /**
     * This is the full constructor for the restaurant class.
     * @param restaurantName string for the name of the restaurant
     * @param restaurantDescription string for the description of the restaurant's style and food types
     * @param restaurantLocation string for the restaurants location within the park such as a section name or location code
     * @param menuFoods list of the foods on the menu for the restaurant
     * @param restaurantResOptions list of the reservation options for the restaurant
     */
    public Restaurant (String restaurantName, String restaurantDescription, String restaurantLocation, ArrayList menuFoods){
        
        this.restaurantName = restaurantName;
        this.restaurantDescription = restaurantDescription; 
        this.restaurantLocation = restaurantLocation;
        this.menuFoods = menuFoods;
       
        
    }

    public Restaurant() {
        
    }

    /**
     * Gets the name for this restaurant.
     * @return the string restaurantName representing the name of the restaurant.
     */
    public String getRestaurantName() {
         System.out.println(restaurantName);
        return "";
    }

    /**
     * Sets the name of this restaurant.
     * @param restaurantName sets the name of the restaurant.
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * Gets the description for this restaurant.
     * @return the string retaurantDescription representing the description of the restaurant.
     */
    public String getRestaurantDescription() {
        System.out.println(restaurantDescription);
        return "";
    }

    /**
     * Sets the description for this restaurant.
     * @param retaurantDescription sets the description for the restaurant.
     */
    public void setRestaurantDescription(String retaurantDescription) {
        this.restaurantDescription = retaurantDescription;
    }

    /**
     * Gets this restaurant's location.
     * @return the string restaurantLocation representing the restaurant's location.
     */
    public String getRestaurantLocation() {
        System.out.println(restaurantLocation);
        return "";
    }

    /**
     * Sets this restaurant's location.
     * @param restaurantLocation sets the restaurant's location.
     */
    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    /**
     * Gets the array of foods making up this restaurant's menu.
     * @return the array list menuFoods representing the foods making up the menu for the restaurant.
     */
    public ArrayList <Food> getMenuFoods() {
        System.out.println(menuFoods);
        return null;
    }

    /**
     * Sets the array of foods making up this restaurant's menu.
     * @param menuFoods sets the array of foods making up the restaurant's menu.
     */
    public void setMenuFoodsGrill(ArrayList <Food> menuFoods) {
        Food food1 = new Food("Hotdog", 6.99);
        Food food2 = new Food("Hamburger", 8.99);
        Food food3 = new Food("Turkey leg", 7);
        Food food4 = new Food("Dole Whip", 4.50);
        Food food5 = new Food("Chicken Nuggets", 6.99);
        Food food6 = new Food("Chips", 3.50);
        Food food7 = new Food("French Fries", 4.50);
        Food food8 = new Food("Milkshake", 5.00);
        Food food9 = new Food("Fountain Drink", 2.99);
        Food food10 = new Food("Bottled Drink", 3.99);
        menuFoods.add(food1);
        menuFoods.add(food2);
        menuFoods.add(food3);
        menuFoods.add(food4);
        menuFoods.add(food5);
        menuFoods.add(food6);
        menuFoods.add(food7);
        menuFoods.add(food8);
        menuFoods.add(food9);
        menuFoods.add(food10);
        
        this.menuFoods = menuFoods;
    }  
    
    public void setMenuFoodsItalian(ArrayList <Food> menuFoods) {
        Food food1 = new Food("Small Pizza", 9.99);
        Food food2 = new Food("Large Pizza", 12.99);
        Food food3 = new Food("Pasta Bowl", 7);
        Food food4 = new Food("Gelato", 4.50);
        Food food5 = new Food("Dessert Pizza", 9.99);
        Food food6 = new Food("Fountain Drink", 2.99);
        Food food7 = new Food("Bottled Drink", 3.99);
        menuFoods.add(food1);
        menuFoods.add(food2);
        menuFoods.add(food3);
        menuFoods.add(food4);
        menuFoods.add(food5);
        menuFoods.add(food6);
        menuFoods.add(food7);
        
        this.menuFoods = menuFoods;
    }    
    
    public void setMenuFoodsDeli(ArrayList <Food> menuFoods){
        Food food1 = new Food("Sandwich", 9.99);
        Food food2 = new Food("Sub", 12.99);
        Food food3 = new Food("Pasta Salad", 7);
        Food food4 = new Food("Cookie", 4.50);
        Food food5 = new Food("Chips", 3.50);
        Food food6 = new Food("Brownie", 4.50);
        Food food7 = new Food("Fountain Drink", 2.99);
        Food food8 = new Food("Bottled Drink", 3.99);
        menuFoods.add(food1);
        menuFoods.add(food2);
        menuFoods.add(food3);
        menuFoods.add(food4);
        menuFoods.add(food5);
        menuFoods.add(food6);
        menuFoods.add(food7);
        menuFoods.add(food8);
        
        this.menuFoods = menuFoods;
    }
    
    public void setMenuFoodsMexican(ArrayList<Food> menuFoods){
        Food food1 = new Food("Tacos", 9.99);
        Food food2 = new Food("Burrito", 12.99);
        Food food3 = new Food("Rice Bowl", 12.99);
        Food food4 = new Food("Churro", 4.50);
        Food food5 = new Food("Chips and Salsa", 6.50);
        Food food6 = new Food("chips and Guacamole", 7.50);
        Food food7 = new Food("Fountain Drink", 2.99);
        Food food8 = new Food("Bottled Drink", 3.99);
        menuFoods.add(food1);
        menuFoods.add(food2);
        menuFoods.add(food3);
        menuFoods.add(food4);
        menuFoods.add(food5);
        menuFoods.add(food6);
        menuFoods.add(food7);
        menuFoods.add(food8);
        
        this.menuFoods = menuFoods;
    }
}
