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
    private int foodQuantity;
    private double foodSubtotal;
    
    /**
     * This is the full constructor for the food class.
     * @param foodName string representing the name of the food item
     * @param foodDescription string representing the description of the food item
     * @param foodPrice double representing the price of the food item
     */   
    public Food (String foodName, double foodPrice, int foodQuantity){
        
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodQuantity = foodQuantity; 
        this.foodSubtotal = this.calculateFoodSubtotal(this.foodPrice, this.foodQuantity);
              
    }

    /**
     * Calculates the value for the food subtotal variable
     * @param price double representing the price for one of this food object
     * @param quantity integer representing the number requested of this food object
     * @return double representing the subtotal for the requested number of the food object
     */
    public double calculateFoodSubtotal(double price, int quantity){
        double subtotal = price * quantity;
        return subtotal;
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

    /**
     * @return the foodQuantity
     */
    public int getFoodQuantity() {
        return foodQuantity;
    }

    /**
     * @param foodQuantity the foodQuantity to set
     */
    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    /**
     * @return the foodSubtotal
     */
    public double getFoodSubtotal() {
        return foodSubtotal;
    }

    /**
     * @param foodSubtotal the foodSubtotal to set
     */
    public void setFoodSubtotal(double foodSubtotal) {
        this.foodSubtotal = foodSubtotal;
    }
    
    public String ToString(){
        return "Food Name: " + this.foodName +
                ", Price Each: $" + this.foodPrice +
                ", Quantity Ordered: " + this.foodQuantity +
                ", Item Subtotal: $ " + this.foodSubtotal;
    }
}
