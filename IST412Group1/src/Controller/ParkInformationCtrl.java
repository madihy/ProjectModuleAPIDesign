/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.ParkInformationUI;

/**
 * This class controls the customer's ability to view information about parks, rides, shows, and restaurants.
 * @author katerineer
 */
public class ParkInformationCtrl {
    
    /**
     * This is the default constructor for the park information controller class.
     */
    public ParkInformationCtrl(){
        
        ParkInformationUI parkInfoUI = new ParkInformationUI();
        parkInfoUI.setVisible(true);
        
        
    }public void viewHours(){
        
        System.out.println("View Hours");
        
    }
    
    
}
