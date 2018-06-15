package com.codewars.kyu8.DontGiveMeFive;

import java.util.stream.IntStream;

public class Kata {
    public static int dontGiveMeFive(int start, int end) {
        int x = (int) IntStream.rangeClosed(start,end).filter(n-> !String.valueOf(n).contains("5")).count();
        System.out.println(x);
        return x;
    }
}
