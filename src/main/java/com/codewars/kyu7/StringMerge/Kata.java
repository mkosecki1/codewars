package com.codewars.kyu7.StringMerge;

public class Kata {
    public static String stringMerge(String s1, String s2, char letter) {
        int indexS1 = s1.indexOf(letter);
        int indexS2 = s2.indexOf(letter);
        String subS1 = s1.substring(0,indexS1);
        String subS2 = s2.substring(indexS2);
        StringBuilder result = new StringBuilder();
        result.append(subS1).append(subS2);
        System.out.println(result.toString());
        return result.toString();
    }
    /* SIMPLE SOLUTION:
        return s1.substring(0,s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    */
}