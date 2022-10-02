package Control;


/**
 * This class will add, update, and delete customer info
 * @author brandonworley
 */
public class CustomerCtrl {
    private long custID;
    
    /**
     * Generate and assign a unique customer ID number to each customer
     * @return A long representing the new customer ID number
     */
    public long generateCustID() {
        return custID;
    }

    /**
     * Get the customer ID number
     * @return A long representing the customer ID number
     */
    public long getCustID() {
        return custID;
    }

    /**
     * Set the unique customer ID number
     * @param custID Sets the unique customer ID number
     */
    public void setCustID(long custID) {
        this.custID = custID;
    }

    
}
