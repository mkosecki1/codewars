package com.codewars.kyu8.FindTheForceOfGravity;

public class Solution {
    public static double solution(double[] arrVal, String[] arrUnit) {
        return (6.67 * Math.pow(10,-11)) * convertToKG(arrVal[0],arrUnit[0]) * convertToKG(arrVal[1],arrUnit[1])
                / Math.pow(convertToM(arrVal[2],arrUnit[2]),2);
    }

    public static double convertToKG(double val, String unit){
        switch (unit) {
            case "lb" : return val * 0.453592;
            case "μg" : return val / 1000000000.0;
            case "mg" : return val / 1000000.0;
            case "g"  : return val / 1000.0;
            default   : return val;
        }
    }
    public static double convertToM(double val, String unit){
        switch (unit) {
            case "ft" : return val * 0.3048;
            case "μm" : return val / 1000000.0;
            case "mm" : return val / 1000.0;
            case "cm" : return val / 100.0;
            default   : return val;
        }
    }
}
