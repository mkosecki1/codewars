package com.codewars.kyu8.CalculateAverage;

import java.util.stream.IntStream;

public class Kata{
    public static double find_average(int[] array){
        return IntStream.of(array).average().orElse(0);
    }

    /* ANOTHER SOLUTIONS:
    public static double find_average(int[] array){
        return Arrays.stream(array).average().orElse(0);
    }

    public static double find_average(int[] array){
        double sum=0;
        double avg=0;
        for (int i=0;i<array.length;i++)
        sum+= array[i];
        avg= sum/array.length;
        return avg;

    }
    */
}
