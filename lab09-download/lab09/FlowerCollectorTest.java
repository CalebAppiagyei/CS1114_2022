// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import java.util.*;

// -------------------------------------------------------------------------
/**
 *  This is a test class for the FlowerCollector
 *  subclass
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.21
 */
public class FlowerCollectorTest
    extends TestCase
{
    //~ Fields ................................................................
    private FlowerCollector kd;
    private FlowerIsland island;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new FlowerCollectorTest test object.
     */
    public FlowerCollectorTest()
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
        island = new FlowerIsland(7, 7);
        kd = new FlowerCollector();
        island.addObject(kd, 1, 1);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Test for the collectFlowers method
     */
    public void testCollectFlowers()
    {
        kd.collectFlowers();
        assertThat(kd.getX()).isEqualTo(5);
        assertThat(kd.getY()).isEqualTo(5);
        assertThat(island.countFlowers()).isEqualTo(0);
        assertThat(kd.getBasket().size()).isEqualTo(13);
    }
    
    /**
     * Tests the getBasket getter method
     */
    public void testGetBasket()
    {
        assertThat(kd.getBasket().size()).isEqualTo(0);
    }
    
    /**
     * Tests the overridden pick() method
     */
    public void testPick()
    {
        kd.pick();
        assertThat(island.countFlowers()).isEqualTo(12);
        assertThat(kd.getBasket().size()).isEqualTo(1);
    }
}
