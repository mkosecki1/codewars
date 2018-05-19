package com.codewars.kyu8.NthPower;

public class Kata {
    public static int nthPower(int[] array, int n) {
        return n >= array.length ? -1 : (int) Math.pow(array[n], n);
    }

    /* ANOTHER SOLUTIONS:
    public static int nthPower(int[] array, int n) {
        if (n>(array.length-1)){
            return -1;
        }
        int variable = array[n];
        int result = (int) Math.pow(variable,n);
        return result;
    }
    */
}
