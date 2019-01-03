package com.codewars.kyu7.MaximumLengthDifference;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaxDiffLengthTest {

    @Test
    public void test1() {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, MaxDiffLength.mxdiflg(s1, s2)); // 13
    }

    @Test
    public void test2() {
        String[] s1 = new String[]{};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(-1, MaxDiffLength.mxdiflg(s1, s2)); // 13
    }

    @Test
    public void test3() {
        String[] s1 = null;
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(-1, MaxDiffLength.mxdiflg(s1, s2)); // 13
    }
}
