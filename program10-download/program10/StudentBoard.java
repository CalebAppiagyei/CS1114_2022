// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
//-------------------------------------------------------------------------
import student.tetris2.*;
import java.util.*;
/**
 *  StudentBoard class
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.13
 */
public class StudentBoard
    implements Board
{
    //~ Fields ................................................................
    private int width;
    private int height;
    private int[] columnHeights;
    private int[] blocksInAllRows;
    private boolean[][] grid;
    private static int PLACE_OK = 0;
    private static final int PLACE_ROW_FILLED = 1;
    private static final int PLACE_OUT_BOUNDS = 2;
    private static final int PLACE_BAD = 3;
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created StudentBoard object.
     * @param w is the width
     * @param h is the height
     */
    public StudentBoard(int w, int h)
    {
        super();
        /*# Do any work to initialize your class here. */
        width = w;
        height = h;
        columnHeights = new int[width];
        blocksInAllRows = new int[height];
        grid = new boolean[height][width];
    }


    //~ Methods ...............................................................
    /**
     * Gets width
     * @return returns width
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * Gets height
     * @return returns height
     */
    public int getHeight()
    {
        return height;
    }
    
    /**
     * Gets column heights
     * @return returns the column heights
     */
    public int[] getColumnHeights()
    {
        return columnHeights;
    }
    
    /**
     * Gets the blocks in all rows
     * @return returns blocksinallrows
     */
    public int[] getBlocksInAllRows()
    {
        return blocksInAllRows;
    }
    
    /**
     * Gets the grid
     * @return returns the grid
     */
    public boolean[][] getGrid()
    {
        return grid;
    }
    
    /**
     * Checks if there is a block at the given point
     * @param p is the given point
     * @return returns if there is a block
     */
    public boolean hasBlockAt(Point p)
    {
        return grid[p.getY()][p.getX()];
    }
    
    /**
     * Places the given piece on the board
     * @param piece is the given piece
     * @param point is the given point
     * @return returns the result of the placement
     */
    public int place(Piece piece, Point point)
    {
        for (int i = 0; i < piece.getBody().length; i++)
        {
            int y = piece.getBody()[i].getY() + point.getY();
            int x = piece.getBody()[i].getX() + point.getX();
            Point check = new Point(x, y);
            //if (check.getX() < 0 || check.getY() < 0)
            //{
            //    return PLACE_OUT_BOUNDS;
            //}
            if (check.getX() >= getWidth() || check.getY() >= getHeight())
            {
                return PLACE_OUT_BOUNDS;
            }
            else if (hasBlockAt(check))
            {
                return PLACE_BAD;
            }
            //else if (x >= getWidth() || y >= getHeight())
            //{
            //    return PLACE_OUT_BOUNDS;
            //}
        }
        
        //now place the piece in the location
        for (int i = 0; i < piece.getBody().length; i++)
        {
            int y = piece.getBody()[i].getY() + point.getY();
            int x = piece.getBody()[i].getX() + point.getX();
            grid[y][x] = true;
            if (getColumnHeights()[x] < y + 1)
            {
                columnHeights[x] = y + 1;
            }
            blocksInAllRows[y] += 1;
        }
        
        for (int i = 0; i < getBlocksInAllRows().length; i++)
        {
            if (getBlocksInAllRows()[i] == getWidth())
            {
                return PLACE_ROW_FILLED;
            }
        }
        return PLACE_OK;
    }
    
    /**
     * Clears the row if it is filled
     * @return returns if a row was cleared
     */
    public boolean clearRows()
    {
        boolean[] blankRow = new boolean[getHeight()];
        boolean torf = false;
        for (int j = 0; j < blankRow.length; j++)
        {
            blankRow[j] = false;
        }
        for (int i = 0; i < getBlocksInAllRows().length; i++)
        {
            if (getBlocksInAllRows()[i] == getWidth())
            {
                for (int g = i; g < getHeight() - 1; g++)
                {
                    grid[g] = grid[g + 1];
                }
                for (int g = 0; g < columnHeights.length; g++)
                {
                    columnHeights[g] -= 1;
                }
                torf = true;
            }
            grid[getHeight() - 1] = blankRow;
        }
        return torf;
    }
    
}
