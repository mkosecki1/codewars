package com.codewars.kyu7.ThinkfulStringDrillsRepeater;

import org.apache.commons.lang3.StringUtils;

public class Repeater {
    public static String repeat(String string,long n){
        return StringUtils.repeat(string, (int) n);
    }
}
