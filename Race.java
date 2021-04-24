// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Quinn Sullivan (quinnsullivan)
// -- Daniel Petrenko (danielp18)
// -- Kirti Shukla (kshukla01)
package prj5;

import java.text.DecimalFormat;

/**
 * Gets each statistic of a race, calculates the case fatality ratio, and
 * outputs as a string
 *
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/24/2021>
 */
public class Race {

    private String name;
    private double cases;
    private double fatality;

    /**
     * Constructor
     * 
     * @param raceName
     *            The name of the race
     * @param caseRate
     *            The number of cases for that race
     * @param fatalityRate
     *            The fatality rate for a given race
     */
    public Race(String raceName, double caseRate, double fatalityRate) {
        this.name = raceName;
        this.cases = caseRate;
        this.fatality = fatalityRate;
    }


    /**
     * Gets the name of the race
     * 
     * @return The Race
     */
    public String getName() {
        return name;
    }


    /**
     * Gets the number of cases
     * 
     * @return The number of cases
     */
    public double getCases() {
        return cases;
    }


    /**
     * Gets the name of fatalities
     * 
     * @return The fatalities
     */
    public double getFatality() {
        return fatality;
    }


    /**
     * Calculates the case fatality ratio
     * 
     * @return The CFR
     */
    public double covidCalculator() {
        double result = fatality / cases;

        if (fatality == -1 || cases == -1) {
            result = -.01;
        }

        return result;
    }


    /**
     * Returns a string of the Race, number of cases and CFR
     * 
     * @return The name of the race, number of cases and CFR
     */
    public String toString() {

        StringBuilder builder = new StringBuilder("");
        int casesCast = (int)getCases();
        builder.append(name + ": ");
        DecimalFormat df = new DecimalFormat("##.#%");
        String blah = df.format(covidCalculator());
        builder.append(casesCast + " cases, ");
        builder.append(blah + " CFR");

        return builder.toString();
    }
}
