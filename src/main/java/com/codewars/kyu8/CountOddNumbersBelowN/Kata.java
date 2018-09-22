package com.codewars.kyu8.CountOddNumbersBelowN;

import java.util.stream.IntStream;

public class Kata {
    public static int oddCount(int n){
        return (int)IntStream.range(1,n).filter(i->i % 2 !=0).count();
    }
}
