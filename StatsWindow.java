// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Quinn Sullivan (quinnsullivan)
// -- Daniel Petrenko (danielp18)
// -- Kirti Shukla (kshukla01)
package prj5;

import java.awt.Color;
import java.text.DecimalFormat;
import cs2.Button;
import cs2.Shape;
import cs2.TextShape;
import cs2.Window;
import cs2.WindowSide;

/**
 * Creats the window, graph, and buttons that will display the data from the csv
 * file
 *
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/30/2021>
 */
public class StatsWindow {

    private Window window;
    private Button quit;
    private Button sortAlpha;
    private Button sortCFR;
    private Button repDC;
    private Button repGA;
    private Button repMD;
    private Button repNC;
    private Button repTN;
    private Button repVA;
    private LinkedList<Race> races;
    private LinkedList<States> states;
    private AlphaCompare compareName;
    private CFRCompare compareCFR;
    private static int BAR_WIDTH = 20;
    private Button lastButton;

    /**
     * Constructor
     * 
     * @param inputState
     *            The state being displayed
     */
    public StatsWindow(LinkedList<States> inputState) {
        states = inputState;
        window = new Window();
        lastButton = null;
        compareName = new AlphaCompare();
        compareCFR = new CFRCompare();

        window.setTitle("Case Fatality Ratio Graph");

        quit = new Button("Quit");
        quit.onClick(this, "clickedQuit");

        sortAlpha = new Button("Sort by Alpha");
        sortAlpha.onClick(this, "clickedSortAlpha");

        sortCFR = new Button("Sort by CFR");
        sortCFR.onClick(this, "clickedSortCFR");

        repDC = new Button("Represent DC");
        repDC.onClick(this, "clickedRepDC");

        repGA = new Button("Represent GA");
        repGA.onClick(this, "clickedRepGA");

        repMD = new Button("Represent MD");
        repMD.onClick(this, "clickedRepMD");

        repNC = new Button("Represent NC");
        repNC.onClick(this, "clickedRepNC");

        repTN = new Button("Represent TN");
        repTN.onClick(this, "clickedRepTN");

        repVA = new Button("Represent VA");
        repVA.onClick(this, "clickedRepVA");

        window.addButton(sortAlpha, WindowSide.NORTH);
        window.addButton(quit, WindowSide.NORTH);
        window.addButton(sortCFR, WindowSide.NORTH);
        window.addButton(repDC, WindowSide.SOUTH);
        window.addButton(repGA, WindowSide.SOUTH);
        window.addButton(repMD, WindowSide.SOUTH);
        window.addButton(repNC, WindowSide.SOUTH);
        window.addButton(repTN, WindowSide.SOUTH);
        window.addButton(repVA, WindowSide.SOUTH);
    }


    /**
     * This method quits the program
     * 
     * @param button
     *            quits the program
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }


    /**
     * This method sorts the data alphabetically
     * 
     * @param button
     *            sorts data alphabetically
     */
    public void clickedSortAlpha(Button button) {
        if (lastButton == null) {
            // left blank intentionally
        }
        else if (lastButton.equals(repDC)) {
            races.sort(compareName);
            clickedRepDC(lastButton);
        }
        else if (lastButton.equals(repGA)) {
            races.sort(compareName);
            clickedRepGA(lastButton);
        }
        else if (lastButton.equals(repMD)) {
            races.sort(compareName);
            clickedRepMD(lastButton);
        }
        else if (lastButton.equals(repNC)) {
            races.sort(compareName);
            clickedRepNC(lastButton);
        }
        else if (lastButton.equals(repTN)) {
            races.sort(compareName);
            clickedRepTN(lastButton);
        }
        else if (lastButton.equals(repVA)){
            races.sort(compareName);
            clickedRepVA(lastButton);
        }
    }


    /**
     * This method sorts the data by CFR
     * 
     * @param button
     *            sorts data by CFR
     */
    public void clickedSortCFR(Button button) {
        if (lastButton == null) {
            // left blank intentionally
        }
        else if (lastButton.equals(repDC)) {
            races.sort(compareCFR);
            clickedRepDC(lastButton);
        }
        else if (lastButton.equals(repGA)) {
            races.sort(compareCFR);
            clickedRepGA(lastButton);
        }
        else if (lastButton.equals(repMD)) {
            races.sort(compareCFR);
            clickedRepMD(lastButton);
        }
        else if (lastButton.equals(repNC)) {
            races.sort(compareCFR);
            clickedRepNC(lastButton);
        }
        else if (lastButton.equals(repTN)) {
            races.sort(compareCFR);
            clickedRepTN(lastButton);
        }
        else if (lastButton.equals(repVA)){
            races.sort(compareCFR);
            clickedRepVA(lastButton);
        }
    }


