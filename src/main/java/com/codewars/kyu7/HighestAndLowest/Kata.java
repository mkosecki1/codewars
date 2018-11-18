package com.codewars.kyu7.HighestAndLowest;

import java.util.Arrays;

public class Kata {
    public static String HighAndLow(String numbers) {
        String[] splitNo = numbers.split(" ");
        int[] numArray = new int[splitNo.length];
        for (int i = 0; i < splitNo.length; i++){
            numArray[i] = Integer.parseInt(splitNo[i]);
        }
        Arrays.sort(numArray);
        return numArray[numArray.length-1] + " " + numArray[0];
    }
}