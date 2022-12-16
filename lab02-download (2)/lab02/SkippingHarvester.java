
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This subclass extends the Harvester class. 
 *  It creates a skipping jeroo.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.02
 */
public class SkippingHarvester
    extends Harvester
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created SkippingHarvester object.
     */
    public SkippingHarvester()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Calls hopAndPick from Harvester class and then adds a call 
     * of the hop method.
     */
    public void hop2AndPick()
    {
        hopAndPick();
        hop();
    }

}
