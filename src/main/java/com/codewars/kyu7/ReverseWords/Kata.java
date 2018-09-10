package com.codewars.kyu7.ReverseWords;

public class Kata {
    public static String reverseWords(final String original) {
        String[] splitTowords = original.split(" ");

        if (splitTowords.length == 0) return original;

        int i=0;
        for (String string : splitTowords){
            splitTowords[i] = new StringBuilder(string).reverse().toString();
            i++;
        }
        return String.join(" ",splitTowords);
    }
}
