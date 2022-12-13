/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This class is for the authentication of a system user's login username and password.
 * @author katerineer
 */
public class Authentication{
    public ArrayList<Customer> customerArray = new ArrayList<>();
    String customerDataFileName = "customerData.ser";
    Customer currentUser;
    private String currentUsername;
    private String currentPassword;
    
    
    /**
     * This is the full constructor for the authentication class.
     * @param usersArray array of user accounts to be used in the authentication process
     * @param currentUsername string for the current username used in the authentication process
     * @param currentPassword string for the current password used in the authentication process
     */
    public Authentication (){
        
        this.readCustomerDataFile();
        
        if (customerArray.isEmpty() || customerArray == null){
                       
            this.createTestCustomers();
            this.writeCustomerDataFile();
            this.readCustomerDataFile();
        }
               
    }

    /**
     * Creates test user accounts to allow testing of the application throughout development.
     * Gets the users array and adds the new accounts to the users array list.
     */ 
    public void createTestCustomers() {
        
        //Populate array with some test users 
        Customer customer1 = new Customer("username1", "password1", "user1FirstName", "user1LastName", "email1@test.com", null, null, null);
        Customer customer2 = new Customer("username2", "password2", "user2FirstName", "user2LastName", "email2@test.com", null, null, null);
        Customer customer3 = new Customer("username3", "password3", "user3FirstName", "user3LastName", "email3@test.com", null, null, null);
        
        
        //Adds customer accounts to the customer array
        getCustomerArray().add(customer1);
        getCustomerArray().add(customer2);
        getCustomerArray().add(customer3);
        
    }

    /**
     * Gets array list of customer accounts.
     * @return the array list customerArray representing the list of customer accounts.
     */
    public ArrayList<Customer> getCustomerArray() {
        return customerArray;
    }

    /**
     * Sets the array list of user accounts.
     * @param usersArray sets the array list of user accounts.
     */
    public void setUsersArray(ArrayList<Account> usersArray) {
        this.customerArray = customerArray;
    }

    /**
     * Gets the string value for the current username for the authentication process.
     * @return the string representing currentUsername for the authentication process.
     */
    public String getCurrentUsername() {
        return currentUsername;
    }

    /**
     * Sets the current username for the authentication process.
     * @param currentUsername sets the current username for the authentication process.
     */
    public void setCurrentUsername(String currentUsername) {
        this.currentUsername = currentUsername;
    }

    /**
     * gets the current user's password for the authentication process.
     * @return the string currentPassword representing the current password for the authentication process.
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * Sets the current user's password for the authentication process.
     * @param currentPassword sets the current user's password for the authentication process.
     */
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

/**
 * The following methods are used to read and write data in the customer data file
 */
    public void readCustomerDataFile() {

        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(customerDataFileName);
            in = new ObjectInputStream(fis);
            customerArray = (ArrayList<Customer>) in.readObject();
            in.close();

            if (!customerArray.isEmpty()) {
            }
            this.customerArray = customerArray;

        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }

    }

    public void writeArray(ArrayList<Customer> inf_userArray) {
        this.customerArray = inf_userArray;

        writeCustomerDataFile();

    }
    
    public void writeCustomerDataFile() {

        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try {
            fos = new FileOutputStream(customerDataFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(customerArray);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
 
}