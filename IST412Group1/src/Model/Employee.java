/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * This is the subclass Employee that extends the superclass Accounts and contains account information specific to employees.
 * @author katerineer
 */
public class Employee extends Account{
    private String authLevel;//such as rides, foods, shows, helpdesk, manager, and so on
    
    /**
     * This is a full constructor for the Employee subclass.
     * @param accountID the employee's account ID number.
     * @param userName the employee's account user name.
     * @param password the employee password.
     * @param firstName the employee's account first name.
     * @param lastName the employee's account last name.
     * @param authLevel the employee's authorization level.
     */
    public Employee (int accountID, String userName, String password, String firstName, String lastName, String authLevel){
        
        super(accountID, userName, password, firstName, lastName);
        
        authLevel = ""; //instantiates the authLevel string variable
        this.authLevel = authLevel;
              
    } 

    /**
     * Gets the employee's system authorization level.
     * @return the string authLevel representing the employee's system authorization level.
     */
    public String getAuthLevel() {
        return authLevel;
    }

    /**
     * Sets the string value for the employee's authorization level.
     * @param authLevel sets the authorization level of the employee.
     */
    public void setAuthLevel(String authLevel) {
        this.authLevel = authLevel;
    }
    
    
}
