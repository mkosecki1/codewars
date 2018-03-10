package com.codewars.kyu8.RepeatIt;

import org.thymeleaf.util.StringUtils;

public class RepeatIt {
    public static String repeatString(Object toRepeat, final int n) {
        return StringUtils.repeat(toRepeat,n);
    }
}
