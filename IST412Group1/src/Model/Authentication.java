/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This class is for the authentication of a system user's login username and password.
 * @author katerineer
 */
public class Authentication{
    private ArrayList<Account> usersArray = new ArrayList<>();
    private String currentUsername;
    private String currentPassword;
    
    /**
     * This is the full constructor for the authentication class. 
     */
    public Authentication (ArrayList usersArray, String currentUsername, String currentPassword){
        
        createTestUsers();
        this.usersArray = usersArray;
        this.currentUsername = currentUsername;
        this.currentPassword = currentPassword;
               
    }
    
    /**
     * Creates test user accounts to allow testing of the application throughout development.
     */ 
    public void createTestUsers() {
        //int accountID, String username, String password, String firstName, String lastName
        //Populate array with some test users 
        Account account1 = new Account(1001, "username1", "password1", "user1FirstName", "user1LastName");
        Account account2 = new Account(1002, "username2", "password2", "user2FirstName", "user2LastName");
        Account account3 = new Account(1003, "username3", "password3", "user3FirstName", "user3LastName");
        Account account4 = new Account(1004, "username4", "password4", "user4FirstName", "user4LastName");
        Account account5 = new Account(1005, "username5", "password5", "user5FirstName", "user5LastName");
        
        getUsersArray().add(account1);
        getUsersArray().add(account2);
        getUsersArray().add(account3);
        getUsersArray().add(account4);
        getUsersArray().add(account5);   
    }

    /**
     * @return the usersArray
     */
    public ArrayList<Account> getUsersArray() {
        return usersArray;
    }

    /**
     * @param usersArray the usersArray to set
     */
    public void setUsersArray(ArrayList<Account> usersArray) {
        this.usersArray = usersArray;
    }

    /**
     * @return the currentUsername
     */
    public String getCurrentUsername() {
        return currentUsername;
    }

    /**
     * @param currentUsername the currentUsername to set
     */
    public void setCurrentUsername(String currentUsername) {
        this.currentUsername = currentUsername;
    }

    /**
     * @return the currentPassword
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * @param currentPassword the currentPassword to set
     */
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }
}

    