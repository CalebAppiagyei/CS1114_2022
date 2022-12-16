// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.micro.jeroo.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  This test class will test the plantSider()
 *  method
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.22
 */
public class SquarePlanterTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................
    private Lab05Island island;
    private SquarePlanter jeroo;
    // ----------------------------------------------------------
    /**
     * Creates a new SquarePlanterTest test object.
     */
    public SquarePlanterTest()
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
        island = new Lab05Island();
        jeroo = new SquarePlanter(4);
        island.addObject(jeroo, 1, 1);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    
    /**
     * This method will test to make sure
     * the whole square is planted correctly
     */
    public void testPlantSquare()
    {
        jeroo.plantSquare();
        assertThat(jeroo.getX()).isEqualTo(1);
        assertThat(jeroo.getY()).isEqualTo(1);
        assertThat(jeroo.isFacing(EAST)).isTrue();
        assertThat(island.countFlowers()).isEqualTo(16);
    }
    
    /**
     * This method will test to make sure
     * that each side is being correctly
     * planted
     */
    public void testPlantSide()
    {
        jeroo.plantSide();
        assertThat(jeroo.getX()).isEqualTo(5);
        assertThat(jeroo.getY()).isEqualTo(1);
        assertThat(jeroo.isFacing(SOUTH)).isTrue();
        assertThat(island.countFlowers()).isEqualTo(4);
    }
}
