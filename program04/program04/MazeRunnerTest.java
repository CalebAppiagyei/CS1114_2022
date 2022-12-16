// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (caleba04)
import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.micro.jeroo.*;          
import static student.micro.jeroo.CompassDirection.*;          
import static student.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  This test class will test the methods
 *  used in for the Maze Runner
 *
 *  @author Caleb Appiagyei (caleba04)
 *  @version 2022.09.20
 */
public class MazeRunnerTest
    extends TestCase
{
    //~ Fields ................................................................
    private MazeRunner runner;
    private TestingIsland island;
    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new MazeRunnerTest test object.
     */
    public MazeRunnerTest()
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
        island = new TestingIsland();
        runner = new MazeRunner();
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */

    /**
     * Tests the navigateMaze method
     * to make sure it returns to
     * the starting point
     */
    public void testNavigateMaze()
    {
        // set up a testing situation
        island.addObject(runner, 1, 1);
        runner.navigateMaze();
        assertThat(runner.getX()).isEqualTo(1);
        assertThat(runner.getY()).isEqualTo(1);
    }

    /**
     *  Tests that the maze is being cleared
     */
    public void testClearMaze()
    {
        island.addObject(runner, 1, 1); 
        runner.clearMaze();
        assertThat(island.countFlowers()).isEqualTo(0);
        assertThat(island.countNets()).isEqualTo(0);
    }

    /**
     * Tests the canMoveforward() method when there is
     * water ahead
     */
    public void testCanMoveForward()
    {
        island.addObject(runner, 2, 1);
        island.addObject(new Water(), 3, 1);
        assertThat(runner.canMoveforward()).isFalse();
    }

    /**
     * Tests the canMoveforward() method when there is
     * a net ahead
     */
    public void testCanMoveForward2()
    {
        island.addObject(runner, 1, 7);
        island.addObject(new Net(), 2, 7);
        assertThat(runner.canMoveforward()).isFalse();
    }

    /**
     * Tests the canMoveforward() method when
     * there is no net or water ahead
     */
    public void testCanMoveForward3()
    {
        island.addObject(runner, 1, 9);
        assertThat(runner.canMoveforward()).isTrue();
    }

    /**
     * Tests that this method disables
     * any net that may come ahead
     */
    public void testCheckDisable()
    {
        island.addObject(runner, 1, 7);
        island.addObject(new Net(), 2, 7);
        assertThat(runner.seesNet(AHEAD)).isTrue();
        runner.checkDisable();
        assertThat(runner.seesNet(AHEAD)).isFalse();
    }

    /**
     * Tests that this method identifies
     * when there is no net ahead
     */
    public void testCheckDisable2()
    {
        island.addObject(runner, 1, 3);
        assertThat(runner.seesNet(AHEAD)).isFalse();
        runner.checkDisable();
        assertThat(runner.seesNet(AHEAD)).isFalse();
    }
}
