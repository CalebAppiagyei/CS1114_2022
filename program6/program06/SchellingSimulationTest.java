import student.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import static org.assertj.core.api.Assertions.*;
import student.media.*;
import student.util.Random;
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
        sim = new SchellingSimulation(3, 3);
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
        assertThat(sim.getSatisfactionThreshold()).isEqualTo(0.3);
    }

    /**
     * Tests to make sure this method succesfully
     * changes the satisfaction threshold
     */
    public void testSetSatisfactionThreshold()
    {
        assertThat(sim.getSatisfactionThreshold()).isEqualTo(0.3);
        sim.setSatisfactionThreshold(2);
        //assertThat(sim.getSatisfactionThreshold() != 0.3).isTrue();
        assertThat(sim.getSatisfactionThreshold()).isEqualTo(2);
    }

    /**
     * Tests to make sure this method succesfully
     * retrieves the red line
     */
    public void testGetRedLine()
    {
        assertThat(sim.getRedLine()).isEqualTo(0);
    }

    /**
     * Tests to make sure this method succesfully
     * changes the satisfaction threshold
     */
    public void testSetRedLine()
    {
        assertThat(sim.getRedLine()).isEqualTo(0);
        sim.setRedLine(1);
        //assertThat(sim.getSatisfactionThreshold() != 0).isTrue();
        assertThat(sim.getRedLine()).isEqualTo(1);
    }

    /**
     * Tests to make sure this method populates
     * a model with blue pixels
     */
    public void testPopulate()
    {
        sim.populate(1.0, 0.0);
        // Make assertions that prove there are exceptable
        // amounts of blue orange and "blank" pixels 
        int bcount = 0; 
        for (Pixel pix : sim.getPixels())
        {
            if (pix.getColor().equals(Color.BLUE))
            {
                bcount = bcount + 1;
            }
        }
        // Create a loop that runs through the test model 
        // and counts the number of each pixel
        assertThat(bcount > 0).isTrue();
    }
    
    /**
     * Tests to make sure this method populates
     * a model with orange pixels
     */
    public void testPopulate2()
    {
        sim.populate(0.0, 1.0);
        // Make assertions that prove there are exceptable
        // amounts of blue orange and "blank" pixels
        int ocount = 0; 
        for (Pixel pix : sim.getPixels())
        {
            if (pix.getColor().equals(Color.ORANGE))
            {
                ocount = ocount + 1;
            }
        }
        // Create a loop that runs through the test model 
        // and counts the number of each pixel
        assertThat(ocount > 0).isTrue();
        
        sim.setRedLine(3);
        sim.populate(0.0, 1.0);
        // Make assertions that prove there are exceptable
        // amounts of blue orange and "blank" pixels
        ocount = 0; 
        for (Pixel pix : sim.getPixels())
        {
            if (pix.getColor().equals(Color.ORANGE))
            {
                ocount = ocount + 1;
            }
        }
        // Create a loop that runs through the test model 
        // and counts the number of each pixel
        assertThat(ocount).isEqualTo(0);
    }
    
    /**
     * Tests to make sure this method populates
     * a model with "blank" pixels
     */
    public void testPopulate3()
    {
        sim.populate(0.0, 0.0);
        // Make assertions that prove there are exceptable
        // amounts of blue orange and "blank" pixels
        int wCount = 0;
        int bCount = 0;
        int oCount = 0;
        
        for (Pixel pix : sim.getPixels())
        {
            if (pix.getColor().equals(Color.WHITE))
            {
                wCount = wCount + 1;
            }
            if (pix.getColor().equals(Color.BLUE))
            {
                bCount++;
            }
            if (pix.getColor().equals(Color.ORANGE))
            {
                oCount++;
            }
            
        }
        assertThat(wCount > 0).isTrue();
        assertEquals(0, bCount);
        assertEquals(0, oCount);
    }

    /**
     * Tests to make sure the method correctly
     * identifies if the pixels are the same color
     */
    public void testAreSameColor()
    {
        // True case
        Pixel pixel1 = sim.getPixel(0, 1);
        Pixel pixel2 = sim.getPixel(1, 1);
        pixel1.setColor(Color.BLUE);
        pixel2.setColor(Color.BLUE);
        assertThat(sim.areSameColor(pixel1, pixel2)).isTrue();  

        // False case
        pixel2.setColor(Color.ORANGE);
        assertThat(sim.areSameColor(pixel1, pixel2)).isFalse();
        
    }

    /**
     * Tests if the method correctly identifies an
     * empty space
     */
    public void testIsEmpty()
    {
        Pixel pixel1 = sim.getPixel(1, 1);
        // True case
        pixel1.setColor(Color.WHITE);
        assertThat(sim.isEmpty(pixel1)).isTrue();

        // False case
        pixel1.setColor(Color.BLUE);
        assertThat(sim.isEmpty(pixel1)).isFalse();
        pixel1.setColor(Color.ORANGE);
        assertThat(sim.isEmpty(pixel1)).isFalse();
    }

    /**
     * Verifies that the method correctly identifies if 
     * an agent is satisfied or not
     */
    public void testIsSatisfied()
    {
        for (Pixel pix : sim.getPixels())
        {
            pix.setColor(Color.BLUE);
        }
        Pixel pixel1 = sim.getPixel(1, 1);
        //True case
        assertThat(sim.isSatisfied(pixel1, Color.BLUE)).isTrue();

        //False case
        for (Pixel neighbor : pixel1.getNeighborPixels())
        {
            neighbor.setColor(Color.ORANGE);
        }
        assertThat(sim.isSatisfied(pixel1, Color.BLUE)).isFalse();
    }

    /**
     * Tests that the method is able to move the
     * agent if possible and returns the correct
     * boolean value
     */
    public void testMaybeRelocate()
    {
        Pixel pixel1 = sim.getPixel(0, 0);
        // If the agent can't move at all
        for (Pixel pix : sim.getPixels())
        {
            pix.setColor(Color.BLUE);
        }
        assertThat(sim.maybeRelocate(pixel1)).isFalse();
    }
    
    /**
     * Tests that the method is able to move the
     * agent if possible and returns the correct
     * boolean value
     */    
    public void testMaybeRelocate2()
    {
        //If the agent can move and will be satisfied
        Pixel pixel1 = sim.getPixel(0, 0);
        Pixel leftpix = sim.getPixel(1, 2);
        Pixel toppix = sim.getPixel(2, 1);
        pixel1.setColor(Color.BLUE);
        leftpix.setColor(Color.BLUE);
        toppix.setColor(Color.BLUE);
        Random.setNextInts(2, 2);
        assertThat(sim.maybeRelocate(pixel1)).isTrue();
    }
    
    /**
     * Tests that the method is able to move the
     * agent if possible and returns the correct
     * boolean value
     */    
    public void testMaybeRelocate3()
    {
        Pixel pixel1 = sim.getPixel(0, 0);
        // If the agent can't move at all
        for (Pixel pix : sim.getPixels())
        {
            pix.setColor(Color.BLUE);
        }
        
        // If the agent can move but wont be satisfied
        pixel1.setColor(Color.ORANGE);
        Pixel pixel2 = picture.getPixel(2, 2);
        pixel2.setColor(Color.WHITE);
        Random.setNextInts(2, 2);
        assertThat(sim.maybeRelocate(pixel1)).isFalse();
        
    }

    /**
     * Verifies that the method is able to incorporate
     * the previous methods and correctly execute the
     * full process
     */
    public void testCycleAgents()
    {
        // Zero moves because there is no white space
        for (Pixel pix : sim.getPixels())
        {
            pix.setColor(Color.BLUE);
        }
        assertThat(sim.cycleAgents()).isEqualTo(0);
        
        // Zero moves because it would not be satisfied at the new spot
        Pixel pixel1 = sim.getPixel(0, 0);
        for (Pixel pix : sim.getPixels())
        {
            pix.setColor(Color.ORANGE);
        }
        pixel1.setColor(Color.BLUE);
        //Create an open spot
        Pixel openspot = picture.getPixel(2, 2);
        openspot.setColor(Color.WHITE);
        Random.setNextInts(2, 2);
        assertThat(sim.cycleAgents()).isEqualTo(0);
    }
    
    /**
     * Verifies that the method is able to incorporate
     * the previous methods and correctly execute the
     * full process
     */
    public void testCycleAgents2()
    {
        //If the agent can move and will be satisfied
        Pixel pixel1 = sim.getPixel(0, 0);
        for (Pixel neighbor : pixel1.getNeighborPixels())
        {
            neighbor.setColor(Color.ORANGE);
        }
        //Make sure the neighboring pixels at the new
        //spot will satisfy the agent
        Pixel leftpix = sim.getPixel(1, 2);
        Pixel toppix = sim.getPixel(2, 1);
        pixel1.setColor(Color.BLUE);
        leftpix.setColor(Color.BLUE);
        toppix.setColor(Color.BLUE);
        //Make sure the generator always picks 2
        Random.setNextInts(2, 2, 2, 2, 2, 2, 2, 2, 
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        assertThat(sim.cycleAgents()).isEqualTo(1);
    }
}
