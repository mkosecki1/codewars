package com.codewars.kyu8.GrasshopperArrayMean;

import java.util.stream.IntStream;

public class GrassHopper {
    public static int findAverage(int[] nums) {
        return (int)IntStream.of(nums).average().orElse(0);
    }
}
