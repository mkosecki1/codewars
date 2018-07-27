package com.codewars.kyu8.SumOfPositive;

import java.util.stream.IntStream;

public class Positive {
    public static int sum(int[] arr){
        return IntStream.of(arr).filter(value -> value>0).sum();
    }
}
