package com.codewars.kyu8.SumWithoutHighestAndLowestNumber;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] n) {
        if (n == null){
            return 0;
        } else if (n.length<2 && n.length>0){
            return 0;
        } else if (n.length == 0){
            return 0;
        }
        int result = IntStream.of(n).sum();
        Arrays.sort(n);
        return result - n[0] - n[n.length-1];
    }
}
