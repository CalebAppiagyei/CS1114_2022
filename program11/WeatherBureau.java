// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
//-------------------------------------------------------------------------
import java.util.*;
/**
 *  WeatherBureau class
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.13
 */
public class WeatherBureau
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created WeatherBureau object.
     */
    public WeatherBureau()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Records the rainfall from the daily summary
     * @param summary is the summary
     */
    public void recordDailySummary(String summary)
    {
        // empty
    }
    
    /**
     * Records the daily summaries from the input
     * @param input is the given input
     */
    public void recordDailySummaries(Scanner input)
    {
        // empty
    }
    
    /**
     * Gets the weather station
     * @param id is the id
     * @return returns the station
     */
    public WeatherStation getStation(String id)
    {
        return null;
    }
    /**
     * Gets the station with the lowest average
     * rainfall for the given month
     * @param month is the given month
     * @return returns the lowest weatherstation
     */
    public WeatherStation lowestStation(int month)
    {
        return null;        
    }
    
    /**
     * Gets the station with the lowest average 
     * rainfall for any month
     * @return returns the lowest weatherstation
     */
    public WeatherStation lowestStation()
    {
        return null;
    }

}
