package com.codewars.kyu8.FindNumbersWhichAreDivisible;

import java.util.stream.IntStream;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return  IntStream.of(numbers).filter(i->i%divider==0).toArray();
    }
}
