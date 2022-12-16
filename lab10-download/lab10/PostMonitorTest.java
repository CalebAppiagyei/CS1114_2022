import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests PostMonitor class
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.10.29
 */
public class PostMonitorTest
    extends TestCase
{
    //~ Fields ................................................................
    private PostMonitor testMonitor;
    private Post testPost;
    

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new PostMonitorTest test object.
     */
    public PostMonitorTest()
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
        /*# Insert your own setup code here */
        testMonitor = new PostMonitor();
        testPost = new Post("Brady", "Goat", 1, 2);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests Counts
     */
    public void testCounts()
    {
        int[] testDay = new int[7];
        int[] testHour = new int[24];
        assertThat(testMonitor.getPostCount()).isEqualTo(0);
        assertThat(testMonitor.getDayCounts()).isEqualTo(testDay);
        assertThat(testMonitor.getHourCounts()).isEqualTo(testHour);
    }
    
    /**
     * Tests recordPost
     */
    public void testRecordPost()
    {
        int[] testDay = {0, 1, 0, 0, 0, 0, 0};
        int[] testHour = new int[24];
        testHour[2] = 1;
        testMonitor.recordPost(testPost);
        assertThat(testMonitor.getPostCount()).isEqualTo(1);
        assertThat(testMonitor.getDayCounts()).isEqualTo(testDay);
        assertThat(testMonitor.getHourCounts()).isEqualTo(testHour);
    }
    
    /**
     * Tests getIndex
     */
    public void testGetIndex()
    {
        int[] test = {0, 1, 2, 3, 4, 5};
        assertThat(testMonitor.getIndexOfLargest(test)).isEqualTo(5);
        assertThat(testMonitor.getIndexOfSmallest(test)).isEqualTo(0);
    }
    
    /**
     * Tests hour
     */
    public void testHour()
    {
        testMonitor.recordPost(testPost);
        assertThat(testMonitor.getBusiestHour()).isEqualTo(2);
        assertThat(testMonitor.getSlowestHour()).isEqualTo(0);
    }
    
    /**
     * Tests day
     */
    public void testDay()
    {
        testMonitor.recordPost(testPost);
        assertThat(testMonitor.getBusiestDay()).isEqualTo(1);
        assertThat(testMonitor.getSlowestDay()).isEqualTo(0);
    }
}
