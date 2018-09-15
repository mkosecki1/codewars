package com.codewars.kyu7.ProductOfMaximumsOfArray;

import java.util.Collections;
import java.util.stream.IntStream;

public class Solution {
    public static long maxProduct(int[] numbers, int sub_size) {
        return IntStream.of(numbers).boxed().sorted(Collections.reverseOrder())
                .limit(sub_size).mapToLong(i->i).reduce(1,(a,b)->a*b);
    }
}
