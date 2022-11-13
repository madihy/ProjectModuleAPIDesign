/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Account;
import Model.Authentication;
import View.LoginUI;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 *
 * @author Kate
 * This class manages the actions to facilitate the login process for all users of this application.
 */
public class LoginCtrl {
    public ArrayList<Account> usersArray = new ArrayList<>();
    public String currentUsername;
    public String currentPassword;
    private String event;
    LoginUI login;
    /**
     * Login method to authenticate user login credentials.
     */
    public void login(String username, String password) {
        Authentication auth = new Authentication(usersArray, currentUsername, currentPassword);
        auth.readUserDataFile();
        View.LoginUI loginUI = new View.LoginUI();
        loginUI.setVisible(true);      
        
        
        auth.createTestUsers();
        
    }
    
    /**
     * Establishes the action event to be carried out when the submit button is selected on the login screen.
     * Authenticates the user name and password from the list of accounts stored in a data file.
     * Throws an exception and provides an message on the screen if the login information is not found.
     */
    public void handleSubmitButtonAction() {
        //File inputFile = new File("USERDATA.txt");
        String userNameInput = currentUsername;
        String passwordInput = currentPassword;
       
        try {
            Scanner in = new Scanner(new File("USERDATA.txt"));
            while (in.hasNextLine())
            {
                String s = in.nextLine();
                String[] sArray = s.split(",");

                if (userNameInput.equals(sArray[0]) && passwordInput.equals(sArray[1]))
                {
                    JOptionPane.showMessageDialog(null,
                            "Login Successful", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Invalid Username / Password Combo", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            in.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "User Database Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * Establishes the action event to be carried out when the new user button is selected on the login screen.
     * Directs the user to the new user login screen to set up a user account.
     */
    public void handleNewUserButtonAction(){
        CreateCustomerCtrl cusCtrl = new CreateCustomerCtrl(); 
        
    }

}
