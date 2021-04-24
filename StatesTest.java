// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Quinn Sullivan (quinnsullivan)
// -- Daniel Petrenko (danielp18)
// -- Kirti Shukla (kshukla01)
package prj5;

import student.TestCase;

/**
 * Tests the States class
 *
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/24/2021>
 */
public class StatesTest extends TestCase {

    private States washington;

    /**
     * Sets up each test method before it runs
     */
    public void setUp() {
        Race white = new Race("White", 1000, 37);
        Race black = new Race("Black", 1000, 47);
        LinkedList<Race> races = new LinkedList<Race>();
        races.add(white);
        races.add(black);
        washington = new States("DC", races);
    }


    /**
     * Tests the getInfo method
     */
    public void testGetInfo() {
        Race white = new Race("White", 1000, 37);
        Race black = new Race("Black", 1000, 47);
        LinkedList<Race> races1 = new LinkedList<Race>();
        LinkedList<Race> races2 = new LinkedList<Race>();
        races1.add(white);
        races1.add(black);
        races2.add(white);
        races2.add(black);

        States utah = new States("Utah", races1);

        assertEquals(races2, utah.getInfo());
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
        assertEquals("DC\nBlack: 1000 cases, 4.7% CFR" + "\n"
            + "White: 1000 cases, 3.7% CFR" + "\n" + "===="
            + "\nBlack: 1000 cases, 4.7% CFR" + "\n"
            + "White: 1000 cases, 3.7% CFR" + "\n" + "====" + "\n", washington
                .toString());
    }

}
