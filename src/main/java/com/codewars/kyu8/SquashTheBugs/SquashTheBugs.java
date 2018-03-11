package com.codewars.kyu8.SquashTheBugs;

public class SquashTheBugs {

    public static int findLongest(final String str) {

        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i< spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }

    /* ANOTHER SOLUTIONS:

    public static int findLongest(final String str) {
        return Stream.of(str.split(" ")).mapToInt(s -> s.length()).max().getAsInt();
    }

     */
}