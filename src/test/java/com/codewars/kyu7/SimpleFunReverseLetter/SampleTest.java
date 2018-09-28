package com.codewars.kyu7.SimpleFunReverseLetter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void testSomething() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }
    private void doTest(final String str, final String expected) {
        assertEquals(expected, Kata.reverseLetter(str));
    }
}