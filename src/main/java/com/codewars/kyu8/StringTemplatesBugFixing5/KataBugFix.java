package com.codewars.kyu8.StringTemplatesBugFixing5;

public class KataBugFix {
    public static String buildString(String... args){
        return "I like " + String.join(", ",args) + "!";
    }
}
