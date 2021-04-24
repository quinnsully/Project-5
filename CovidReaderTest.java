/**
 * 
 */
package prj5;

import java.io.FileNotFoundException;

/**
 * tests the covid reader methods
 * @author Daniel Petrenko
 * @version 2021.04.23
 */
public class CovidReaderTest extends student.TestCase {
    private CovidReader reader;
    /**
     * sets up each test method
     */
    public void setUp() throws FileNotFoundException
    {
        reader = new CovidReader("Cases_and_Deaths.csv");
    }
    /**
     * tests the toString method
     */
    public void testToString()
    {
        assertEquals("DC\n" +
            "asian: 5407 cases, 4.7% CFR\n" +
            "black: 179563 cases, 7.4% CFR\n" +
            "latinx: 97118 cases, 2.3% CFR\n" +
            "other: 108784 cases, 0.2% CFR\n" +
            "white: 70678 cases, 2.7% CFR\n" +
            "=====\n" +
            "black: 179563 cases, 7.4% CFR\n" +
            "asian: 5407 cases, 4.7% CFR\n" +
            "white: 70678 cases, 2.7% CFR\n" +
            "latinx: 97118 cases, 2.3% CFR\n" +
            "other: 108784 cases, 0.2% CFR\n" +
            "=====\n" +
            "VA\n" +
            "asian: -1 cases, -1% CFR\n" +
            "black: 426362 cases, 3.4% CFR\n" +
            "latinx: 738177 cases, -1% CFR\n" +
            "other: 777332 cases, 0.7% CFR\n" +
            "white: 616402 cases, 5.6% CFR\n" +
            "=====\n" +
            "white: 616402 cases, 5.6% CFR\n" +
            "black: 426362 cases, 3.4% CFR\n" +
            "other: 777332 cases, 0.7% CFR\n" +
            "asian: -1 cases, -1% CFR\n" +
            "latinx: 738177 cases, -1% CFR\n" +
            "===== \n", reader.toString());
    }
}
