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
 *
 * @author IST412 Group1
 * This class is a user interface to allow the user to select the tickets and then submit that selection for the ticket order.
 */
public class SelectTicketsUI {
    JPanel selectTickets;
    private Label selectTicketsTitleLabel;
    
    Label ticketType1Label;
    String type1Name = "Adult, ages 6+, $50";
    JFormattedTextField type1QuantityField;
    int type1Quantity = 0;
    Label type1SubtotalLabel; 
    double type1Subtotal = 0;
    
    Label ticketType2Label;
    String type2Name = "Senior, ages 65+, $25";
    JFormattedTextField type2QuantityField;
    int type2Quantity = 0;
    Label type2SubtotalLabel;
    double type2Subtotal = 0;
    
    Label ticketType3Label;
    String type3Name = "Adult, ages 5 and under, $25";
    JFormattedTextField type3QuantityField;
    int type3Quanity = 0;
    Label type3SubtotalLabel;
    double type3Subtotal = 0;
    
    JButton purchaseTickets;
    
    /**
     * This is the default constructor for the SelectTicketsUI class.
     */
    public SelectTicketsUI(){
    
    }
    
    /**
     * Returns the subtotal amount for the quantity and type of ticket selected and updates the subtotal label.
     * @param quantity sets the quantity of tickets to be used to calculate the subtotal.
     * @param ticketType sets the ticket type to be used to calculate the subtotal.
     * @return a double representing the subtotal for the ticket quantity and type selected.
     */
    public double calculateSubtotal(int quantity, String ticketType){
        double subtotal = 0;
        return subtotal;
    }
    
}

