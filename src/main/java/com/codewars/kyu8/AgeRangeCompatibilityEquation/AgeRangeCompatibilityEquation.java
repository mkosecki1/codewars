package com.codewars.kyu8.AgeRangeCompatibilityEquation;

public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
       if (age<=14){
            int min14 = (int) Math.floor(age - 0.10 * age);
            int max14 = (int) Math.floor(age + 0.10 * age);
            return min14 + "-" + max14;
       }
       int min = (int) Math.floor((age/2) + 7);
       int max = (int) Math.floor((age-7)*2);
       return min + "-" + max;
    }

    /* ANOTHER SOLUTIONS:

    public static String datingRange(int age) {
        String minmax = (age<=14) ? Integer.toString((int)(age-0.10*age)) + "-" + Integer.toString((int)(age+0.10*age)) : Integer.toString((int)(age/2+7)) + "-" + Integer.toString((int)((age-7)*2));
        return minmax;
    }

     */
}
