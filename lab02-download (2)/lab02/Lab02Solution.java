import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  This class adds three Harvester objects.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.02
 */
public class Lab02Solution
    extends PlantationIsland
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Lab02Solution object.
     */
    public Lab02Solution()
    {
        super();
    }
    
    

    
    //~ Methods ...............................................................
    /**
     * Initializes a new method titled myProgram.
     */
    public void myProgram() 
    {
        Harvester caleb = new Harvester();
        this.addObject(caleb, 2, 3);
        caleb.harvestRow();
        SkippingHarvester jenny = new SkippingHarvester();
        this.addObject(jenny, 2, 5);
        jenny.harvestRow();
        PlantingHarvester john = new PlantingHarvester();
        this.addObject(john, 2, 7);
        john.harvestRow();
        
        
    }

}
