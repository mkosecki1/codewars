package com.codewars.kyu7.BetweenExtremes;

import java.util.Arrays;

public class Kata {
    public static int betweenExtremes(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] - numbers[0];
    }
}