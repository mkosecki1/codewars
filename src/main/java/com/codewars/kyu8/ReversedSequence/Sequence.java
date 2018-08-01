package com.codewars.kyu8.ReversedSequence;

import org.apache.commons.lang3.ArrayUtils;

public class Sequence {
    public static int[] reverse(int n) {
        int[]nums = new int[n];
        for (int x=0; x<nums.length; x++) {
            nums[x]=x+1;
        }
        ArrayUtils.reverse(nums);
        return nums;
    }
}
