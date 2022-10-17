/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 * This class contains the information about restaurants at the park.
 * @author katerineer
 */
public class Restaurant {
    
    private String restaurantName;
    private String retaurantDescription;
    private String restaurantLocation;
    private ArrayList <Food> menuFoods = new ArrayList<>();
    private ArrayList <ResOption> restaurantResOptions = new ArrayList<>();
    
    
    /**
     * This is the full constructor for the restaurant class.
     * @param restaurantName string for the name of the restaurant
     * @param restaurantDescription string for the description of the restaurant's style and food types
     * @param restaurantLocation string for the restaurants location within the park such as a section name or location code
     * @param menuFoods list of the foods on the menu for the restaurant
     * @param restaurantResOptions list of the reservation options for the restaurant
     */
    public Restaurant (String restaurantName, String restaurantDescription, String restaurantLocation, ArrayList menuFoods, ArrayList restaurantResOptions){
        
        this.restaurantName = restaurantName;
        this.retaurantDescription = restaurantDescription; 
        this.restaurantLocation = restaurantLocation;
        this.menuFoods = menuFoods;
        this.restaurantResOptions = restaurantResOptions;
       
        
    }

    public Restaurant() {
        
    }

    /**
     * Gets the name for this restaurant.
     * @return the string restaurantName representing the name of the restaurant.
     */
    public String getRestaurantName() {
        return restaurantName;
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
        return retaurantDescription;
    }

    /**
     * Sets the description for this restaurant.
     * @param retaurantDescription sets the description for the restaurant.
     */
    public void setRestaurantDescription(String retaurantDescription) {
        this.retaurantDescription = retaurantDescription;
    }

    /**
     * Gets this restaurant's location.
     * @return the string restaurantLocation representing the restaurant's location.
     */
    public String getRestaurantLocation() {
        return restaurantLocation;
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
        return menuFoods;
    }

    /**
     * Sets the array of foods making up this restaurant's menu.
     * @param menuFoods sets the array of foods making up the restaurant's menu.
     */
    public void setMenuFoods(ArrayList <Food> menuFoods) {
        Food food1 = new Food("Hotdog", "Description", 6.99);
        Food food2 = new Food("Hamburger", "Description", 8.99);
        Food food3 = new Food("Turkey leg", "Description", 7);
        Food food4 = new Food("Dole Whip", "Description", 4.50);
        Food food5 = new Food("Chicken Nuggets", "Description", 6.99);
        menuFoods.add(food1);
        menuFoods.add(food2);
        menuFoods.add(food3);
        menuFoods.add(food4);
        menuFoods.add(food5);
        
        this.menuFoods = menuFoods;
    }

    /**
     * Gets the array of reservation options for this restaurant.
     * @return the array list restaurantResOptions representing the reservation options for the restaurant.
     */
    public ArrayList <ResOption> getRestaurantResOptions() {
        return restaurantResOptions;
    }

    /**
     * Sets the array of reservation options for this restaurant.
     * @param restaurantResOptions sets the reservation options for the restaurant.
     */
    public void setRestaurantResOptions(ArrayList <ResOption> restaurantResOptions) {
        this.restaurantResOptions = restaurantResOptions;
    }
    
    
}
