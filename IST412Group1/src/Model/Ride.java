/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 * This class contains the information about rides at the park.
 * @author katerineer
 */
public class Ride {
    private String rideName;
    private String rideDescription;
    private String rideLocation;
    private ArrayList <ResOption> rideResOptions = new ArrayList<>();    
    
    /**
     * This is the full constructor for the ride class.
     * @param rideName string representing the name of the ride
     * @param rideDescription string representing the description of the ride
     * @param rideLocation string representing the location for the ride within the park
     * @param rideResOptions array list of the reservation options for the ride
     */
    public Ride(String rideName, String rideDescription, String rideLocation, ArrayList rideResOptions){
        this.rideName = rideName;
        this.rideDescription = rideDescription;
        this.rideLocation = rideLocation;
        this.rideResOptions = rideResOptions;
        
    }

    /**
     * Gets the name of this ride.
     * @return the string rideName representing the name of the ride.
     */
    public String getRideName() {
        return rideName;
    }

    /**
     * Sets the name of this ride.
     * @param rideName sets the name of the ride.
     */
    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    /**
     * Gets the description for this ride.
     * @return the string rideDescription representing the description for the ride.
     */
    public String getRideDescription() {
        return rideDescription;
    }

    /**
     * Sets the description for this ride.
     * @param rideDescription sets the description for the ride.
     */
    public void setRideDescription(String rideDescription) {
        this.rideDescription = rideDescription;
    }

    /**
     * Gets the location of the ride within this park.
     * @return the string rideLocation representing the location of the ride within the park.
     */
    public String getRideLocation() {
        return rideLocation;
    }

    /**
     * Sets the location of this ride within the park.
     * @param rideLocation sets the location of the ride within the park.
     */
    public void setRideLocation(String rideLocation) {
        this.rideLocation = rideLocation;
    }

    /**
     * Gets the reservation options for this ride.
     * @return the array list rideResOptions representing the list of reservation options for the ride.
     */
    public ArrayList <ResOption> getRideResOptions() {
        return rideResOptions;
    }

    /**
     * Sets the list of reservation options for this ride.
     * @param rideResOptions sets the array list of reservation options for the ride.
     */
    public void setRideResOptions(ArrayList <ResOption> rideResOptions) {
        this.rideResOptions = rideResOptions;
    }
    
    
}
