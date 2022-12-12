/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.NavigationUI;

/**
 * This class provides the actions to facilitate user interface navigation menus in the application.
 * @author katerineer
 * 
 */
public class NavigationCtrl {
    
    /**
     * This is the default constructor for the NavigationCtrl class.
     */
    public NavigationCtrl(){
        //creates a new NavigationUI object,sets display parameters, and sets to visible
        NavigationUI navUI = new NavigationUI();
        navUI.setSize(400, 650);
        navUI.setLocationRelativeTo(null);
        navUI.setVisible(true);
        
    }
    
}
