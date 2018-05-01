package com.codewars.kyu8.Java_Functional_Programming_Part_1;

import java.util.function.Function;

public class FunctionalProgramming {
    public static Function<Student, Boolean> f = p -> p.getFullName().equals("John Smith") && p.studentNumber.equals("js123");
}