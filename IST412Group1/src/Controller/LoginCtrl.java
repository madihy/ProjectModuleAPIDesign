/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import View.LoginUI;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import Model.Authentication;
import Model.Customer;
import View.CreateCustomerUI;
import View.LoginUI;
import View.NavigationUI;
import View.LoginUI;

import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;


/**
 *
 * @author Kate
 * This class manages the actions to facilitate the login process for all users of this application.
 */
public class LoginCtrl{
    
    Authentication auth; 
    ArrayList<Customer> customerArray; 
    LoginUI loginUI;
    CreateCustomerUI createCustUI;
    
    
    public LoginCtrl(){
        auth = new Authentication();
        auth.readCustomerDataFile();
        this.auth = auth;
        
        customerArray = new ArrayList<Customer>(auth.getCustomerArray());
        this.customerArray = customerArray;
        
               
        createCustUI = new CreateCustomerUI();
        createCustUI.setVisible(false);
        this.createCustUI = createCustUI;
        
    }
    
    public Authentication getCustomerDataFromLoginController(){
        return this.auth;
    }
    
    /**
     * Method to authenticate customer username and password from the LoginUI with the customerArray
     * @param inf_userName
     * @param inf_password
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
     * Method to find an account and returns a customer object
     * @param inf_username
     * @return 
     */
    public Customer findAccount(String inf_username){
        Customer customerToReturn = null;
        
        for (int i = 0; i < customerArray.size(); i++){
            if (customerArray.get(i).getUsername().equals(inf_username)){
                customerToReturn = customerArray.get(i);
            }
        }
        
        return customerToReturn;
    }
    
    public boolean createAccount(String inf_FirstName, String inf_LastName, String inf_Email, String inf_Username, String inf_Password) { //Method to create a new account. If account is created, return boolean is true 

        boolean accountCreateSuccess = false; //returns true if account creation is successful 
        boolean noDuplicate = true; 
        
        System.out.println(accountCreateSuccess);    
        System.out.println(inf_Username + ", " + inf_Password + ", " + inf_FirstName + ", " + inf_LastName + ", " + inf_Email);
        
        for (int i = 0; i < customerArray.size(); i++) {
            if (customerArray.get(i).getUsername().equals(inf_Username)) { //check to make sure username doesn't already exist 
                noDuplicate = false;
                System.out.println("duplicate found: " + noDuplicate);
            }            
        } 
        accountCreateSuccess = noDuplicate;
        System.out.println(accountCreateSuccess);
        
        if (accountCreateSuccess == true) {
            
            Customer newCustomer = new Customer(inf_Username, inf_Password, inf_FirstName, inf_LastName, inf_Email, null);
            customerArray.add(newCustomer);
            writeArray(customerArray);
        }
        System.out.println(accountCreateSuccess);
   

        return accountCreateSuccess;

    }
 
    public void writeArray(ArrayList<Customer> inf_arrayToWrite) { //write the local arraylist back to userdata

        auth.writeArray(inf_arrayToWrite);

    }
    
    public void makeCustomerUIVisible(){
        createCustUI.setLocationRelativeTo(null);
        createCustUI.setVisible(true);
        loginUI.setVisible(false);
    }
    
    public void makeLoginUIVisible(){
        createCustUI.setVisible(false);
        loginUI.setLocationRelativeTo(null);
        loginUI.setVisible(true);
    }
}