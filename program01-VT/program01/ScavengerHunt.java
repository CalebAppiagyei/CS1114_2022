
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This class places the new Scavenger
 *  object onto the board
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

public class ScavengerHunt
    extends LongIsland
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created ScavengerHunt object.
     */
    public ScavengerHunt()
    {
        super();
    }


    //~ Methods ...............................................................
    /**
     * This method creates a new Scavenger object
     * named lenny.
     */
    public void myProgram()
    {
        Scavenger lenny = new Scavenger();
        this.addObject(lenny, 1, 2);
        lenny.collectFlowers();
    }

}
