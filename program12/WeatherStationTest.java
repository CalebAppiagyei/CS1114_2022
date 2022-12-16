// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests WeatherStation
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.14
 */
public class WeatherStationTest
    extends TestCase
{
    //~ Fields ................................................................
    private WeatherStation test;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new WeatherStationTest test object.
     */
    public WeatherStationTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
        test = new WeatherStation("demo");
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests recordDailySummary
     */
    public void testRecordDailyRainAndCount()
    {
        test.recordDailyRain(2, 2);
        assertThat(test.getRainTotals()[1]).isEqualTo(2);
        assertThat(test.getDailyRecords()[1]).isEqualTo(1);
        assertThat(test.getCountForMonth(2)).isEqualTo(1);
    }

    /**
     * Tests getAvgForMonth
     */
    public void testGetAvgForMonth()
    {
        test.recordDailyRain(2, 500);
        test.recordDailyRain(2, 0);
        assertThat(test.getAvgForMonth(2)).isEqualTo(250);
    }
    
    /**
     * Tests getLowestMonth
     */
    public void testGetLowestMonth()
    {
        for (int i = 0; i < 12; i++)
        {
            test.getDailyRecords()[i] = 5;
        }
        for (int g = 11; g > -1; g--)
        {
            test.getRainTotals()[g] = (12 - g);
        }
        assertThat(test.getLowestMonth()).isEqualTo(12);
    }
    
    /**
     * Tests getLowestMonth
     */
    public void testGetLowestMonth2()
    {
        for (int i = 1; i < 12; i++)
        {
            test.getDailyRecords()[i] = 5;
        }
        for (int g = 11; g > -1; g--)
        {
            test.getRainTotals()[g] = (12 - g);
        }
        test.getDailyRecords()[11] = 0;
        test.getDailyRecords()[0] = 0;
        assertThat(test.getLowestMonth()).isEqualTo(11);
    }
    
    /**
     * Tests getLowestMonth
     */
    public void testGetLowestMonth3()
    {
        assertThat(test.getLowestMonth()).isEqualTo(1);
    }
    
    /**
     * Tests getiD
     */
    public void testGetID()
    {
        String check = test.getId();
        assertEquals(check, "demo");
    }
}