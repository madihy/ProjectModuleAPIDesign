package View;

import Model.*;
import View.*;
import Controller.*;
import java.util.ArrayList;

/**
 * This class will display an itinerary
 *
 * @author brandonworley
 */
public class ItineraryUI {

    private Itinerary itinModel;
    private ItineraryCtrl itinController;
    private NavigationCtrl navCtrl;
    private ArrayList<Activity> activities;

    public void btnAddActivity() {
        System.out.println("Click to Add this Activity to the Itinerary:");
    }
    
    public void btnRemoveActivity() {
        System.out.println("Click to Remove this Activity from the Itinerary:");
    }
    
    public void btnUpdateActivity() {
        System.out.println("Click to Update this Activity on the Itinerary:");
    }
    
    public void btnReturnToNav() {
        System.out.println("Click to return to Navigation Menu:");
    }    
}
