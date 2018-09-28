package com.codewars.kyu7.ThinkfulStringDrillsRepeater;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("aaaaa",Repeater.repeat("a",5));
        assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa",Repeater.repeat("Na", 16));
        assertEquals("Wub Wub Wub Wub Wub Wub ",Repeater.repeat("Wub ", 6));
    }
}