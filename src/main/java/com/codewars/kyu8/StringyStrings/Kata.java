package com.codewars.kyu8.StringyStrings;

public class Kata {
    public static String stringy(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int n=0;n<size;n++) {
            if (n % 2 == 0) {
                stringBuilder.append(1);
            } else {
                stringBuilder.append(0);
            }
        }
        return stringBuilder.toString();
    }
}
