package com.codewars.kyu8.TwiceAsOld;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TwiceAsOldTest {
    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld.TwiceAsOld(30,0));
        assertEquals(16, TwiceAsOld.TwiceAsOld(30,7));
        assertEquals(15, TwiceAsOld.TwiceAsOld(45,30));

    }
}