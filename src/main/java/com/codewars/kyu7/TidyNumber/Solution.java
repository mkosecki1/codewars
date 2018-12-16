package com.codewars.kyu7.TidyNumber;

import java.util.Arrays;

public class Solution {
    public static boolean tidyNumber(int number) {
        String commingNo = Integer.toString(number);
        char[] charsNo = commingNo.toCharArray();
        Arrays.sort(charsNo);
        String sortedNo = String.valueOf(charsNo);
        return (commingNo.equals(sortedNo));
    }
}