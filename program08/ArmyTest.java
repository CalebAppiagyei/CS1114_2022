import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the army class
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.25
 */
public class ArmyTest
    extends TestCase
{
    //~ Fields ................................................................
    private Army testArmy;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ArmyTest test object.
     */
    public ArmyTest()
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
        testArmy = new Army("Hollywood", "Cardinals", "Marquise");
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests the player name getter and setter methods
     */
    public void testPlayerName()
    {
        testArmy.setName("Brown");
        assertThat(testArmy.getName().equals("Brown")).isTrue();
    }
    
    /**
     * Tests the faction getter and setter methods
     */
    public void testFaction()
    {
        testArmy.setFaction("Arizona");
        assertThat(testArmy.getFaction().equals("Arizona")).isTrue();
    }
    
    /**
     * Tests the toString() method
     */
    public void testToString()
    {
        String check = "player:Marquise, faction:Cardinals, ";
        check = check + "army:Hollywood (0, 2, 2) units:[]";
        assertThat(testArmy.toString()).isEqualTo(check);
    }
}
