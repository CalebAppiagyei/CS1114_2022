import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This NetRemover subclass will instruct
 *  the jeroo to use the flowers to remove
 *  the nets. It extends jeroo.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.09
 */
public class NetRemover
    extends Jeroo
{
    //~ Fields ................................................................
    private int flowercounter;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created NetRemover object.
     */
    public NetRemover()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * This method will give instructions for the
     * jeroo 
     */
    public void pickFlowersAndDisableNets() 
    {
        //The jeroo will have to turn right
        //then it will begin collecting the
        // flowers. Afterwards it will move 
        // back to (3,1) and approach the
        // nets to disable them
        turn(RIGHT);
        collectFlowers();
        returnToStartPoint();
        approachNets();
        disableNets();
    }
    
    /**
     * This method will instruct the jeroo
     * to collect all of the flowers
     */
    public void collectFlowers()
    {
        while (this.seesFlower(AHEAD))
        {
            hop();
            pick();
            flowercounter++;
        }
    }
    
    /**
     * This method instructs the jeroo
     * to return back to (3,1)
     */
    public void returnToStartPoint()
    {
        turn(RIGHT);
        turn(RIGHT);
        for (int i = 0; i < flowercounter; i++)
        {
            hop();
        }
        turn(RIGHT);
    }
    
    /**
     * This method instructs the jeroo
     * to approach the nets
     */
    public void approachNets()
    {
        while (!this.seesNet(AHEAD))
        {
            hop();
        }
    }
    
    /**
     * This method will instruct the jeroo
     * to disable as many nets as possible
     */
    public void disableNets()
    {
        for (int g = flowercounter; g > 0; g--)
        {
            if (this.seesNet(AHEAD))
            {
                toss();
                turn(RIGHT);
                hop();
                turn(LEFT);
            }
            
            else
            {
                g = 0;
            }
        }
    }

}
