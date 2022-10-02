package Model;


/**
 * This is the subclass Customer that extends the superclass Accounts and contains account information specific to customers.
 * @author brandonworley and katerineer
 */
public class Customer extends Account {
    private String DOB;
    private String email;

    
    /**
     * This is the full constructor for the Customer subclass.
     * @param accountID the customer's account ID number.
     * @param userName the customer's account user name.
     * @param password the customer's account password.
     * @param firstName the customer's account first name.
     * @param lastName the customer's account last name.
     * @param DOB the customer's date of birth.
     * @param email the customer's email.
     */
    public Customer(int accountID, String userName, String password, String firstName, String lastName, String DOB, String email) {
        
        super(accountID, userName, password, firstName, lastName);
        
        this.DOB = DOB;
        this.email = email;
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

    /**
     * Returns the email for this account.
     * @return a string representing the email for this account.
     */
    public String getEmail() {
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
}
