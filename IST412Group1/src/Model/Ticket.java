/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *@author katerineer 
 * A class to define the admission ticket object and its associated variables and methods.
 * This class will be used to create ticket objects so that customers can purchase tickets
 * and manage tickets in other classes.
 */
public class Ticket {
    private String ticketType; //adult, senior, or child ticket type
    private double ticketCost; //
    private long ticketNumber;
    private String ticketAssignedName;
    private boolean checkedIn;
    
    /**
     * This is the constructor for the Ticket class.
     */
    public Ticket (String ticketType, double ticketCost, long ticketNumber, String ticketAssignedName, boolean checkedIn){
        
        this.ticketType = ticketType;
        this.ticketCost = ticketCost;
        this.ticketNumber = ticketNumber;
        this.ticketAssignedName = ticketAssignedName;
        this.checkedIn = checkedIn;
    
}
    
    /**
     * Returns the ticket type for this ticket.
     * @return the string representing the ticket type for the ticket.
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Returns the ticket cost for this ticket.
     * @return the double representing the ticket cost for the ticket.
     */
    public double getTicketCost() {        
        return ticketCost;
    }

    /**
     * Sets the ticket cost for the ticket.
     * @param ticketCost sets the ticket cost for the ticket.
     */
    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    /**
     * Returns the ticket number for this ticket.
     * @return the long representing the ticket number for the ticket.
     */
    public long getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the ticket number for the ticket.
     * @param ticketNumber sets the ticket number for the ticket.
     */
    public void setTicketNumber(long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /**
     * Returns the Boolean value for the checked in status for this ticket.
     * @return a Boolean value for the checked in status for the ticket.
     */
    public boolean isCheckedIn() {
        return checkedIn;
    }

    /**
     * Sets the Boolean value for the checked in status for the ticket.
     * @param checkedIn sets the checked in Boolean value for the ticket.
     */
    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }
    
    
                
}
