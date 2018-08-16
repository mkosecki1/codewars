package com.codewars.kyu8.InvertValues;

import java.util.Arrays;

public class Kata {
    public static int[] invert(int[] array) {
        if (array == null) return null;
        int[] invArray = new int[array.length];
        for (int i=0;i<array.length;i++){
            invArray[i] = array[i]*(-1);
        }
        System.out.println(Arrays.toString(invArray));
        return invArray;
    }
}
