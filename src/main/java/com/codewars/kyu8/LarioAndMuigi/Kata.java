package com.codewars.kyu8.LarioAndMuigi;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        int first = numbers[0];
        int last = numbers[numbers.length-1];
        int[] result = new int[last-first+1];
        for (int i=0;i<result.length;i++){
            result[i] = i+numbers[0];
        }
        return result;
    }

    /* ANOTHER SOLUTIONS:
    public static int[] pipeFix(int[] numbers) {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
     */

}
