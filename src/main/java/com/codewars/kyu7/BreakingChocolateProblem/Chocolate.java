package com.codewars.kyu7.BreakingChocolateProblem;

public class Chocolate {
    public static int breakChocolate(int n, int m) {
        return n*m>1? n*m-1 : 0;
    }
}