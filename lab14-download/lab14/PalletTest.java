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
 *  Test for Pallet class
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.12.02
 */
public class PalletTest
    extends TestCase
{
    //~ Fields ................................................................

    private Pallet pallet;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new PalletTest test object.
     */
    public PalletTest()
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
        pallet = new Pallet(2, 3);
    }


    // ----------------------------------------------------------
    /**
     * Tests getWeight
     */
    public void testGetWeight()
    {
        /*# Put your own assertions in here. */
        assertThat(pallet.getWeight()).isEqualTo(11.1, within(0.01));
    }
    
    /**
     * Tests getHeight
     */
    public void testGetHeight()
    {
        assertThat(pallet.getHeight()).isEqualTo(39.0, within(0.01));
    }
    
    /**
     * Tests getHeight
     */
    public void testGetHeight2()
    {
        Pallet zero = new Pallet(0, 5);
        assertThat(zero.getHeight()).isEqualTo(15.0, within(0.01));
    }
}
