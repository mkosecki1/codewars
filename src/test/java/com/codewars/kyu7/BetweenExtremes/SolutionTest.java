package com.codewars.kyu7.BetweenExtremes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void fixedTest() {
        assertEquals(42, Kata.betweenExtremes(new int[]{21, 34, 54, 43, 26, 12}));
        assertEquals(99, Kata.betweenExtremes(new int[]{-1, -41, -77, -100}));
    }
}