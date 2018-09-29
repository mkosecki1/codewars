package com.codewars.kyu7.ComplementaryDNA;

public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] change = dna.toCharArray();
        for (int i = 0; i < change.length; i++) {
            if (change[i] == 'A') {
                change[i] = 'T';
            } else if (change[i] == 'T'){
                change[i] = 'A';
            } else if (change[i] == 'C') {
                change[i] = 'G';
            } else if (change[i] == 'G') {
                change[i] = 'C';
            }
        }
        String x = new String(change);
        System.out.println(x);
        return x;
    }
}
