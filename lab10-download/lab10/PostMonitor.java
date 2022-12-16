// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
//-------------------------------------------------------------------------
/**
 *  This class represents a monitor that tracks
 *  information about posts
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.29
 */
public class PostMonitor
{
    //~ Fields ................................................................
    private int postCount;
    private int[] hourCounts;
    private int[] dayCounts;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created PostMonitor object.
     */
    public PostMonitor()
    {
        super();
        /*# Do any work to initialize your class here. */
        postCount = 0;
        hourCounts = new int[24];
        dayCounts = new int[7];
    }


    //~ Methods ...............................................................
    /**
     * Getter method for postCount
     * @return returns postCount
     */
    public int getPostCount()
    {
        return postCount;
    }

    /**
     * Getter method for hourCounts
     * @return returns hourCounts
     */
    public int[] getHourCounts()
    {
        return hourCounts;
    }
    
    /**
     * Getter method for dayCounts
     * @return returns dayCounts
     */
    public int[] getDayCounts()
    {
        return dayCounts;
    }
    
    /**
     * This method records seeing the post
     * @param p is the post
     */
    public void recordPost(Post p)
    {
        postCount += 1;
        hourCounts[p.getHour()] += 1;
        dayCounts[p.getDay()] += 1;
    }
    
    /**
     * This method returns the index where the
     * largest value exists
     * @param list is the given array
     * @return returns index
     */
    public int getIndexOfLargest(int[] list)
    {
        int index = 0;
        int value = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] > value)
            {
                value = list[i];
                index = i;
            }
        }
        return index;
    }
    
    /**
     * This method gets the busiest hour
     * @return returns the hour with the
     * largest count
     */
    public int getBusiestHour()
    {
        return getIndexOfLargest(getHourCounts());
    }
    
    /**
     * This method gets the busiest day
     * @return returns the day with the
     * largest count
     */
    public int getBusiestDay()
    {
        return getIndexOfLargest(getDayCounts());
    }
    
    /**
     * This method returns the index
     * where the smallest value exists
     * @param list is the given array
     * @return returns the index
     */
    public int getIndexOfSmallest(int[] list)
    {
        int index = 0;
        int value = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < value)
            {
                value = list[i];
                index = i;
            }
        }
        return index;
    }
    
    /**
     * This method gets the slowest hour
     * @return returns the hour with the
     * smallest count
     */
    public int getSlowestHour()
    {
        return getIndexOfSmallest(getHourCounts());
    }
    
    /**
     * This method gets the slowest day
     * @return returns the day with the
     * smallest count
     */
    public int getSlowestDay()
    {
        return getIndexOfSmallest(getDayCounts());
    }
}