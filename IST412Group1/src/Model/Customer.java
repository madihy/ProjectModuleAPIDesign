package Model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * This is the subclass Customer that extends the superclass Accounts and contains account information specific to customers.
 * @author brandonworley and katerineer
 */
public class Customer extends Account{    
    private String email;
    private ArrayList<Ticket> purchasedTickets;
    private ArrayList<FoodOrder> foodOrders;
    private ArrayList<Activity> reservedActivities;

    
    /**
     * This is the full constructor for the Customer subclass.
     * @param username the customer's account user name.
     * @param password the customer's account password.
     * @param firstName the customer's account first name.
     * @param lastName the customer's account last name.
     * @param email the customer's email.
     * @param purchasedTickets array list of the tickets the customer has purchased.
     * @param foodOrders array list of the food order the customer has placed.
     * @param reservedActivities array list of the activity reservations the customer has placed.
     */
    
    public Customer(String username, String password, String firstName, String lastName, String email, 
            ArrayList<Ticket> purchasedTickets, ArrayList<FoodOrder> foodOrders, ArrayList<Activity> reservedActivities) {
        
        super(username, password, firstName, lastName);  
        
        this.email = email;
        this.purchasedTickets = purchasedTickets;
        this.foodOrders = foodOrders;
        this.reservedActivities = reservedActivities;
    }
    
    
    /**
     * Returns the email for this account.
     * @return a string representing the email for this account.
     */
    public String getEmail() {
        System.out.println("Email: " + email);
        return email;
    }

    /**
     * Checks the format of the email string and sets the email for this account.
     * @param email sets the email for this account.
     */
    public void setEmail(String email) {
        //verifies the email address is formatted correctly
         String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (this.email.matches(regex)) {
            this.email = email;
        } else {
            System.out.println("Not a valid address!");
        }
    }

    /**
     * Gets the list of tickets purchased by this customer.
     * @return the ArrayList purchasedTickets representing the list of tickets purchased by the customer.
     */
    public ArrayList<Ticket> getPurchasedTickets() {
               
        return purchasedTickets;
    }

    /**
     * Sets the array list of tickets purchased by this customer.
     * @param purchasedTickets sets the list of tickets purchased by the customer.
     */
    public void setPurchasedTickets(ArrayList<Ticket> purchasedTickets) {
        this.purchasedTickets = purchasedTickets;
    }

    /**
     * Gets the list of food orders by this customer.
     * @return the foodOrders and Array List of the customer's food orders.
     */
    public ArrayList<FoodOrder> getFoodOrders() {
        return foodOrders;
    }

    /**
     * Sets the array list of the food orders for this customer
     * @param foodOrders array list sets the list of food orders placed by the customer
     */
    public void setFoodOrders(ArrayList<FoodOrder> foodOrders) {
        this.foodOrders = foodOrders;
    }

    /**
     * Gets the list of activities reserved by this customer
     * @return the reservedActivities array list representing reserved activities for the customer
     */
    public ArrayList<Activity> getReservedActivities() {
        return reservedActivities;
    }

    /**
     * Sets the list of reserved activities for this customer
     * @param reservedActivities sets the list of reserved activities for the customer
     */
    public void setReservedActivities(ArrayList<Activity> reservedActivities) {
        this.reservedActivities = reservedActivities;
    }
    
    
}
