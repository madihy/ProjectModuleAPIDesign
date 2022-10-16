package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * This class will allow customers to input their info and display that info
 * @author brandonworley
 */
public class CustomerUI {
    private JFrame customerAccountPanel;
    JButton updateAccountButton;
    JButton backToMainNavigationButton;
    private boolean customerUIActive = false;
    
    /**
     * This is the default constructor for the CustomerUI class.
     */
    public CustomerUI(){
    
    }

    /**
     * Gets the Boolean value representing this customer interface screen status.
     * @return the Boolean customerUIActive representing the customer interface screen status.
     */
    public boolean isCustomerUIActive() {
        return customerUIActive;
    }

    /**
     * Sets the boolean status for this customer interface screen status.
     * @param customerUIActive sets the boolean status for the customer interface screen status.
     */
    public void setCustomerUIActive(boolean customerUIActive) {
        this.customerUIActive = customerUIActive;
    }

    
}
