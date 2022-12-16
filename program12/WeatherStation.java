// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
//-------------------------------------------------------------------------
/**
 *  Weather station class
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.13
 */
public class WeatherStation
{
    //~ Fields ................................................................
    private String stationID;
    private double[] rainTotals;
    private int[] dailyRecords;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created WeatherStation object.
     * @param id is the station id
     */
    public WeatherStation(String id)
    {
        super();
        /*# Do any work to initialize your class here. */
        stationID = id;
        rainTotals = new double[12]; 
        dailyRecords = new int[12];
    }


    //~ Methods ...............................................................
    /**
     * getter method for the ID
     * @return returns the station id
     */
    public String getId()
    {
        return stationID;
    }
    
    /**
     * Records the month and rainfall
     * @param month is the given month
     * @param rain is the amount of rain
     */
    public void recordDailyRain(int month, double rain)
    {
        rainTotals[month - 1] += rain;
        dailyRecords[month - 1] += 1;
    }
    
    /**
     * Gives the number of daily rainfall values
     * @param month is the given month
     * @return returns daily rainfall values
     */
    public int getCountForMonth(int month)
    {
        return dailyRecords[month - 1];
    }
    
    /**
     * Returns the average rainfall for the amount
     * @param month is the month
     * @return returns the avergae rainfall
     */
    public double getAvgForMonth(int month)
    {
        if (dailyRecords[month - 1] == 0)
        {
            return -1;
        }
        double average = rainTotals[month - 1] / dailyRecords[month - 1];
        return average;
    }
    
    /**
     * Gets the month with the lowest average rainfall
     * @return returns the month with the lowest average
     * rainfall
     */
    public int getLowestMonth()
    {
        int month = 0;
        int index = 0;
        for (int g = 0; g < 12; g++)
        {
            if (getAvgForMonth(g + 1) != -1)
            {
                index = g;
                month = g;
                break;
            }
        }
        double average = getAvgForMonth(month + 1);
        for (int i = index; i < 12; i++)
        {
            int m = i + 1;
            if (getAvgForMonth(m) < average && getAvgForMonth(m) != -1)
            {
                month = i;
                average = getAvgForMonth(month + 1);
            }
        }
        month += 1;
        return month;
    }
    
    /**
     * Gets rain totals
     * @return returns the rain totals
     */
    public double[] getRainTotals()
    {
        return rainTotals;
    }
    
    /**
     * Gets daily records
     * @return returns the daily records
     */
    public int[] getDailyRecords()
    {
        return dailyRecords;
    }
}
