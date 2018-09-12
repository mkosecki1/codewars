package com.codewars.kyu7.AreTheNumbersInOrder;

import java.util.Arrays;

public class Solution {
    public static boolean isAscOrder(int[] arr) {
        if (arr.length == 0){
            return true;
        }
        int[] copyOfArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyOfArr);
        return Arrays.equals(arr,copyOfArr);
    }
}
