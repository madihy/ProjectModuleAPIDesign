/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 * This class contains information about parks including arrays of rides, shows, and restaurants at each park.
 * @author katerineer
 */
public class Park {
    
    private String parkName;//such as "WallyLand Chicago" or "WallyLand Paris"
    private String parkAddress;
    private String parkHours;
    private ArrayList<Restaurant> restaurants =  new ArrayList<>();
    private ArrayList<Ride> rides = new ArrayList<>();
    private ArrayList<Show> shows = new ArrayList<>();
    
    
    /**
     * This is the full constructor for the park class.
     * @param parkName a string for the unique nickname of the park
     * @param parkAddress a string for the address of the park
     * @param parkHours a string for the hours of the park
     * @param restaurants an array of the restaurants at the park
     * @param rides an array of the rides at the park
     * @param shows an array of the shows at the park
     */
    public Park (String parkName, String parkAddress, String parkHours, ArrayList restaurants, ArrayList rides, ArrayList shows){
    
    this.parkName = parkName;
    this.parkAddress = parkAddress;
    this.parkHours = parkHours;
    this.restaurants = restaurants;
    this.rides = rides;
    this.shows = shows;
    
}

    public Park() {
       
    }

    /**
     * Gets the unique name for the park location
     * @return the parkName string representing the unique park name for the park location
     */
    public String getParkName() {
        System.out.println(parkName);
        return "";
    }

    /**
     * Sets the string for the unique park name for the park location.
     * @param parkName string sets the unique park name for the park location.
     */
    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    /**
     * Gets the physical address for this park.
     * @return the string parkAddress representing the park's physical address.
     */
    public String getParkAddress() {
        System.out.println(parkAddress);
        return "";
    }

    /**
     * Sets the string for the park's physical address.
     * @param parkAddress sets the park's physical address.
     */
    public void setParkAddress(String parkAddress) {
        this.parkAddress = parkAddress;
    }

    /**
     * Gets the operational hours for this park.
     * @return the string parkHours representing the operational hours for the park. 
     */
    public String getParkHours() {
        System.out.println("Park hours: " + parkHours);
        return "";
    }

    /**
     * Sets the operational hours for this park.
     * @param parkHours sets the operational hours for this park.
     */
    public void setParkHours(String parkHours) {
        this.parkHours = parkHours;
    }

    /**
     * Gets the list of restaurants for this park.
     * @return the array list restaurants representing the list of restaurants for the park.
     */
    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    /**
     * Sets the list of restaurants for this park.
     * @param restaurants sets the list of restaurants for the park. 
     */
    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    /**
     * Gets the list of rides for this park.
     * @return the array list rides representing the list of rides for the park.
     */
    public ArrayList<Ride> getRides() {
        return rides;
    }

    /**
     * Sets the list of rides for this park.
     * @param rides sets the list of rides for the park.
     */
    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }

    /**
     * Gets the list of shows for this park.
     * @return the array list shows representing the list of shows for the park.
     */
    public ArrayList<Show> getShows() {
        return shows;
    }

    /**
     * Sets the list of shows for this park.
     * @param shows sets the list of shows for this park.  
     */
    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }
    
    
}
