/**
 * 
 */
package project5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Daniel Petrenko
 *
 */
public class CovidReader {

    private States[] states;
    public CovidReader(String fileName)
    {
        states = readFile(fileName);
        CovidWindow window = new CovidWindow(new CovidCalculator(states));
       
    }
    
    
    
    
    
    private States[] readFile(String fileName) throws FileNotFoundException {
        States[] holder = new States[CovidCalculator.NUM_STATES];
        File file = new File(fileName);
        Scanner input = new Scanner(fileName);
        input.nextLine();
        int count = 0;
        while (input.hasNextLine()) {
            String[] temp = input.nextLine().split(", *");
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].equals("NA")) {
                    temp[i] = "-1";
                }
            }
            holder[count] = new State(temp[0], Integer.valueOf(temp[1]), Integer
                .valueOf(temp[2]), Integer.valueOf(temp[3]), Integer.valueOf(
                    temp[4]), Integer.valueOf(temp[5]), Integer.valueOf(
                        temp[6]), Integer.valueOf(temp[7]), Integer.valueOf(
                            temp[8]), Integer.valueOf(temp[9]), Integer.valueOf(
                                temp[10]));
            count++;
        }
        input.close();
        return holder;

    }
}
