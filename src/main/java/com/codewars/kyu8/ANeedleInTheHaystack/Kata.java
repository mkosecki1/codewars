package com.codewars.kyu8.ANeedleInTheHaystack;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        String value = "needle";
        for (int i=0; i<haystack.length;i++){
            if (value.equals(haystack[i])) return "found the needle at position " + i;
        }
        return "";
    }
}
