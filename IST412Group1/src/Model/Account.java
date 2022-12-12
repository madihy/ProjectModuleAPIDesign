/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 * This is a class for the account login information that will be used for both customers and employees.
 * Customer and employee classes will extend this class.
 * @author brandonworley and katerineer
 */
public class Account implements Serializable{

    private String username;
    private String password;
    private String firstName; 
    private String lastName; 
        
    /**
     * This is the full constructor for the Account class.
     * @param username
     * @param password
     * @param firstName
     * @param lastName 
     */
    
    public Account(String username, String password, String firstName, String lastName) {  
        //Instantiates the userName and password variables.
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;    

    }

    /**
     * Returns the username for this login account.
     * @return a string representing the username for this login account.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the user name for this account.
     * @param username sets the user name for the account.
     */
    public void setUserName(String userName) {      
        this.username = username;
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
