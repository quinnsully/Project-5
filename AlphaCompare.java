package project5;

import java.util.Comparator;

/**
 * Compares the names of two states
 * 
 *
 */
public class AlphaCompare implements Comparator<String> {

    /**
     * Empty constructor
     */
    public AlphaCompare() {
        // left blank intentionally
    }

    /**
     * Compare method
     */
    @Override
    public int compare(String state1, String state2) {
        return state1.compareTo(state2);
    }


    

}
