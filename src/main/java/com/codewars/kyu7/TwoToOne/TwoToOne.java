package com.codewars.kyu7.TwoToOne;

import java.util.Arrays;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        StringBuilder connetStr = new StringBuilder();
        String bothStr = connetStr.append(s1).append(s2).toString();
        char[] splitToChars = bothStr.toCharArray();
        Arrays.sort(splitToChars);

        StringBuilder withoutDuplicates = new StringBuilder();
        for (int i=0;i<splitToChars.length-1;i++){
            if (splitToChars[i]!=splitToChars[i+1]){
                withoutDuplicates.append(splitToChars[i]);
            }
        }
        withoutDuplicates.append(splitToChars[splitToChars.length-1]);
        return withoutDuplicates.toString();
    }
}