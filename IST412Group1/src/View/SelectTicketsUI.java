/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;

/**
 * This class is a user interface to allow the user to select the tickets and then submit that selection for the ticket order.
 * @author katerineer
 */
public class SelectTicketsUI {
    JPanel selectTicketsPanel;
    private Label selectTicketsTitleLabel = new Label("Select the quantity of each ticket type you want to order.");
    
    String type1Name = "Adult, ages 6+, $50";
    Label ticketType1Label = new Label (type1Name);
    JFormattedTextField type1QuantityField;
    int type1Quantity = 0;
    double type1Subtotal = 0;
    Label type1SubtotalLabel; 
    
    
    String type2Name = "Senior, ages 65+, $25";
    Label ticketType2Label = new Label (type2Name);
    JFormattedTextField type2QuantityField;
    int type2Quantity = 0;
    double type2Subtotal = 0;
    Label type2SubtotalLabel;
    
    
    String type3Name = "Adult, ages 5 and under, $25";
    Label ticketType3Label = new Label(type3Name);
    JFormattedTextField type3QuantityField;
    int type3Quanity = 0;
    double type3Subtotal = 0;
    Label type3SubtotalLabel;
   
    JButton purchaseTickets;
    
    /**
     * This is the default constructor for the SelectTicketsUI class.
     */
    public SelectTicketsUI(){
        
    }
    
   
}

