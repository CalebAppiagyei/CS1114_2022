import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the EnhancedUnit class
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.16
 */
public class EnhancedUnitTest
    extends TestCase
{
    //~ Fields ................................................................
    private EnhancedUnit unit;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new EnhancedUnitTest test object.
     */
    public EnhancedUnitTest()
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
        unit = new EnhancedUnit("Kawhi", 2);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests the setter and getter method in the
     * EnhancedUnit class
     */
    public void testSetRule()
    {
        unit.setSpecialRule("Bron");
        assertThat(unit.getSpecialRule()).isEqualTo("Bron");
    }
    
    /**
     * Tests toString()
     */
    public void testToString()
    {
        assertThat(unit.toString()).isEqualTo("Kawhi (2, 2, 2)");
    }
    
    /**
     * Tests toString()
     */
    public void testToString2()
    {
        EnhancedUnit unit2 = new EnhancedUnit("Wall", 2);
        unit2.setSpecialRule("hoop");
        assertThat(unit2.toString()).isEqualTo(
            "Wall (2, 2, 2) special rule:[hoop]");
    }
}
