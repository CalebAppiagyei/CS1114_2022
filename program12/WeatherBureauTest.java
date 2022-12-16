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
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests RecordDailySummary
     */
    public void testRecordDailySummary()
    {
        //String trial = ("demo  1 2 3 4/5/6 0.07  80 90 10");        
        test.recordDailySummary("demo 1 2 3 4/5/6 0.07 80 90 10");
        assertThat(test.getStations().containsKey("demo")).isTrue();
        //assertEquals(test.getStations().get("demo").getRainTotals()[3], 0.07);
        assertThat(test.getStations().get("demo")
            .getRainTotals()[3]).isEqualTo(0.07, within(0.01));
        assertEquals(test.getStations().get("demo").getDailyRecords()[3], 1);
    }
    
    /**
     * Tests RecordDailySummary
     */
    public void testRecordDailySummary2()
    {
        test.recordDailySummary("demo 1 2 3 4/5/6 0.07 80 90 10");
        assertThat(test.getStations().containsKey("demo")).isTrue();
        test.recordDailySummary("demo 1 2 3 4/5/6 0.03 80 90 10");
        assertThat(test.getStations().get("demo")
            .getRainTotals()[3]).isEqualTo(0.10, within(0.01));
        assertEquals(test.getStations().get("demo").getDailyRecords()[3], 2);
    }
    
    /**
     * Tests RecordDailySummary
     */
    public void testRecordDailySummary3()
    {
        test.recordDailySummary("demo 1 2 3 4/5/6 -1 80 90 10");
        assertThat(test.getStations().containsKey("demo")).isFalse();
    }
    
    /**
     * Tests RecordDailySummaries
     */
    public void testRecordDailySummaries()
    {
        setIn(
            "KeyOne 1 2 3 4/5/6 0.07 80 90 10",
            "KeyTwo 1 2 3 4/5/6 0.07 80 90 10"
        );
        test.recordDailySummaries(in());
        assertThat(test.getStations().containsKey("KeyOne")).isTrue();
        assertThat(test.getStations().containsKey("KeyTwo")).isTrue();
    }
    
     /**
     * Tests lowestStation with a given month
     */
    public void testLowestStation()
    {
        setIn(
            "KeyOne 1 2 3 4/5/6 0.07 80 90 10",
            "KeyTwo 1 2 3 4/5/6 0.05 80 90 10",
            "KeyThree 1 2 3 4/5/6 0.10 80 90 10"
        );
        test.recordDailySummaries(in());
        assertThat(test.lowestStation(4)).isEqualTo(test.getStation("KeyTwo"));
    }
    
    /**
     * Tests lowestStation
     */
    public void testLowestStation2()
    {
        setIn(
            "KeyOne 1 2 3 4/5/6 0.07 80 90 10",
            "KeyTwo 1 2 3 4/5/6 0.07 80 90 10",
            "KeyThree 1 2 3 4/5/6 0.10 80 90 10"
        );
        test.recordDailySummaries(in());
        for (int i = 0; i < 12; i++)
        {
            test.getStation("KeyThree").recordDailyRain((i + 1), i);
        }
        assertThat(test.lowestStation()).isEqualTo(test.getStation("KeyThree"));
    }
    
    /**
     * Tests getStation
     */
    public void testGetStation()
    {
        WeatherStation demo = new WeatherStation("demo");
        test.getStations().put("demo", demo);
        assertThat(test.getStation("demo")).isEqualTo(demo);
        assertThat(test.getStation("trial")).isEqualTo(null);
    }
}
