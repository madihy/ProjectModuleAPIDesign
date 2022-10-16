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
        Activity act1 = new Activity("Circus", "Show", 30, true, 15);
        Activity act2 = new Activity("Coaster 1", "Roller Coaster", 5, true, 25);
        Activity act3 = new Activity("The Lunch Spot", "Meal", 30, true, 15);
        Activity act4 = new Activity("The Big Parade", "Parade", 10, true, 45);
        activities.add(act1);
        activities.add(act2);
        activities.add(act3);
        activities.add(act4);
        //this.activities = activities;
    }
    
        public void getItinModel() {
        System.out.println("Displaying Itinerary in UI");;
    }

    public void setItinModel(Itinerary itinModel) {
        itinModel.setActivities(activities);
    }

    public void getItinView() {
        System.out.println("Calling UI to change Itinerary");;
    }

    public void setItinView(ItineraryUI itinView) {
        System.out.println("Setting the Itinerary UI View");
    }

}
