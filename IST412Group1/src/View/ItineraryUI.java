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

    

    @Override
    public String toString() {
        return itinModel.getActivities().toString();
    }
}
