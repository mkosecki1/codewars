package com.codewars.kyu7.MyLanguages;

import java.util.*;
import java.util.stream.Collectors;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet().stream().filter(x -> x.getValue()>=60).sorted((x1,x2)->
                Integer.compare(x2.getValue(),x1.getValue())).map(x->x.getKey()).collect(Collectors.toList());
    }
}
