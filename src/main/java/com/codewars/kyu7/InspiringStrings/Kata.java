package com.codewars.kyu7.InspiringStrings;

public class Kata {
    public static String longestWord(String wordString) {
        String[] copy = wordString.split(" ");
        String temp = "";
        for(int i=0; i<copy.length; i++){
            if (copy[i].length()>=temp.length()){
                temp = copy[i];
            }
        }
        return temp;
    }
}
