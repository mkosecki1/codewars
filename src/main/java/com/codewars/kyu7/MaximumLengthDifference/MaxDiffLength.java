package com.codewars.kyu7.MaximumLengthDifference;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1==null || a2==null || a1.length==0 || a2.length==0) return -1;

        int maxLengthOfA = 0;
        String longestStringOfA = null;
        for (String s : a1) {
            if (s.length() > maxLengthOfA) {
                maxLengthOfA = s.length();
                longestStringOfA = s;
            }
        }

        int minLengthOfA = maxLengthOfA;
        String shortestStringOfA = null;
        for (String s : a1) {
            if (s.length() <= minLengthOfA) {
                minLengthOfA = s.length();
                shortestStringOfA = s;
            }
        }

        int maxLengthOfB = 0;
        String longestStringOfB = null;
        for (String s : a2) {
            if (s.length() > maxLengthOfB) {
                maxLengthOfB = s.length();
                longestStringOfB = s;
            }
        }

        int minLengthOfB = maxLengthOfB;
        String shortestStringOfB = null;
        for (String s : a2) {
            if (s.length() <= minLengthOfB) {
                minLengthOfB = s.length();
                shortestStringOfB = s;
            }
        }
        int res1 = Math.abs(maxLengthOfA-minLengthOfB);
        int res2 = Math.abs(maxLengthOfB-minLengthOfA);

        return (res1>res2) ? res1 : res2;
    }
}