package com.codewars.kyu7.MovesInSquaredStrings1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Opstrings {
    public static String vertMirror (String strng) {
        return Arrays.stream(strng.split("\n"))
                .map(s->new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining("\n"));
    }
    public static String horMirror (String strng) {
        List<String> list = Arrays.asList(strng.split("\n"));
        Collections.reverse(list);
        return list.stream().collect(Collectors.joining("\n"));

    }
    public static String oper(Function<String,String> operator, String s) {
        return operator.apply(s);
    }
}