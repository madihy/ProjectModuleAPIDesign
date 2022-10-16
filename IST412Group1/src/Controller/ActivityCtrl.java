package Controller;
import Model.*;
import View.*;
import Controller.*;


/**
 * This class will allow associates to change information about activities 
 * and how it is displayed to the user.
 * This class will also allow customers to reserve times for activities
 * @author brandonworley
 */
public class ActivityCtrl {
    private Activity activity;
    private ActivityUI activityView;
/**
 * Add new activities
 */ 
    public void addActivity() {
        System.out.println("Activityy Added!");
        
    }
    
/** 
 * Update info on existing activities
 */
    public void updateActivity() {
        System.out.println("Activity Updated!");
    }

/** 
 * Update availability of individual activities    
 */
    public void updateActivityAvail() {
        System.out.println("Activity Availability Updated!");
    }

/** 
 * Update list of available activities    
 */
    public void updateAvailList() {
        System.out.println("The list of Available Activities has been Updated!");
    }
    
/** 
 * Change wait times    
 */
    public void updateWaitTime() {
        System.out.println("Activity Wait Time has been updated");
    }  
    
    public void returnToNav() {
        System.out.println("Returning to Navigation Menu!\n");
    }
    
    @Override
    public String toString() {
        return "Activity: " + activity.getActivityName() + "\nType: " + activity.getActivityType()
                + "\nActivity Length: " + activity.getActLenInMins() + " minutes"
                +"\nAvailable: " + activity.isActivityAvail() + "\nWait Time: " + activity.getWaitTimeInMins() + " minutes";
}
}
