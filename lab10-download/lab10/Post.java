// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
//-------------------------------------------------------------------------
/**
 *  This class will represent a social media post
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.29
 */
public class Post
{
    //~ Fields ................................................................
    private String name;
    private String message;
    private int day;
    private int hour;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Post object.
     * @param n is the name
     * @param m is the message
     * @param d is the day
     * @param h is the hour
     */
    public Post(String n, String m, int d, int h)
    {
        super();
        /*# Do any work to initialize your class here. */
        name = n;
        message = m;
        day = d;
        hour = h;
    }


    //~ Methods ...............................................................
    /**
     * Gets the name
     * @return returns name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the message
     * @return returns message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Gets the day
     * @return returns day
     */
    public int getDay()
    {
        return day;
    }
    
    /**
     * Gets the hour
     * @return returns hour
     */
    public int getHour()
    {
        return hour;
    }
}
