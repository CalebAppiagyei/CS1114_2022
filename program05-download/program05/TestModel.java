
import student.media.*;
//-------------------------------------------------------------------------
/**
 *  This class is a test model for the Schelling 
 *  simulation
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.05)
 */
public class TestModel
    extends Picture
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................
    /**
     * Initializes a newly created TestImage2x2 object.
     */
    public TestModel()
    {
        this(100);
    }
    // ----------------------------------------------------------
    /**
     * Initializes a newly created TestModel object.
     * @param colorValue represents the color of 
     * pixel
     */
    public TestModel(int colorValue)
    {
        super(2, 2);
        /*# Do any work to initialize your class here. */
        for (Pixel pix : this.getPixels())
        {
            pix.setRed(colorValue);
            pix.setGreen(colorValue);
            pix.setBlue(colorValue);
        }
    }


    //~ Methods ...............................................................


}
