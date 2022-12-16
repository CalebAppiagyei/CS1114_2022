// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
import student.micro.jeroo.*;
import java.util.Scanner;

//-------------------------------------------------------------------------
/**
 *  A remotely controllable jeroo that reads commands
 *  from a scanner and carries out the corresponding actions
 *  one at a time.
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.11)
 */
public class RemoteJeroo
    extends Jeroo
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new RemoteJeroo object.
     */
    public RemoteJeroo()
    {
        super();
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Calls interpretCommand() repeatedly until there are no more
     * words left in the given Scanner.
     * 
     * @param input The Scanner to read the command from.
     */
    public void interpretAllCommands(Scanner input)
    {
        while (input.hasNext())
        {
            interpretCommand(input);
        }
    }


    // ----------------------------------------------------------
    /**
     * Reads one word from the scanner (if there is any), and executes
     * the corresponding command.  If the scanner has no words remaining,
     * then nothing happens.
     * 
     * @param input The Scanner to read the command from.
     */
    public void interpretCommand(Scanner input)
    {
        String temp = input.next();
        if (temp.equals("forward"))
        {
            this.forward();
        }
        else if (temp.equals("right"))
        {
            this.right();
        }
        else
        {
            this.left();
        }
    }


    // ----------------------------------------------------------
    /**
     * Moves the actor forward one square.
     */
    public void forward()
    {
        super.hop();
    }


    // ----------------------------------------------------------
    /**
     * Turns the actor left 90 degrees.
     */
    public void left()
    {
        super.turn(LEFT);
    }


    // ----------------------------------------------------------
    /**
     * Turns the actor right 90 degrees.
     */
    public void right()
    {
        super.turn(RIGHT);
    }
}
