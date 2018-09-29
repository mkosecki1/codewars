package com.codewars.kyu7.ShortestWord;

import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        String[] toPieces = s.split(" ");
        String result = Arrays.asList(toPieces).stream().sorted((e2,e1) -> e1.length()>e2.length() ? -1 : 1).findFirst().get();
        return result.length();
    }
}
