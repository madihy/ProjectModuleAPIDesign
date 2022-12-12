

import Model.*;
import View.*;
import Controller.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * This is the WallyLand Vacation Group Application for IST 412, Group1
 */

/**
 * This application will allow users to complete a variety of tasks for their WallyLand vacation.
 * @author Hytham Madi, Kate Rineer, Joe Pompilii, Brandon Worley
 */
public class Main {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args)  {
        LoginUI loginUI = new LoginUI();
        loginUI.setLocationRelativeTo(null);
        loginUI.setVisible(true);
    }
    
}
