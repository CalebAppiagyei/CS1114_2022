import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.media.*;
//import student.util.Random;
import java.awt.Color;
// -------------------------------------------------------------------------
/**
 *  This test class tests the methods used
 *  in the SchellingSimulation class
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.04
 */
public class SchellingSimulationTest
    extends TestCase
{
    //~ Fields ................................................................
    private SchellingSimulation sim;
    private Picture picture;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SchellingSimulationTest test object.
     */
    public SchellingSimulationTest()
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
        sim = new SchellingSimulation(200, 200);
        picture = new Picture(new TestModel());
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests to make sure this method succesfully
     * retrieves the satisfaction threshold
     */
    public void testGetSatisfactionThreshold()
    {
        assertThat(sim.getSatisfactionThreshold() == 0.3).isTrue();
    }

    /**
     * Tests to make sure this method succesfully
     * changes the satisfaction threshold
     */
    public void testSetSatisfactionThreshold()
    {
        assertThat(sim.getSatisfactionThreshold() == 0.3).isTrue();
        sim.setSatisfactionThreshold(2);
        assertThat(sim.getSatisfactionThreshold() != 0.3).isTrue();
        assertThat(sim.getSatisfactionThreshold() == 2).isTrue();
    }

    /**
     * Tests to make sure this method succesfully
     * retrieves the red line
     */
    public void testGetRedLine()
    {
        assertThat(sim.getRedLine() == 0).isTrue();
    }

    /**
     * Tests to make sure this method succesfully
     * changes the satisfaction threshold
     */
    public void testSetRedLine()
    {
        assertThat(sim.getRedLine() == 0).isTrue();
        sim.setRedLine(1);
        assertThat(sim.getSatisfactionThreshold() != 0).isTrue();
        assertThat(sim.getRedLine() == 1).isTrue();
    }

    /**
     * Tests to make sure this method populates
     * a model with blue orange and "blank" pixels
     */
    public void testPopulate()
    {
        sim.populate(0.3, 0.4);
        // Make assertions that prove there are exceptable
        // amounts of blue orange and "blank" pixels
        int ocount = 0; 
        int bcount = 0; 
        int wcount = 0;
        // Create a loop that runs through the test model 
        // and counts the number of each pixel
        assertThat(ocount > 0).isTrue();
        assertThat(bcount > 0).isTrue();
        assertThat(wcount > 0).isTrue();
    }

    /**
     * Tests to make sure the method correctly
     * identifies if the pixels are the same color
     */
    public void testAreSameColor()
    {
        // True case
        // Add code for true case later
        Pixel pixel1 = picture.getPixel(1, 1);
        Pixel pixel2 = picture.getPixel(1, 1);
        //assertThat(sim.areSameColor(pixel1, pixel2)).isTrue();  

        // False case
        // Add code for false case later
        assertThat(sim.areSameColor(pixel1, pixel2)).isFalse();
        
    }

    /**
     * Tests if the method correctly identifies an
     * empty space
     */
    public void testIsEmpty()
    {
        Pixel pixel1 = picture.getPixel(1, 1);
        // True case
        // Add code for true case later
        //assertThat(sim.isEmpty(pixel1)).isTrue();

        // False case
        // Add code for false case later
        assertThat(sim.isEmpty(pixel1)).isFalse();
    }

    /**
     * Verifies that the method correctly identifies if 
     * an agent is satisfied or not
     */
    public void testIsSatisfied()
    {
        Pixel pixel1 = picture.getPixel(1, 1);
        //True case
        // Add code for true case later
        //assertThat(sim.isSatisfied(pixel1, Color.BLUE)).isTrue();

        //False case
        // Add code for false case later
        assertThat(sim.isSatisfied(pixel1, Color.BLUE)).isFalse();
    }

    /**
     * Tests that the method is able to move the
     * agent if possible and returns the correct
     * boolean value
     */
    public void testMaybeRelocate()
    {
        Pixel pixel1 = picture.getPixel(1, 1);
        // True case
        // Add code for true case later
        //assertThat(sim.maybeRelocate(pixel1)).isTrue();
        
        // False case
        // Add code for false case later
        assertThat(sim.maybeRelocate(pixel1)).isFalse();
    }

    /**
     * Verifies that the method is able to incorporate
     * the previous methods and correctly execute the
     * full process
     */
    public void testCycleAgents()
    {
        // Assertions to be added later
        assertThat(sim.cycleAgents() == 5).isTrue();
        // Change 5 to the correct number later
    }
}
