package com.codewars.kyu7.Quicksum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuicksumTest {
    @Test
    public void testQuicksumBasic() {
        Quicksum quicksumObject = new Quicksum();
        assertEquals(46,quicksumObject.quicksum("ACM"));
        assertEquals(650,quicksumObject.quicksum("MID CENTRAL"));
        assertEquals(15,quicksumObject.quicksum("BBC"));
        assertEquals(0,quicksumObject.quicksum("???"));
        assertEquals(0,quicksumObject.quicksum("axg"));
        assertEquals(0,quicksumObject.quicksum("234 234 WEF ASDF AAA 554211 ???? "));
        assertEquals(75,quicksumObject.quicksum("A C M"));
    }
}