package com.codewars.kyu7.PasswordSystem;

import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class Kata {
    public static String helpZoom(final int[] key) {
        int centre = 0;
        String change = Arrays.toString(key).replaceAll("\\[|\\]|,|\\s", "");
        String rightPart;
        if (key.length % 2 == 0){
            centre = key.length/2;
            rightPart = change.substring(centre);

        } else {
            centre = (int) Math.floor(key.length/2);
            rightPart = change.substring(centre+1);
        }
        String leftPart = change.substring(0,centre);
        String reverseRight = StringUtils.reverse(rightPart);
        return (leftPart.equals(reverseRight)) ? "Yes" : "No";
    }
}