package prj5;

@SuppressWarnings("unused")
public class Input {
    public static void main(String[] args) {
        if (args.length > 0) {
            CovidReader country = new CovidReader(args[0]);
        }
        else {
            
            CovidReader country = new CovidReader(
                "Cases_and_Deaths_by_race_CRDT_Sep2020.csv");
        }

    }
}
