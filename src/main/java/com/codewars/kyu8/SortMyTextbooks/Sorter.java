package com.codewars.kyu8.SortMyTextbooks;

import java.util.Collections;
import java.util.List;

public class Sorter {
    public static List<String> sort(List<String> textbooks) {
        Collections.sort(textbooks,String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}
