package com.codewars.kyu8.altERnaTIngcAsE;

public class StringUtils {
    public static String toAlternativeString(String string) {
        System.out.println("Before change: " + string);
        char[] charArray = string.toCharArray();

        for (int i=0; i<charArray.length;i++){
            if (Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else if (Character.isLowerCase(charArray[i])){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        string = new String(charArray);
        System.out.println("After change: " + string + "\n-----------------");
        return string;
    }
}
