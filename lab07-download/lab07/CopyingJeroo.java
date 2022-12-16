// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  A Jeroo that walks every cell in on an island and uses delegation
 *  to instruct a second jeroo to follow its motions and plant a flower
 *  anywhere it finds one.
 *
 *  @author Caleb Appiagyei
 *  @version 2022.10.10
 */
public class CopyingJeroo
    extends Jeroo
{
    //~ Fields ................................................................
    private Jeroo copier;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created CopyingJeroo object.
     * @param copy is the copying jeroo
     */
    public CopyingJeroo(Jeroo copy)
    {
        super();
        copier = copy;
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Walk a pattern over every grid location on the current island.
     */
    public void walkIsland()
    {
        boolean firstSpot = this.seesFlower(HERE);
        if (firstSpot)
        {
            copier.plant();
        }
        /*# insert your code here */
        for (int i = 0; i < 7; i++)
        {
            this.hopToWater();
            this.aboutFace();
        }
        hopToWater();
        super.turn(LEFT);
        copier.turn(LEFT);        
    }

    // ----------------------------------------------------------
    /**
     * Hop forward until we reach the water.
     */
    public void hopToWater()
    {
        while (!this.seesWater(AHEAD))
        {
            if (this.seesFlower(AHEAD))
            {
                this.hop();
                copier.plant();
            }
            else 
            {
                this.hop();
            }
        }
    }

    /**
     * Turn around and hop the other way
     */
    public void aboutFace()
    {
        if (this.isFacing(EAST))
        {
            this.turn(RIGHT);
            if (this.seesFlower(AHEAD))
            {
                this.hop();
                copier.plant();
            }
            else 
            {
                this.hop();
            }
            this.turn(RIGHT);
        }
        else
        {
            this.turn(LEFT);
            if (this.seesFlower(AHEAD))
            {
                this.hop();
                copier.plant();
            }
            else 
            {
                this.hop();
            }
            this.turn(LEFT);
        }   
    }

    /**
     * Overrides original hop() method and
     * makes the copier jeroo hop as well
     */
    public void hop()
    {
        super.hop();
        copier.hop();
    }

    /**
     * Overrides original turn() method and
     * makes the copier jeroo turn as well
     * @param d turns the jeroos in the 
     * correct direction
     */
    public void turn(RelativeDirection d)
    {
        super.turn(d);
        copier.turn(d);
    }
}
