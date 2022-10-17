/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;

/**
 * This class allows a customer to select tickets, place the ticket order, confirm the ticket order, and manage the tickets
 * @author katerineer
 */
public class ManageTicketsCtrl {
    
    /**
     * This is the default constructor for the ManageTicketsCtrl class
     */
    public ManageTicketsCtrl(){
    
    }
    /**
     * Establishes the action event to be carried out when the update ticket selection button is clicked.
     * Submits the quantity and ticket type information to use on the Place Order screen.
     * @param event sets the event variable to occur when the purchase ticket button is selected.
     */
    public void updateTicketSelectionButtonEvent (){
        System.out.println("Button clicked to set the ticket selection information.");
        
    }
    /**
     * Establishes the action event to be carried out when the place order button 
     * is selected on the place order user interface screen.
     * Confirms the order information and takes the user to the confirm order screen.
     * @param event sets the event variable to occur when the place order button is selected.
     */
    public void purchaseTicketsButtonEvent (ActionEvent event){
        
    }
    /**
     * Establishes the action event to be carried out when the cancel order button 
     * is selected on the place order user interface screen.
     * Confirms the order information and takes the user back to the select tickets screen.
     * @param event sets the event variable to occur when the cancel order button is selected.
     */
    public void cancelOrderButtonEvent (ActionEvent event){
        
    }
    
    /**
     * Establishes the action event to be carried out when the manage tickets button 
     * is selected on the confirm order user interface screen.
     * Confirms the order information and takes the user to the manage tickets screen.
     * @param event sets the event variable to occur when the manage tickets button is selected.
     */
    public void manageTicketsButtonEvent (ActionEvent event){
        
    }
    
    /**
     * Establishes the action event to be carried out when the open ticket button 
     * is selected on the manage tickets user interface.
     * @param event sets the event variable to occur when the open ticket button is selected.
     */
    public void openTicketsButtonEvent (ActionEvent event){
        
    }
    
    /**
     * Establishes the action event to be carried out when the assign ticket button 
     * is selected on the manage tickets user interface.
     * @param event sets the event variable to occur when the assign ticket button is selected.
     */
    public void assignTicketsButtonEvent (ActionEvent event){
        
    }
        
    
    
}
