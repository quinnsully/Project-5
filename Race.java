package prj5;

import java.text.DecimalFormat;

public class Race {
    
    private String name;
    private double cases;
    private double fatality;

    public Race(String raceName, double caseRate, double fatalityRate) {
        this.name = raceName;
        this.cases = caseRate;
        this.fatality = fatalityRate;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCases() {
        return cases;
    }
    
    public double getFatality() {
        return fatality;
    }
    
    public String covidCalculator() {
        double result = fatality / cases;
        
        DecimalFormat df = new DecimalFormat("##.#");
        return String.valueOf(df.format(result));
    }
    
    public String toString() {
        
        
        StringBuilder builder = new StringBuilder("");
        int casesCast = (int) getCases();
        builder.append(name + ": ");
        builder.append(casesCast + " cases, ");
        builder.append(covidCalculator() + "% CFR");

        return builder.toString();
    }
}
