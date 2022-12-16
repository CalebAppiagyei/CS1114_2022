import student.*;
import student.media.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Unit tests for Transformable Picture in Lab 06.
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.30
 */
public class TransformablePictureTest
    extends TestCase
{
    //~ Fields ................................................................

    private TransformablePicture image;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new TransformablePictureTest test object.
     */
    public TransformablePictureTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        // Create a transformable picture for testing.
        // It contains a 2x2 test image where all pixels are (100, 100, 100).
        image = new TransformablePicture(new TestImage2x2());
    }


    // ----------------------------------------------------------
    /**
     * An example test case that shows how to test the pixel values
     * in a tiny 2x2 test image.
     */
    public void testMaxRed()
    {
        // 1. initial conditions are already provided in setUp(),
        //    so there's nothing to do here.
        
        // 2. Call the method to test
        image.maxRed();
        
        // 3. Check expected behavior
        
        // The test image is so small, we can check individual pixels
        assertThat(image.getPixel(0, 0).getRed()).isEqualTo(255);
        assertThat(image.getPixel(0, 0).getGreen()).isEqualTo(100);
        assertThat(image.getPixel(0, 0).getBlue()).isEqualTo(100);

        // Or, since the image is the same color everywhere, we can
        // check all the pixels in a loop
        for (Pixel pix : image.getPixels())
        {
            assertThat(pix.getRed()).isEqualTo(255);
            assertThat(pix.getGreen()).isEqualTo(100);
            assertThat(pix.getBlue()).isEqualTo(100);
        }
    }
    
    /**
     * Tests the maxGreen() method to make sure the
     * green value is set to 255
     */
    public void testMaxGreen()
    {
        image.maxGreen();
        assertThat(image.getPixel(0, 0).getRed()).isEqualTo(100);
        assertThat(image.getPixel(0, 0).getGreen()).isEqualTo(255);
        assertThat(image.getPixel(0, 0).getBlue()).isEqualTo(100);
        for (Pixel pix : image.getPixels())
        {
            assertThat(pix.getRed()).isEqualTo(100);
            assertThat(pix.getGreen()).isEqualTo(255);
            assertThat(pix.getBlue()).isEqualTo(100);
        }
    }
    
    /**
     * Tests the maxBlue() method to make sure the
     * blue value is set to 255
     */
    public void testMaxBlue()
    {
        image.maxBlue();
        assertThat(image.getPixel(0, 0).getRed()).isEqualTo(100);
        assertThat(image.getPixel(0, 0).getGreen()).isEqualTo(100);
        assertThat(image.getPixel(0, 0).getBlue()).isEqualTo(255);
        for (Pixel pix : image.getPixels())
        {
            assertThat(pix.getRed()).isEqualTo(100);
            assertThat(pix.getGreen()).isEqualTo(100);
            assertThat(pix.getBlue()).isEqualTo(255);
        }
    }
    
    /**
     * Tests the brighten(int) method to make sure the values
     * increase by the given amount
     */
    public void testBrighten()
    {
        image.brighten(50);
        assertThat(image.getPixel(0, 0).getRed()).isEqualTo(150);
        assertThat(image.getPixel(0, 0).getGreen()).isEqualTo(150);
        assertThat(image.getPixel(0, 0).getBlue()).isEqualTo(150);
        for (Pixel pix : image.getPixels())
        {
            assertThat(pix.getRed()).isEqualTo(150);
            assertThat(pix.getGreen()).isEqualTo(150);
            assertThat(pix.getBlue()).isEqualTo(150);
        }
    }
}
