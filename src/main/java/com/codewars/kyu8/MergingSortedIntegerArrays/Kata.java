package com.codewars.kyu8.MergingSortedIntegerArrays;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

public class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        /*
        int[] merge = ArrayUtils.addAll(first,second);
        Arrays.sort(merge);
        int[] result = Arrays.stream(merge).distinct().toArray();
        return result;
        */

        return Arrays.stream(ArrayUtils.addAll(first,second)).distinct().sorted().toArray();
    }
}