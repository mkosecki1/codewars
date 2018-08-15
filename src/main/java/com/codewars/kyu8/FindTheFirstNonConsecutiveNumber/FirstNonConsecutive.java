package com.codewars.kyu8.FindTheFirstNonConsecutiveNumber;

public class FirstNonConsecutive {
    public static Integer find(final int[] array) {
        for (int i=1;i<array.length;i++){
            if (array[i] - array[i-1] !=1) return array[i];
        }
        return null;
    }
}
