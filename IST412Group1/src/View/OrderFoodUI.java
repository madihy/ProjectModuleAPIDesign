/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This class is the user interface for the customer to be able to order food at the park.
 * @author Kate
 */
public class OrderFoodUI {
    
    JPanel orderFoodPanel; 
    Label selectRestuarantLabel = new Label("Select your restaurant.");
    JButton restaurant1 = new JButton("Restaurant 1");
    JButton restaurant2 = new JButton("Restaurant 2");
    JButton restaurant3 = new JButton("Restaurant 3");
    JButton restaurant4 = new JButton("Restaurant 4");
    JButton restaurant5 = new JButton("Restaurant 5");
    Label foodItemName;
    Label foodItemCost;
    Label foodOrderSubtotal;
    
    
    
    /**
     * This is the default constructor for the OrderFoodUI class.
     */
    public OrderFoodUI(){
        
    }
    
}
