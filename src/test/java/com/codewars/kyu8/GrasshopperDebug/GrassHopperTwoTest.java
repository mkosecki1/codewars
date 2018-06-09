package com.codewars.kyu8.GrasshopperDebug;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GrassHopperTwoTest {
    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                GrassHopperTwo.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                GrassHopperTwo.sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                GrassHopperTwo.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                GrassHopperTwo.sayHello("Dr. McCoy"));
    }

}