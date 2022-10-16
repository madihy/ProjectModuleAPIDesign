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

    public String printIniterary(Itinerary itin) {
        System.out.println("Itinerary\n");
        return activities.toString();
    }

    @Override
    public String toString() {
        return activities.toString();
    }
}
