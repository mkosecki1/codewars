package com.codewars.kyu7.UnluckyDays;

import java.time.LocalDate;
import java.util.stream.IntStream;
import static java.time.DayOfWeek.FRIDAY;

public class Kata {
    public static int unluckyDays(int year) {
        return IntStream.range(1,13).map(i -> LocalDate.of(year,i,13).
                getDayOfWeek().equals(FRIDAY) ? 1 : 0).sum();
    }
}
