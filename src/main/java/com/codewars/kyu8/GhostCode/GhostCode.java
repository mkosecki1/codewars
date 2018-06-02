package com.codewars.kyu8.GhostCode;

public class GhostCode {
    public static String helloName(final String name){
        if(name == null || name.equals("")){
            return "Hello world!";
        }
        return "Hello my name is " + name;
    }
}
