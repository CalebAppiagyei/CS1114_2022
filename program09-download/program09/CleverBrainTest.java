// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.tetris.*;

// -------------------------------------------------------------------------
/**
 *  Tests CleverBrain
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.08
 */
public class CleverBrainTest
    extends TestCase
{
    //~ Fields ................................................................
    private CleverBrain testBrain;
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new CleverBrainTest test object.
     */
    public CleverBrainTest()
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
        testBrain = new CleverBrain();
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests the rateBoard method
     */
    public void testRateBoard()
    {
        Board testBoard = new Board(10, 4, 
                "          ",
                "  #       ",
                "# ### #   ",
                "####### ##"
            );
        assertThat(testBrain.rateBoard(testBoard)).isEqualTo(15);
    }

    /**
     * Tests check
     */
    public void testCheck()
    {
        Board testBoard = new Board(10, 5, 
                "          ",
                "          ",
                "  #       ",
                "# ### #   ",
                "######### "
            );
        Piece piece = Piece.getPiece(Piece.T, 0);
        Move m = new Move(piece);
        m.setLocation(new Point(5, 1));
        assertThat(testBrain.check(testBoard, m.getLocation(), piece))
            .isEqualTo(false);
        piece = Piece.getPiece(Piece.T, 2);
        m = new Move(piece);
        m.setLocation(new Point(5, 2));
        assertThat(testBrain.check(testBoard, m.getLocation(), piece))
            .isEqualTo(true);
        piece = Piece.getPiece(Piece.STICK, 0);
        m = new Move(piece);
        m.setLocation(new Point(7, 3));
        assertThat(testBrain.check(testBoard, m.getLocation(), piece))
            .isEqualTo(false);
        m.setLocation(new Point(9, 0));
        assertThat(testBrain.check(testBoard, m.getLocation(), piece))
            .isEqualTo(true);
    }

    /**
     * Tests bestMove
     */
    public void testBestMove()
    {
        Board testBoard = new Board(10, 5,
                "          ",
                "          ",
                "          ",
                "          ",
                "### #### #"
            );
        Piece piece = Piece.getPiece(Piece.T, 0);
        testBrain.bestMove(testBoard, piece, 4);
        assertThat(testBrain.bestMove(testBoard, piece, 4).getLocation()
            .getX()).isEqualTo(0);
        assertThat(testBrain.bestMove(testBoard, piece, 4).getLocation()
            .getY()).isEqualTo(1);
        assertThat(testBrain.bestMove(testBoard, piece, 4).getPiece())
            .isEqualTo(Piece.getPiece(Piece.T, 0));
    }
}
