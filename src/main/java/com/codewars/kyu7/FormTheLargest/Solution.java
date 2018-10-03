package com.codewars.kyu7.FormTheLargest;

import java.util.Arrays;

public class Solution {
    public static long maxNumber(long n) {
        String firstConvert = String.valueOf(n);
        char[] secendConvert = firstConvert.toCharArray();
        Arrays.sort(secendConvert);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(secendConvert));
        return Long.valueOf(stringBuilder.reverse().toString());
    }
}
