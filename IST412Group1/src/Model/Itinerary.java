package Model;


import Model.Activity;
import java.util.ArrayList;


/**
 * This class contains information about customer Itineraries
 * @author brandonworley
 */

public class Itinerary {
    protected ArrayList<Activity> activities;

    /**
     * This is the default Itinerary constructor 
     */
    public Itinerary() {
        this.activities = null;
    }

    /**
     * This is the full constructor for the Itinerary class
     * @param itinNum Unique Itinerary number
     * @param activities Array list of activities on the itinerary
     */
    public Itinerary(long itinNum, ArrayList<Activity> activities) {
        this.activities = activities;
    }

    

    /**
     * Gets the list of activities on the itinerary
     * @return An array list of the activities on the itinerary
     */
    public ArrayList<Activity> getActivities() {
        return activities;
    }

    /**
     * Sets the activities in the array list
     * @param activities An array list of activity objects
     */
    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
    
    
    
}
