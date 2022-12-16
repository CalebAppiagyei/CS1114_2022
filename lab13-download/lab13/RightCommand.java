// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
//-------------------------------------------------------------------------
import student.micro.jeroo.*;
/**
 *  Right Command class that implements command
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.18
 */
public class RightCommand
    implements Command
{
    //~ Fields ................................................................
    private Jeroo mark;
    private RelativeDirection right;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created ForwardCommand object.
     * @param jeroo is the given jeroo
     */
    public RightCommand(Jeroo jeroo)
    {
        super();
        /*# Do any work to initialize your class here. */
        mark = jeroo;
        right = jeroo.RIGHT;
    }


    //~ Methods ...............................................................
    
    /**
     * Executes the command
     */
    public void execute()
    {
        mark.turn(right);
    }

}