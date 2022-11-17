
package Controller;

import Model.Account;
import Model.Customer;
import View.CreateCustomerUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Authentication;
import java.util.ArrayList;
import View.*;

/**
 *
 * @author brandonworley
 */
public class CreateCustomerCtrl implements ActionListener {
    private String username;
    private String password;
    private String firstName; 
    private String lastName; 
    private String email;
    private CreateCustomerUI createCust;
    private ArrayList<Customer> usersArray;
    private Authentication auth;
    
     /**
     * This is the default constructor for the CreateCustomerCtrl class.
     */
    
    public CreateCustomerCtrl() {
        CreateCustomerUI createCust = new CreateCustomerUI();
        //createCust = new CreateCustomerUI();
        //customerUI.add(createCust);
        
        createCust.setVisible(true);
        addALButtons();
        createCust.lblSaveAccountError.setVisible(false);
        
    }
    
    /**
     * Adds action listener to "Save" and "Cancel" buttons.
     */
    
    public void addALButtons() {
        createCust.btnSave.addActionListener(this);
        createCust.btnCancel.addActionListener(this);
    }       
  
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == createCust.btnCancel) {
            createCust.tfFirstName.setText(null);
            createCust.tfLastName.setText(null);
            createCust.tfEmail.setText(null);
            createCust.tfUsername.setText(null);
            createCust.tfPassword.setText(null);
            createCust.setVisible(false);
            
        }
        if (obj == createCust.btnSave) {
            firstName = createCust.tfFirstName.getText();
            lastName = createCust.tfLastName.getText();
            email = createCust.tfEmail.getText();
            username = createCust.tfUsername.getText();
            password = createCust.tfPassword.getText();
            auth = new Authentication(usersArray, username, password);
            auth.readUserDataFile();            
            for (int i = 0; i < usersArray.size(); i++) {
                if (usersArray.contains(username)) {                
                    createCust.tfUsername.setText(null);
                    createCust.lblSaveAccountError.setVisible(true); 
                }
            }
            if (!username.isEmpty() && !password.isEmpty() && !firstName.isEmpty() && !lastName.isEmpty()) {
                Customer newCust = new Customer(username, password, firstName, 
                        lastName, email);
                usersArray.add(newCust);
                auth.writeUserDataFile();
                createCust.setVisible(false);
            }
        }    
    }
}

