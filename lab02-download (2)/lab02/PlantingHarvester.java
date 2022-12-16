
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This class also extends Harvester.
 *  It creates a Plating Harvester Jeroo
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.02
 */
public class PlantingHarvester
    extends Harvester
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created PlantingHarvester object.
     */
    public PlantingHarvester()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Calls hopAndPick from Harvester class then adds a call
     * from the hop and plant methods
     */
    public void hop2AndPick()
    {
        hopAndPick();
        hop();
        plant();

    }

}
