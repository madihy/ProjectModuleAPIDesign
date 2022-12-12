package Controller;

import Model.Activity;
import Model.Reservation;
import View.ReserveActivityUI;
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

    private Reservation Reservation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
