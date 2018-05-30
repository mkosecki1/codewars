package com.codewars.kyu8.CountingSheep;

import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(b->b != null && b).count();
    }
}