    /**
     * This method shows the stats for DC when pressed,
     * default layout is in order of CFR
     * 
     * @param button
     *            represents DC button
     */
    public void clickedRepDC(Button button) {

        lastButton = button;
        window.removeAllShapes();

        for (States DC : states) {
            if (DC.getState().equals("DC")) {
                races = DC.getInfo();

                TextShape title = new TextShape(300, 15,
                    "DC Case Fatality Ratio by Race");

                window.addShape(title);

                drawing();
            }
        }
    }


    /**
     * This method shows the stats for GA when pressed,
     * default layout is in order of CFR
     * 
     * @param button
     *            represents GA button
     */
    public void clickedRepGA(Button button) {

        lastButton = button;
        window.removeAllShapes();

        for (States GA : states) {
            if (GA.getState().equals("GA")) {
                races = GA.getInfo();

                TextShape title = new TextShape(300, 15,
                    "GA Case Fatality Ratio by Race");
                window.addShape(title);

                drawing();
            }
        }
    }


    /**
     * This method shows the stats for MD when pressed,
     * default layout is in order of CFR
     * 
     * @param button
     *            represents MD button
     */
    public void clickedRepMD(Button button) {

        lastButton = button;

        window.removeAllShapes();

        for (States MD : states) {
            if (MD.getState().equals("MD")) {
                races = MD.getInfo();

                TextShape title = new TextShape(300, 15,
                    "MD Case Fatality Ratio by Race");
                window.addShape(title);

                drawing();
            }
        }
    }


    /**
     * This method shows the stats for NC when pressed,
     * default layout is in order of CFR
     * 
     * @param button
     *            represents NC button
     */
    public void clickedRepNC(Button button) {

        lastButton = button;

        window.removeAllShapes();

        for (States NC : states) {
            if (NC.getState().equals("NC")) {
                races = NC.getInfo();

                TextShape title = new TextShape(300, 15,
                    "NC Case Fatality Ratio by Race");
                window.addShape(title);

                drawing();
            }
        }
    }


    /**
     * This method shows the stats for TN when pressed,
     * default layout is in order of CFR
     * 
     * @param button
     *            represents TN button
     */
    public void clickedRepTN(Button button) {

        lastButton = button;

        window.removeAllShapes();

        for (States TN : states) {
            if (TN.getState().equals("TN")) {
                races = TN.getInfo();

                TextShape title = new TextShape(300, 15,
                    "TN Case Fatality Ratio by Race");
                window.addShape(title);

                drawing();
            }
        }
    }


    /**
     * This method shows the stats for VA when pressed,
     * default layout is in order of CFR
     * 
     * @param button
     *            represents VA button
     */
    public void clickedRepVA(Button button) {

        lastButton = button;

        window.removeAllShapes();

        for (States VA : states) {
            if (VA.getState().equals("VA")) {
                races = VA.getInfo();

                TextShape title = new TextShape(300, 15,
                    "VA Case Fatality Ratio by Race");
                window.addShape(title);

                drawing();

            }

        }
    }


    /**
     * Converts the CFR of a race into a bar that can be put on a graph.
     */
    private void drawing() {
        DecimalFormat df = new DecimalFormat("##.#%");

        for (int i = 0; i < races.size(); i++) {
            if (races.get(i).getCases() == -1 || races.get(i)
                .getFatality() == -1) {

                TextShape dispRace = new TextShape((200 + (100 * i)), 210, races
                    .get(i).getName());

                window.addShape(dispRace);

                TextShape notAvailable = new TextShape((200 + 100 * i), 190,
                    "NA");

                window.addShape(notAvailable);
            }
            else {

                TextShape dispRace = new TextShape((200 + (100 * i)), 210, races
                    .get(i).getName());

                window.addShape(dispRace);

                int height = (int)(races.get(i).covidCalculator() * 100);
                Shape bar = new Shape((200 + 100 * i), 205 - (height * 25),
                    BAR_WIDTH, (height * 25), Color.BLUE);

                TextShape CFR = new TextShape((200 + 100 * i), 225, df.format(
                    races.get(i).covidCalculator()));

                window.addShape(bar);
                window.addShape(CFR);
            }
        }
    }
}
