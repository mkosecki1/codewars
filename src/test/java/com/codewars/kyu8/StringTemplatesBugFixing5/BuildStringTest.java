package com.codewars.kyu8.StringTemplatesBugFixing5;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildStringTest {
    @Test
    public void fixedTests() {
        assertEquals(KataBugFix.buildString("Cheese","Milk","Chocolate"),"I like Cheese, Milk, Chocolate!");
        assertEquals(KataBugFix.buildString("Cheese","Milk"),"I like Cheese, Milk!");
        assertEquals(KataBugFix.buildString("Chocolate"),"I like Chocolate!");
    }

}