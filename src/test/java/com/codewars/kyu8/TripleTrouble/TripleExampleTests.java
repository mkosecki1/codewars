package com.codewars.kyu8.TripleTrouble;

import org.junit.Test;

import static org.junit.Assert.*;

public class TripleExampleTests {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", TripleTroubleKata.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", TripleTroubleKata.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", TripleTroubleKata.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", TripleTroubleKata.tripleTrouble("LLh","euo","xtr"));
    }

}