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
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */

    /**
     * Tests the navigateMaze method
     * to make sure it returns to
     * the starting point
     */
    public void testnavigateMaze()
    {
        // set up a testing situation
        TestingIsland island = new TestingIsland();
        MazeRunner runner = new MazeRunner();
        island.addObject(runner, 1, 1);
        runner.navigateMaze();
        assertThat(runner.getX()).isEqualTo(1);
        assertThat(runner.getY()).isEqualTo(1);
    }

    /**
     *  Tests that the maze is being cleared
     */
    //public void testclearMaze()
    //{
    // Tests that the maze is being cleared
    //}

    /**
     * Tests that this method
     * identifies clear steps ahead
     */
    public void testcanMoveforward()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner runner = new MazeRunner();
        island.addObject(runner, 1, 3);
        runner.canMoveforward();
        assertThat(runner.canMoveforward()).isFalse();
    }

    /**
     * Tests that this method disables
     * any net that may come ahead
     */
    public void testcheckDisable()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner runner = new MazeRunner();
        island.addObject(runner, 1, 7);
        runner.checkDisable();
        assertThat(runner.seesNet(AHEAD)).isFalse();
    }
}
