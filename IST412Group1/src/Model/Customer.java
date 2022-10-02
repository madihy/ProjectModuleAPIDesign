package Model;


/**
 * This class contains information about the Customer
 * @author brandonworley
 */
public class Customer {
    private String firstName;
    private String lastName;
    private long custNum;
    private String DOB;

    /**
     * This is the default constructor for the Customer class
     */
    public Customer() {
        this.firstName = "None";
        this.lastName = "None";
        this.custNum = 000000;
        this.DOB = "00/00/0000";
    }

    /**
     * This is the full constructor for the Customer class
     *
     * @param firstName Customer's first name
     * @param lastName Customer's last name
     * @param custNum Customer's unique customer number
     * @param DOB Customer's date of birth
     */
    public Customer(String firstName, String lastName, long custNum, String DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.custNum = custNum;
        this.DOB = DOB;
    }

    /**
     * Returns the customer's first name
     *
     * @return A string of the customer's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the First Name of the Customer
     *
     * @param firstName Sets the first name of the customer
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the customer
     *
     * @return A string of the customer's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the customer
     *
     * @param lastName Sets the last name of the customer
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
/**
 * Gets the customer's unique customer number
 * @return a long that represents the customer number
 */    
    public long getCustNum() {
        return custNum;
    }

    /**
     * Sets the unique customer number for the customer
     * @param custNum Sets the customer number
     */
    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    /**
     * Gets the customer's Date of Birth (mm/dd/yyyy)
     * @return A string containing the customer's date of birth (mm/dd/yyyy)
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * Sets the date of birth of the customer in the format mm/dd/yyyy
     * @param DOB Sets the date of birth of the customer (mm/dd/yyyy)
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

}
