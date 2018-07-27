package com.codewars.kyu8.FindSmallestInteger;

import java.util.stream.IntStream;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int result = IntStream.of(args).min().getAsInt();
        System.out.println(result);
        return result;
    }
}
