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
 *  created in the FlowerPicker subclass.
 *
 *  @author Caleb Appiagyei (Caleba04)
 *  @version (2022.09.15)
 */
public class FlowerPickerTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new FlowerPickerTest test object.
     */
    public FlowerPickerTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................
    
    // ----------------------------------------------------------



    // ----------------------------------------------------------
// ----------------------------------------------------------
    /**
     * Test the pickLine() method on flower patch A's northwest corner.
     */
    public void testPickLine()
    {
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 2, 2);
        picker.pickLine();
        // The jeroo should end at (6, 2), so check the x coordinate 
        assertThat(picker.getX()).isEqualTo(6);
        assertThat(picker.getY()).isEqualTo(2);
        assertThat(picker.isFacing(EAST)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(5);
        assertThat(island.countFlowers()).isEqualTo(37);
    }
    
    /**
     * Test pickLine() method on flower patch 
     * at northeast corner
     */
    public void testPickLineE()
    {
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        picker.turn(RIGHT);
        island.addObject(picker, 10, 8);
        picker.pickLine();
        // The jeroo should end at (10, 10), so check the x coordinate 
        assertThat(picker.getX()).isEqualTo(10);
        assertThat(picker.getY()).isEqualTo(10);
        assertThat(picker.isFacing(SOUTH)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(3);
        assertThat(island.countFlowers()).isEqualTo(39);  
    }
    
    /**
     * Tests the turnAroundRight() method
     */
    public void testTurnAroundRight()
    {
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 4, 4);
        picker.turnAroundRight();
        // The jeroo should end at (6, 2), so check the x coordinate 
        assertThat(picker.getX()).isEqualTo(4);
        assertThat(picker.getY()).isEqualTo(5);
        assertThat(picker.isFacing(WEST)).isTrue();
        assertThat(island.countFlowers()).isEqualTo(42);
    }
    
    /**
     * Tests the pick2Lines() method
     */
    public void testPick2Lines()
    {
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 2, 2);
        picker.pick2Lines();
        // The jeroo should end at (2, 3), so check the x coordinate 
        assertThat(picker.getX()).isEqualTo(2);
        assertThat(picker.getY()).isEqualTo(3);
        assertThat(picker.isFacing(WEST)).isTrue();
        assertThat(island.countFlowers()).isEqualTo(32);
    }
}
