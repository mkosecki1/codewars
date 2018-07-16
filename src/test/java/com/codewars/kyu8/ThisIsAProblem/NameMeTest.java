package com.codewars.kyu8.ThisIsAProblem;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class NameMeTest extends TestCase {

    public void testNameMeOne() throws Exception {
        NameMe nameMe = new NameMe("John", "Doe");

        assertEquals("Verifying First name. Object returned should contain the firstname: John",
                "John",
                nameMe.getFirstName());

        assertEquals("Verifying Last name. Object returned should contain the lastname: Doe",
                "Doe",
                nameMe.getLastName());

        assertNotEquals("Verifying full name. Object returned should contain full name: John Doe",
                "JohnDoe",
                nameMe.getFullName());

        assertEquals("Verifying full name. Object returned should contain full name: John Doe",
                "John Doe",
                nameMe.getFullName());
    }
    @Test
    public void test(){
        NameMe nameMe = new NameMe("Jaś", "Fasola");
        System.out.println(nameMe.getFirstName());
        System.out.println(nameMe.getLastName());
        System.out.println("Full: " + nameMe.getFullName());
    }
}