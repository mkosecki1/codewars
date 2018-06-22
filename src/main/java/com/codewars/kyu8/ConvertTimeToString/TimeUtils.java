package com.codewars.kyu8.ConvertTimeToString;

public class TimeUtils {
    public static String convertTime(int timeDiff) {
        int minutes = timeDiff / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        return days + " " + hours % 24 + " " + minutes % 60 + " " + timeDiff % 60;
    }
}
