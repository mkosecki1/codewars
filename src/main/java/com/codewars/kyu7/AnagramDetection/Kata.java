package com.codewars.kyu7.AnagramDetection;

import java.util.Arrays;

public class Kata {
    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()){
            return false;
        }
        char[] testChar = test.toLowerCase().toCharArray();
        char[] originalChar = original.toLowerCase().toCharArray();
        Arrays.sort(testChar);
        Arrays.sort(originalChar);
        return Arrays.equals(testChar,originalChar);
    }
}