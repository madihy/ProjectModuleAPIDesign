package Model;


import Model.*;
import View.*;
import Controller.*;
import java.util.ArrayList;
import java.util.Date;


/**
 * This class contains information about customer Itineraries
 * @author brandonworley
 */

public class Itinerary extends Activity{
    protected ArrayList<Activity> activities;
    private Date timeSlot;
    /**
     * This is the default Itinerary constructor 
     */
    public Itinerary() {
        this.activities = null;
        this.timeSlot = null;
    }

    /**
     * This is the full constructor for the Itinerary class
     * @param activities Array list of activities on the itinerary
     */
    public Itinerary(ArrayList<Activity> activities, Date timeSlot) {
        this.activities = activities;
        this.timeSlot = timeSlot;
    }

    public Date getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(Date timeSlot) {
        this.timeSlot = timeSlot;
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
