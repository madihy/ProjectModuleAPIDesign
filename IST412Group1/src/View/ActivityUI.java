package View;

import java.util.ArrayList;

/**
 * This class will display activities to the customer and associates
 *
 * @author brandonworley
 */
public class ActivityUI {

    private ArrayList activities;
    private String timeSlots;

    /**
     * Display a list of time slots during open park hours to select available
     * activities from.
     *
     * @return String of time slots with available activities
     */
    public String TimeSlotDisplay() {
        return timeSlots;
    }

    /**
     * Display the list of available activities
     *
     * @return Array list containing all available activities
     */
    public ArrayList ActivityList() {
        return activities;
    }

    /**
     * Confirm chosen reservation
     *
     * @return Boolean to show if the reservation has been confirmed (true) or
     * not confirmed (false)
     */
    public boolean ConfirmReservation() {
        return false;
    }
}