package com.codewars.kyu8;

import com.codewars.kyu8.ConvertTimeToString.TimeUtils;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimeUtilsTest {
    @Test
    public void shouldConvertCorrectly() throws Exception {
        assertEquals("1 1 1 1", TimeUtils.convertTime(90061));
        assertEquals("-1 -1 -1 -1", TimeUtils.convertTime(-90061));
    }
}