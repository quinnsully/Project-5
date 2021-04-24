// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Quinn Sullivan (quinnsullivan)
// -- Daniel Petrenko (danielp18)
// -- Kirti Shukla (kshukla01)
package prj5;

import java.io.FileNotFoundException;

/**
 * Runs the file
 *
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/24/2021>
 */
public class Input {
    /**
     * The main method
     * 
     * @param args
     *            argument input
     * @throws FileNotFoundException
     *             If the file was not found
     */
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 1) {
            CovidReader country = new CovidReader(args[0]);
            System.out.println(country.toString());
        }
        else {

            CovidReader country = new CovidReader(
                "Cases_and_Deaths_by_race_CRDT_Sep2020.csv");
            System.out.println(country.toString());
        }

    }
}
