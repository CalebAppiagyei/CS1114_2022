import student.TestCase;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests for the Calendar class.
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.04
 */
public class CalendarTest
    extends TestCase
{
    //~ Fields ................................................................

    private Calendar calendar;
    private Event event;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new CalendarTest test object.
     */
    public CalendarTest()
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
        calendar = new Calendar();
        event = new Event(17, "Busy");
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests Calendar()
     */
    public void testAddEvent()
    {
        calendar.addEvent(0, event);
        assertThat(calendar.getEvent(0, 8)).isEqualTo(null);
        assertThat(calendar.getEvent(0, 17).toString()).isEqualTo("5pm: Busy");
        assertThat(calendar.getEvent(0, 19)).isEqualTo(null);
        assertThat(calendar.getEvent(-1, 9)).isEqualTo(null);
        assertThat(calendar.getEvent(10, 9)).isEqualTo(null);
    }
}
