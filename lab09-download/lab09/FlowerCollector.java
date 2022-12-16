// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import student.micro.jeroo.*;
import java.util.*;
//-------------------------------------------------------------------------
/**
 *  Creating a new Flower collector
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.21
 */
public class FlowerCollector
    extends Jeroo
{
    //~ Fields ................................................................
    private List<Flower> basket;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created FlowerCollector object.
     */
    public FlowerCollector()
    {
        super();
        /*# Do any work to initialize your class here. */
        basket = new ArrayList<Flower>();
    }


    //~ Methods ...............................................................
    /**
     * Method used to walk the whole island and collect
     * all flowers
     */
    public void collectFlowers()
    {
        for (int x = 1; x < this.getWorld().getWidth() - 1; x++)
        {
            for (int y = 1; y < this.getWorld().getHeight() - 1; y++)
            {
                setLocation(x, y);
                if (this.seesFlower(HERE))
                {
                    this.pick();
                }
            }
        }
    }
    
    /**
     * Getter method for the basket arraylist
     * @return basket returns the basket ArrayList
     */
    public List<Flower> getBasket()
    {
        return basket;
    }
    
    /**
     * Overriding the pick() method
     */
    public void pick()
    {
        Flower flower = this.getOneIntersectingObject(Flower.class);
        flower.remove();
        basket.add(flower);
    }
}
