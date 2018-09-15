package com.codewars.kyu7.MinimizeSumOfArray;

import java.util.Arrays;

public class Solution {
    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int result = 0;
        for (int i=0;i<passed.length;i++){
            result+= (passed[i] * passed[passed.length - i - 1])/2;
        }
        return result;
    }
}