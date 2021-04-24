package prj5;

import java.util.Comparator;

public class States {

    private String name;
    private LinkedList<Race> info;

    public States(String inputState, LinkedList<Race> races) {
        info = new LinkedList<Race>();
        this.name = inputState;
        this.info = races;
    }


    public String getState() {
        return name;
    }


    public LinkedList<Race> getInfo() {
        return info;
    }
   
    public String toString() {
        StringBuilder builder = new StringBuilder("");

        builder.append(name);
        builder.append("\n");
        info.sort(new AlphaCompare());
        for (Race race: info) {
            
            builder.append(race);
            builder.append("\n");
        }
        builder.append("==== \n");
        info.sort(new CFRCompare());
        for (Race race: info) {
            
            builder.append(race);
            builder.append("\n");
        }
        builder.append("==== \n");
        return builder.toString();
    }

}
