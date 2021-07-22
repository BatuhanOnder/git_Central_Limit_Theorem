package git_central_limit_theorem;

import java.util.List;

/**
 *
 * @author batuh
 */
public class AllSamples extends Sample {

    public double AverageCalculate() {
        double temp = 0;
        for (int i = 0; i < Samples.size(); i++) {
            temp += Samples.get(i).Average;
        }
        return (temp / Samples.size());
    }

    public double StandardDeviationCalculate() {
        double temp = 0;
        for (int i = 0; i < Samples.size(); i++) {
            temp += Samples.get(i).StandardDeviation;
        }
        return (temp / Samples.size());
    }

    public double VarianceMinus3_Calculate() {
        double temp = 0;
        for (int i = 0; i < Samples.size(); i++) {
            temp += Samples.get(i).VarianceMinus_3;
        }
        return (temp / Samples.size());
    }

    public double VarianceMinus2_Calculate() {
        double temp = 0;
        for (int i = 0; i < Samples.size(); i++) {
            temp += Samples.get(i).VarianceMinus_2;
        }
        return (temp / Samples.size());
    }

    public double VarianceMinus1_Calculate() {
        double temp = 0;
        for (int i = 0; i < Samples.size(); i++) {
            temp += Samples.get(i).VarianceMinus_1;
        }
        return (temp / Samples.size());
    }

    public double VarianceZero_Calculate() {
        double temp = 0;
        for (int i = 0; i < Samples.size(); i++) {
            temp += Samples.get(i).VarianceZero;
        }
        return (temp / Samples.size());
    }

    public double VariancePlus1_Calculate() {
        double temp = 0;
        for (int i = 0; i < Samples.size(); i++) {
            temp += Samples.get(i).VariancePlus_1;
        }
        return (temp / Samples.size());
    }

}
