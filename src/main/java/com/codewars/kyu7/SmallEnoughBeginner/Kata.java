package com.codewars.kyu7.SmallEnoughBeginner;

public class Kata {
    public static boolean smallEnough(int[] a, int limit){
        int counter = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]<=limit){
                counter++;
            }
        }
        return (counter==a.length);
    }
}