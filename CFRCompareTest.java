package prj5;

/**
 * 
 * Testing CFRCompare class
 *
 */
public class CFRCompareTest extends student.TestCase {

    private CFRCompare cfr;
    
    /**
     * sets up test method
     */
    public void setUp() {
        cfr = new CFRCompare();
    }
    
    /**
     * Tests compare method
     */
    public void testCompare() {
        Integer state1 = 5;
        Integer state2 = 2;        
        Integer state3 = 2;
        assertTrue(cfr.compare(state1, state2) > 0);
        assertTrue(cfr.compare(state3, state2) == 0);
        assertTrue(cfr.compare(state2, state1) < 0);
    }

}
