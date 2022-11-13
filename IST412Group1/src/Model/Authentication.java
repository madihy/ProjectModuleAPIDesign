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
    public ArrayList<Account> usersArray = new ArrayList<>();
    private String currentUsername;
    private String currentPassword;
    
    /**
     * This is the full constructor for the authentication class.
     * @param usersArray array of user accounts to be used in the authentication process
     * @param currentUsername string for the current username used in the authentication process
     * @param currentPassword string for the current password used in the authentication process
     */
    public Authentication (ArrayList usersArray, String currentUsername, String currentPassword){
        
        createTestUsers();
        this.usersArray = usersArray;
        this.currentUsername = currentUsername;
        this.currentPassword = currentPassword;
               
    }

    /**
     * Creates test user accounts to allow testing of the application throughout development.
     * Gets the users array and adds the new accounts to the users array list.
     */ 
    public void createTestUsers() {
        
        //Populate array with some test users 
        Account account1 = new Account("username1", "password1", "user1FirstName", "user1LastName");
        Account account2 = new Account("username2", "password2", "user2FirstName", "user2LastName");
        Account account3 = new Account("username3", "password3", "user3FirstName", "user3LastName");
        Account account4 = new Account("username4", "password4", "user4FirstName", "user4LastName");
        Account account5 = new Account("username5", "password5", "user5FirstName", "user5LastName");
        
        //Adds user accounts to the user array
        getUsersArray().add(account1);
        getUsersArray().add(account2);
        getUsersArray().add(account3);
        getUsersArray().add(account4);
        getUsersArray().add(account5);   
    }

    /**
     * Gets array list of user accounts.
     * @return the array list usersArray representing the list of user accounts.
     */
    public ArrayList<Account> getUsersArray() {
        return usersArray;
    }

    /**
     * Sets the array list of user accounts.
     * @param usersArray sets the array list of user accounts.
     */
    public void setUsersArray(ArrayList<Account> usersArray) {
        this.usersArray = usersArray;
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


    public void readUserDataFile() {

        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream("USERDATA.txt");
            in = new ObjectInputStream(fis);
            usersArray = (ArrayList<Account>) in.readObject();
            in.close();

            if (!usersArray.isEmpty()) {
                System.out.println("User Data Loaded from File");
            }

        } catch (IOException ex) {
            //ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            // ex.printStackTrace();
        }

    }

    public void writeUserDataFile() {

        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try {
            fos = new FileOutputStream("USERDATA.txt");
            out = new ObjectOutputStream(fos);
            out.writeObject(usersArray);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}