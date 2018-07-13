package com.codewars.kyu8.MultiplesOf3Or5;

public class Solution {
    public int solution(int number) {
        int result = 0;
        for (int i=0; i<number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result+= i;
            }
        }
        System.out.println("Result: " + result);
        return result;
    }

    /*
    ANOTHER SOLLUTION:
    public int solution(int number) {
    return IntStream.range(0, number)
                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                    .sum();
    }
    */
}
