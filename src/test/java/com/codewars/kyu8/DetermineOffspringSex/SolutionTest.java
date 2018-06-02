package com.codewars.kyu8.DetermineOffspringSex;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", Kata.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", Kata.chromosomeCheck("XX"));
    }
}