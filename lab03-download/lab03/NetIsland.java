import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  This class creates new NetiIsland object
 *  and adds it to the Island.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.09
 */
public class NetIsland
    extends NetIslandBase
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created NetIsland object.
     */
    public NetIsland()
    {
        super();
    }
    
    /**
     * This myprogram method adds a new netRemover
     * object and places it at (3,1)
     */
    public void myProgram()
    {
        NetRemover amon = new NetRemover();
        this.addObject(amon, 3, 1);
        amon.pickFlowersAndDisableNets();
    }
}
