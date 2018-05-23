package com.codewars.kyu8.CountOfPositives;

import java.util.Arrays;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) throws NullPointerException{
        int count = 0;
        int sum = 0;
        int[] result = new int[2];

        if (input.length == 0) {
            return new int[] {};
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
                result[0] = count;
            } else {
                sum += input[i];
                result[1] = sum;
            }
        }
        return result;
    }
}
