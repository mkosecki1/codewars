package com.codewars.kyu8.StringRepeat;

import org.thymeleaf.util.StringUtils;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        if (repeat<0){
            return "";
        }
        return StringUtils.repeat(string,repeat);
    }
}
