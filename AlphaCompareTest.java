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
 * Testing AlphaCompare class
 * 
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/24/2021>
 */
public class AlphaCompareTest extends TestCase {

    private AlphaCompare alpha;

    /**
     * sets up test method
     */
    public void setUp() {
        alpha = new AlphaCompare();
    }


    /**
     * Tests compare method
     */
    public void testCompare() {
        Race white = new Race("White", 1000, 37);
        Race black = new Race("Black", 1000, 37);
        Race black2 = new Race("Black", 1000, 37);

        assertTrue(alpha.compare(white, black) < 0);
        assertEquals(0, alpha.compare(black, black2));
        assertTrue(alpha.compare(black, white) > 0);
    }

}
