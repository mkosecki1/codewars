package com.codewars.kyu7.TheOfficeBrokenPhotocopier;

public class Kata {
    public static String broken(final String x) {
        return x.replace("0","A").replace("1","0").replace("A","1");
    }
}