package com.codewars.kyu8.SwitchItUp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SwitchItUpTest {

    @Test
    public void basicTests() {
        //System.out.println("Thats it: " + SwitchItUp.switchItUp(1));
        assertEquals("One", SwitchItUp.switchItUp(1));
        assertEquals("Three", SwitchItUp.switchItUp(3));
        assertEquals("Five", SwitchItUp.switchItUp(5));
    }

}