package com.codewars.kyu8.ReversedStrings;

public class Kata {
    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int n = str.length()-1; n>=0;n--){
            stringBuilder.append(str.charAt(n));
        }
        System.out.println(stringBuilder);
        return String.valueOf(stringBuilder);
    }

    /* another sollution:
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    */
}
