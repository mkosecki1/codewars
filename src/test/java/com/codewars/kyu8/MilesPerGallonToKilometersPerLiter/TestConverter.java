package com.codewars.kyu8.MilesPerGallonToKilometersPerLiter;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestConverter {
    @Test
    public void test1() {
        assertEquals(3.54f, Converter.mpgToKPM(10), 0.001f);
    }

    @Test
    public void test2() {
        assertEquals(7.08f, Converter.mpgToKPM(20), 0.001f);
    }

    @Test
    public void test3() {
        assertEquals(10.62f, Converter.mpgToKPM(30), 0.001f);
    }

}