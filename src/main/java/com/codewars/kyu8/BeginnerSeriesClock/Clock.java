package com.codewars.kyu8.BeginnerSeriesClock;

public class Clock {
    public static int Past(int h, int m, int s) {
        double hours = 3.6*Math.pow(10,6)*h;
        double minutes = 6*Math.pow(10,4)*m;
        double secends = 1000*s;
        int result = (int) (hours + minutes + secends);
        System.out.println(result);
        return result;
    }
}
