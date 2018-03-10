package com.codewars.kyu8.Plural;

import org.junit.Test;

import static org.junit.Assert.*;

public class PluralTest {
    @Test
    public void BasicTest() {
        assertEquals(true,Plural.isPlural(0f));
        assertEquals(true,Plural.isPlural(0.5f));
        assertEquals(false,Plural.isPlural(1f));
        assertEquals(true,Plural.isPlural(100f));
    }

}