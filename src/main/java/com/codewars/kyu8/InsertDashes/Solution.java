package com.codewars.kyu8.InsertDashes;

public class Solution {
    public static String insertDash(int num) {
        String solution = "";
        String beginString = String.valueOf(num);

        for (int i = 0; i<beginString.length()-1; i++){
            solution+= beginString.charAt(i);
            if ((int)beginString.charAt(i)%2==1 && (int)beginString.charAt(i+1)%2==1){
                solution+= "-";
            }
        }
        return solution + String.valueOf(beginString.charAt(beginString.length()-1));
    }
}
