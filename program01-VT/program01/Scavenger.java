
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This class contains methods that will instruct the
 *  scavenger object to collect all of the flowers
 *  on the board
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.06
 */

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)

public class Scavenger
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Scavenger object.
     */
    public Scavenger()
    {
        super();
        /*# Do any work to initialize your class here. */
    }
    
    

    //~ Methods ...............................................................
    /**
     * Collect Flowers
     */
    public void collectFlowers()
    {
        // Saved for program 02
    }
    
    /**
     * Approaches and picks the first flower
     */
    public void pickFlower1()
    {
        hop(1);
        turnRightcorner(1);
        hop(1);
        turnLeftcorner(1);
        hop(1);
        turnRightcorner(1);
        hop(2);
        pick();
    }
    
    /**
     * Approaches North shore
     */
    public void approachNorthshore()
    {
        turn(LEFT);
        turn(LEFT);
        hop(4);
        turnLeftcorner(1);
        turn(RIGHT);
        hop(2);
        turn(RIGHT);
    }
    
    /**
     * This method gives instructions to collect
     * the flowers on the north shore.
     * (Assumes you are facing east and starting
     * with the leftmost flower)
     */
    public void northshoreCollecting()
    {
        pick();
        hop(3);
        pick();
        hop(4);
    }
    
    /**
     * Approaches South shore
     */
    public void approachSouthshore()
    {
        turn(RIGHT);
        turnLeftcorner(1);
        turn(RIGHT);
        hop(7);
        turn(LEFT);
    }
    
    /**
     * This method gives instructions to collect
     * the flowers on the south shore
     * (Assumes you are facing west and starting
     * with the rightmost flower)
     */
    public void southshoreCollecting()
    {
        pick();
        hop(2);
        pick();
        hop(3);
        pick();
    }
    
    /**
     * Approach and pick the center flower
     */
    public void pickCenterflower()
    {
        turn(RIGHT);
        turn(RIGHT);
        turnLeftcorner(1);
        hop(3);
        pick();
    }
    
    /**
     * This turnRightcorner method will be used
     * whenever a right corner turn is needed
     * @param x is required to know number
     * of corners turned
     */
    public void turnRightcorner(int x)
    {
        for (int g = 0; g < x; g++)
        {
            hop(1);
            turn(RIGHT);
            hop(1);
        }
    }
    
    /**
     * This turnLeftcorner method will be used
     * whenever a left corner turn is needed
     * @param x is required to know number
     * of corners turned
     */
    public void turnLeftcorner(int x)
    {
        for (int g = 0; g < x; g++)
        {
            hop(1);
            turn(LEFT);
            hop(1);
        }
    }
    
    

}
