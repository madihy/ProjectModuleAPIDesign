/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author brandonworley and katerineer
 * This is an abstract class for the account login information that will be used for both customers and employees.
 * Customer and employee classes will extend this class.
 */
abstract class Account {

    private int accountID;
    private String userName;
    private String password;
    private String firstName; 
    private String lastName; 
    private Boolean accountTypeCustomer;
        
    /**
     * This is the constructor for the Account abstract class.
     * @param accountID
     * @param userName
     * @param password
     * @param firstName
     * @param lastName 
     */
    
    public Account(int accountID, String userName, String password, String firstName, String lastName) {  
        //Instantiates the userName and password variables.
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        
        //Instantiates the account ID.
        Random randomAcctID = new Random();
        this.accountID = randomAcctID.nextInt(1000);
        
        //Instantiates the account type Boolean value.
        accountTypeCustomer = true;

    }

    /**
     * Returns the user name for this login account.
     * @return a string representing the userName for this login account.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the user name for this account.
     * @param userName sets the user name for the account.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Returns the account ID for this account.
     * @return the integer representing the accountID for the account.
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * Sets the account ID for this account.
     * @param accountID sets the account ID for the account.
     */
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    /**
     * Returns the password for this login account.
     * @return a string representing the password for this login account.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password for this account.
     * @param password sets the password for the account.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * * Returns the first name for this account.
     * @return a string representing the firstName for this account.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name for this account.
     * @param firstName sets the first name for the account.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name for this account.
     * @return a string representing the lastName for the account.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name for this account.
     * @param lastName sets the last name for the account.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
