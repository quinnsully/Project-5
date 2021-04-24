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
 * Tests the Race class
 *
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/24/2021>
 */
public class RaceTest extends TestCase {

    private Race covidRace;

    /**
     * Sets up each test method before it runs
     */
    public void setUp() {
        covidRace = new Race("White", 1000, 37);
    }


    /**
     * Tests the getCases method
     */
    public void testGetCases() {
        assertEquals(1000, covidRace.getCases(), 0.01);
    }


    /**
     * Tests the getFatality method
     */
    public void testGetFatality() {
        assertEquals(37, covidRace.getFatality(), 0.01);
    }


    /**
     * Tests the getName method
     */
    public void testGetName() {
        assertEquals("White", covidRace.getName());
    }
    
    /**
     * Tests the covidCalculator method
     */
    public void testCovidCalculator() {
        Race test = new Race("White", -1, 1);
        Race test2 = new Race("White", 1, -1);
        
        assertEquals(-.01, test.covidCalculator(), 0.001);
        assertEquals(-.01, test2.covidCalculator(), 0.001);
    }


    /**
     * Tests the toString method
     */
    public void testToString() {
        assertEquals("White: 1000 cases, 3.7% CFR", covidRace.toString());
    }

}
