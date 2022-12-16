import student.media.*;
//import student.util.Random;
import java.awt.Color;
//-------------------------------------------------------------------------
/**
 *  This subclass represents a model of the 
 *  neighborhood.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.04
 */
public class SchellingSimulation
    extends Picture
{
    //~ Fields ................................................................
    private double satisfactionThreshold;
    private int redLine;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Initializes a newly created SchellingSimulation object.
     * @param width gives the width of the model
     * @param height gives the height of the model
     */
    public SchellingSimulation(int width, int height)
    {
        super(width, height);
        /*# Do any work to initialize your class here. */
        satisfactionThreshold = 0.3;
        redLine = 0;
    }

    //~ Methods ...............................................................
    /**
     * Getter method that returns satisfaction threshold
     * @return returns satisfaction threshold
     */
    public double getSatisfactionThreshold()
    {
        // Getter method that returns satisfaction threshold
        return satisfactionThreshold;   
    }

    /**
     *  A setter method that changes the satisfaction
     *  threshold and changes it to a specified value
     *  @param newThreshold is the new threshold
     */
    public void setSatisfactionThreshold(double newThreshold)
    {
        // Changes the satisfaction threshold   
    }

    /**
     * Getter method that returns redLine
     * @return returns the redLine
     */
    public int getRedLine()
    {
        // Getter method that returns redLine
        return redLine;
    }

    /**
     * Setter method that changes redLine
     * to a specified value
     * @param newRedLine represents the new
     * redline value
     */
    public void setRedLine(int newRedLine)
    {
        // Changes the redLine value
    }

    /**
     * Populates the model with the agents
     * @param blueProb represents the probability
     * of there being a blue agent at that location
     * @param orangeProb represents the probability
     * of there being an orange agent at that location
     */
    public void populate(double blueProb, double orangeProb)
    {
        // Fills the model with a randomized collection
        // of blue and orange pixels
    }

    /**
     * Takes two Pixel objects and compares if
     * they are the same.
     * @param agent1 is the first Pixel object
     * @param agent2 is the second Pixel object
     * @return returns if the pixels are the 
     * same or not
     */
    public boolean areSameColor(Pixel agent1, Pixel agent2)
    {
        // Compares two pixel objects  
        // Return true if the two pixels are the same color
        return false;
    }

    /**
     * Checks if there is an empty location
     * @param spot represents the pixel object
     * @return return if the spot is white or
     * not
     */
    public boolean isEmpty(Pixel spot)
    {
        // Check if the spot is white; if so return true
        return false;
    }

    /**
     * Check if an agent would be satisfied at their
     * current location
     * @param agent represents the given pixel object
     * @param bORo represents the color of pixel
     * @return returns if the agent is satisfied
     * or not
     */
    public boolean isSatisfied(Pixel agent, Color bORo)
    {
        // Check if the pixel object would be satisfied
        return false;
    }

    /**
     * Moves the agent to a new location
     * @param agent represents the Pixel object
     * @return if the agent moved or not
     */
    public boolean maybeRelocate(Pixel agent)
    {
        // Attempts to move the agent to a new loacation
        // If no other location is available the agent 
        // remain in the same location
        return false;
    }

    /**
     * Uses the previous methods to count the
     * number of successful agent moves
     * @return returns the amount of successful
     * moves
     */
    public int cycleAgents()
    {
        // Runs the previous methods and counts
        // the number of successful moves
        return 0;
    }
}
