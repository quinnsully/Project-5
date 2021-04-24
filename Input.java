package prj5;

import java.io.FileNotFoundException;
import java.util.Locale.IsoCountryCode;

@SuppressWarnings("unused")
public class Input {
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