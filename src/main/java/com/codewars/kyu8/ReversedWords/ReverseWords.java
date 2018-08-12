package com.codewars.kyu8.ReversedWords;

public class ReverseWords {
    public static String reverseWords(String str){
        String[] splited = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=splited.length-1; i>=0;i--){
            stringBuilder.append(splited[i]).append(" ");
        }
        String result = String.valueOf(stringBuilder).substring(0,stringBuilder.length()-1);
        System.out.println(result);
        return result;
    }
}
