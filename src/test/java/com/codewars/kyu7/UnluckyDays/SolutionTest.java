package com.codewars.kyu7.UnluckyDays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(3, Kata.unluckyDays(2015));
        assertEquals(1, Kata.unluckyDays(1986));
    }
}