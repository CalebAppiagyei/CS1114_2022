// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This class will contain the instructions
 *  the Jeroo will use to plant the flowers
 *  in a square.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.22
 */
public class SquarePlanter
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    private int sideFlowers;
    /**
     * Initializes a newly created SquarePlanter object.
     * @param flowersPerSide uses the given number of flowers 
     * per side
     */
    public SquarePlanter(int flowersPerSide)
    {
        super(flowersPerSide * 4);
        /*# Do any work to initialize your class here. */
        sideFlowers = flowersPerSide;
    }


    //~ Methods ...............................................................
    /**
     * This method will execute the planting
     * of the full square
     */
    public void plantSquare()
    {
        for (int i = 0; i < 4; i++)
        {
            plantSide();
        }
    }
    
    /**
     * This method will plant a side of the square
     */
    public void plantSide()
    {
        for (int i = 0; i < sideFlowers; i++) 
        {
            hop();
            plant();
        }
        turn(RIGHT);
    }

}
