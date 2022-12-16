
//-------------------------------------------------------------------------
/**
 * 
 *  This class represents any kind of playable unit in the 
 *  game, and will define the features that all units have 
 *  in common. a one-sentence summary of your class here.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.16
 */
public class Unit
    implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;
    private int quality;
    private int defense;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Monster object.
     * @param n The name (and description) of the upgrade.
     * @param p the point value of the upgrade
     */
    public Unit(String n, int p)
    {
        super();
        /*# Do any work to initialize your class here. */
        name = n;
        points = p;
        quality = 2;
        defense = 2;
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
     * A getter method that retreives the quality value
     * @return returns quality
     */
    public int getQuality()
    {
        return quality;
    }
    
    /**
     * A setter method that changes the quality value
     * @param newQuality is the new quality value
     */
    public void setQuality(int newQuality)
    {
        quality = newQuality;
    }
    
    /**
     * A getter method that retreives the defense value
     * @return returns defense
     */
    public int getDefense()
    {
        return defense;
    }
    
    /**
     * A setter method that changes the defense value
     * @param newDefense is the new defense value
     */
    public void setDefense(int newDefense)
    {
        defense = newDefense;
    }
}
