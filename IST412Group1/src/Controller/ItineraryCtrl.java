package Controller;

import Model.*;
import View.*;
import Controller.*;
import java.util.ArrayList;


/**
 * This class will allow users to add items to an itinerary, update items, and 
 * delete items
 * @author brandonworley
 */
public class ItineraryCtrl {
    // protected long itinNum;
    private Itinerary itinModel;
    private ItineraryUI itinView;
    private NavigationCtrl navCtrl;
    
    protected ArrayList<Activity> activities;
    
//    public ItineraryCtrl(Itinerary itinModel, ItineraryUI itinView) {
//        this.itinModel = itinModel;
//        this.itinView = itinView;
//    }
    public Itinerary getItinModel() {
        return itinModel;
    }

    public void setItinModel(Itinerary itinModel) {
        itinModel.setActivities(activities);
    }

    public void getItinView() {
        itinView.printIniterary(activities);
    }

    public void setItinView(ItineraryUI itinView) {
        this.itinView = itinView;
    }
    
//    
//    /**
//     * Generate unique itinerary ID for each itinerary
//     * @return A long representing the Itinerary ID number
//     */
//    public long AssignItinID() {
//        return itinNum;
//    }
//    
//    /**
//     * Gets the unique Itinerary number
//     * @return A long representing the Itinerary Number
//     */
//    public long getItinNum() {
//        return itinNum;
//    }
//
//    /**
//     * Sets the unique Itinerary number
//     * @param itinNum Sets the unique Itinerary Number 
//     */
//    public void setItinNum(long itinNum) {
//        this.itinNum = itinNum;
//    }
//
//    /**
//     * Add reservation to Itinerary and return true if added, false if not
//     * @return True if reservation has been added to itinerary, false if not
//     */
//    public boolean addToItin() {
//        return false;
//    }
//
//    /**
//     * Remove a reservation from itinerary, return true if removed, false if not
//     * @return True if reservation was removed from itinerary, false if not
//     */
//    public boolean removeFromItin() {
//        return false;
//    }


    
}
