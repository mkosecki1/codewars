package com.codewars.kyu8.CenturyFromYear;

public class Solution {
    public static int century(int number) {
        if (number>9) {
            String string = String.valueOf(number);
            int length = string.length();
            int first = Integer.parseInt(String.valueOf(string.charAt(0)));
            int firstSecend = Integer.parseInt(string.substring(0,2));
            int last = Integer.parseInt(String.valueOf(string.charAt(length-1)));
            if (length==2 || number==100) return 1;
            else if (length==3 && last!=0) return first+1;
            else if (length==3 && last==0) return first;
            else if (length==4 && last!=0) return firstSecend+1;
            else if (length==4 && last==0 && number!=1000) return firstSecend;
            else if (number==1000) return 9;
        }
        return 1;
    }
}
