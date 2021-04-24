package prj5;

public class States {

    private String state;
    private LinkedList<Race> info;

    public States(String inputState, LinkedList<Race> races) {
        info = new LinkedList<Race>();
        this.state = inputState;
        this.info = races;
    }


    public String getState() {
        return state;
    }


    public LinkedList<Race> getInfo() {
        return info;
    }


    public String toString() {
        StringBuilder builder = new StringBuilder("");

        builder.append(state);
        builder.append("\n");
        for (int i = 0; i < info.size(); i++) {
            builder.append(info);
            builder.append("\n");
        }
        builder.append("====");

        return builder.toString();
    }

}
