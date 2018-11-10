package com.codewars.kyu8.HolidayVIIIDutyFree;

public class Kata {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) Math.floor(hol/(((double)discount/100)*normPrice));
    }
}