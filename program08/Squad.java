// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import java.util.*;
//-------------------------------------------------------------------------
/**
 *  This subclass of EnhancedUnit will represent
 *  a squad of units
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.25
 */
public class Squad
    extends EnhancedUnit
{
    //~ Fields ................................................................
    private List<Unit> units;
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Squad object.
     * @param n given name
     */
    public Squad(String n)
    {
        super(n, 0);
        /*# Do any work to initialize your class here. */
        units = new ArrayList<Unit>();
    }

    //~ Methods ...............................................................
    /**
     * This method gets the units list
     * @return unit list
     */
    public List<Unit> getUnits()
    {
        return units;
    }

    /**
     * This method add a unit to the list
     * @param newUnit is the unit to be 
     * added
     */
    public void addUnit(Unit newUnit)
    {
        units.add(newUnit);
    }

    /**
     * Method that removes an upgrade
     * @param rUnit is the Upgrade that
     * will be removed
     */
    public void removeUnit(Unit rUnit)
    {
        for (int i = 0; i < units.size(); i++)
        {
            if (units.get(i).equals(rUnit))
            {
                units.remove(i);   
            }
        }
    }

    /**
     * A getter method that retreives the point value
     * @return returns points
     */
    public int getPoints()
    {
        int countPoints = 0;
        for (int i = 0; i < units.size(); i++)
        {
            countPoints += units.get(i).getPoints();
        }
        return countPoints;
    }

    /**
     * Overriding toString()
     * @return returns the new String
     */
    public String toString()
    {
        String newString = super.toString() + " units:" + units.toString();
        return newString;
    }
}
