/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This class contains information for tickets that customers can purchase and manage.
 *@author katerineer 
 *
 */
public class Ticket { 
    private long ticketNumber;
    private LocalDate purchaseDate;
    private String ticketAssignedName;
    private boolean checkedIn;
    ArrayList<Integer> ticketNums = new ArrayList<>();
    
    /**
     * This is the full constructor for the Ticket class.
     * @param ticketCost the double representing the cost of the ticket
     * @param ticketNumber the long number representing the unique number assigned to the ticket
     * @param visitDate the date that the ticket will be used in the park
     * @param ticketAssignedName the string representing the optional name of the person who will use the ticket
     * @param checkedIn the Boolean representing whether the ticket has been checked in or used
     */
    public Ticket (){
        
        this.ticketNumber = this.createTicketNumber();
        this.purchaseDate = LocalDate.now();
        this.ticketAssignedName = "";
        this.checkedIn = false;
    
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

    /**
     * Gets the date for the park visit for this ticket.
     * @return the LocalDate visitDate representing the date for the park visit for the ticket.
     */
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the date for the park visit for this ticket.
     * @param visitDate sets the date for the park visit for the ticket.
     */
    public void setPurchaseDate(LocalDate visitDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * Gets the name of the person assigned to this ticket.
     * @return the string ticketAssignedName representing the name of the person assigned to the ticket.
     */
    public String getTicketAssignedName() {
        return ticketAssignedName;
    }

    /**
     * Sets the name of the person assigned to this ticket.
     * @param ticketAssignedName sets the name of the person assigned to this ticket.
     */
    public void setTicketAssignedName(String ticketAssignedName) {
        this.ticketAssignedName = ticketAssignedName;
    }
    
    /**
     * Generates the ticket number automatically when a ticket is produced.
     * @return 
     */
    public int createTicketNumber(){
        int ticketNum;
        
        do{
            ticketNum = (int)(Math.random()*800000000) + 1000000000;
        } 
        while (ticketNums.contains(ticketNum));
        ticketNums.add(ticketNum);
        return ticketNum;
   }
}
