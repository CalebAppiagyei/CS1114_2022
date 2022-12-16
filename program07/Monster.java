
//-------------------------------------------------------------------------
/**
 *  Subclass of enhanced unit that is extra 
 *  durable and capable.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.16
 */
public class Monster
    extends EnhancedUnit
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Monster object.
     * @param n The name (and description) of the upgrade.
     * @param p the point value of the upgrade
     */
    public Monster(String n, int p)
    {
        super(n, p);
        /*# Do any work to initialize your class here. */
        this.setQuality(4);
        this.setDefense(4);
    }


    //~ Methods ...............................................................


}
