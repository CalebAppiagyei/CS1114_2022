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
    private Map<String, WeatherStation> stations;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created WeatherBureau object.
     */
    public WeatherBureau()
    {
        super();
        /*# Do any work to initialize your class here. */
        stations = new HashMap<String, WeatherStation>();
    }


    //~ Methods ...............................................................
    /**
     * Records the rainfall from the daily summary
     * @param summary is the summary
     */
    public void recordDailySummary(String summary)
    {
        String[] record = summary.split("\\s+");
        if (new Double(record[5]) == -1)
        {
            return;
        }
        else if (!stations.containsKey(record[0]))
        {
            stations.put(record[0], new WeatherStation(record[0]));
            String date = record[4];
            //System.out.println(record[4]);
            String[] pieces = date.split("/", 3);
            int month = new Integer(pieces[0]);
            double rain = new Double(record[5]);
            stations.get(record[0]).recordDailyRain(month, rain);
        }
        else
        {
            String date = record[4];
            //System.out.println(record[4]);
            String[] pieces = date.split("/", 3);
            int month = new Integer(pieces[0]);
            double rain = new Double(record[5]);
            stations.get(record[0]).recordDailyRain(month, rain);
        }
    }
    
    /**
     * Records the daily summaries from the input
     * @param input is the given input
     */
    public void recordDailySummaries(Scanner input)
    {
        while (input.hasNextLine())
        {
            recordDailySummary(input.nextLine());
        }
    }
    
    /**
     * Gets the weather station
     * @param id is the id
     * @return returns the station
     */
    public WeatherStation getStation(String id)
    {
        if (stations.containsKey(id))
        {
            return stations.get(id);
        }
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
        String lowStation;
        Set<String> keys = stations.keySet();
        String startKey = keys.toArray(new String[keys.size()])[0];
        lowStation = startKey;
        for (String station : stations.keySet())
        {
            if (stations.get(station).getAvgForMonth(month) 
                < stations.get(lowStation).getAvgForMonth(month))
            {
                lowStation = stations.get(station).getId();
            }
        }
        return stations.get(lowStation);
    }
    
    /**
     * Gets the station with the lowest average 
     * rainfall for any month
     * @return returns the lowest weatherstation
     */
    public WeatherStation lowestStation()
    {
        String lowStation;
        Set<String> keys = stations.keySet();
        String startKey = keys.toArray(new String[keys.size()])[0];
        lowStation = startKey;
        for (String station : stations.keySet())
        {
            int month1 = stations.get(station).getLowestMonth();
            int month2 = stations.get(lowStation).getLowestMonth();
            if (stations.get(station).getAvgForMonth(month1)
                < stations.get(lowStation).getAvgForMonth(month2))
            {
                lowStation = stations.get(station).getId();
            }
        } 
        return stations.get(lowStation);
    }
    
    /**
     * Gets the map of stations
     * @return returns the map created
     */
    public Map<String, WeatherStation> getStations()
    {
        return stations;
    }
}
