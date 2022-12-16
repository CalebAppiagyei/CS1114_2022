import student.media.*;

//-------------------------------------------------------------------------
/**
 *  A picture that supports basic color transformations for Lab 06.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.30
 */
public class TransformablePicture
    extends Picture
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created TransformablePicture object as a copy
     * of another image.
     * @param original Uses the original picture
     */
    public TransformablePicture(Picture original)
    {
        super(original);
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    //private Picture image = new Picture("image.png");
    /**
     * Turns the red intensity of every pixel in this image up to
     * the maximum value.
     */
    public void maxRed()
    {
        /*# Start your implementation here */
        for (Pixel pix : this.getPixels())
        {
            pix.setRed(255);     
        }
    }
    
    /**
     * Turns the green intensity of every pixel in this image up to
     * the maximum value.
     */
    public void maxGreen()
    {
        for (Pixel pix : this.getPixels())
        {
            pix.setGreen(255);     
        }
    }
    
    /**
     * Turns the blue intensity of every pixel in this image up to
     * the maximum value.
     */
    public void maxBlue()
    {
        for (Pixel pix : this.getPixels())
        {
            pix.setBlue(255);     
        }
    }
    
    /**
     * Brightens each pixel by the amount given
     * @param amount represents the brighten value
     */
    public void brighten(int amount)
    {
        for (Pixel pix : this.getPixels())
        {
            pix.setRed(pix.getRed() + amount);
            pix.setGreen(pix.getGreen() + amount);
            pix.setBlue(pix.getBlue() + amount);
        }
    }
}
