import java.util.*;
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
    private List<Upgrade> upgrades;


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
        upgrades = new ArrayList<Upgrade>();
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
        int countPoints = 0;
        for (int i = 0; i < upgrades.size(); i++)
        {
            countPoints += upgrades.get(i).getPoints();
        }
        return this.points + countPoints;
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
    
    /**
     * Getter method for the upgrades list
     * @return returns the upgrade list
     */
    public List<Upgrade> getUpgrades()
    {
        return upgrades;   
    }
    
    /**
     * Method that adds an upgrade to the list
     * @param newUpgrade is the new upgrade
     */
    public void addUpgrade(Upgrade newUpgrade)
    {
        upgrades.add(newUpgrade);       
    }
    
    /**
     * Method that removes an upgrade
     * @param rUpgrade is the Upgrade that
     * will be removed
     */
    public void removeUpgrade(Upgrade rUpgrade)
    {
        for (int i = 0; i < upgrades.size(); i++)
        {
            if (upgrades.get(i).equals(rUpgrade))
            {
                upgrades.remove(i);   
            }
        }
    }
    
    /**
     * Overriding toString()
     * @return returns name points quality
     * and defense
     */
    public String toString()
    {
        String newString = name + " (" + points + ", "
            + quality + ", " + defense + ")";
        if (upgrades.size() > 0)
        {
            newString = newString + " upgrades:" + upgrades.toString();
        }
        return newString;
    }
}
