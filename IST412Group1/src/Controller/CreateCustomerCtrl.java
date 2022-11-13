
package Controller;

import Model.Account;
import View.CreateCustomerUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    
    public CreateCustomerCtrl() {
        createCust = new CreateCustomerUI();   
        addALButtons();
        createCust.setVisible(true);
        
    }
    
    public void addALButtons() {
        createCust.btnSave.addActionListener(this);
        createCust.btnClear.addActionListener(this);
    }       
  
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == createCust.btnClear) {
            createCust.tfFirstName.setText("");
            createCust.tfLastName.setText("");
            createCust.tfEmail.setText("");
            createCust.tfUsername.setText("");
            createCust.tfPassword.setText("");
        }
        if (obj == createCust.btnSave) {
            firstName = createCust.tfFirstName.getText();
            lastName = createCust.tfLastName.getText();
            email = createCust.tfEmail.getText();
            username = createCust.tfUsername.getText();
            password = createCust.tfPassword.getText();
            
            // Should the account number randomizer go here?
            // Create a new account object and save it to the users arraylist
            
        }
    }    
}
