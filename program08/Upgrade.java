
//-------------------------------------------------------------------------
/**
 *  Represents any kind of upgrade that can be 
 *  applied to a unit in the game
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.16)
 */
public class Upgrade
    implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Upgrade object.
     * @param n The name (and description) of the upgrade.
     * @param p the point value of the upgrade
     */
    public Upgrade(String n, int p)
    {
        super();
        name = n;
        points = p;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * A getter method that retreives the name
     * @return returns name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * A setter method that changes the name
     * @param newName is the new name value
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * A getter method that retreives the point value
     * @return returns points
     */
    public int getPoints()
    {
        return points;
    }
    
    /**
     * A setter method that changes the point value
     * @param newPoints is the new point value
     */
    public void setPoints(int newPoints)
    {
        points = newPoints;
    }
    
    /**
     * Overriding toString()
     * @return returns the name and points
     */
    public String toString()
    {
        String newString = name + " (" + points + ")";
        return newString;
    }
}
