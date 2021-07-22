package git_central_limit_theorem;

import java.util.List;

/**
 *
 * @author batuh
 */
public class Sample extends Variance {

    public List<Sample> Samples;
    public double VarianceMinus_3;
    public double VarianceMinus_2;
    public double VarianceMinus_1;
    public double VarianceZero;
    public double VariancePlus_1;

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
        Step_2 = Math.sqrt(Step_1 / (Values.size() - 1));
        return Step_2; 
    }

    public double Variance_Calculate(int a) {
        double Step_1 = 0;
        double Step_2 = 0;
        for (int i = 0; i < Values.size(); i++) {
            Step_1 += Math.pow((Values.get(i) - this.Average), 2); 
        }
        Step_2 = Step_1 / (Values.size() + a);
        return Step_2; 
    }


}
