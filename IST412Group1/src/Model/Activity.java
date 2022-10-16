package Model;
import Model.*;
import View.*;
import Controller.*;


/**
 * This class contains information on activities that a customer can do.
 * These can be displayed on an itinerary or displayed on a list
 * @author brandonworley
 */
public class Activity {
    private String activityName;
    private String activityType;
    private int actLenInMins;
    private boolean activityAvail;
    private int waitTimeInMins;
    private ActivityUI activityView;
    private ActivityCtrl activityCtrl;
    
    
    

    /**
     * This is the default constructor for the Activity class
     */
    public Activity() {
        this.activityName = "None";
        this.activityType = "None";
        this.actLenInMins = 0;
        this.activityAvail = false;
        this.waitTimeInMins = 0;
    }

    /**
     * This is the full constructor of the Activity class
     * @param activityName The name of the activity
     * @param activityType The type of the activity (ie. ride, show, meal)
     * @param actLenInMins The length in minutes of the activity
     * @param activityAvail Is the activity available, true or false
     * @param waitTimeInMins The wait time for the activity in minutes
     */
    public Activity(String activityName, String activityType, int actLenInMins, 
            boolean activityAvail, int waitTimeInMins) {
        this.activityName = activityName;
        this.activityType = activityType;
        this.actLenInMins = actLenInMins;
        this.activityAvail = activityAvail;
        this.waitTimeInMins = waitTimeInMins;
    }

    /**
     * Gets the name of the activity
     * @return A string of the activity name
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the name of the activity
     * @param activityName Sets the name of the activity
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * Gets the type of activity
     * @return A string representing the type of the activity
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the type of activity
     * @param activityType Sets the type of activity
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    /**
     * Gets the length of the activity in minutes
     * @return An int representing the length of the activity in minutes
     */
    public int getActLenInMins() {
        return actLenInMins;
    }

    /**
     * Sets the length of the activity in minutes
     * @param actLenInMins Sets the length of the activity in minutes
     */
    public void setActLenInMins(int actLenInMins) {
        this.actLenInMins = actLenInMins;
    }

    /**
     * Returns if the activity is available
     * @return True if the activity is available, false if it is not available
     */
    public boolean isActivityAvail() {
        return activityAvail;
    }

    /**
     * Sets if the activity is available
     * @param activityAvail Sets if the activity is available or not available
     */
    public void setActivityAvail(boolean activityAvail) {
        this.activityAvail = activityAvail;
    }

    /**
     * Gets the wait time of the activity in minutes
     * @return An int representing the wait time in minutes
     */
    public int getWaitTimeInMins() {
        return waitTimeInMins;
    }

    /**
     * Sets the wait time of an activity in minutes
     * @param waitTimeInMins Sets the wait time in minutes
     */
    public void setWaitTimeInMins(int waitTimeInMins) {
        this.waitTimeInMins = waitTimeInMins;
    }
    
    
    
}
