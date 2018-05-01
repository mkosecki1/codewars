package com.codewars.kyu8.Java_Functional_Programming_Part_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionalProgrammingTest {
    @Test
    public void testJohnSmith() throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f.apply(jSmith));
    }

}