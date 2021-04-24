package prj5;

import java.util.Comparator;

/**
 * Compares the names of two states
 * 
 *
 */
public class AlphaCompare implements Comparator<Race> {

    /**
     * Compare method
     */
    @Override
    public int compare(Race race1, Race race2) {
        return race2.getName().compareToIgnoreCase(race1.getName());
    }


    

}
