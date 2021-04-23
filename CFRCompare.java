package project5;

import java.util.Comparator;

/**
 * Compares the CFRs of two states
 * 
 *
 */
public class CFRCompare implements Comparator<Integer> {

    /**
     * Empty constructor
     */
    public CFRCompare() {
        //left blank intentionally
    }

    /**
     * Compare method
     */
    @Override
    public int compare(Integer case1, Integer case2) {
        return case1.compareTo(case2);
    }

    

}
