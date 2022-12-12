package Controller;
import Model.*;
import View.*;
import Controller.*;
import java.util.ArrayList;


/**
 * This class will allow associates to change information about activities 
 * and how it is displayed to the user.
 * This class will also allow customers to reserve times for activities
 * @author brandonworley
 */
public class ActivityCtrl {
    private Activity reservedActivity;
    private ReserveActivityUI activityView;
    Reservation newReservation;

    
    public void createReservationObject(String inf_activityType, String inf_activityName, String inf_activityTimeSlot, int inf_resQty){
        reservedActivity = new Activity();
        reservedActivity.setActivityType(inf_activityType);
        reservedActivity.setActivityName(inf_activityName);
        reservedActivity.setTimeSlot(inf_activityTimeSlot);
        reservedActivity.setReservationQty(inf_resQty);
        
        this.reservedActivity = reservedActivity;
        
    }
    
    public Activity getReservedActivityInformation(){
        return reservedActivity;
    }
    
    public void addReservedActivityToReservationArray(){
        Reservation newReservation = Reservation();
        ArrayList<Activity> reservations = new ArrayList<Activity>();
        reservations = newReservation.getReservedActivities();
        reservations.add(reservedActivity);
        newReservation.setReservedActivities(reservations);  
    }
    
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
/**
 * Method to return back to the Navigation Menu
 */    
    public void returnToNav() {
        System.out.println("Returning to Navigation Menu!\n");
    }
    
    @Override
    public String toString() {
        return "Activity: " + reservedActivity.getActivityName() + "\nType: " + reservedActivity.getActivityType();
}

    private Reservation Reservation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
