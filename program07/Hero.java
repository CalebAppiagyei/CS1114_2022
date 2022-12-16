
//-------------------------------------------------------------------------
/**
 *  Subclass of Enhanced unit
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.16
 */
public class Hero
    extends EnhancedUnit
{
    //~ Fields ................................................................
    


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Hero object.
     * @param n The name (and description) of the upgrade.
     * @param p the point value of the upgrade
     */
    public Hero(String n, int p)
    {
        super(n, p);
        /*# Do any work to initialize your class here. */
        this.setQuality(5);
        this.setDefense(5);
    }


    //~ Methods ...............................................................


}
