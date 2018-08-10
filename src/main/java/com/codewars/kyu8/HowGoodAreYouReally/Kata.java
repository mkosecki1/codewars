package com.codewars.kyu8.HowGoodAreYouReally;

import java.util.Arrays;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double sum = Arrays.stream(classPoints).sum();
        double sumWithMy = sum + yourPoints;
        int length = classPoints.length + 1;
        double average = sumWithMy / length;
        return (yourPoints>average);
    }
}
