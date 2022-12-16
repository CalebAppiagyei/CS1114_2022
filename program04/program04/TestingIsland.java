import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  An island with a fixed layout that can be used as a testing
 *  ground for individual MazeRunner methods.
 *
 *  @author Stephen Edwards
 *  @version 2021.09.12
 */
public class TestingIsland
extends Island
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created TestingIsland object.
     */
    public TestingIsland()
    {
        super(4, 11);

        addObject(new Water(), 0, 0);
        addObject(new Water(), 0, 1);
        addObject(new Water(), 0, 2);
        addObject(new Water(), 0, 3);
        addObject(new Water(), 0, 4);
        addObject(new Water(), 0, 5);
        addObject(new Water(), 0, 6);
        addObject(new Water(), 0, 7);
        addObject(new Water(), 0, 8);
        addObject(new Water(), 0, 9);
        addObject(new Water(), 0, 10);

        addObject(new Water(), 4, 0);
        addObject(new Water(), 4, 1);
        addObject(new Water(), 4, 2);
        addObject(new Water(), 4, 3);
        addObject(new Water(), 4, 4);
        addObject(new Water(), 4, 5);
        addObject(new Water(), 4, 6);
        addObject(new Water(), 4, 7);
        addObject(new Water(), 4, 8);
        addObject(new Water(), 4, 9);
        addObject(new Water(), 4, 10);

        addObject(new Water(), 1, 0);
        addObject(new Water(), 2, 0);
        addObject(new Water(), 3, 0);

        addObject(new Water(), 1, 10);
        addObject(new Water(), 2, 10);
        addObject(new Water(), 3, 10);

        addObject(new Water(), 2, 2);
        addObject(new Water(), 3, 2);
        addObject(new Water(), 1, 4);
        addObject(new Water(), 2, 6);
        addObject(new Water(), 2, 8);
        addObject(new Water(), 3, 8);

        addObject(new Net(), 2, 3);
        addObject(new Net(), 1, 8);

        addObject(new Flower(), 2, 1);
        addObject(new Flower(), 2, 3);
        addObject(new Flower(), 1, 3);
    }

}
