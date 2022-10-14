/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This class contains the information for a food order.
 * @author katerineer
 */
public class FoodOrder {
    private int orderNumber = 0;
    private ArrayList<Food> foodsSelected = new ArrayList<>();
    private double foodOrderSubtotal = 0;
    private double foodOrderTax = 0;
    private double foodOrderTotal = 0;
    private String foodOrderStatus; //such as pending, being prepared, ready for pick-up, or completed
    
    /**
     * This is the full constructor for the FoodOrder class.
     * @param orderNumber integer representing the unique order number
     * @param foodsSelected array list representing the food selected from a menu to be placed on the order
     * @param foodOrderSubtotal the double representing the subtotal of the food selected before tax
     * @param foodOrderTax the double representing the tax for the food order
     * @param foodOrderTotal the double representing the total of the order including both the food order subtotal and the tax
     * @param foodOrderStatus the string representing the status of the order such as pending, being prepared, ready for pick-up or completed
     */
    public FoodOrder (int orderNumber, ArrayList foodsSelected, double foodOrderSubtotal, double foodOrderTax, double foodOrderTotal, String foodOrderStatus){
        
        this.orderNumber = orderNumber;
        this.foodsSelected = foodsSelected;
        this.foodOrderSubtotal = foodOrderSubtotal;
        this.foodOrderTax = foodOrderTax;
        this.foodOrderTotal = foodOrderTotal;
        this.foodOrderStatus = foodOrderStatus;
    }

    /**
     * Gets the order number for this food order.
     * @return the integer orderNumber representing the order number for the food order.
     */
    public int getOrderNumber() {
        orderNumber = orderNumber + 1; // will this work or will there need to be a for loop?
        return orderNumber;
    }

    /**
     * Sets the order number for this food order.
     * @param orderNumber sets the order number for the food order.
     */
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * Gets the array list of the foods selected for this food order.
     * @return the array list foodsSelected representing the foods selected for this food order.
     */
    public ArrayList<Food> getFoodsSelected() {
        return foodsSelected;
    }

    /**
     * Sets the array list for the foods selected for this food order.
     * @param foodsSelected sets the array list for the foods selected for this food order.
     */
    public void setFoodsSelected(ArrayList<Food> foodsSelected) {
        this.foodsSelected = foodsSelected;
    }

    /**
     * Gets the food cost subtotal for this food order.
     * @return the double foodOrderSubtotal representing the food cost subtotal for the food order.
     */
    public double getFoodOrderSubtotal() {
        return foodOrderSubtotal;
    }

    /**
     * Sets the food cost subtotal for this food order.
     * @param foodOrderSubtotal sets the food cost subtotal for this food order.
     */
    public void setFoodOrderSubtotal(double foodOrderSubtotal) {
        this.foodOrderSubtotal = foodOrderSubtotal;
    }

    /**
     * Gets the tax amount for this food order.
     * @return the double foodOrderTax representing the tax amount for the food order.
     */
    public double getFoodOrderTax() { 
        return foodOrderTax;
    }

    /**
     * Sets the tax amount for this food order.
     * @param foodOrderTax sets the tax amount for the food order.
     */
    public void setFoodOrderTax(double foodOrderTax) {
        this.foodOrderTax = foodOrderTax;
    }

    /**
     * Gets the total cost of the food including tax for this food order.
     * @return the double foodOrderTotal representing the total cost of the food including tax for the food order.
     */
    public double getFoodOrderTotal() {       
        foodOrderTotal = foodOrderSubtotal + foodOrderTax;       
        return foodOrderTotal;
    }

    /**
     * Sets the total cost including tax for this food order.
     * @param foodOrderTotal sets the total cost including tax for the food order.
     */
    public void setFoodOrderTotal(double foodOrderTotal) {
        this.foodOrderTotal = foodOrderTotal;
    }

    /**
     * Gets the status of this food order.
     * @return the string foodOrderStatus representing the status of the food order.
     */
    public String getFoodOrderStatus() {
        return foodOrderStatus;
    }

    /**
     * Sets the status for this food order.
     * @param foodOrderStatus sets the status for the food order.
     */
    public void setFoodOrderStatus(String foodOrderStatus) {
        this.foodOrderStatus = foodOrderStatus;
    }
    
    
}
