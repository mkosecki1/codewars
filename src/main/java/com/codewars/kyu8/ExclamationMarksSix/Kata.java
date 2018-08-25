package com.codewars.kyu8.ExclamationMarksSix;

public class Kata {
    public static String remove(String s, int n){
        String result = s;
        for (int i=0; i<s.length();i++){
            if (i<n) {
                result = result.replaceFirst("!","");
            }
        }
        System.out.println(result);
        return result;
    }
}
