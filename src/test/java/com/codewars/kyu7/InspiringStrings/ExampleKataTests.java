package com.codewars.kyu7.InspiringStrings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleKataTests {
    @Test
    public void tests() {
        assertEquals("fgh", Kata.longestWord("a b c d e fgh"));
        assertEquals("three", Kata.longestWord("one two three"));
        assertEquals("grey", Kata.longestWord("red blue grey"));
        assertEquals("black", Kata.longestWord("blue black grey red"));
        assertEquals("55555", Kata.longestWord("1 22 333 4444 55555"));
        assertEquals("55555", Kata.longestWord("55555 1 22 333 4444"));
    }
}