package com.codewars.kyu7.MinimumSteps;

import java.util.Arrays;

public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
        int counter = 0;
        Arrays.sort(numbers);
        int sumOfNo = numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (sumOfNo<k){
                sumOfNo += numbers[i];
                counter++;
            }
        }
        return counter;
    }
}