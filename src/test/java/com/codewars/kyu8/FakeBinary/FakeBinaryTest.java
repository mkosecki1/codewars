package com.codewars.kyu8.FakeBinary;

import org.junit.Test;
import static org.junit.Assert.*;

public class FakeBinaryTest {
    @Test
    public void fakeBin() throws Exception {
        assertEquals("0011",FakeBinary.fakeBin("1256"));
    }

}