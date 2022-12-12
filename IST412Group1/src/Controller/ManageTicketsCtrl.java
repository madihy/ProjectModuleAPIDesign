/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.TicketOrder;

/**
 * This class allows a customer to select tickets, place the ticket order, confirm the ticket order, and manage the tickets
 * @author katerineer
 */
public class ManageTicketsCtrl {
    TicketOrder newTicketOrder;
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
    public void updateTicketSelectionButtonEvent (int inf_NumberOfTickets, int inf_NumberOfDays){
        newTicketOrder = new TicketOrder();
        newTicketOrder.setOrderNumber(newTicketOrder.createTicketOrderNumber());
        newTicketOrder.setQuantityTickets(inf_NumberOfTickets);
        newTicketOrder.setQuantityDays(inf_NumberOfDays);
        newTicketOrder.setOrderSubtotal(newTicketOrder.calculateOrderSubtotal(inf_NumberOfTickets, inf_NumberOfDays));
        newTicketOrder.setOrderTax(newTicketOrder.calculateTax(newTicketOrder.getOrderSubtotal()));
        newTicketOrder.setOrderTotal(newTicketOrder.calculateTotal(newTicketOrder.getOrderSubtotal(), newTicketOrder.getOrderTax()));
        this.newTicketOrder = newTicketOrder;  
    }
    
    public TicketOrder getTicketOrderInformation(){
        return newTicketOrder;
    }
    /**
     * Establishes the action event to be carried out when the place order button 
     * is selected on the place order user interface screen.
     * Confirms the order information and takes the user to the confirm order screen.
     * @param event sets the event variable to occur when the place order button is selected.
     */
    public TicketOrder purchaseTicketsButtonEvent (){
        this.getTicketOrderInformation();
        newTicketOrder.setTicketsOrdered();
        this.newTicketOrder = newTicketOrder;
        
        return newTicketOrder;   
  
    }
}
