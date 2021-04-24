package prj5;

import student.TestCase;

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
     * Tests the toString method
     */
    public void testToString() {
        assertEquals("White: 1000 cases, 3.7% CFR", covidRace.toString());
    }

}
