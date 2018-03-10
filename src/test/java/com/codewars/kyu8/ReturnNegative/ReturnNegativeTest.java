package com.codewars.kyu8.ReturnNegative;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnNegativeTest {
    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-9, ReturnNegative.makeNegative(-9));
    }

    @Test
    public void test3() {
        assertEquals(0, ReturnNegative.makeNegative(0));
    }

}