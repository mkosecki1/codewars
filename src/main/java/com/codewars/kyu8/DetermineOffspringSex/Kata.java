package com.codewars.kyu8.DetermineOffspringSex;

public class Kata {
    public static String chromosomeCheck(String sperm) {
        if(sperm.contains("Y")) return "Congratulations! You're going to have a son.";
        return "Congratulations! You're going to have a daughter.";
    }
}