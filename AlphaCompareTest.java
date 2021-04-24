package prj5;

/**
 * Testing AlphaCompare class
 * 
 *
 */
public class AlphaCompareTest extends student.TestCase {

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
        String state1 = "Alabama";
        String state2 = "Wyoming";
        String state3 = "Wyoming";
        System.out.println(alpha.compare(state1, state2));
        assertTrue(alpha.compare(state1, state2) < 0);
        assertTrue(alpha.compare(state3, state2) == 0);
        assertTrue(alpha.compare(state2, state1) > 0);
    }

}
