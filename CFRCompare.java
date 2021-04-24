// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Quinn Sullivan (quinnsullivan)
// -- Daniel Petrenko (danielp18)
// -- Kirti Shukla (kshukla01)
package prj5;

import java.util.Comparator;

/**
 * Compares the CFRs of two states
 * 
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/24/2021>
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
