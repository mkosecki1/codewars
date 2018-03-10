package com.codewars.kyu8.ConvertNumberToString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertNumbToStringTest {
    @Test
    public void tests() {
        assertEquals("67", ConvertNumbToString.numberToString(67));
        assertEquals("123", ConvertNumbToString.numberToString(123));
        assertEquals("999", ConvertNumbToString.numberToString(999));
    }

}