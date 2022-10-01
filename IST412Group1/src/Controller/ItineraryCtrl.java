package Control;


/**
 * This class will allow users to add items to an itinerary, update items, and 
 * delete items
 * @author brandonworley
 */
public class ItineraryCtrl {
    protected long itinNum;
    
    /**
     * Generate unique itinerary ID for each itinerary
     * @return A long representing the Itinerary ID number
     */
    public long AssignItinID() {
        return itinNum;
    }
    
    /**
     * Gets the unique Itinerary number
     * @return A long representing the Itinerary Number
     */
    public long getItinNum() {
        return itinNum;
    }

    /**
     * Sets the unique Itinerary number
     * @param itinNum Sets the unique Itinerary Number 
     */
    public void setItinNum(long itinNum) {
        this.itinNum = itinNum;
    }

    
// Add confirmed reservations to itinerary
    
// Remove selected activities from itinerary when reservations are deleted
    

    
}
