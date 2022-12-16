import student.micro.lightbot.*;

//-------------------------------------------------------------------------
/**
 *  Level 6, together with its solution using a single Light-Bot.
 *
 * @author Caleb Appiagyei (caleba04)
 * @version 2022.08.24
 */
public class Level6Solution
    extends Level6
{
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * This method solves level 6 of the LightBot game. The LightBot is placed
     * at (2,6) and is commanded to travel using given instructions 
     * and light up specific blocks.
     */
    public void myProgram()
    {
        LightBot caleb = new LightBot();
        this.addObject(caleb, 2, 6);
        caleb.turnLeft();
        caleb.move();
        for (int i = 0; i < 2; i++) {
            caleb.jump();
        }
        caleb.turnRight();
        for (int j = 0; j < 2; j++) {
            caleb.jump();
        }
        caleb.turnLightOn();
        caleb.jump();
        caleb.turnLeft();
        for (int i = 0; i < 3; i++) {
            caleb.move();
        }
        caleb.turnLightOn();
        caleb.turnLeft();
        caleb.turnLeft();
        for (int i = 0; i < 6; i++) {
            caleb.move();
        }
        caleb.turnLightOn();
    }
}
