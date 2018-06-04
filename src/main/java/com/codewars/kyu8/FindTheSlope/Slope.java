package com.codewars.kyu8.FindTheSlope;

public class Slope {
    public String slope(int[] points) {
        int a = points[0];
        int b = points[1];
        int c = points[2];
        int d = points[3];
        if ((c-a)==0){
            return "undefined";
        }
        int result = (d-b)/(c-a);
        return Integer.toString(result);
    }
}
