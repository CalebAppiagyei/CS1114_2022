// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
//-------------------------------------------------------------------------
/**
 *  Represents a weekly event at a specified time, including a
 *  description.
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.04
 */
public class Event
{
    //~ Fields ................................................................

    // Add a field representing the hour of this event
    private int hour;
    // Add a field representing the description of this event
    private String describe;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Event object.
     * 
     * @param hr The hour (time) of this event, in military time
     *             (0-23).
     * @param d The description of this event.
     */
    public Event(int hr, String d)
    {
        /*# Do any work to initialize your class here. */
        hour = hr;
        describe = d;
    }
    
    /**
     * Creates a new Event object.
     * 
     * @param hr is the hr
     * @param d is the description
     */
    public Event(String hr, String d)
    {
        this.setTime(hr);
        describe = d;
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get the description of this event.
     * @return This event's description.
     */
    // place getDescription() here
    public String getDescription()
    {
        return describe;
    }

    // ----------------------------------------------------------
    /**
     * Get the hour of this event.
     * @return This event's hour, in military time.
     */
    // place getHour() here
    public int getHour()
    {
        return hour;
    }

    // ----------------------------------------------------------
    /**
     * Set the description of this event.
     * @param newDescription The new description for this event.
     */
    // place setDescription() here
    public void setDescription(String newDescription)
    {
        describe = newDescription;
    }

    // ----------------------------------------------------------
    /**
     * Set the hour of this event.
     * @param newHour The new hour for this  event, in military
     *                time.
     */
    // place setHour() here
    public void setHour(int newHour)
    {
        hour = newHour;
    }

    // ----------------------------------------------------------
    /**
     * Set the hour of this event, using a more human-friendly
     * string.
     * @param newHour The new hour for this  event, using an
     *                am/pm designation such as "9am" or "5pm".
     */
    // place setTime() here
    public void setTime(String newHour)
    {
        String h = "";
        for (int i = 0; i < newHour.length() - 2; i++)
        {
            h = h + newHour.charAt(i);
        }
        int hr = Integer.parseInt(h);
        if (newHour.contains("pm") && hr != 12)
        {
            hr += 12;
        }
        if (newHour.equals("12am"))
        {
            hr = 0;
        }
        hour = hr;
    }

    // ----------------------------------------------------------
    /**
     * Get a string representation of this event.
     * @return A human-readable representation of this event
     * that includes the time (in am/pm format) and the description,
     * such as "11am: CS 1114".
     */
    @Override
    // place toString() here
    public String toString()
    {
        String amPM = "am";
        int sHour = hour;
        if (hour > 12)
        {
            amPM = "pm";
            sHour = sHour - 12;
        }
        if (hour == 12)
        {
            amPM = "pm";
        }
        if (sHour == 0)
        {
            sHour = 12;
        }
        String eventString = sHour + amPM + ": " + describe;
        return eventString;
    }
}
