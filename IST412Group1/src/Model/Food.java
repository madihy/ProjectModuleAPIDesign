/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * This class contains the information about foods that can be added to restaurant menus.
 * @author katerineer
 */
public class Food {
    private String foodName;
    private String foodDescription;
    
    /**
     * This is the full constructor for the food class.
     * @param foodName
     * @param foodDescription 
     */   
    public Food (String foodName, String foodDescription){
        
        this.foodName = foodName;
        this.foodDescription = foodDescription;
    }

    /**
     * Gets the name of this food item.
     * @return the string foodName representing the name of the food item.
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * Sets the name of this food item.
     * @param foodName sets the name of the food item.
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * Gets the description of this food item.
     * @return the string foodDescription representing the description of the food item.
     */
    public String getFoodDescription() {
        return foodDescription;
    }

    /**
     * Sets the description of this food item.
     * @param foodDescription sets the description of the food item.
     */
    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }
    
}
