package com.codewars.kyu8.AbbreviateTwoWordName;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] splitName = name.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(splitName[0].substring(0,1).toUpperCase()).append(".")
                .append(splitName[1].substring(0,1).toUpperCase());
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}

