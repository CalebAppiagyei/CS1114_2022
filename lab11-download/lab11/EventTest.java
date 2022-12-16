import student.TestCase;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests for the Event class.
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.04
 */
public class EventTest
    extends TestCase
{
    //~ Fields ................................................................

    private Event event;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new EventTest test object.
     */
    public EventTest()
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
        // You'll need to fix this after modifying the Event constructor
        event = new Event(8, "Busy");
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests accessors
     */
    public void testAccessors()
    {
        assertThat(event.getHour()).isEqualTo(8);
        assertThat(event.getDescription()).isEqualTo("Busy");
    }
    
    /**
     * Tests Mutators
     */
    public void testMutators()
    {
        event.setDescription("Free");
        assertThat(event.getDescription()).isEqualTo("Free");
        event.setHour(9);
        assertThat(event.getHour()).isEqualTo(9);
    }
    
    /**
     * Tests setTime()
     */
    public void testSetTime()
    {
        Event testEvent1 = new Event("9am", "Busy");
        assertThat(testEvent1.getHour()).isEqualTo(9);
        Event testEvent2 = new Event("11pm", "Free");
        assertThat(testEvent2.getHour()).isEqualTo(23);
        Event testEvent3 = new Event("12pm", "Free");
        assertThat(testEvent3.getHour()).isEqualTo(12);
        Event testEvent4 = new Event("12am", "Free");
        assertThat(testEvent4.getHour()).isEqualTo(0);
    }
    
    /**
     * Tests toString()
     */
    public void testToString()
    {
        assertThat(event.toString()).isEqualTo("8am: Busy");
        event.setHour(13);
        assertThat(event.toString()).isEqualTo("1pm: Busy");
        event.setHour(12);
        assertThat(event.toString()).isEqualTo("12pm: Busy");
        event.setHour(0);
        assertThat(event.toString()).isEqualTo("12am: Busy");
    }
}
