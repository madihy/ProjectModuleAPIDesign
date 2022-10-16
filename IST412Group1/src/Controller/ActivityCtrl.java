package Controller;


/**
 * This class will allow associates to change information about activities 
 * and how it is displayed to the user.
 * This class will also allow customers to reserve times for activities
 * @author brandonworley
 */
public class ActivityCtrl {
    
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
    
}
