/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;



/**
 * This class contains the information about foods that can be added to restaurant menus.
 * @author katerineer
 */
public class Food{
    private String foodName;
    private double foodPrice;
    
    /**
     * This is the full constructor for the food class.
     * @param foodName string representing the name of the food item
     * @param foodDescription string representing the description of the food item
     * @param foodPrice double representing the price of the food item
     */   
    public Food (String foodName, double foodPrice){
        
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public Food() {
       
    }


   
    /**
     * Gets the name of this food item.
     * @return the string foodName representing the name of the food item.
     */
    public String getFoodName() {
        System.out.println(foodName);
        return "";
    }

    /**
     * Sets the name of this food item.
     * @param foodName sets the name of the food item.
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * Gets the price of this food item.
     * @return the double foodPrice representing the price of the food item.
     */
    public double getFoodPrice() {
        System.out.println(foodPrice);
       return 0;
    }

    /**
     * Sets the price of this food item.
     * @param foodPrice sets the price of the food item.
     */
    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }
    
}
