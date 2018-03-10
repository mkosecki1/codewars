package com.codewars.kyu8.TripleTrouble;

public class TripleTroubleKata {
    public static String tripleTrouble(String one, String two, String three) {
        String sum = one.substring(0,1) + two.substring(0,1) + three.substring(0,1) +
                one.substring(1,2) + two.substring(1,2) + three.substring(1,2) +
                one.substring(2,3) + two.substring(2,3) + three.substring(2,3)
                + one.substring(3) + two.substring(3) + three.substring(3);
        System.out.println("--> "+ sum);
        return sum;

    }
}
