// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
import student.TestCase;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Test for Brick class
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.12.02
 */
public class BrickTest
    extends TestCase
{
    //~ Fields ................................................................

    private Brick brick;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new BrickTest test object.
     */
    public BrickTest()
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
        /*# Pick your own values instead of those used below */
        brick = new Brick(4, 5, 6);
    }


    // ----------------------------------------------------------
    /**
     * Tests getHeight
     */
    public void testGetHeight()
    {
        /*# Put your own assertions in here. */
        assertThat(brick.getHeight()).isEqualTo(4.0, within(0.01));
    }
    
    /**
     * Tests getVolume
     */
    public void testGetVolume()
    {
        assertThat(brick.getVolume()).isEqualTo(120);
    }
    
    /**
     * Tests getSurfaceArea
     */
    public void testGetSurfaceArea()
    {
        assertThat(brick.getSurfaceArea()).isEqualTo(148.0, within(0.01));
    }
    
    /**
     * Tests getWeight
     */
    public void testGetWeight()
    {
        assertThat(brick.getWeight()).isEqualTo(0.048, within(0.0001));
    }
}
