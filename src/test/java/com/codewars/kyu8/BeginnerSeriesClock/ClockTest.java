package com.codewars.kyu8.BeginnerSeriesClock;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClockTest {
    @Test
    public void test1(){
        assertEquals(Clock.Past(0,1,1),61000);
    }


}