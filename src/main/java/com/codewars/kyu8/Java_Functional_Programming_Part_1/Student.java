package com.codewars.kyu8.Java_Functional_Programming_Part_1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student {
    private final String firstName;
    private final String lastName;
    public final String studentNumber;
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public String getCommaName() {
        return lastName + ", " + firstName;
    }
}
