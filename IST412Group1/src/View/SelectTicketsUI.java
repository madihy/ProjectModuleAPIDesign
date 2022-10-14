/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Label;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;

/**
 * This class is a user interface to allow the user to select the tickets and then submit that selection to place the ticket order.
 * @author katerineer
 */
public class SelectTicketsUI {
    JPanel selectTicketsPanel;
    Label selectTicketsTitleLabel = new Label("Select the quantity and number of days for your tickets.");
    String ticketDescription = "Ticket are $50 each for each day";
    Label ticketDescriptionLabel = new Label (ticketDescription);
    TextField numberOfTicketsField;
    TextField numberOfDaysField;
    Label currentTicketCost;
    Label orderSubtotalLabel; 
    Label orderTaxLabel;
    Label orderTotalLabel;
    JButton updateTickets;
    JButton purchaseTickets;
    
    /**
     * This is the default constructor for the SelectTicketsUI class.
     */
    public SelectTicketsUI(){
        
    }
    
   
}

