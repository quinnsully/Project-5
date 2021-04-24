package prj5;

import student.TestCase;

public class StatesTest extends TestCase {

    private States washington;
    private LinkedList<Race> races;

    /**
     * Sets up each test method before it runs
     */
    public void setUp() {
        Race white = new Race("White", 1000, 37);
        Race black = new Race("Black", 1000, 47);
        races.add(white);
        races.add(black);
        washington = new States("DC", races);
    }

    /**
     * Tests the getInfo method
     */
    public void testGetInfo() {
        Race compared = new Race("White", 1000, 37);
        assertEquals(compared, washington.getInfo());
    }

    /**
     * Tests the getState method
     */
    public void testGetState() {
        assertEquals("DC", washington.getState());
    }

    /**
     * Tests the toString method
     */
    public void testToString() {
        assertEquals("White: 1000 cases, 3.7% CFR" + "\n"
            + "Black: 1000 cases, 4.7% CFR" + "\n" + "====", washington.toString());
    }

}
