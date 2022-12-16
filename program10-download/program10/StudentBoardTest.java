import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.tetris2.*;
// -------------------------------------------------------------------------
/**
 *  Tests StudentBoard
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.14
 */
public class StudentBoardTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new StudentBoardTest test object.
     */
    public StudentBoardTest()
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
     * Tests hasBlockAt
     */
    public void testHasBlockAt()
    {
        StudentBoard test = BoardUtilities.newBoard(StudentBoard.class,
            10, 1,
            "#### #####");
        Point full = new Point(0, 0);
        Point blank = new Point(4, 0);
        assertThat(test.hasBlockAt(blank)).isFalse();
        assertThat(test.hasBlockAt(full)).isTrue();
    }
    
    /**
     * Tests place
     */
    public void testPlace()
    {
        StudentBoard test = BoardUtilities.newBoard(StudentBoard.class,
            10, 4,
            "          ",
            "          ",
            "###   ####",
            "##### ####");
        Piece stick = Piece.getPiece(Piece.STICK, 0);
        Piece t = Piece.getPiece(Piece.T, 2);
        assertThat(test.place(t, new Point(9, 1))).isEqualTo(2);
        assertThat(test.place(t, new Point(10, 1))).isEqualTo(2);
        assertThat(test.place(stick, new Point(0, 0))).isEqualTo(3);
        int height = test.getColumnHeights()[5];
        assertThat(test.place(stick, new Point(5, 0))).isEqualTo(1);
        assertThat(test.getColumnHeights()[5]).isEqualTo(height + 4);
    }
    
    /**
     * Tests Place
     */
    public void testPlace2()
    {
        StudentBoard test = BoardUtilities.newBoard(StudentBoard.class,
            5, 5,
            "     ",
            "     ",
            "     ",
            "     ",
            "#   #");
        Piece box = Piece.getPiece(Piece.SQUARE, 0);
        assertThat(test.place(box, new Point(1, 0))).isEqualTo(0);
    }
    
    /**
     * Tests clearRows
     */
    public void testClearRows()
    {
        StudentBoard test = BoardUtilities.newBoard(StudentBoard.class,
            5, 3,
            "     ",
            "### #",
            "#####");
        boolean[] blankRow = {false, false, false, false, false};
        boolean[] newBottom = {true, true, true, false, true};
        assertThat(test.clearRows()).isTrue();
        assertThat(test.getGrid()[1]).isEqualTo(blankRow);
        assertThat(test.getGrid()[0]).isEqualTo(newBottom);
    }
    
    /**
     * Tests clearRows
     */
    public void testClearRows2()
    {
        StudentBoard test = BoardUtilities.newBoard(StudentBoard.class,
            5, 3,
            "     ",
            "     ",
            "##  #");
        assertThat(test.clearRows()).isFalse();
    }
}
