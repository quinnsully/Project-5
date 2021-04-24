package prj5;

import java.util.Comparator;

/**
 * Compares the CFRs of two states
 * 
 *
 */
public class CFRCompare implements Comparator<Race> {

    /**
     * Empty constructor
     */
    public CFRCompare() {
        // left blank intentionally
    }


    /**
     * Compare method
     */
    @Override
    public int compare(Race race1, Race race2) {
        if (Double.valueOf(race1.covidCalculator()) < Double.valueOf(race2
            .covidCalculator())) {
            return -1;
        }
        if (Double.valueOf(race1.covidCalculator()) > Double.valueOf(race2
            .covidCalculator())) {
            return 1;
        }
        return race2.getName().compareToIgnoreCase(race1.getName());
    }

}
