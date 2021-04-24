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
    
    public double covidCalculator() {
        double result = fatality / cases;
        
          if (fatality == -1 || cases == -1)
          {
          result = -.01;
          }
         
        
        return result;
    }
    
    public String toString() {
        
        
        StringBuilder builder = new StringBuilder("");
        int casesCast = (int) getCases();
        builder.append(name + ": ");
        DecimalFormat df = new DecimalFormat("##.#%");
        String blah = df.format(covidCalculator());
        builder.append(casesCast + " cases, ");
        builder.append(blah + " CFR");

        return builder.toString();
    }
}
