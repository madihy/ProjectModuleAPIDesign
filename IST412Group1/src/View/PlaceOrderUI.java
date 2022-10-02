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
 * This class is a user interface that displays the order for the customer to review.
 * The customer can cancel the back out of the order at this point or can place the order. 
 */
public class PlaceOrderUI {
    
    JPanel placeOrderPanel;
    private Label placeOrderTitleLabel = new Label ("Review your order and click the place order button to purchase.");
    
    private Label ticketType1Label;
    private Label type1QuantityLabel;
    private Label type1SubtotalLabel;
    
    private Label ticketType2Label;
    private Label type2QuantityLabel;
    private Label type2SubtotalLabel;
    
    private Label ticketType3Label;
    private Label type1Quant3tyLabel;
    private Label type3SubtotalLabel;
    
    private Label orderSubtotalLabel;
    private Label orderTaxLabel;
    private Label orderTotalLabel;
    
    private JButton placeOrder;
    private JButton cancelOrderButton;
    
    /**
     * This is the standard default constructor for the PlaceOrderUI class.
     */
    public PlaceOrderUI(){
    
}
    
}
