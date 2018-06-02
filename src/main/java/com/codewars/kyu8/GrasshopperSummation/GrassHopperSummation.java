package com.codewars.kyu8.GrasshopperSummation;

public class GrassHopperSummation {
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /* ANOTHER SOLUTIONS:

    public static int summation(int n) {
        return IntStream.rangeClosed(1,n)
                .sum();
    }

    public static int summation(int n) {
        return  n*(n+1)/2;
    }

    */


}
