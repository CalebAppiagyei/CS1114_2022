
//-------------------------------------------------------------------------
/**
 *  EnhancedUnit is a subclass of Unit that 
 *  stores the special abilities of certain
 *  units.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.16
 */
public class EnhancedUnit
    extends Unit
{
    //~ Fields ................................................................
    private String specialRule;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created EnhancedUnit object.
     * @param n The name (and description) of the upgrade.
     * @param p the point value of the upgrade
     */
    public EnhancedUnit(String n, int p)
    {
        super(n, p);
        /*# Do any work to initialize your class here. */
        specialRule = null;
    }


    //~ Methods ...............................................................
    /**
     * Getter method for special rule
     * @return returns special rule
     */
    public String getSpecialRule()
    {
        return specialRule;
    }
    
    /**
     * Setter method for special rule
     * @param newRule is the new special rule
     */
    public void setSpecialRule(String newRule)
    {
        specialRule = newRule;
    }
    
    /**
     * Overriding toString()
     * @return returns the new String
     */
    public String toString()
    {
        String newString = super.toString();
        if (specialRule != null)
        {
            newString = newString + " special rule:[" +
                specialRule + "]";
        }
        return newString;
    }
}
