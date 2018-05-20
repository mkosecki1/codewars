package com.codewars.kyu8.RegexpBasicsIsItADigit;

public class StringUtils {
    public static boolean isDigit(String s) {
        if (s.length()==1){
            for (char c : s.toCharArray()){
                if (Character.isDigit(c)){
                    return true;
                }
            }
        }
        return false;
    }

    /* ANOTHER SOLUTIONS:
    public static boolean isDigit(String s) {
        return s.matches("[0-9]");
    }

    public static boolean isDigit(String s) {
        return s != null && s.length() == 1 && Character.isDigit(s.charAt(0));
    }
     */
}
