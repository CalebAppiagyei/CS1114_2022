// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import student.media.*;
import student.util.Random;
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
    private int w;
    private int h;

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
        w = width;
        h = height;
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
        satisfactionThreshold = newThreshold;
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
        redLine = newRedLine;
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
        // bOro represents a random int
        Random generator = new Random();
        int bORo;
        double bpercent = blueProb * 100;
        double opercent = orangeProb * 100;
        for (Pixel pix : this.getPixels())
        {
            bORo = generator.nextInt(100);
            if (bORo <= (int)bpercent)
            {
                pix.setColor(Color.BLUE);
            }
            else if ((bORo > (int)bpercent) && 
                (bORo < (int)bpercent + (int)opercent) &&
                    (pix.getY() >= redLine))
            {
                pix.setColor(Color.ORANGE);
            }
            else
            {
                pix.setColor(Color.WHITE);
            }
        }
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
        boolean torf = false;
        if (agent1.getColor().equals(agent2.getColor()))
        {
            torf = true;
        }
        return torf;
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
        boolean torf = false;
        if (spot.getColor().equals(Color.WHITE))
        {
            torf = true;
        }
        return torf;
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
        boolean torf = true;
        int samecounter = 0;
        int agentcounter = 0;
        for (Pixel neighbor : agent.getNeighborPixels())
        {
            if (neighbor.getColor().equals(Color.BLUE) || 
                neighbor.getColor().equals(Color.ORANGE))
            {
                if (neighbor.getColor().equals(bORo))
                {
                    samecounter = samecounter + 1;
                }
                agentcounter = agentcounter + 1;
            }
        }
        
        if (((double)samecounter / (double)agentcounter) 
            < satisfactionThreshold)
        {
            torf = false;
        }
        return torf;
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
        boolean torf = false;
        Random generator = new Random();
        int newY = generator.nextInt(h);
        if (agent.getColor().equals(Color.ORANGE))
        {
            newY = generator.nextInt(h - redLine) + redLine;
        }
        int newX = generator.nextInt(w);
        if (this.getPixel(newX, newY).getColor().equals(Color.WHITE))
        {
            if (isSatisfied(this.getPixel(newX, newY), agent.getColor()))
            {
                this.getPixel(newX, newY).setColor(agent.getColor());
                torf = true;
                agent.setColor(Color.WHITE);
            }
        }
 
        return torf;
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
        int counter = 0;
        for (Pixel pix : this.getPixels())
        {
            if (!isEmpty(pix) && !isSatisfied(pix, pix.getColor()))
            {
                if (maybeRelocate(pix)) 
                {
                    counter++;
                }                
            }
        }
        return counter;
    }
}
