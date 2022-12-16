// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import student.media.*;

//-------------------------------------------------------------------------
/**
 *  A picture that supports basic color transformations for Lab 08.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.13
 */
public class TransformablePicture
    extends Picture
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created TransformablePicture object as a copy
     * of another image.
     * @param original gives the original picture
     */
    public TransformablePicture(Picture original)
    {
        super(original);
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Adds a radial shadow that gets darker the farther a pixel is from
     * the upper left corner.
     * 
     * @param rate The speed at which the shadow gets darker, where
     *             a larger number produces a more gradual shadow
     */
    public void radialShadow(int rate)
    {
        /*# Insert your imlpementation here */
        int xy;
        int change;
        for (int x = 0; x < this.getWidth(); x++)
        {
            for (int y = 0; y < this.getHeight(); y++)
            {
                xy = x + y;
                change = xy / rate;
                adjustPixel((this.getPixel(x, y)), change * -1);
            }
        }
    }

    /**
     * Adds a radial glow that gets brighter the farther a pixel is from
     * the bottom right corner.
     * 
     * @param rate The speed at which the shadow gets lighter, where
     *             a larger number produces a more gradual glow
     */
    public void radialGlow(int rate)
    {
        int distance = (this.getWidth() - 1) + (this.getHeight() - 1);
        int xy2;
        int change2;
        for (int x = this.getWidth() - 1; x > -1; x--)
        {
            for (int y = this.getHeight() - 1; y > -1; y--)
            {
                xy2 = x + y;  
                xy2 = distance - xy2;
                change2 = xy2 / rate;
                adjustPixel((this.getPixel(x, y)), change2);
            }
        }
    }

    /**
     * Takes a given pixel and adjusts its RGB
     * values using a given int value
     * @param pix is the given pixel
     * @param amount is the change amount
     */
    public void adjustPixel(Pixel pix, int amount)
    {
        pix.setRed(pix.getRed() + amount);
        pix.setGreen(pix.getGreen() + amount);
        pix.setBlue(pix.getBlue() + amount);
    }

    /**
     * Adjusts the Red and Blue values of each
     * pixel
     * @param rate is the given user rate
     */
    public void colorShift(int rate)
    {
        //Adjusts the Blue value
        int xy3;
        int change3;
        for (int x = 0; x < this.getWidth(); x++)
        {
            for (int y = 0; y < this.getHeight(); y++)
            {
                xy3 = x + y;
                change3 = xy3 / rate;
                adjustPixel2((this.getPixel(x, y)), change3);
            }
        }
        //Adjusts the Red value
        int distance = (this.getWidth() - 1) + (this.getHeight() - 1);
        int xy4;
        int change4;
        for (int x = this.getWidth() - 1; x > -1; x--)
        {
            for (int y = this.getHeight() - 1; y > -1; y--)
            {
                xy4 = x + y;  
                xy4 = distance - xy4;
                change4 = xy4 / rate;
                adjustPixel3((this.getPixel(x, y)), change4);
            }
        }        
    }

    /**
     * Takes a given pixel and adjusts its B
     * value using a given int value
     * @param pix is the given pixel
     * @param amount is the change amount
     */
    public void adjustPixel2(Pixel pix, int amount)
    {
        pix.setBlue(pix.getBlue() + amount);
    }

    /**
     * Takes a given pixel and adjusts its R
     * value using a given int value
     * @param pix is the given pixel
     * @param amount is the change amount
     */
    public void adjustPixel3(Pixel pix, int amount)
    {
        pix.setRed(pix.getRed() + amount);
    }
}
