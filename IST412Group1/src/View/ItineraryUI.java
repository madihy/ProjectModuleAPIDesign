package View;

import Model.*;
import View.*;
import Controller.*;
import java.util.ArrayList;


/**
 * This class will display an itinerary
 * @author brandonworley
 */
public class ItineraryUI {
    public void printIniterary(ArrayList<Activity> activities) {
        System.out.println("Itinerary\n");
        for (Activity a: activities) {
            System.out.println(a);
        }
    }
    
}
