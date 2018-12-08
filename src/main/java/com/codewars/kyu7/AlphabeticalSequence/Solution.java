package com.codewars.kyu7.AlphabeticalSequence;

import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class Solution {

    public static String alphaSeq(String s) {
        char[] splited = s.toLowerCase().toCharArray();
        Arrays.sort(splited);
        char letter;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<splited.length;i++){
            letter = splited[i];
            stringBuilder.append(Character.toUpperCase(splited[i])).
                    append(StringUtils.repeat(splited[i],letterToAlphabetPos(letter)-1)).append(",");

        }
        String result = stringBuilder.toString().substring(0,stringBuilder.length()-1);
        System.out.println(result);
        return result;
    }

    private static int letterToAlphabetPos(char letter) {
        return Character.toUpperCase(letter) - 64;
    }
}