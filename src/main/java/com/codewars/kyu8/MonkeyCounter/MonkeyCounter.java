package com.codewars.kyu8.MonkeyCounter;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n){
        int[] count = new int[n];
        for (int i=0;i<n;i++){
            count[i]=+ i+1;
        }
        return count;
    }

    /* ANOTHER SOLUTIONS:
    public static int[] monkeyCount(final int n){
        return IntStream.rangeClosed(1,n).toArray();
    }

    public static int[] monkeyCount(final int n) {
        int[] counts = new int[n];
        Arrays.setAll(counts, i -> i + 1);
        return counts;
  }
    */
}