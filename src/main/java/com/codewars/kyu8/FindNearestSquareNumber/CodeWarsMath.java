package com.codewars.kyu8.FindNearestSquareNumber;

public class CodeWarsMath {
    public static int nearestSq(final int n){
        int x = (int) Math.round(Math.sqrt(n));
        return x * x;
    }

    /* ANOTHER SOLUTIONS:
    return (int) Math.pow(Math.round(Math.sqrt(n)),2);
    */
}
