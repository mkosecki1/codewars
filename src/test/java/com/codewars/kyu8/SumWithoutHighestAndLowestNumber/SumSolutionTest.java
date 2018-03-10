package com.codewars.kyu8.SumWithoutHighestAndLowestNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumSolutionTest {
    @Test
    public void BasicTests() {
        assertEquals(16, SumWithoutHighestAndLowestNumber.sum(new int[] { 6, 2, 1, 8, 10}));
    }

}