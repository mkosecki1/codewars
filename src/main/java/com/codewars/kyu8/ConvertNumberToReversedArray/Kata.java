package com.codewars.kyu8.ConvertNumberToReversedArray;

import org.apache.commons.lang3.ArrayUtils;

public class Kata {
    public static int[] digitize(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
