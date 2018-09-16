package com.codewars.kyu7.CountAllTheSheep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(5, Kata.lostSheeps(new int[] {1,2}, new int[] {3,4}, 15));
        assertEquals(6, Kata.lostSheeps(new int[] {3,1,2}, new int[] {4,5}, 21));
    }
}