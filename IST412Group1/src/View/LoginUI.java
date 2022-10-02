/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author katerineer
 * This class is a user interface for logging into the application.  
 * It initiates the mainframe for the application and the user login panel.
 */
public class LoginUI {
    
    private static JFrame primaryFrame;
    private JPanel loginPanel;
    
    /**
     * This is the default constructor for the LoginUI class.
     */
    public LoginUI (){
        
    }

    /**
     * Returns the primary frame for this application.
     * @return the JFrame primaryFrame as primary frame for the application
     */
    public static JFrame getPrimaryFrame() {
        return primaryFrame;
    }

    /**
     * Sets the primary frame for this application.
     * @param PrimaryFrame as the primary frame for the application.
     */
    public static void setPrimaryFrame(JFrame PrimaryFrame) {
        primaryFrame = PrimaryFrame;
    }

    /**
     * Returns the login panel for the login screen.
     * @return the JPanel of loginPanel as the login panel for the login screen.
     */
    public JPanel getLoginPanel() {
        return loginPanel;
    }

    /**
     * Sets the login panel for the login screen.
     * @param loginPanel sets the login panel for the login screen.
     */
    public void setLoginPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
    }
   
}
    
    
  
