package com.codewars.kyu8.GrasshopperDebug;

public class GrassHopper {
    public static String weatherInfo(double temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    public static double convertToCelsius(double temp) {
        return (5.00/9.00)*(temp - 32);
    }
}
