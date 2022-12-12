
package Model;

import java.util.ArrayList;


public class Reservation {
    private ArrayList<Activity> reservedActivities;
    
    /**
     * This class is to create an array of activity objects to persist activities reserved by the customer.
     * This is the default constructor for the Reservation class.
     */
    public void Reservation(){
        this.setReservedActivities(getReservedActivities());
    }

    /**
     * Gets the Reserved Activities
     * @return the reservedActivities
     */
    public ArrayList<Activity> getReservedActivities() {
        return reservedActivities;
    }

    /**
     * @param reservedActivities the reservedActivities to set
     */
    public void setReservedActivities(ArrayList<Activity> reservedActivities) {
        this.reservedActivities = reservedActivities;
    }
    
    
    
    
}
