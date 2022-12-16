import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the Upgrade class
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.16
 */
public class UpgradeTest
    extends TestCase
{
    //~ Fields ................................................................
    private Upgrade unit;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UpgradeTest test object.
     */
    public UpgradeTest()
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
        unit = new Upgrade("Kawhi", 2);
    }



    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests the name getter and setter methods
     */
    public void testName()
    {
        unit.setName("KD");
        assertThat(unit.getName().equals("KD")).isTrue();
    }

    /**
     * Tests the points getter and setter methods
     */
    public void testPoints()
    {
        unit.setPoints(35);
        assertThat(unit.getPoints()).isEqualTo(35);
    }
    
    /**
     * Testing upgrade constructor
     */
    public void testUpgrade()
    {
        assertEquals("Kawhi", unit.getName());
    }
    
    /**
     * Tests toString()
     */
    public void testToString()
    {
        assertThat(unit.toString()).isEqualTo("Kawhi (2)");
    }
}
