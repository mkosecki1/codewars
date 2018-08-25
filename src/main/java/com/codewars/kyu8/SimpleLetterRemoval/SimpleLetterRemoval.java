package com.codewars.kyu8.SimpleLetterRemoval;

public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
                'r','s','t','u','v','w','x','y','z'};
        int letterCount=0;
        while (s.length() > 0 && k > 0) {
            String letter = String.valueOf(alphabet[letterCount]);
            if (s.contains(letter)) {
                s = s.replaceFirst(letter, "");
                k--;
            } else {
                letterCount++;
            }

        }
        return s;
    }
}
