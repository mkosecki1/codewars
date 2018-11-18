package com.codewars.kyu7.SpeedControl;

import java.util.Arrays;

public class GpsSpeed {
    public static int gps(int s, double[] x) {
        if (x.length<=1) return 0;
        double[] averageSpeed = new double[x.length-1];
        for (int i = 0; i < x.length-1; i++){
            averageSpeed[i] = (3600 * (x[i+1]-x[i]))/s;
        }
        Arrays.sort(averageSpeed);
        int max = (int) Math.floor(averageSpeed[averageSpeed.length-1]);
        return max;
    }
}