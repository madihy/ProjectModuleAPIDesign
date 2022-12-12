/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 * This class contains ticket order information for when a orders ticket.
 * @author katerineer
 */
public class TicketOrder{
   
     private int orderNumber;
     private int quantityTickets;
     private int quantityDays;
     private ArrayList <Ticket> ticketsOrdered = new ArrayList<>();
     private double orderSubtotal = 0;
     private double orderTax = 0;
     private double orderTotal = 0;
     private String orderStatus = ""; 
     ArrayList<Integer> orderNums = new ArrayList<>();
     
     /**
      * This is the full constructor for the TicketOrder Class
      * @param orderNumber unique number to identify a specific order
      * @param quantityTickets number of tickets requested for the order
      * @param quantityDays number of days requested for each ticket
      * @param ticketsOrdered array list of the tickets for the order
      * @param orderSubtotal subtotal of the ticket order before tax
      * @param orderTax amount of tax for the ticket order
      * @param orderTotal total cost for the ticket order including the subtotal and tax
      * @param orderStatus status of the order such as in-progress or completed
      */
     public TicketOrder(int orderNumber, int quantityTickets, int quantityDays, ArrayList ticketsOrdered, double orderSubtotal, double orderTax, double orderTotal, String orderStatus){
         
         this.orderNumber = orderNumber;
         this.quantityTickets = quantityTickets;
         this.quantityDays = quantityDays;
         this.ticketsOrdered = createTicketsArray(quantityTickets, quantityDays);
         
         this.orderSubtotal = orderSubtotal;
         this.orderTax = orderTax;
         this.orderTotal = orderTotal;
         this.orderStatus = orderStatus;
     }
     
     public TicketOrder(){
         
         
     }
     /**
      * Returns the array tickets requested for this ticket order creating one ticket for each person each day.
      * @param numberOfTickets sets the quantity of tickets to be created for the ticket order.
      * @param numberOfDays sets the number of days for each ticket.
      * @return an Array of tickets containing the specified quantity for each day requested for the ticket order.
      */
     public ArrayList<Ticket> createTicketsArray (int numberOfTickets, int numberOfDays){
         ArrayList<Ticket> ticketsRequested = new ArrayList();
         int quantity = numberOfTickets * numberOfDays;
         for(int i = 0; i < quantity; i++){
             Ticket newTicket = new Ticket();
             ticketsRequested.add(newTicket);
         }
         return ticketsRequested;
         
     }
     
     /**
      * Returns the calculated subtotal of the cost for the an array of tickets for this ticket order.
      * @param tickets sets the array of tickets to be used for this ticket order.
      * @return a double representing the calculated subtotal amount of an array of tickets for the ticket order.
      */
     public double calculateOrderSubtotal (int tickets, int days){
         double subTotal = tickets * days * 50;
         return subTotal;
     }
     
     /**
      * Returns the tax amount for the ticket order.
      * @param subTotal set the subtotal value to be used to calculate the tax for the ticket order.
      * @return a double representing the tax amount for this ticket order.
      */
     public double calculateTax (double subtotal){
         double tax = this.orderSubtotal * 0.13;
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
     * Gets the quantity of tickets for this ticket order.
     * @return the integer quantityTickets representing the quantity of tickets for the ticket order.
     */
    public int getQuantityTickets() {
        return quantityTickets;
    }

    /**
     * Gets the quantity of days for each ticket for this ticket order.
     * @return the integer quantityDays representing the quantity of days for each ticket for the ticket order.
     */
    public int getQuantityDays() {
        return quantityDays;
    }

    /**
     * Gets the list of tickets for this ticket order.
     * @return the ArrayList ticketsOrdered representing the list of tickets for the ticket order.
     */
    public ArrayList <Ticket> getTicketsOrdered() {
        return ticketsOrdered;
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
     * Sets the number of tickets for this ticket order.
     * @param quantityTickets sets the number of tickets for the ticket order.
     */
    public void setQuantityTickets(int quantityTickets) {
        this.quantityTickets = quantityTickets;
    }

    /**
     * Sets the quantity of days for each ticket for this ticket order.
     * @param quantityDays sets the quantity of days for each ticket for the ticket order.
     */
    public void setQuantityDays(int quantityDays) {
        this.quantityDays = quantityDays;
    }

    /**
     * Sets the list of tickets ordered for this ticket order.
     * @param ticketsOrdered sets the list of tickets ordered for the ticket order.
     */
    public void setTicketsOrdered() {
        this.ticketsOrdered = createTicketsArray(this.getQuantityTickets(), this.getQuantityDays());
        this.ticketsOrdered = ticketsOrdered;
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
    
    public int createTicketOrderNumber(){
        int orderNum;
        
        do{
            orderNum = (int)(Math.random()*400000000) + 1000000000;
        } 
        while (orderNums.contains(orderNum));
        orderNums.add(orderNum);
        return orderNum;
   }

}
