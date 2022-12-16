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
    ///**
    // * Tests recordDailySummary
    // */
    //public void testRecordDailyRain()
    //{
    //    test.recordDailyRain(2, 2);
    //    assertEquals(0, 0);
    //}
    
    /**
     * Tests getCountForMonth
     */
    public void testGetCountForMonth()
    {
        int check = test.getCountForMonth(1);
        assertEquals(check, 0);
        test.recordDailyRain(2, 2);
    }
    
    /**
     * Tests getAvgForMonth
     */
    public void testGetAvgForMonth()
    {
        double check = test.getAvgForMonth(1);
        assertThat(check).isEqualTo(0, within(0.001));
    }
    
    /**
     * Tests getLowestMonth
     */
    public void testGetLowestMonth()
    {
        int check = test.getLowestMonth();
        assertEquals(check, 0);
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