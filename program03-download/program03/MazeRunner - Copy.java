// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This subclass will be used to create a maze 
 *  runner and give it instructions on how to
 *  navigate the given maze.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.20
 */
public class MazeRunner
extends Jeroo
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Initializes a newly created MazeRunner object.
     */
    public MazeRunner()
    {
        super(EAST, 10);
        /*# Do any work to initialize your class here. */

    }

    //~ Methods ...............................................................
    /**
     * This method is responsible for calling all 
     * of the methods used in the maze clearing
     * process
     */
    public void clearMaze()
    {
        // Will call methods needed to clear maze
    }

    /**
     * This method is responsible for just 
     * navigating the maze
     */
    public void navigateMaze()
    {
        int endpoint = 0;
        do
        {
            if (getX() == 1 && getY() == 1)
            {
                endpoint++;
            }

            while (this.seesWater(LEFT) && canMoveforward())
            {
                checkDisable();
                pick();
                hop();
            }

            if (!this.seesWater(LEFT))
            {
                turn(LEFT);
                checkDisable();
                pick();
                hop();
            }

            else
            {
                checkDisable();
                turn(RIGHT);
            }

        } while (endpoint < 3);   
    }

    /**
     * Checks for an open space ahead
     * @return true or false
     */
    public boolean canMoveforward()
    {
        if (this.seesNet(AHEAD))
        {
            return false;
        }

        else if (this.seesWater(AHEAD))
        {
            return false;
        }
        return true;
    }

    /**
     * Checks for and disables nets
     */
    public void checkDisable()
    {
        if (this.seesNet(AHEAD))
        {
            toss();
        }
    }

}
