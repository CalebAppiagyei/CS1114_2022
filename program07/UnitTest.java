import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the Unit class
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.16
 */
public class UnitTest
    extends TestCase
{
    //~ Fields ................................................................
    private Unit unit;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UnitTest test object.
     */
    public UnitTest()
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
        unit = new Unit("Kawhi", 2);
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
     * Tests the quality getter and setter methods
     */
    public void testQuality()
    {
        unit.setQuality(35);
        assertThat(unit.getQuality()).isEqualTo(35);
    }
    
    /**
     * Tests the points getter and setter methods
     */
    public void testDefense()
    {
        unit.setDefense(35);
        assertThat(unit.getDefense()).isEqualTo(35);
    }
}
