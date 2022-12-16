import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the Monster class
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.16
 */
public class MonsterTest
    extends TestCase
{
    //~ Fields ................................................................
    private Monster unit;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MonsterTest test object.
     */
    public MonsterTest()
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
        unit = new Monster("Kawhi", 2);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Testing monster name
     */
    public void testMonsterName()
    {
        assertEquals("Kawhi", unit.getName());
    }
}
