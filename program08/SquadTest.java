import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the Squad class
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.25
 */
public class SquadTest
    extends TestCase
{
    //~ Fields ................................................................
    private Squad testSquad;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SquadTest test object.
     */
    public SquadTest()
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
        testSquad = new Squad("Hurts");
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests the unit methods
     */
    public void testUnits()
    {
        Unit testUnit = new Unit("Jordan", 23);
        Unit testUnit2 = new Unit("Bron", 6);
        testSquad.addUnit(testUnit);
        testSquad.addUnit(testUnit2);
        assertThat(testSquad.getUnits().size()).isEqualTo(2);
        testSquad.removeUnit(testUnit);
        assertThat(testSquad.getUnits().size()).isEqualTo(1);
        testSquad.removeUnit(testUnit);
        assertThat(testSquad.getUnits().size()).isEqualTo(1);
    }

    /**
     * Tests the getPoints method
     */
    public void testGetPoints()
    {
        assertThat(testSquad.getPoints()).isEqualTo(0);
        Unit testUnit = new Unit("Kyrie", 2);
        testSquad.addUnit(testUnit);   
        assertThat(testSquad.getPoints()).isEqualTo(2);
    }

    /**
     * Tests the toString() method
     */
    public void testToString()
    {
        Unit testUnit = new Unit("Kyrie", 2);
        testSquad.addUnit(testUnit);  
        assertThat(testSquad.toString()).isEqualTo(
            "Hurts (0, 2, 2) units:[Kyrie (2, 2, 2)]");
    }
}
