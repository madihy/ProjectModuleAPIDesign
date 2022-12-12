/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import Model.Authentication;
import Model.Customer;
import View.CreateCustomerUI;
import View.LoginUI;

/**
 *
 * @author Kate
 * This class manages the actions to facilitate the login and create new customer 
 * processes for all users of this application.
 */
public class LoginCtrl{
    
    Authentication auth; 
    ArrayList<Customer> customerArray; 
    LoginUI loginUI;
    CreateCustomerUI createCustUI;
    
    /**
     * This is the constructor for the LoginCtrl class.
     */
    public LoginCtrl(){
        auth = new Authentication(); //creates the authentication class object
        auth.readCustomerDataFile(); //read persisted file of customers
        this.auth = auth;
        
        //passes customers array stored in the persisted file to the current application class
        customerArray = new ArrayList<Customer>(auth.getCustomerArray());
        this.customerArray = customerArray;
        
        //creates the create customer UI and sets it visible      
        createCustUI = new CreateCustomerUI();
        createCustUI.setVisible(false);
        this.createCustUI = createCustUI;
        
    }
    /**
     * Passes the customer data from the authentication class to use in the Login Controller
     * @return 
     */
    public Authentication getCustomerDataFromLoginController(){
        return this.auth;
    }
    
    /**
     * Authenticates customer username and password from the LoginUI with the customerArray.
     * @param inf_userName is a string representing the username entered by the user on login screen
     * @param inf_password is a string representing the password entered by the user on login screen
     * @return 
     */
    public boolean authenticateUser(String inf_userName, String inf_password){
        boolean authStatus = false; //return true if authentication, else false
        
        String usernameToAuthenticate = inf_userName;//username from the LoginUI
        String passwordToAuthenticate = inf_password;//password from the LoginUI
        Customer customerToVerify;
        
        customerToVerify = findAccount(usernameToAuthenticate);//search the customerArray for a username, return a Customer object
        
        if (customerToVerify != null && customerToVerify.getPassword().equals(passwordToAuthenticate)){ //checks if the Customer object's password equals the password to authenticate.
            authStatus = true;
        }
        else {
            authStatus = false;
        }
        
        return authStatus;
        
    }
    /**
     * Finds an account and returns a customer object that matches the current username.
     * @param inf_username is a string representing the text field entry by user for the username.
     * @return 
     */
    public Customer findAccount(String inf_username){
        Customer customerToReturn = null;
        
        //For loop checks the current username provided to find the customer in the customer array
        for (int i = 0; i < customerArray.size(); i++){
            if (customerArray.get(i).getUsername().equals(inf_username)){
                customerToReturn = customerArray.get(i);
            }
        }
        
        return customerToReturn;
    }
    /**
     * Creates the account object for this new customer.
     * Validates against duplicates and blanks on fields with all fields being required.
     * Calls the method to write the new account to the customer array to persist for the application.
     * @param inf_FirstName is a string representing the first name for the new account
     * @param inf_LastName is a string representing the last name for the new account
     * @param inf_Email is a string representing the email for the new account
     * @param inf_Username is string representing the username for the new account
     * @param inf_Password is a string representing the password for the new account
     * @return 
     */
    public boolean createAccount(String inf_FirstName, String inf_LastName, String inf_Email, String inf_Username, String inf_Password) { //Method to create a new account. If account is created, return boolean is true 

        boolean accountCreateSuccess = false; //returns true if account creation is successful 
        boolean noDuplicate = true; 
        
        for (int i = 0; i < customerArray.size(); i++) {
            if (customerArray.get(i).getUsername().equals(inf_Username)) { //check to make sure username doesn't already exist 
                noDuplicate = false;
                
            }            
        } 
        accountCreateSuccess = noDuplicate;
        
        
        if (accountCreateSuccess == true) {
            
            Customer newCustomer = new Customer(inf_Username, inf_Password, inf_FirstName, inf_LastName, inf_Email, null);
            customerArray.add(newCustomer);
            writeArray(customerArray);
        }
   

        return accountCreateSuccess;

    }
    /**
     * Writes the local arraylist back to the user data file to be persisted
     * @param inf_arrayToWrite 
     */
    public void writeArray(ArrayList<Customer> inf_arrayToWrite) { //write the local arraylist back to userdata

        auth.writeArray(inf_arrayToWrite);

    }
 
}