/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *@author IST412 Group1
 * This class is for a user interface screen that displays the completed ticket order as a confirmation
 * and provides access to the list of individual tickets purchased with a manage tickets button.
 */
public class ConfirmOrderUI {
    
    JPanel confirmOrderUIPanel;
    Label confirmOrderTitleLabel = new Label("Your ticket order is complete.");
        
    Label confirmationMessageLabel;
    String confirmationMessage;
        
    JButton ManageTickets;
    /**
     * This is a default constructor for the ConfirmOrderUI class.
     */
    public ConfirmOrderUI(){
        
    }
    
}
