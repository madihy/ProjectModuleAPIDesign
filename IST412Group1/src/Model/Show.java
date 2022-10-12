/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 * This class contains the information about shows at the park.
 * @author katerineer
 */
public class Show {
    private String showName;
    private String showDescription;
    private String showLocation;
    private ArrayList <ResOption> showResOptions = new ArrayList<>();
    
    /**
     * This is the full constructor for the show class.
     * @param showName string representing the name of the show.
     * @param showDescription string representing the description about the show.
     * @param showLocation string representing the location of the show within the park.
     * @param showResOptions array list representing the reservation options for the show.
     * @return 
     */
    
    public Show (String showName, String showDescription, String showLocation, ArrayList showResOptions){
        
        this.showName = showName;
        this.showDescription = showDescription;
        this.showLocation = showLocation;
        this.showResOptions = showResOptions;
    }

    /**
     * Gets the name of this show.
     * @return the string showName representing the name of the show.
     */
    public String getShowName() {
        return showName;
    }

    /**
     * Sets the name of this show.
     * @param showName sets the name of the show.
     */
    public void setShowName(String showName) {
        this.showName = showName;
    }

    /**
     * Gets the description for this show.
     * @return the string showDescription representing the description for the show.
     */
    public String getShowDescription() {
        return showDescription;
    }

    /**
     * Sets the description for this show.
     * @param showDescription sets the description for the show.
     */
    public void setShowDescription(String showDescription) {
        this.showDescription = showDescription;
    }

    /**
     * Gets the location for this show within the park.
     * @return the string showLocation representing the location for the show within the park.
     */
    public String getShowLocation() {
        return showLocation;
    }

    /**
     * Sets the location of this show within the park.
     * @param showLocation sets the location of the show within the park.
     */
    public void setShowLocation(String showLocation) {
        this.showLocation = showLocation;
    }

    /**
     * Gets the list of reservation options for this show.
     * @return the array list showResOptions representing the reservation options for the show.
     */
    public ArrayList <ResOption> getShowResOptions() {
        return showResOptions;
    }

    /**
     * Sets the reservation options for this show.
     * @param showResOptions sets the reservation options for the show.
     */
    public void setShowResOptions(ArrayList <ResOption> showResOptions) {
        this.showResOptions = showResOptions;
    }
    
    
}
