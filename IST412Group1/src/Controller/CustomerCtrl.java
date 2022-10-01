package Control;


/**
 * This class will add, update, and delete customer info
 * @author brandonworley
 */
public class CustomerCtrl {
    private long custID;
    
    /**
     * Assign a unique customer ID number to each customer
     * @return A long representing the new customer ID number
     */
    public long assignCustID() {
        return custID;
    }

    public long getCustID() {
        return custID;
    }

    public void setCustID(long custID) {
        this.custID = custID;
    }

    
}
