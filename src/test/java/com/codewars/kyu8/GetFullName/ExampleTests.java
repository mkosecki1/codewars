package com.codewars.kyu8.GetFullName;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {

    @Test
    public void test() {
        assertEquals("Clint Eastwood", new Dinglemouse("Clint", "Eastwood").getFullName());
        assertEquals("Clint", new Dinglemouse("Clint", "").getFullName());
        assertEquals("Eastwood", new Dinglemouse("", "Eastwood").getFullName());
    }

}