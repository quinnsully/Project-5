// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Quinn Sullivan (quinnsullivan)
// -- Daniel Petrenko (danielp18)
// -- Kirti Shukla (kshukla01)
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Reads the input files and creates the LinkedLists for the
 * input class
 * 
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/24/2021>
 */
public class CovidReader {

    private LinkedList<States> states;

    /**
     * creates the covidreader object
     * 
     * @param fileName
     *            String of the file name
     * @throws FileNotFoundException
     */
    public CovidReader(String fileName) throws FileNotFoundException {

        states = readFile(fileName);

    }


    /**
     * reads the csv files and creates states and races
     * objects
     * 
     * @param fileName
     *            String name of the file
     * @return LinkedList<States> of states
     * @throws FileNotFoundException
     */
    private LinkedList<States> readFile(String fileName)
        throws FileNotFoundException {
        LinkedList<States> holder = new LinkedList<States>();

        Scanner input = new Scanner(new File(fileName));
        String[] names = input.nextLine().split(", *");

        while (input.hasNextLine()) {
            LinkedList<Race> races = new LinkedList<Race>();
            String[] temp = input.nextLine().split(", *");
            for (int i = 1; i < temp.length; i++) {
                if (temp[i].equals("NA")) {
                    temp[i] = "-1.0";
                }
            }
            for (int i = 1; i < 6; i++) {

                Race hold = new Race(names[i].split("_")[1].toLowerCase(),
                    Double.valueOf(temp[i]), Double.valueOf(temp[i + 5]));
                races.add(hold);

            }
            States tempState = new States(temp[0], races);
            holder.add(tempState);
        }
        input.close();
        return holder;

    }


    /**
     * method creates the covidreader object into string
     * 
     * @return String of the covidreader
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (States state : states) {
            builder.append(state.toString());
        }
        return builder.toString();

    }
}
