package Model;

import java.util.ArrayList;


/**
 * This is the subclass Customer that extends the superclass Accounts and contains account information specific to customers.
 * @author brandonworley and katerineer
 */
public class Customer extends Account {    
    private String email;
    private ArrayList<Ticket> purchasedTickets = new ArrayList<>();

    
    /**
     * This is the full constructor for the Customer subclass.
     * @param accountID the customer's account ID number.
     * @param username the customer's account user name.
     * @param password the customer's account password.
     * @param firstName the customer's account first name.
     * @param lastName the customer's account last name.
     * @param DOB the customer's date of birth.
     * @param email the customer's email.
     * @param purchasedTickets array list of the tickets the customer has purchased.
     */
    
    public Customer(String username, String password, String firstName, String lastName, String email) {
        
        super(username, password, firstName, lastName);  
        
        this.email = email;
        this.purchasedTickets = purchasedTickets;
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
        System.out.println("Purchased Tickets: " + purchasedTickets);
        return purchasedTickets;
    }

    /**
     * Sets the array list of tickets purchased by this customer.
     * @param purchasedTickets sets the list of tickets purchased by the customer.
     */
    public void setPurchasedTickets(ArrayList<Ticket> purchasedTickets) {
        this.purchasedTickets = purchasedTickets;
    }
    
    
}
