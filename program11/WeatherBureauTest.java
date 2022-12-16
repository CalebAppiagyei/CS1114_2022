// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import java.util.*;

// -------------------------------------------------------------------------
/**
 *  Tests WeatherBureau
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.15
 */
public class WeatherBureauTest
    extends TestCase
{
    //~ Fields ................................................................
    private WeatherBureau test;
    private Scanner input;
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new WeatherBureauTest test object.
     */
    public WeatherBureauTest()
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
        test = new WeatherBureau();
        input = new Scanner(System.in);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    ///**
     //* Tests Record Daily Summary
     //*/
    //public void testRecordDailySummary()
    //{
    //    test.recordDailySummary("Bill");
    //    assertEquals(0, 0);
    //}
    
    ///**
    // * Tests Record Daily Summary
    // */
    //public void testRecordDailySummaries()
    //{
    //    test.recordDailySummaries(input);
    //    assertEquals(0, 0);
    //}
    
    /**
     * Tests lowestStation
     */
    public void testLowestStation()
    {
        WeatherStation check = test.lowestStation(2);
        assertEquals(check, null);
        test.recordDailySummaries(input);
        test.recordDailySummary("Bill");
    }
    
    /**
     * Tests lowestStation
     */
    public void testLowestStation2()
    {
        WeatherStation check = test.lowestStation();
        assertEquals(check, null);
    }
    
    /**
     * Tests getStation
     */
    public void testGetStation()
    {
        WeatherStation check = test.getStation("demo");
        assertEquals(check, null);
    }
}
