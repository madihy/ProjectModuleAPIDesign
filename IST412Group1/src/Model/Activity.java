package Model;

import Controller.*;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * This class contains information on activities that a customer can do. These
 * can be displayed on an itinerary or displayed on a list
 *
 * @author brandonworley
 */
public class Activity implements Serializable {

    private String activityName;//Name of the restaurant, show or ride
    private String activityType;//Types are Dining, Show, or Ride
    private String timeSlot;
    private int reservationQty; 
    String activityDataFileName = "activityData.ser";
    private ArrayList<Activity> activityArray = new ArrayList<>();

    /**
     * This is the default constructor for the Activity class
     */
    public Activity() {
        this.activityName = "None";
        this.activityType = "None";
        this.readActivityDataFile();
        
        if (activityArray.isEmpty() || activityArray == null) {
            this.createTestActivities();  // Should only need to be created once.  After that the data should persist between runs
            this.writeActivityDataFile();
            this.readActivityDataFile();
        }
        //this.actLenInMins = 0;
        //this.activityAvail = false;
        //this.waitTimeInMins = 0;
    }
    
    public void createTestActivities() {
        Activity ride1 = new Activity("Monster Coaster", "Ride", null);
        Activity ride2 = new Activity("Kiddy Coaster", "Ride", null);
        Activity ride3 = new Activity("3D Train Ride", "Ride", null);
        Activity ride4 = new Activity("Tornado", "Ride", null);
        Activity ride5 = new Activity("Shoot The Rapids", "Ride", null);
        
        Activity show1 = new Activity("Kate's Komedy Show", "Show", null);
        Activity show2 = new Activity("Hytham's Gone HayWire!", "Show", null);
        Activity show3 = new Activity("Brandon's Boredom Buster", "Show", null);
        Activity show4 = new Activity("Professor Ken's The Floor Is Java", "Show", null);
        activityArray.add(ride1);
        activityArray.add(ride2);
        activityArray.add(ride3);
        activityArray.add(ride4);
        activityArray.add(ride5);
        activityArray.add(show1);
        activityArray.add(show2);
        activityArray.add(show3);
        activityArray.add(show4);
    }
    
    public ArrayList<Activity> getActivityArray() {
        return activityArray;
    }
    public void setActivityArray() {
        this.activityArray = activityArray;
    }

    /**
     * This is the full constructor of the Activity class
     *
     * @param activityName The name of the activity
     * @param activityType The type of the activity (ie. ride, show, meal)
     * @param timeSlot
     */
    public Activity(String activityName, String activityType, String timeSlot) {
        this.activityName = activityName;
        this.activityType = activityType;
        this.timeSlot = timeSlot;
    }

    /**
     * Gets the name of the activity
     *
     * @return A string of the activity name
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the name of the activity
     *
     * @param activityName Sets the name of the activity
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * Gets the type of activity
     *
     * @return A string representing the type of the activity
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the type of activity
     *
     * @param activityType Sets the type of activity
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
    
    

    public void readActivityDataFile() {

        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(activityDataFileName);
            in = new ObjectInputStream(fis);
            activityArray = (ArrayList<Activity>) in.readObject();
            in.close();

            if (!activityArray.isEmpty()) {
                //System.out.println("Activity Data Loaded from File");
            }
            this.activityArray = activityArray;

        } catch (IOException ex) {
            //ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            // ex.printStackTrace();
        }

    }
    
        public void writeArray(ArrayList<Activity> inf_activityArray) {
        //userArray.clear();
        this.activityArray = inf_activityArray;

        writeActivityDataFile();

    }
    
    public void writeActivityDataFile() {

        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try {
            fos = new FileOutputStream(activityDataFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(activityArray);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    @Override
    public String toString() {
        
        return "";
    }

    /**
     * @return the reservationQty
     */
    public int getReservationQty() {
        return reservationQty;
    }

    /**
     * @param reservationQty the reservationQty to set
     */
    public void setReservationQty(int reservationQty) {
        this.reservationQty = reservationQty;
    }

}
