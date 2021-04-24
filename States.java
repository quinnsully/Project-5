// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Quinn Sullivan (quinnsullivan)
// -- Daniel Petrenko (danielp18)
// -- Kirti Shukla (kshukla01)
package prj5;

/**
 * Creates the States that will be shown in the graph
 *
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/24/2021>
 */
public class States {

    private String name;
    private LinkedList<Race> info;

    /**
     * Constructor
     * 
     * @param inputState
     *            The state whos data is being shown
     * @param races
     *            The race whos data is being displayed
     */
    public States(String inputState, LinkedList<Race> races) {
        info = new LinkedList<Race>();
        this.name = inputState;
        this.info = races;
    }


    /**
     * Gets the State from constructor
     * 
     * @return The State
     */
    public String getState() {
        return name;
    }


    /**
     * Gets the Race info from constructor
     * 
     * @return The races info as a linked list
     */
    public LinkedList<Race> getInfo() {
        return info;
    }


    /**
     * Returns a string of the State and info on each race
     * 
     * @return The State and statistics of each race from that state
     */
    public String toString() {
        StringBuilder builder = new StringBuilder("");

        builder.append(name);
        builder.append("\n");
        info.sort(new AlphaCompare());
        for (Race race : info) {

            builder.append(race);
            builder.append("\n");
        }
        builder.append("====\n");
        info.sort(new CFRCompare());
        for (Race race : info) {

            builder.append(race);
            builder.append("\n");
        }
        builder.append("====\n");
        return builder.toString();
    }

}
