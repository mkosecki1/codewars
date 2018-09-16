package com.codewars.kyu7.CountAllTheSheep;

import java.util.stream.IntStream;

public class Kata {
    public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
        int friday = IntStream.of(fridayNightCounting).sum();
        int saturday = IntStream.of(saturdayNightCounting).sum();
        return sheepsTotal - friday - saturday;
    }
}