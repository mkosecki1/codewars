package com.codewars.kyu8.LocalizeTheBarycenter;

public class Barycenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double xO = (double)Math.round((x[0] + y[0] + z[0])/3*10000)/10000;
        double yO = (double)Math.round((x[1] + y[1] + z[1])/3*10000)/10000;
        double[] result = {xO,yO};
        return result;
    }
}
