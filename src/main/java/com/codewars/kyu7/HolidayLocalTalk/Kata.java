package com.codewars.kyu7.HolidayLocalTalk;

public class Kata {
    public static String pak(final String s) {
        return (s.trim().length() == 0) ? "" : s.replaceAll(" "," pak ");
    }
}