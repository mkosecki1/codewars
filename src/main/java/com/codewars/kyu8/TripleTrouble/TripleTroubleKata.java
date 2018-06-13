package com.codewars.kyu8.TripleTrouble;

public class TripleTroubleKata {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder stringBuilder = new StringBuilder(one.length()*3);
        for (int n=0; n<one.length();n++){
            stringBuilder.append(one.charAt(n)).append(two.charAt(n)).append(three.charAt(n));
        }
        return stringBuilder.toString();
    }
}
