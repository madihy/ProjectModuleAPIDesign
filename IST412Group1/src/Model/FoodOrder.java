/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This class contains the information for a food order.
 * @author katerineer
 */
public class FoodOrder {
    private int orderNumber = this.getOrderNumber();
    private ArrayList<Food> foodsSelected = new ArrayList<>();
    private double foodOrderSubtotal = this.foodOrderSubtotal;
    private double foodOrderTax = this.getFoodOrderTax();
    private double foodOrderTotal = this.getFoodOrderTotal();
    private String foodOrderStatus = "pending"; //such as pending, being prepared, ready for pick-up, or completed
    private ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
    ArrayList<Integer> orderNums = new ArrayList<Integer>();
    
    /**
     * Empty constructor for the Food Order class
     */
    public FoodOrder (){
     
    }

    /**
     * Gets the order number for this food order.
     * @return the integer orderNumber representing the order number for the food order.
     */
    public int getOrderNumber() {
        
        System.out.println("Order number: " + orderNumber);
        return 0;
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
        System.out.println("Order subtotal: " + foodOrderSubtotal);
        return 0;
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
        System.out.println("Order tax: " + foodOrderTax);
        return 0;
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
        System.out.println("Order total: " + foodOrderTotal);
        return 0;
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
        System.out.println("Your order status: " + foodOrderStatus);
        return "";
    }

    /**
     * Sets the status for this food order.
     * @param foodOrderStatus sets the status for the food order.
     */
    public void setFoodOrderStatus(String foodOrderStatus) {
        this.foodOrderStatus = foodOrderStatus;
    }
    
    public int createFoodOrderNumber(){
        int orderNum = 0;
        do{
            orderNum = (int)(Math.random()*400000000) + 1000000000;
        } 
        while (orderNums.contains(orderNum));
        orderNums.add(orderNum);
        
        return orderNum;
   }
   /**
      * Returns the calculated subtotal of the cost the food for this order.
      * @param foodsSelected sets the array of foods to be used for this ticket order.
      * @return a double representing the calculated subtotal amount of an array of tickets for the ticket order.
      */
     public double calculateFoodOrderSubtotal (ArrayList foodsSelected){
         double foodSubtotal = 0;
         System.out.println("Food order subtotal calculated!");
         return foodSubtotal;
     }
     
     /**
      * Returns the tax amount for the food order.
      * @param subTotal set the subtotal value to be used to calculate the tax for the food order.
      * @return a double representing the tax amount for this food order.
      */
     public double calculateFoodOrderTax (double subtotal){
         double tax = this.foodOrderSubtotal * 0.13;
         System.out.println("Food order tax calculated!");
         return tax;
     }
     
     /**
      * Returns the total cost of this food order.
      * @param subtotal sets the subtotal amount to be used to calculate the total for the food order.
      * @param tax sets the tax amount to be used to calculate the total for the food order.
      * @return a double representing the total amount for the food order.
      */
     public double calculateTotal (double subtotal, double tax){
         double total = subtotal + tax;
         System.out.println("Food order subtotal calculated!");
         return total;
     }
   
}
