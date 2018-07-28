package com.codewars.kyu8.SortAndStar;

import java.util.Collections;
import java.util.LinkedList;

public class SortAndStar {
    public static String twoSort(String[] s) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i=0;i<s.length;i++){
            linkedList.add(s[i]);
        }
        Collections.sort(linkedList);
        String first = linkedList.getFirst();
        char[] c = first.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int n=0;n<c.length;n++){
            stringBuilder.append(c[n]+"***");
        }
        String result = stringBuilder.substring(0,stringBuilder.length()-3);
        System.out.println("Result -> "+result);
        return result;
    }
    /* ANOTHER SOLUTIONS:
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
    */
}
