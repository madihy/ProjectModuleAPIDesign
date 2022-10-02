/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * This is the subclass Customer that extends the superclass Accounts and contains account information specific to customers.
 * @author katerineer
 */
public class Employee extends Account{
    
    private String accessLevel;//such as park check-in, customer service, management
    
    /**
     * This is the full constructor for the Employee subclass.
     * @param accountID the employee's account ID number
     * @param userName the employee's account user name.
     * @param password the employee's account password.
     * @param firstName the employee's account first name.
     * @param lastName the employee's account last name.
     * @param accessLevel the employee's access level.
     */
    
    public Employee (int accountID, String userName, String password, String firstName, String lastName,String accessLevel){
        
        super(accountID, userName, password, firstName, lastName);
        
        accessLevel = "";
        this.accessLevel = accessLevel;
        
    }

    /**
     * Returns the access level of this employee.
     * @return the string accessLevel representing the access level of the employee.
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the access level for this employee.
     * @param accessLevel sets the access level for the employee.
     */
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
    
}
