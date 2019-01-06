package com.codewars.kyu7.BingoOrNot;

import org.apache.commons.lang3.ArrayUtils;

public class BingoOrNot {
    public static String bingo(int[] numberArray){
        return (ArrayUtils.contains(numberArray,2) &&
                ArrayUtils.contains(numberArray,7) &&
                ArrayUtils.contains(numberArray,9) &&
                ArrayUtils.contains(numberArray,14) &&
                ArrayUtils.contains(numberArray,15)) ? "WIN" : "LOSE";
    }
}