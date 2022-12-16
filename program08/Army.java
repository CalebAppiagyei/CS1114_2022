// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import java.util.*;
//-------------------------------------------------------------------------
/**
 *  This subclass of squad represents an
 *  army
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.25
 */
public class Army
    extends Squad
{
    //~ Fields ................................................................
    private String playerName;
    private String faction;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Army object.
     * @param n is the name
     * @param f is the faction
     * @param pN is the player name
     */
    public Army(String n, String f, String pN)
    {
        super(n);
        /*# Do any work to initialize your class here. */
        playerName = pN;
        faction = f;
    }


    //~ Methods ...............................................................
    /**
     * Getter method for playerName
     * @return returns player name
     */
    public String getPlayerName()
    {
        return playerName;
    }
    
    /**
     * Setter method for playerName
     * @param newName is the new player name
     */
    public void setPlayerName(String newName)
    {
        playerName = newName;
    }
    
    /**
     * Getter method for fraction
     * @return returns the fraction
     */
    public String getFaction()
    {
        return faction;
    }
    
    /**
     * Setter method for fraction
     * @param newFaction is the new
     * fraction
     */
    public void setFaction(String newFaction)
    {
        faction = newFaction;
    }
    
    /**
     * Overriding toString()
     * @return returns new string
     */
    public String toString()
    {
        String newString = "player:" + playerName + ", faction:" + faction
            + ", army:" + super.toString(); 
        return newString;
    }
}
