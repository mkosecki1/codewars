package com.codewars.kyu8.AllStarCodeChallenge18;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class basicTests {
    @Test
    public void testSomething() {
        assertEquals(CodeWars.strCount("Hello", 'o'),1);
        assertEquals(CodeWars.strCount("Hello", 'l'),2);
        assertEquals(CodeWars.strCount("",'z'),0);
    }
}