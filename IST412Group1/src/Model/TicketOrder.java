/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.lang.reflect.Array;

/**
 *
 * @author katerineer
 * A class to create an ticket order for tickets to be purchased.
 * This class creates instances of tickets and adds them to an array for the ticket order.
 */
public class TicketOrder{
   
     private int orderNumber;
     private Array[] adultTickets = null;
     private Array[] seniorTickets = null;
     private Array[] childTickets = null;
     private double orderSubtotal = 0;
     private double orderTax = 0;
     private double orderTotal = 0;
     private String orderStatus = ""; //in progress, complete
     
     /**
      * This is the basic constructor for the TicketOrder class.
      * @param orderNumber
      * @param adultTickets
      * @param seniorTickets
      * @param childTickets
      * @param orderSubtotal
      * @param orderTax
      * @param orderTotal
      * @param orderStatus 
      */
     public TicketOrder(int orderNumber, Array[] adultTickets, Array[] seniorTickets, Array[] childTickets, double orderSubtotal, double orderTax, double orderTotal, String orderStatus){
         
         this.orderNumber = orderNumber;
         this.adultTickets = adultTickets;
         this.seniorTickets = seniorTickets;
         this.childTickets = childTickets;
         this.orderSubtotal = orderSubtotal;
         this.orderTax = orderTax;
         this.orderStatus = orderStatus;
     }
     /**
      * Returns the array of the specified type and specified quantity of tickets requested for this ticket order.
      * @param quantity sets the quantity of tickets to be created for the ticket order.
      * @param ticketType sets the type of ticket to create in the array for the ticket order.
      * @return an Array of tickets containing the specified quantity and type of ticket requested for the ticket order.
      */
     public Array[] createTicketsArray (int quantity, String ticketType){
         Array[] ticketsRequested = null;
         for(int i = 0; i <= quantity; i++){     
         }
         return ticketsRequested;
         
     }
     
     /**
      * Returns the calculated subtotal of the cost for the an array of tickets for this ticket order.
      * @param tickets sets the array of tickets to be used for this ticket order.
      * @return a double representing the calculated subtotal amount of an array of tickets for the ticket order.
      */
     public double calculateOrderSubtotal (Array[] tickets){
         double subTotal = 0;
         return subTotal;
     }
     
     /**
      * Returns the tax amount for the ticket order.
      * @param subTotal set the subtotal value to be used to calculate the tax for the ticket order.
      * @return a double representing the tax amount for this ticket order.
      */
     public double calculateTax (double subTotal){
         double tax = 0;
         return tax;
     }
     
     /**
      * Returns the total cost of this ticket order.
      * @param subtotal sets the subtotal amount to be used to calculate the total for the order.
      * @param tax sets the tax amount to be used to calculate the total for the order.
      * @return a double representing the total amount for the ticket order.
      */
     public double calculateTotal (double subtotal, double tax){
         double total = subtotal + tax;
         return total;
     }

    /**
     * Returns the order number for this ticket order.
     * @return an integer representing the orderNumber for the ticket order.
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Returns the array of adult tickets for this ticket order.
     * @return an array representing the adult tickets for the ticket order.
     */
    public Array[] getAdultTickets() {
        return adultTickets;
    }

    /**
     * Returns the array of senior tickets for this ticket order.
     * @return an array representing the senior tickets for the ticket order.
     */
    public Array[] getSeniorTickets() {
        return seniorTickets;
    }

    /**
     * Returns the array of child tickets for this ticket order.
     * @return an array representing the child tickets for the ticket order.
     */
    public Array[] getChildTickets() {
        return childTickets;
    }

    /**
     * Returns the order subtotal for this ticket order.
     * @return a double representing the order subtotal for the ticket order.
     */
    public double getOrderSubtotal() {
        return orderSubtotal;
    }

    /**
     * Returns the order tax amount for this ticket order.
     * @return a double representing the order tax amount for the ticket order.
     */
    public double getOrderTax() {
        return orderTax;
    }

    /**
     * Returns the order total for this ticket order.
     * @return a double representing the order total for the ticket order.
     */
    public double getOrderTotal() {
        return orderTotal;
    }

    /**
     * Returns the order status for this ticket order.
     * @return an string representing the order status for the ticket order.
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the order number for this ticket order.
     * @param orderNumber sets the order number for this ticket order.
     */
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * Sets the ticket array for the adult tickets for this ticket order.
     * @param adultTickets sets the adult tickets in the array for the ticket order.
     */
    public void setAdultTickets(Array[] adultTickets) {
        this.adultTickets = adultTickets;
    }

    /**
     * Sets the ticket array for the senior tickets for this ticket order.
     * @param seniorTickets sets the senior tickets in the array for the ticket order.
     */ 
    public void setSeniorTickets(Array[] seniorTickets) {
        this.seniorTickets = seniorTickets;
    }

    /**
     * Sets the ticket array for the child tickets for this ticket order.
     * @param childTickets sets the child tickets in the array for the ticket order.
     */
    public void setChildTickets(Array[] childTickets) {
        this.childTickets = childTickets;
    }

    /**
     * Sets the order subtotal for this ticket order.
     * @param orderSubtotal sets the order subtotal for the ticket order.
     */
    public void setOrderSubtotal(double orderSubtotal) {
        this.orderSubtotal = orderSubtotal;
    }

    /**
     * Sets the order tax amount for this ticket order.
     * @param orderTax sets the order tax amount for this ticket order.
     */
    public void setOrderTax(double orderTax) {
        this.orderTax = orderTax;
    }

    /**
     * Sets the orderTotal for the ticket order.
     * @param orderTotal sets the order total for the ticket order.
     */
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * Sets the order status for this ticket order.
     * @param orderStatus sets the order status for the ticket order.
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
         
}
