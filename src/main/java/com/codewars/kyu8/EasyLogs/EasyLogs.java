package com.codewars.kyu8.EasyLogs;

public class EasyLogs {
    public static double logs(double x, double a, double b) {
        double logA = Math.log(a) / Math.log(x);
        double logB = Math.log(b) / Math.log(x);
        return logA + logB;
    }
}
