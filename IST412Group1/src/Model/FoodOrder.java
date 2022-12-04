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
    private int orderNumber = 0;
    private ArrayList<Food> foodsSelected = new ArrayList<>();
    private double foodOrderSubtotal = 0;
    private double foodOrderTax = 0;
    private double foodOrderTotal = 0;
    private String foodOrderStatus; //such as pending, being prepared, ready for pick-up, or completed
    private ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
    String restaurantDataFileName = "restaurantData.ser";
    
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

    public FoodOrder() {
       this.readRestaurantFile();

        if (restaurants.isEmpty() || restaurants == null) {

            System.out.println("restaurants empty, creating test foods...");

            this.createRestaurants();
            this.writeRestaurantFile();
            this.readRestaurantFile();

        } 
        
       
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
    
    public ArrayList<Restaurant> createRestaurants(){
        Restaurant restaurant1 = new Restaurant("Sandwich Shop", "delicatessen", "Area C-1", null);
        restaurant1.setMenuFoods(restaurant1.createMenuFoodsDeli());
        Restaurant restaurant2 = new Restaurant("Sofia's Pizza", "pizzaria", "Area B-2", null);
        restaurant2.setMenuFoods(restaurant2.createMenuFoodsItalian());
        Restaurant restaurant3 = new Restaurant("El Taco", "Mexican food", "Area C-1", null);
        restaurant3.setMenuFoods(restaurant3.createMenuFoodsMexican());
        Restaurant restaurant4 = new Restaurant("Grub Grill", "American grilled foods", "Area A-3", null);
        restaurant4.setMenuFoods(restaurant4.createMenuFoodsGrill());
        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
        restaurants.add(restaurant4);
        
        return restaurants;
        
    }
    
    public void readRestaurantFile() {

        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(restaurantDataFileName);
            in = new ObjectInputStream(fis);
            restaurants = (ArrayList<Restaurant>) in.readObject();
            in.close();

            if (!restaurants.isEmpty()) {
                System.out.println("Restaurant Data Loaded from File");
            }

        } catch (IOException ex) {
            //ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            // ex.printStackTrace();
        }

    }

    public void writeRestaurantFile() {

        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try {
            fos = new FileOutputStream(restaurantDataFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(restaurants);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
