package com.codewars.kyu7.ReverseANumber;

public class ReverseNumber {
    public static int reverse(int number) {
        char[] negativeCheck = String.valueOf(number).toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        if (negativeCheck[0] == '-') {
            for (int i = negativeCheck.length-1; i > 0; i--){
                stringBuilder.append(negativeCheck[i]);
            }
            return Integer.valueOf(stringBuilder.insert(0,negativeCheck[0]).toString());
        }
        for (int i = negativeCheck.length-1; i >= 0; i--){
            stringBuilder.append(negativeCheck[i]);
        }
        int result = Integer.valueOf(stringBuilder.toString());
        return Math.abs(result);
    }
}
