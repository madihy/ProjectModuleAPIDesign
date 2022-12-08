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
    String restaurantDataFileName = "restaurantData.ser";
    ArrayList<Integer> orderNums = new ArrayList<>();
    
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
        int orderNum;
        
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
    
     /**
      * Creates the food objects and menu arrays, and then, adds foods to menu arrays
      * Creates restaurants and sets menu array for each and adds to the restaurants array
      * @return the restaurants array
      */
    public ArrayList<Restaurant> createRestaurants(){
        //Create all food options
        //Deli-specific foods
        Food food1 = new Food("Sandwich", 9.99);
        Food food2 = new Food("Sub", 12.99);
        Food food3 = new Food("Pasta Salad", 7);
        Food food4 = new Food("Cookie", 4.50);
        Food food5 = new Food("Chips", 3.50);
        Food food6 = new Food("Brownie", 4.50);
        //Grill-specific foods
        Food food7 = new Food("Hotdog", 6.99);
        Food food8 = new Food("Hamburger", 8.99);
        Food food9 = new Food("Turkey leg", 7);
        Food food10 = new Food("Dole Whip", 4.50);
        Food food11 = new Food("Chicken Nuggets", 6.99);
        Food food12 = new Food("Chips", 3.50);
        Food food13 = new Food("French Fries", 4.50);
        Food food14 = new Food("Milkshake", 5.00);
        //Italian-specific foods
        Food food15 = new Food("Small Pizza", 9.99);
        Food food16 = new Food("Large Pizza", 12.99);
        Food food17 = new Food("Pasta Bowl", 7);
        Food food18 = new Food("Gelato", 4.50);
        Food food19 = new Food("Dessert Pizza", 9.99);
        //Mexican-specific foods
        Food food20 = new Food("Tacos", 9.99);
        Food food21 = new Food("Burrito", 12.99);
        Food food22 = new Food("Rice Bowl", 12.99);
        Food food23 = new Food("Churro", 4.50);
        Food food24 = new Food("Chips and Salsa", 6.50);
        Food food25 = new Food("chips and Guacamole", 7.50);
        //General Beverages
        Food food26 = new Food("Fountain Drink", 2.99);
        Food food27 = new Food("Bottled Drink", 3.99);
        
        //Create Menu arrays and add Food objects to each menu
        //Create array for the deli menu and add food objects to it
        ArrayList<Food> menuDeli = new ArrayList<Food>();
        menuDeli.add(food1);
        menuDeli.add(food2);
        menuDeli.add(food3);
        menuDeli.add(food4);
        menuDeli.add(food5);
        menuDeli.add(food6);
        menuDeli.add(food26);
        menuDeli.add(food27);
        
        //Create array for the grill menu and add food objects to it
        ArrayList<Food> menuGrill = new ArrayList<Food>();
        menuGrill.add(food7);
        menuGrill.add(food8);
        menuGrill.add(food9);
        menuGrill.add(food10);
        menuGrill.add(food11);
        menuGrill.add(food12);
        menuGrill.add(food13);
        menuGrill.add(food14);
        menuGrill.add(food26);
        menuGrill.add(food27);
        
        //Create array for the Italian menu and add food objects to it
        ArrayList<Food> menuItalian = new ArrayList<Food>();
        menuItalian.add(food15);
        menuItalian.add(food16);
        menuItalian.add(food17);
        menuItalian.add(food18);
        menuItalian.add(food19);
        menuItalian.add(food26);
        menuItalian.add(food27);
        
        
        //Create array for the Mexican menu and add food objects to it
        ArrayList<Food> menuMexican = new ArrayList<Food>();
        menuMexican.add(food20);
        menuMexican.add(food21);
        menuMexican.add(food22);
        menuMexican.add(food23);
        menuMexican.add(food24);
        menuMexican.add(food25);
        menuMexican.add(food26);
        menuMexican.add(food27);
        
        //Create Restaurant objects and set the menu for each
        Restaurant restaurant1 = new Restaurant("Sandwich Shop", "delicatessen", "Area C-1");
        restaurant1.setMenuFoods(menuDeli);
        Restaurant restaurant2 = new Restaurant("Sofia's Pizza", "pizzaria", "Area B-2");
        restaurant2.setMenuFoods(menuItalian);
        Restaurant restaurant3 = new Restaurant("El Taco", "Mexican food", "Area C-1");
        restaurant3.setMenuFoods(menuMexican);
        Restaurant restaurant4 = new Restaurant("Grub Grill", "American grilled foods", "Area A-3");
        restaurant4.setMenuFoods(menuGrill);
        
        //Add restaurants to the Restaurant array to used by the food order
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
