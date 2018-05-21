package com.codewars.kyu8.HowManyStairs;

public class Kata {
    public static long stairsIn20(int[][] stairs) {
        long sum = 0;
        for (int n=0;n<stairs.length;n++){
            for (int i=0;i<stairs[n].length;i++){
                sum = sum + stairs[n][i];
            }
        }
        return sum*20;
    }
}
