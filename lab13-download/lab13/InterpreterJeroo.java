// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Caleb Appiagyei (Caleba04)
import student.micro.jeroo.*;
import java.util.*;
//-------------------------------------------------------------------------
/**
 *  A remotely controllable jeroo that reads commands
 *  from a scanner and uses a map to translate words
 *  into commands.
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version 2022.11.18
 */
public class InterpreterJeroo
    extends Jeroo
{
    //~ Fields ................................................................
    private Map<String, Command> commands;


    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new InterpreterJeroo object.
     */
    public InterpreterJeroo()
    {
        super();
        commands = new HashMap<String, Command>();
        ForwardCommand forward = new ForwardCommand(this);
        commands.put("forward", forward);
        commands.put("Forward", forward);
        LeftCommand left = new LeftCommand(this);
        commands.put("left", left);
        commands.put("Left", left);
        RightCommand right = new RightCommand(this);
        commands.put("right", right);
        commands.put("Right", right);
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
            commands.get(temp).execute();
        }
        else if (temp.equals("right"))
        {
            commands.get(temp).execute();
        }
        else
        {
            commands.get(temp).execute();
        }
    }
}
