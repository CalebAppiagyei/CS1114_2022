// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
//-------------------------------------------------------------------------
import student.tetris.*;
import java.util.*;
/**
 *  AI of a computerized tetris player
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.06
 */
public class CleverBrain
    implements Brain
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created CleverBrain object.
     */
    public CleverBrain()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Gives the board a score/rating
     * @param b is the given board
     * @return returns the score
     */
    public double rateBoard(Board b)
    {
        double score = 0;
        for (int i = 0; i < b.getColumnHeights().length; i++)
        {
            score += b.getColumnHeights()[i];
        }
        return score;
    }
    
    /**
     * Calculates the best move
     * @param b is the board
     * @param p is the piece
     * @param heightLimit is the heightLimit
     * @return returns the best move
     */
    public Move bestMove(Board b, Piece p, int heightLimit)
    {
        Move m = new Move(p);
        boolean canPlace;
        m.setScore(5000.0);
        for (Piece piece : p.getRotations())
        {
            for (int g = 0; g < b.getWidth() - piece.getWidth(); g++)
            {
                int h = b.rowAfterDrop(piece, g);
                Point location = new Point(g, h);
                if (check(b, location, p) && rateBoard(b) < m.getScore())
                {
                    m.setScore(rateBoard(b));
                    m.setPiece(piece);
                    m.setLocation(new Point(g, h));
                    b.clearRows();
                }
                b.undo();
            }
        }
        return m;
    }
    
    /**
     * Checks if placing the block at the coordinate is
     * valid
     * @param b is the board
     * @param coord is the coordinate
     * @param p is the piece
     * @return returns the resulting integer
     * value
     */
    public boolean check(Board b, Point coord, Piece p)
    {
        int drop = b.place(p, coord);
        b.clearRows();
        return drop == b.PLACE_OK || 
            drop == b.PLACE_ROW_FILLED;
    }
}
