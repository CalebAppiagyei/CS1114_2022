// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
import student.micro.*;
import student.micro.jeroo.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  This test class will test the methods
 *  created in the copyingjeroo class
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.10.11
 */
public class CopyingJerooTest
    extends TestCase
{
    //~ Fields ................................................................

    private CopyingJeroo jeroo;
    private Jeroo copier;
    private Island island;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new CopyingJerooTest test object.
     */
    public CopyingJerooTest()
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
        /*# Initialize field "island" to a new DoubleIsland */
        island = new DualIsland();
        /*# Initialize field "jeroo" to a new PantographJeroo */
        copier = new Jeroo(1000);
        jeroo = new CopyingJeroo(copier);
        /*# add the jeroo to the island at (1, 1) */
        island.addObject(jeroo, 1, 1);
        island.addObject(copier, 10, 1);
    }


    // ----------------------------------------------------------
    /**
     * This test method will fill the island
     * with flowers
     */
    public void testFillIsland()
    {
        for (int i = 1; i <= 8; i++)
        {
            for (int g = 1; g <= 8; g++)
            {
                island.addObject(new Flower(), i, g);
            }
        }
        jeroo.walkIsland();
        assertThat(island.countFlowers()).isEqualTo(143);
    }
    
    /**
     * Check hopToWater(), assuming that setUp() places the
     * jeroo at (1, 1) facing east.
     */
    public void testHopToWater()
    {
        jeroo.hopToWater();
        assertThat(jeroo.getX()).isEqualTo(8);
        assertThat(copier.getX()).isEqualTo(17);
        assertThat(jeroo.seesWater(AHEAD)).isTrue();
        assertThat(copier.seesWater(AHEAD)).isTrue();
    }
    
    /**
     * Tests that both jeroos travel the full island
     */
    public void testWalkIsland()
    {
        jeroo.walkIsland();
        assertThat(jeroo.getX()).isEqualTo(1);
        assertThat(copier.getX()).isEqualTo(10);
        assertThat(jeroo.getY()).isEqualTo(8);
        assertThat(copier.getY()).isEqualTo(8);
        assertThat(jeroo.isFacing(SOUTH)).isTrue();
        assertThat(copier.isFacing(SOUTH)).isTrue();
    }
    
    /**
     * Tests that the method is able to turn the 
     * Jeroo
     */
    public void testAboutFace()
    {
        jeroo.hopToWater();
        jeroo.aboutFace();
        assertThat(jeroo.isFacing(WEST)).isTrue();
        assertThat(jeroo.getX()).isEqualTo(8);
        assertThat(jeroo.getY()).isEqualTo(2);
        assertThat(copier.getX()).isEqualTo(17);
        assertThat(copier.getY()).isEqualTo(2);  
        jeroo.hopToWater();
        jeroo.aboutFace();
        assertThat(jeroo.isFacing(EAST)).isTrue();
        assertThat(jeroo.getX()).isEqualTo(1);
        assertThat(jeroo.getY()).isEqualTo(3);
        assertThat(copier.getX()).isEqualTo(10);
        assertThat(copier.getY()).isEqualTo(3);         
    }
    
}
