package com.codewars.kyu7.SimpleFunReverseLetter;

public class Kata {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]","")).reverse().toString();
    }
}