package com.codewars.kyu7.SimpleFunElectionsWinners;

public class ElectionWinners {
    static int find(final int[] votes, final int k) {
        int counter = 0;

        for(int i=0; i<votes.length; i++) {
            int biggest = votes[i] + k;
            boolean isBiggest = true;
            for(int j=0; j<votes.length; j++)
                if(biggest <= votes[j] && j != i) {
                    isBiggest = false;
                    break;
                }
            if(isBiggest){
                counter++;
            }
        }
        return counter;
    }
}