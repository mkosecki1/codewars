package com.codewars.kyu8.AllStarCodeChallenge18;

import org.apache.commons.lang3.StringUtils;

public class CodeWars {
    public static int strCount(String str, char letter) {
        return StringUtils.countMatches(str,letter);
    }
    /* ANOTHER SOLUTIONS:
    public static int strCount(String str, char letter) {
        return (int)str.chars().filter(x -> x == letter).count();
    }
    */
}
