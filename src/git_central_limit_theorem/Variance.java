package git_central_limit_theorem;

import java.util.List;

/**
 *
 * @author batuh
 */
public class Variance {
    //start assignment to Global variables 
    List<Integer> Values;
    public double Average;
    public double StandardDeviation;
    public double Variance;
    // end assignment

    public double AverageCalculate() {
        double Total = 0;
        for (int i = 0; i < Values.size(); i++) {
            Total += Values.get(i);
        }
        return (Total / Values.size());
    }

    public double StandardDeviationCalculate() {
        double Step_1 = 0;
        double Step_2 = 0;
        for (int i = 0; i < Values.size(); i++) {
            Step_1 += Math.pow((Values.get(i) - this.Average), 2);
        }
        Step_2 = Math.sqrt(Step_1 / Values.size());
        return Step_2; 
    }

    public double VarianceCalculate() {
        return Math.pow(this.StandardDeviation, 2); //Population Variance is equal to the square of the standard deviation
    }
}
