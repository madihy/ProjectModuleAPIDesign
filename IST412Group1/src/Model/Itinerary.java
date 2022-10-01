package Model;


import Model.Activity;
import java.util.ArrayList;


/**
 * This class contains information about customer Itineraries
 * @author brandonworley
 */

public class Itinerary {
    private long itinNum;
    private ArrayList<Activity> activities;

    /**
     * This is the default Itinerary constructor 
     */
    public Itinerary() {
        this.itinNum = 000000;
        this.activities = null;
    }

    /**
     * This is the full constructor for the Itinerary class
     * @param itinNum Unique Itinerary number
     * @param activities Array list of activities on the itinerary
     */
    public Itinerary(long itinNum, ArrayList<Activity> activities) {
        this.itinNum = itinNum;
        this.activities = activities;
    }

    /**
     * Gets the unique Itinerary number
     * @return A long representing the Itinerary Number
     */
    public long getItinNum() {
        return itinNum;
    }

    /**
     * Sets the unique Itinerary number
     * @param itinNum Sets the unique Itinerary Number 
     */
    public void setItinNum(long itinNum) {
        this.itinNum = itinNum;
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
