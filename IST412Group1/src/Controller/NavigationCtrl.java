/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.NavigationUI;
import View.CreateCustomerUI;
import Model.Customer;
import java.awt.event.ActionEvent;

/**
 * This class provides the actions to facilitate user interface navigation menus in the application.
 * @author katerineer
 * 
 */
public class NavigationCtrl {
    
    /**
     * This is the default constructor for the NavigationCtrl class.
     */
    public NavigationCtrl(){
        
    }
    /**
     * Handles the actions to occur when the Customer Account button is clicked on the Main Navigation Menu.
     * Opens the customer user interface screen.
     * Displays the current customer's information in the text fields.
     */
    public void handleCustomerAccountButtonAction () {
        //Opens the Customer UI by setting the customerUIActive boolean to true 
        System.out.println("Button clicked to open the CustomerUI and display account information.\n");
        //Displays the current customer information
                
    }
    /**
     * Handles the actions to occur when the update button is clicked on the Customer User Interface.
     */
    public void handleUpdateCustomerButtonAction (){
        System.out.println("\n"+ "Button clicked to update the customer account.");
        
    }
    
    /**
     * Handles actions to take place when the Back Button is clicked.
     */
    public void handleCustomerBackButtonAction (){
        System.out.println("Button clicked to go back to the Navigtion Menu.");
            
    }
    
    /**
     * Handles actions to take place when the Exit Button is clicked.
     */
    public void handleExitButtonAction (){
        System.out.println("Button clicked to exit the application.");
        
    }
    
    /**
     * Handles actions to take place when the Park Information Button is clicked.
     */
    public void handleParkInformationButtonAction (){
        System.out.println("Button clicked to access Park Information.");
    }
    
    /**
     * Handles actions to take place when the Purchase Tickets Button is clicked.
     */
    public void handlePurchaseTicketsButtonAction (){
        System.out.println("Button clicked to Purchase Tickets.");
    }
    
    /**
     * Handles actions to take when the Manage Tickets Button is clicked.
     */
    public void handleManageTicketsButtonAction (){
        System.out.println("Button clicked to Manage Tickets.");
        
    }
    
    /**
     * Handles actions to take when the Manage Activities Button is clicked.
     */
    public void handleManageActivitiesButtonAction (){
        System.out.println("Button clicked to Manage Activities.");
    }
    
    /** 
     * Handles actions to take place when the Manage Food Orders button is clicked.
     */
    public void handleManageFoodOrdersButtonAction (){
        System.out.println("Button clicked to Manage Food Orders.");
    }
    
    /**
     * Handles actions to take when the Manage Reports Button is clicked.
     */
    public void handleManageReportsButtonAction (){
        System.out.println("Button clicked to Manage Reports.");
    }
    
}
