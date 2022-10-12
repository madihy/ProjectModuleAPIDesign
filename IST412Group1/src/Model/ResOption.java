/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * This class contains the basic information for any type of reservation so can be used for show, ride, or restaurant reservations.
 * @author katerineer
 */
public class ResOption {
    private LocalDate reservationDate;
    private LocalTime reservationTime;
    private int quantityAvailable;
    
    /**
     * This is the full constructor for the reservation options class.
     * @param reservationDate
     * @param reservationTime
     * @param quantityAvailable 
     */
    public ResOption (LocalDate reservationDate, LocalTime reservationTime, int quantityAvailable){
        
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.quantityAvailable = quantityAvailable;
    }

    /**
     * Gets the reservation date for this reservation option.
     * @return the local date reservationDate representing the reservation date for the reservation option.
     */
    public LocalDate getReservationDate() {
        return reservationDate;
    }

    /**
     * Sets the reservation date for this reservation option.
     * @param reservationDate sets the reservation date for the reservation option .
     */
    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    /**
     * Gets the reservation time for this reservation option.
     * @return the local time reservationTime representing the reservation time for the reservation option.
     */
    public LocalTime getReservationTime() {
        return reservationTime;
    }

    /**
     * Sets the reservation time for this reservation option.
     * @param reservationTime sets the reservation time for the reservation option.
     */
    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    /**
     * Gets the quantity of reservations available for this reservation option.
     * @return the integer quantityAvailable representing the quantity of reservations available for the reservation option.
     */
    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the quantity of reservations available for this reservation option.
     * @param quantityAvailable sets the quantity of reservations available for this reservation option.
     */
    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
    
    
    
    
    
}
