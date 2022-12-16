// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
// -------------------------------------------------------------------------
/**
 *  Models a simple brick.
 *  This class is a part of an application for a company producing bricks.
 *  Bricks are delivered in palettes (stacks of bricks).
 * 
 *  There are (at least) four errors in this project. Find them. Fix them.
 *
 * @author Caleb Appiagyei (Caleba04)
 * @version 2022.12.02
 */
public class Brick
{
    //~ Instance/static variables .............................................

    // instance variables:
    private double height;
    private double width;
    private double depth;

    // Constant: weight per cubic cm in grams
    private static final double WEIGHT_PER_CM3 = 2;


    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Create a Brick. Parameters are edge lengths.
     * @param height in centimeters
     * @param width  in centimeters
     * @param depth  in centimeters
     */
    public Brick(double height, double width, double depth)
    {
        this.height = height;
        this.width  = width;
        this.depth  = depth;
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get this brick's surface area.
     * @return the surface area in square centimeters
     */
    public double getSurfaceArea()
    {
        return (2 * width * height) + 
            (2 * width * depth) + (2 * depth * height);
    }


    // ----------------------------------------------------------
    /**
     * Get this brick's weight.
     * @return the weight in kg.
     */
    public double getWeight()
    {
        return (getVolume() * WEIGHT_PER_CM3) / 5000;
    }


    // ----------------------------------------------------------
    /**
     * Get this brick's volume.
     * @return the volume in qubic centimeters
     */
    public double getVolume()
    {
        return width * height * depth;
    }
    
    /**
     * Get this brick's height
     * @return the height
     */
    public double getHeight()
    {
        return height;
    }
}
