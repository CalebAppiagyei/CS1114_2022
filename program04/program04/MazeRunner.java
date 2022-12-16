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
        navigateMaze();
        turn(LEFT);
    }

    /**
     * This method is responsible for just 
     * navigating the maze
     */
    public void navigateMaze()
    {
        int endpoint = 0;
        while (endpoint < 3)
        {
            if (getX() == 1 && getY() == 1)
            {
                endpoint++;
            }

            while (this.seesWater(RIGHT) && canMoveforward())
            {
                checkDisable();
                pick();
                hop();
                if (getX() == 1 && getY() == 1)
                {
                    endpoint++;
                }
            }

            if (!this.seesWater(RIGHT))
            {
                turn(RIGHT);
                checkDisable();
                pick();
                hop();
            }

            else
            {
                checkDisable();
                turn(LEFT);
            }

        }    
    }

    /**
     * Checks for an open space ahead
     * @return true or false
     */
    public boolean canMoveforward()
    {
        boolean torf = true;
        if (this.seesNet(AHEAD) || this.seesWater(AHEAD))
        {
            torf = false;
        }

        else 
        {
            torf = true;
        }
        return torf;
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
        else 
        {
            pick();
        }
    }

}
