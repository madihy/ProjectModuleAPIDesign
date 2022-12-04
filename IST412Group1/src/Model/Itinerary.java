package Model;

import Model.*;
import View.*;
import Controller.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * This class contains information about customer Itineraries
 *
 * @author brandonworley
 */
public class Itinerary extends Activity {
    private ItineraryUI itinView;
    private ItineraryCtrl itinController;
    private NavigationCtrl navCtrl;
    protected ArrayList<Activity> activities;
    private String timeSlot;
    private String itinData;

    /**
     * This is the default Itinerary constructor
     */
    public Itinerary() {
        this.activities = null;
        this.timeSlot = null;
    }

    /**
     * This is the full constructor for the Itinerary class
     *
     * @param activities Array list of activities on the itinerary
     */
    public Itinerary(ArrayList<Activity> activities, String timeSlot) {
        this.activities = activities;
        this.timeSlot = timeSlot;
    }

    public String getTimeSlot() {
        return "Returning the selected time slot for chosen activity";
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    /**
     * Gets the list of activities on the itinerary
     *
     * @return An array list of the activities on the itinerary
     */
    public ArrayList<Activity> getActivities() {
        return activities;
    }

    /**
     * Sets the activities in the array list
     *
     * @param activities An array list of activity objects
     */
    public void setActivities(ArrayList<Activity> activities) {
        Activity act1 = new Activity("Circus", "Show", null);
        Activity act2 = new Activity("Coaster 1", "Roller Coaster", null);
        Activity act3 = new Activity("The Lunch Spot", "Meal", null);
        Activity act4 = new Activity("The Big Parade", "Parade", null);
        activities.add(act1);
        activities.add(act2);
        activities.add(act3);
        activities.add(act4);
        //this.activities = activities;
    }
    
    /**
     * Pulling info from the Itinerary Model class
     */
    public void getItinModel() {
        System.out.println("Displaying Itinerary Data");;
    }

    /**
     * Writing data to the Itinerary Model class
     * @param itinData 
     */
    public void setItinModel(String itinData) {
        this.itinData = itinData;
        System.out.println("Itinerary Data set");;
    }

    /**
     * Getting the UI for the Itinerary
     */
    public void getItinView() {
        System.out.println("Displaying UI to view/change Itinerary");;
    }

    /**
     * Setting info for the UI for the Itinerary
     * @param initData 
     */
    public void setItinView(String initData) {
        this.itinData = itinData;
        System.out.println("Itinerary View set");
    }

}
