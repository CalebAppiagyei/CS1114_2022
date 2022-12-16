
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This class is a subclass of Jeroo.
 *  It inherits all of the methods of Jeroo.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.02
 */
public class Harvester
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Harvester object.
     */
    public Harvester()
    {
        super();
        /*# Do any work to initialize your class here. */
    }
    
    


    //~ Methods ...............................................................
    /**
     * Instructs the Jeroo to hop and pick.
     */
    public void hopAndPick()
    {
        hop();
        pick();
    }
    /**
     * Calls the hopAndPick method twice
     */
    public void hop2AndPick()
    {
        hopAndPick();
        hopAndPick();
    }
    /**
     * Calls the hop2AndPick method three times
     */
    public void harvestRow()
    {
        hop2AndPick();
        hop2AndPick();
        hop2AndPick();
    }

}
