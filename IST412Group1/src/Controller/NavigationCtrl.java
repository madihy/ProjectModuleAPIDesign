/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.NavigationUI;
import View.CustomerUI;
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
     * @param event 
     */
    public void handleCustomerAccountButtonAction () {
        //Opens the Customer UI by setting the customerUIActive boolean to true 
        System.out.println("Action to open the CustomerUI and display account information.\n");
        //Displays the current customer information
                
    }
    /**
     * Handles the actions to occur when the update button is clicked on the Customer User Interface.
     * @param event 
     */
    public void handleUpdateCustomerButtonAction (){
        System.out.println("Update the customer account.");
        
    }
    
    public void handleBackButtonAction (){
        System.out.println("Click button to go back to the Navigtion Menu.");
        
    }
    
    public void handleExitButtonAction (){
        System.out.println("The application exits!");
    }
    
    //Additional buttons to be added to the Main Navigation Menu still under development.
    /**
    
    public void handleParkInformationButtonAction (ActionEvent event){
        System.out.println("Park Information Controller has been started.");
    }
    
    public void handlePurchaseTicketsButtonAction (ActionEvent event){
        System.out.println("Manage Tickets Controller is created and opens the PurchaseTicketsUI.");
    }
    
    public void handleManageTicketsButtonAction (ActionEvent event){
        System.out.println("Manage Tickets Controller is created and opens the ManageTicketsUI. /n");
        
    }
    
    public void handleManageReservationsButtonAction (ActionEvent event){
        System.out.println("Manage Reservations Controller is created and opens the ActivityUI. /n");
    }
    
    public void handleManageFoodOrdersButtonAction (ActionEvent event){
        System.out.println("Manage Food Controller is created and opens the OrderFoodUI. /n");
    }
    
    public void handleExitButtonAction (ActionEvent event){
        System.out.println("The application exits!");
    }
    */
    
}
